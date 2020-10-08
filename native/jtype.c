#include <stdlib.h>

#include <jni.h>

#include <greycat/common/gkeys.h>
#include <greycat/galloc.h>
#include <greycat/graph.h>
#include <greycat/log.h>
#include <greycat/rt/string.h>
#include <greycat/rt/type.h>

typedef struct jtype_factory {
    jclass clazz;
    jmethodID constructor_mid;
    jfieldID value_id;
} jtype_factory_t;

jobject jtype__g2j(JNIEnv *env, gc_graph_t *graph, gc_rt_slot_t slot, gptype_t slot_type) {
    switch (slot_type) {
    case gc_sbi_slot_type_null:
        return NULL;
    case gc_sbi_slot_type_bool: {
        jtype_factory_t *factory = graph->std_types.p_bool->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.b);
    }
    case gc_sbi_slot_type_f64: {
        jtype_factory_t *factory = graph->std_types.p_f64->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.f64);
    }
    case gc_sbi_slot_type_f32: {
        jtype_factory_t *factory = graph->std_types.p_f32->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.f32);
    }
    case gc_sbi_slot_type_u32: {
        jtype_factory_t *factory = graph->std_types.p_u32->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.u32);
    }
    case gc_sbi_slot_type_u64: {
        jtype_factory_t *factory = graph->std_types.p_u64->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.u64);
    }
    case gc_sbi_slot_type_i32: {
        jtype_factory_t *factory = graph->std_types.p_i32->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.i32);
    }
    case gc_sbi_slot_type_i64: {
        jtype_factory_t *factory = graph->std_types.p_i64->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.i64);
    }
    case gc_sbi_slot_type_geo: {
        jtype_factory_t *factory = graph->std_types.p_geo->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.i64);
    }
    case gc_sbi_slot_type_time: {
        jtype_factory_t *factory = graph->std_types.p_time->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.i64);
    }
    case gc_sbi_slot_type_ref: {
        jtype_factory_t *factory = graph->std_types.p_ref->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.i64);
    }
    case gc_sbi_slot_type_enum: {
        jtype_factory_t *factory = graph->std_types.p_enum->extra;
        return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, slot.ti32.left, slot.ti32.right, graph);
    }
    case gc_sbi_slot_type_object: {
        if (slot.object->type->key == g_String) {
            return (*env)->NewStringUTF(env, ((gc_rt_string_t *) slot.object)->buffer);
        } else {
            jtype_factory_t *factory = slot.object->type->extra;
            if (factory == NULL) {
                factory = graph->std_types.object->extra;
            }
            return (*env)->NewObject(env, factory->clazz, factory->constructor_mid, (jlong)(intptr_t) slot.object);
        }
    }
    default: {
        int32_t insupported_type = gptype__to(slot_type);
        gc_rt_string_t *unsupported_name = gc_graph__meta(graph, insupported_type);
        if (unsupported_name == NULL) {
            gerror("not implemented yet: %.*s", unsupported_name->size, unsupported_name->buffer);
        } else {
            gerror("not implemented yet, type: %d:%d", insupported_type, slot_type);
        }
        return NULL;
    }
    }
}

