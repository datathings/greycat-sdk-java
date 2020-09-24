#include <jni.h>

#include <greycat/rt/blob.h>

JNIEXPORT jint JNICALL Java_io_greycat_impl_BlobImpl_nSize(JNIEnv *env, jclass class, jlong ptr) { return ((gc_rt_blob_t *) (intptr_t) ptr)->size; }

JNIEXPORT void JNICALL Java_io_greycat_impl_BlobImpl_nReset(JNIEnv *env, jclass class, jlong ptr) { gc_rt_blob__reset((gc_rt_blob_t *) (intptr_t) ptr); }

JNIEXPORT void JNICALL Java_io_greycat_impl_BlobImpl_nPrepare(JNIEnv *env, jclass class, jlong ptr, jint size) {
    gc_rt_blob__prepare((gc_rt_blob_t *) (intptr_t) ptr, size);
}

JNIEXPORT char JNICALL Java_io_greycat_impl_BlobImpl_nGet(JNIEnv *env, jclass class, jlong ptr, jint offset) {
    return gc_rt_blob__get((gc_rt_blob_t *) (intptr_t) ptr, offset);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_BlobImpl_nAppend(JNIEnv *env, jclass class, jlong ptr, jbyteArray data) {
    gc_rt_blob_t *this = (gc_rt_blob_t *) (intptr_t) ptr;
    jbyte *raw = (*env)->GetByteArrayElements(env, data, false);
    jsize len = (*env)->GetArrayLength(env, data);
    gc_rt_blob__append(this, (char *) raw, len);
    (*env)->ReleaseByteArrayElements(env, data, raw, 0);
}
