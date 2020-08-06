#include <jni.h>

#include <greycat/ggraph.h>
#include <greycat/runtime/gstring.h>

JNIEXPORT void JNICALL Java_io_greycat_impl_ObjectImpl_nUnMark(JNIEnv *env, jclass class, jlong ptr) { gobject__un_mark((gobject_t *) (intptr_t) ptr); }

JNIEXPORT jlong JNICALL Java_io_greycat_impl_ObjectImpl_nType(JNIEnv *env, jclass class, jlong ptr) {
    return (jlong)(intptr_t)((gobject_t *) (intptr_t) ptr)->type;
}

JNIEXPORT jstring JNICALL Java_io_greycat_impl_ObjectImpl_nToString(JNIEnv *env, jclass class, jlong ptr) {
    gobject_t *obj = (gobject_t *) (intptr_t) ptr;
    gstring_t *buffer = ggraph__create_string(obj->type->graph);
    obj->type->to_json(obj, (gobject_t *) buffer, false);
    gstring__close(buffer);
    jstring result = (jstring)(*env)->NewStringUTF(env, buffer->buffer);
    gobject__un_mark((gobject_t *) buffer);
    return result;
}

JNIEXPORT jobject JNICALL Java_io_greycat_impl_ObjectImpl_nGraph(JNIEnv *env, jclass class, jlong ptr) {
    return (jobject)((ggraph_t *) ((gobject_t *) (intptr_t) ptr)->type->graph)->ext.companion;
}

extern gptype_t jtype__j2g(JNIEnv *env, ggraph_t *graph, jobject value, gslot_t *slot);

JNIEXPORT void JNICALL Java_io_greycat_impl_ObjectImpl_nSet(JNIEnv *env, jclass class, jlong ptr, jint key, jobject value) {
    gobject_t *self = (gobject_t *) (intptr_t) ptr;
    ggraph_t *graph = self->type->graph;
    gslot_t slot;
    gptype_t slot_type = jtype__j2g(env, graph, value, &slot);
    if (self->type->key == g_Ctx) {
        gctx__set_slot((gctx_t *) self, key, slot, slot_type);
    } else {
        gobject__set_slot(self, key, slot, slot_type);
    }
    if (slot_type == gc_sbi_slot_type_object) {
        gobject__un_mark(slot.object);
    }
}

extern jobject jtype__g2j(JNIEnv *env, ggraph_t *graph, gslot_t slot, gptype_t slot_type);

JNIEXPORT jobject JNICALL Java_io_greycat_impl_ObjectImpl_nGet(JNIEnv *env, jclass class, jlong ptr, jint key) {
    gobject_t *self = (gobject_t *) (intptr_t) ptr;
    ggraph_t *graph = self->type->graph;
    gslot_t slot;
    gptype_t slot_type;
    if (self->type->key == g_Ctx) {
        slot = gctx__get((gctx_t *) self, key, &slot_type);
    } else {
        slot = gobject__get_slot(self, key, &slot_type);
    }
    return jtype__g2j(env, graph, slot, slot_type);
}