gptype_t jtype__j2g(JNIEnv *env, gc_graph_t *graph, jobject value, gc_rt_slot_t *slot) {
    if (value != NULL) {
        if ((*env)->IsInstanceOf(env, value, ((jtype_factory_t *) graph->std_types.p_i64->extra)->clazz)) {
            slot->i64 = (*env)->GetLongField(env, value, ((jtype_factory_t *) graph->std_types.p_i64->extra)->value_id);
            return gc_sbi_slot_type_i64;
        } else if ((*env)->IsInstanceOf(env, value, ((jtype_factory_t *) graph->std_types.p_f64->extra)->clazz)) {
            slot->f64 = (*env)->GetDoubleField(env, value, ((jtype_factory_t *) graph->std_types.p_f64->extra)->value_id);
            return gc_sbi_slot_type_f64;
        } else if ((*env)->IsInstanceOf(env, value, ((jtype_factory_t *) graph->std_types.p_i32->extra)->clazz)) {
            slot->i32 = (*env)->GetIntField(env, value, ((jtype_factory_t *) graph->std_types.p_i32->extra)->value_id);
            return gc_sbi_slot_type_i32;
        } else if ((*env)->IsInstanceOf(env, value, ((jtype_factory_t *) graph->std_types.p_bool->extra)->clazz)) {
            slot->b = (*env)->GetBooleanField(env, value, ((jtype_factory_t *) graph->std_types.p_bool->extra)->value_id);
            return gc_sbi_slot_type_bool;
        } else if ((*env)->IsInstanceOf(env, value, ((jtype_factory_t *) graph->std_types.string->extra)->clazz)) {
            const char *nativeString = (*env)->GetStringUTFChars(env, value, 0);
            gc_rt_string_t *gc_str = gc_graph__create_string(graph);
            slot->object = (gobject_t *) gc_str;
            gc_rt_buffer__add_raw_string(gc_str, (char *) nativeString);
            gc_rt_buffer__close(gc_str);
            (*env)->ReleaseStringUTFChars(env, value, nativeString);
            return gc_sbi_slot_type_object;
        } else if ((*env)->IsInstanceOf(env, value, ((jtype_factory_t *) graph->std_types.object->extra)->clazz)) {
            slot->object = (gobject_t *) (intptr_t)(*env)->GetLongField(env, value, ((jtype_factory_t *) graph->std_types.object->extra)->value_id);
            gc_rt_object__mark(slot->object);
            return gc_sbi_slot_type_object;
        } else {


            gerror("Can't convert Java object to GreyCat object. Please use API for complex construction. Auto-wrap not implemented yet!");

            // gerror("not implemented yet! %d", is_array);


            // gptype_t nativeType = gc_sbi_slot_type_null;

            /*
            jclass class_class = (*env)->FindClass(env, "java/lang/Class");
            jmethodID class_isArray_m = (*env)->GetMethodID(env, class_class, "isArray", "()Z");
            jclass obj_class = (*env)->GetObjectClass(env, value);
            jboolean is_array = (*env)->CallBooleanMethod(env, obj_class, class_isArray_m);
            if (is_array) {
                // jmethodID mid_getName = (*env)->GetMethodID(env, obj_class, "getName", "()Ljava/lang/String;");
                // jstring name = (*env)->CallObjectMethod(env, obj_class, mid_getName);
                // const char *nativeString = (*env)->GetStringUTFChars(env, name, 0);
                // printf("%s", nativeString);
                // (*env)->ReleaseStringUTFChars(env, name, nativeString);

                //jarray arr = value;
                //jsize len = (*env)->GetArrayLength(env, arr);
            } else {
                gerror("not implemented yet! %d", is_array);
            }
            (*env)->DeleteLocalRef(env, class_class);
            (*env)->DeleteLocalRef(env, obj_class);
             */
        }
    }
    slot->object = NULL;
    return gc_sbi_slot_type_null;
}

JNIEXPORT jint JNICALL Java_io_greycat_impl_TypeImpl_nKey(JNIEnv *env, jclass class, jlong ptr) { return (jint)((gtype_t *) (intptr_t) ptr)->key; }

JNIEXPORT jstring JNICALL Java_io_greycat_impl_TypeImpl_nName(JNIEnv *env, jclass class, jlong ptr) {
    gtype_t *self = (gtype_t *) (intptr_t) ptr;
    gc_rt_string_t *meta = gc_graph__meta((gc_graph_t *) self->graph, self->key);
    if (meta == NULL) {
        return NULL;
    } else {
        return (*env)->NewStringUTF(env, meta->buffer);
    }
}

JNIEXPORT void JNICALL Java_io_greycat_impl_TypeImpl_nSetName(JNIEnv *env, jclass class, jlong ptr, jint name_key, jstring name) {
    gtype_t *self = (gtype_t *) (intptr_t) ptr;
    if (!gc_graph__is_meta((gc_graph_t *) self->graph, name_key)) {
        const char *nativeString = (*env)->GetStringUTFChars(env, name, 0);
        gc_graph__declare_meta((gc_graph_t *) self->graph, name_key, nativeString);
        (*env)->ReleaseStringUTFChars(env, name, nativeString);
    }
    self->key = name_key;
}

