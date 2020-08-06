#include <jni.h>

#include <greycat/runtime/struct/gblob.h>

JNIEXPORT jint JNICALL Java_io_greycat_impl_BlobImpl_nSize(JNIEnv *env, jclass class, jlong ptr) { return ((gblob_t *) (intptr_t) ptr)->size; }

JNIEXPORT void JNICALL Java_io_greycat_impl_BlobImpl_nReset(JNIEnv *env, jclass class, jlong ptr) { gblob__reset((gblob_t *) (intptr_t) ptr); }

JNIEXPORT void JNICALL Java_io_greycat_impl_BlobImpl_nPrepare(JNIEnv *env, jclass class, jlong ptr, jint size) {
    gblob__prepare((gblob_t *) (intptr_t) ptr, size);
}

JNIEXPORT char JNICALL Java_io_greycat_impl_BlobImpl_nGet(JNIEnv *env, jclass class, jlong ptr, jint offset) {
    return gblob__get((gblob_t *) (intptr_t) ptr, offset);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_BlobImpl_nAppend(JNIEnv *env, jclass class, jlong ptr, jbyteArray data) {
    gblob_t *this = (gblob_t *) (intptr_t) ptr;
    jbyte *raw = (*env)->GetByteArrayElements(env, data, false);
    jsize len = (*env)->GetArrayLength(env, data);
    gblob__append(this, (char *) raw, len);
    (*env)->ReleaseByteArrayElements(env, data, raw, 0);
}
