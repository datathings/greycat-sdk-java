#include <jni.h>

#include <greycat/common/gcommon.h>
#include <greycat/runtime/array.h>
#include <greycat/runtime/gtype.h>

JNIEXPORT jint JNICALL Java_io_greycat_impl_ArrayImpl_nSize(JNIEnv *env, jclass class, jlong ptr) { return ((gc_rt_array_t *) (intptr_t) ptr)->size; }

extern gptype_t jtype__j2g(JNIEnv *env, ggraph_t *graph, jobject value, gc_rt_slot_t *slot);

extern jobject jtype__g2j(JNIEnv *env, ggraph_t *graph, gc_rt_slot_t slot, gptype_t slot_type);

JNIEXPORT void JNICALL Java_io_greycat_impl_ArrayImpl_nAdd(JNIEnv *env, jclass class, jlong ptr, jobject value) {
    gc_rt_array_t *self = (gc_rt_array_t *) (intptr_t) ptr;
    ggraph_t *graph = (ggraph_t *) self->header.type->graph;
    gc_rt_slot_t slot;
    gptype_t slot_type = jtype__j2g(env, graph, value, &slot);
    gc_rt_array__add_slot(self, slot, slot_type);
    if (slot_type == gc_sbi_slot_type_object) {
        gobject__un_mark(slot.object);
    }
}

JNIEXPORT void JNICALL Java_io_greycat_impl_ArrayImpl_nSet(JNIEnv *env, jclass class, jlong ptr, jint offset, jobject value) {
    gc_rt_array_t *self = (gc_rt_array_t *) (intptr_t) ptr;
    ggraph_t *graph = (ggraph_t *) self->header.type->graph;
    gc_rt_slot_t slot;
    gptype_t slot_type = jtype__j2g(env, graph, value, &slot);
    gc_rt_array__set_slot(self, (uint32_t) offset, slot, slot_type);
    if (slot_type == gc_sbi_slot_type_object) {
        gobject__un_mark(slot.object);
    }
}

JNIEXPORT jobject JNICALL Java_io_greycat_impl_ArrayImpl_nGet(JNIEnv *env, jclass class, jlong ptr, jint offset) {
    gc_rt_array_t *self = (gc_rt_array_t *) (intptr_t) ptr;
    ggraph_t *graph = (ggraph_t *) self->header.type->graph;
    gptype_t slot_type;
    gc_rt_slot_t slot = gc_rt_array__get_slot(self, (uint32_t) offset, &slot_type);
    return jtype__g2j(env, graph, slot, slot_type);
}
