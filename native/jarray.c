#include <jni.h>

#include <greycat/common/gcommon.h>
#include <greycat/runtime/gtype.h>
#include <greycat/runtime/struct/garray.h>

JNIEXPORT jint JNICALL Java_io_greycat_impl_ArrayImpl_nSize(JNIEnv *env, jclass class, jlong ptr) { return ((garray_t *) (intptr_t) ptr)->size; }

extern gptype_t jtype__j2g(JNIEnv *env, ggraph_t *graph, jobject value, gslot_t *slot);

extern jobject jtype__g2j(JNIEnv *env, ggraph_t *graph, gslot_t slot, gptype_t slot_type);

JNIEXPORT void JNICALL Java_io_greycat_impl_ArrayImpl_nAdd(JNIEnv *env, jclass class, jlong ptr, jobject value) {
    garray_t *self = (garray_t *) (intptr_t) ptr;
    ggraph_t *graph = self->header.type->graph;
    gslot_t slot;
    gptype_t slot_type = jtype__j2g(env, graph, value, &slot);
    garray__add_slot(self, slot, slot_type);
    if (slot_type == gc_sbi_slot_type_object) {
        gobject__un_mark(slot.object);
    }
}

JNIEXPORT void JNICALL Java_io_greycat_impl_ArrayImpl_nSet(JNIEnv *env, jclass class, jlong ptr, jint offset, jobject value) {
    garray_t *self = (garray_t *) (intptr_t) ptr;
    ggraph_t *graph = self->header.type->graph;
    gslot_t slot;
    gptype_t slot_type = jtype__j2g(env, graph, value, &slot);
    garray__set_slot(self, (uint32_t) offset, slot, slot_type);
    if (slot_type == gc_sbi_slot_type_object) {
        gobject__un_mark(slot.object);
    }
}

JNIEXPORT jobject JNICALL Java_io_greycat_impl_ArrayImpl_nGet(JNIEnv *env, jclass class, jlong ptr, jint offset) {
    garray_t *self = (garray_t *) (intptr_t) ptr;
    ggraph_t *graph = self->header.type->graph;
    gptype_t slot_type;
    gslot_t slot = garray__get_slot(self, (uint32_t) offset, &slot_type);
    return jtype__g2j(env, graph, slot, slot_type);
}
