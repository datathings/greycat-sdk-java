#include <stdint.h>

#include <jni.h>

#include <greycat/ggraph.h>

JNIEXPORT jstring JNICALL Java_io_greycat_impl_EnumCallImpl_nType(JNIEnv *env, jclass class, jlong ptr, jint type) {
    gstring_t *resolved = ggraph__meta((ggraph_t *) (intptr_t) ptr, (int32_t) type);
    if (resolved == NULL) {
        return NULL;
    } else {
        return (*env)->NewStringUTF(env, resolved->buffer);
    }
}

JNIEXPORT jstring JNICALL Java_io_greycat_impl_EnumCallImpl_nValue(JNIEnv *env, jclass class, jlong ptr, jint value) {
    gstring_t *resolved = ggraph__meta((ggraph_t *) (intptr_t) ptr, (int32_t) value);
    if (resolved == NULL) {
        return NULL;
    } else {
        return (*env)->NewStringUTF(env, resolved->buffer);
    }
}