JNIEXPORT void JNICALL Java_io_greycat_impl_TypeImpl_nSetClass(JNIEnv *env, jclass class, jlong ptr, jclass wrapper) {
    gtype_t *self = (gtype_t *) (intptr_t) ptr;
    jtype_factory_t *factory = g_malloc(sizeof(jtype_factory_t));
    factory->clazz = (*env)->NewGlobalRef(env, wrapper); // TODO this should be destroy at the end
    switch (self->key) {
    case g_i32:
        factory->constructor_mid = (*env)->GetMethodID(env, factory->clazz, "<init>", "(I)V");
        factory->value_id = (*env)->GetFieldID(env, factory->clazz, "value", "I");
        break;
    case g_u64:
    case g_i64:
    case g_GeoPoint:
    case g_Time:
    case g_Ref:
        factory->constructor_mid = (*env)->GetMethodID(env, factory->clazz, "<init>", "(J)V");
        factory->value_id = (*env)->GetFieldID(env, factory->clazz, "value", "J");
        break;
    case g_f32:
        factory->constructor_mid = (*env)->GetMethodID(env, factory->clazz, "<init>", "(F)V");
        factory->value_id = (*env)->GetFieldID(env, factory->clazz, "value", "F");
        break;
    case g_f64:
        factory->constructor_mid = (*env)->GetMethodID(env, factory->clazz, "<init>", "(D)V");
        factory->value_id = (*env)->GetFieldID(env, factory->clazz, "value", "D");
        break;
    case g_bool:
        factory->constructor_mid = (*env)->GetMethodID(env, factory->clazz, "<init>", "(Z)V");
        factory->value_id = (*env)->GetFieldID(env, factory->clazz, "value", "Z");
        break;
    case g_String:
        factory->constructor_mid = NULL;
        break;
    case g_Enum:
        factory->constructor_mid = (*env)->GetMethodID(env, factory->clazz, "<init>", "(IIJ)V");
        break;
    default:
        factory->constructor_mid = (*env)->GetMethodID(env, factory->clazz, "<init>", "(J)V");
        factory->value_id = (*env)->GetFieldID(env, factory->clazz, "native_ptr", "J");
        break;
    }
    self->extra = factory;
}

JNIEXPORT void JNICALL Java_io_greycat_impl_TypeImpl_nDeclareAttribute(JNIEnv *env, jclass class, jlong ptr, jint key, jstring keyName, jint type) {
    gtype_t *self = (gtype_t *) (intptr_t) ptr;
    if (keyName != NULL && !gc_graph__is_meta((gc_graph_t *) self->graph, key)) {
        const char *nativeString = (*env)->GetStringUTFChars(env, keyName, 0);
        gc_graph__declare_meta((gc_graph_t *) self->graph, key, nativeString);
        (*env)->ReleaseStringUTFChars(env, keyName, nativeString);
    }
    gc_rt_type__declare_attribute(self, (int32_t) key, type);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_TypeImpl_nDeclareStatic(JNIEnv *env, jclass class, jlong ptr, jint key, jstring keyName, jobject value) {
    gtype_t *self = (gtype_t *) (intptr_t) ptr;

    if (keyName != NULL && !gc_graph__is_meta((gc_graph_t *) self->graph, key)) {
        const char *nativeString = (*env)->GetStringUTFChars(env, keyName, 0);
        gc_graph__declare_meta((gc_graph_t *) self->graph, key, nativeString);
        (*env)->ReleaseStringUTFChars(env, keyName, nativeString);
    }

    gc_graph_t *graph = (gc_graph_t *) self->graph;
    gc_rt_slot_t slot;
    gptype_t slot_type = jtype__j2g(env, graph, value, &slot);
    gc_rt_type__declare_static(self, key, slot, slot_type);
    if (slot_type == gc_sbi_slot_type_object) {
        gc_rt_object__un_mark(slot.object);
    }
}

extern void jfunction__pipe_body(gfunction_t *self, JNIEnv *env, jobject body);

JNIEXPORT void JNICALL Java_io_greycat_impl_TypeImpl_nDeclareFunction(JNIEnv *env, jclass class, jlong ptr, jint key, jstring keyName, jobject func_body) {
    gtype_t *self = (gtype_t *) (intptr_t) ptr;
    if (keyName != NULL && !gc_graph__is_meta((gc_graph_t *) self->graph, key)) {
        const char *nativeString = (*env)->GetStringUTFChars(env, keyName, 0);
        gc_graph__declare_meta((gc_graph_t *) self->graph, key, nativeString);
        (*env)->ReleaseStringUTFChars(env, keyName, nativeString);
    }
    gfunction_t *anonymous = gc_graph__create_function((gc_graph_t *) self->graph);
    jfunction__pipe_body(anonymous, env, func_body);
    gc_rt_type__declare_function(self, key, anonymous);
    gc_rt_object__un_mark((gobject_t *) anonymous);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_TypeImpl_nIsOpen(JNIEnv *env, jclass class, jlong ptr) {
    gtype_t *self = (gtype_t *) (intptr_t) ptr;
    self->flags.is_open = true;
}

JNIEXPORT void JNICALL Java_io_greycat_impl_TypeImpl_nSeal(JNIEnv *env, jclass class, jlong ptr) {
    gtype_t *self = (gtype_t *) (intptr_t) ptr;
    if (self->flags.is_sealed) {
        return;
    }
    gc_graph__declare_type((gc_graph_t *) self->graph, self);
}
