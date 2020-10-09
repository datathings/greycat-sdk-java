#include <jni.h>

#include <greycat/graph.h>
#include <greycat/rt/string.h>

JNIEXPORT void JNICALL Java_io_greycat_impl_ObjectImpl_nUnMark(JNIEnv *env, jclass class, jlong ptr) { gc_rt_object__un_mark((gc_rt_object_t *) (intptr_t) ptr); }

JNIEXPORT jlong JNICALL Java_io_greycat_impl_ObjectImpl_nType(JNIEnv *env, jclass class, jlong ptr) {
    return (jlong)(intptr_t)((gc_rt_object_t *) (intptr_t) ptr)->type;
}

JNIEXPORT jstring JNICALL Java_io_greycat_impl_ObjectImpl_nToString(JNIEnv *env, jclass class, jlong ptr) {
    gc_rt_object_t *obj = (gc_rt_object_t *) (intptr_t) ptr;
    gc_rt_buffer_t *buffer = (gc_rt_buffer_t *) gc_graph__create_object((gc_graph_t *) obj->type->graph, g_Buffer);
    obj->type->to_json(obj, (gc_rt_object_t *) buffer, false);
    gc_rt_buffer__close(buffer);
    jstring result = (jstring)(*env)->NewStringUTF(env, buffer->buffer);
    gc_rt_object__un_mark((gc_rt_object_t *) buffer);
    return result;
}

JNIEXPORT jobject JNICALL Java_io_greycat_impl_ObjectImpl_nGraph(JNIEnv *env, jclass class, jlong ptr) {
    return (jobject)((gc_graph_t *) ((gc_rt_object_t *) (intptr_t) ptr)->type->graph)->ext.companion;
}

extern gptype_t jtype__j2g(JNIEnv *env, gc_graph_t *graph, jobject value, gc_rt_slot_t *slot);

JNIEXPORT void JNICALL Java_io_greycat_impl_ObjectImpl_nSet(JNIEnv *env, jclass class, jlong ptr, jint key, jobject value) {
    gc_rt_object_t *self = (gc_rt_object_t *) (intptr_t) ptr;
    gc_graph_t *graph = (gc_graph_t *) self->type->graph;
    gc_rt_slot_t slot;
    gptype_t slot_type = jtype__j2g(env, graph, value, &slot);
    if (self->type->key == g_Ctx) {
        gctx__set_slot((gctx_t *) self, key, slot, slot_type);
    } else {
        gc_rt_object__set_slot(self, key, slot, slot_type);
    }
    if (slot_type == gc_sbi_slot_type_object) {
        gc_rt_object__un_mark(slot.object);
    }
}

extern jobject jtype__g2j(JNIEnv *env, gc_graph_t *graph, gc_rt_slot_t slot, gptype_t slot_type);

JNIEXPORT jobject JNICALL Java_io_greycat_impl_ObjectImpl_nGet(JNIEnv *env, jclass class, jlong ptr, jint key) {
    gc_rt_object_t *self = (gc_rt_object_t *) (intptr_t) ptr;
    gc_graph_t *graph = (gc_graph_t *) self->type->graph;
    gc_rt_slot_t slot;
    gptype_t slot_type;
    if (self->type->key == g_Ctx) {
        slot = gctx__get((gctx_t *) self, key, &slot_type);
    } else {
        slot = gc_rt_object__get_slot(self, key, &slot_type);
    }
    return jtype__g2j(env, graph, slot, slot_type);
}
