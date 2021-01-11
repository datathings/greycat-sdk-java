#include <inttypes.h>
#include <stdint.h>
#include <stdio.h>

#include <jni.h>

JNIEXPORT jstring JNICALL Java_io_greycat_impl_DurationImpl_nToString(JNIEnv *env, jclass class, jlong value) {
    uint64_t duration = value;
    uint32_t size = (uint32_t) snprintf(NULL, 0, "%" PRId64 "ms", duration);
    char buffer[size + 1];
    snprintf(buffer, size + 1, "%" PRId64 "ms", duration);
    buffer[size] = '\0';
    return (*env)->NewStringUTF(env, buffer);
}
