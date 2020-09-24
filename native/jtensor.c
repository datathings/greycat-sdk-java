#include <jni.h>

#include <greycat/log.h>
#include <greycat/rt/gtype.h>
#include <greycat/rt/tensor.h>

extern jobject jtype__g2j(JNIEnv *env, ggraph_t *graph, gc_rt_slot_t slot, gptype_t slot_type);

JNIEXPORT jint JNICALL Java_io_greycat_impl_TensorImpl_nSize(JNIEnv *env, jclass class, jlong ptr) {
  return ((gc_rt_tensor_t *) (intptr_t) ptr)->descriptor.size;
}

JNIEXPORT void JNICALL
Java_io_greycat_impl_TensorImpl_nRawInitDouble(JNIEnv *env, jclass class, jlong ptr, jint size) {
    gc_rt_tensor_t *this = (gc_rt_tensor_t *) (intptr_t) ptr;
    gc_rt_tensor__init(this, gc_sbi_slot_type_f64, (int64_t) size, true, NULL);
  this->descriptor.nb_dim = 1;
  this->descriptor.dim[0] = size;
}

JNIEXPORT void JNICALL
Java_io_greycat_impl_TensorImpl_nRawInitFloat(JNIEnv *env, jclass class, jlong ptr, jint size) {
    gc_rt_tensor_t *this = (gc_rt_tensor_t *) (intptr_t) ptr;
    gc_rt_tensor__init(this, gc_sbi_slot_type_f32, (int64_t) size, true, NULL);
  this->descriptor.nb_dim = 1;
  this->descriptor.dim[0] = size;
}

JNIEXPORT void JNICALL Java_io_greycat_impl_TensorImpl_nFillDouble(
  JNIEnv *env, jclass class, jlong ptr, jint offset, jdoubleArray data) {
    gc_rt_tensor_t *this = (gc_rt_tensor_t *) (intptr_t) ptr;
  jdouble *raw = (*env)->GetDoubleArrayElements(env, data, false);
  jsize len = (*env)->GetArrayLength(env, data);
  if (offset + len > this->descriptor.size) {
    gerror("out of bounds!\n");
    return;
  }
  for (jsize i = 0; i < len; i++) {
    ((double_t *) this->data)[offset + i] = raw[i];
  }
  (*env)->ReleaseDoubleArrayElements(env, data, raw, 0);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_TensorImpl_nFillFloat(
  JNIEnv *env, jclass class, jlong ptr, jint offset, jfloatArray data) {
    gc_rt_tensor_t *this = (gc_rt_tensor_t *) (intptr_t) ptr;
  jfloat *raw = (*env)->GetFloatArrayElements(env, data, false);
  jsize len = (*env)->GetArrayLength(env, data);
  if (offset + len > this->descriptor.size) {
    gerror("out of bounds!\n");
    return;
  }
  for (jsize i = 0; i < len; i++) {
    ((float_t *) this->data)[offset + i] = raw[i];
  }
  (*env)->ReleaseFloatArrayElements(env, data, raw, 0);
}

JNIEXPORT jobject JNICALL Java_io_greycat_impl_TensorImpl_nGet
  (JNIEnv *env, jclass class, jlong ptr, jintArray offsets) {

    jint *raw = (*env)->GetIntArrayElements(env, offsets, false);
    int32_t offset = 1;
    jsize len = (*env)->GetArrayLength(env, offsets);
    for (jsize i = 0; i < len; i++) {
        offset *= raw[i];
    }
    (*env)->ReleaseIntArrayElements(env, offsets, raw, 0);
    gc_rt_tensor_t *this = (gc_rt_tensor_t *) (intptr_t) ptr;
    gc_rt_slot_t slot = gc_rt_tensor__get_value(this, offset);
    return jtype__g2j(env, (ggraph_t *) this->header.type->graph, slot, this->descriptor.data_type);
}
