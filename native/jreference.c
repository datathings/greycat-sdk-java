#include <inttypes.h>
#include <stdint.h>

#include <jni.h>

#include <greycat/runtime/geo/ggeo_code.h>

JNIEXPORT jstring JNICALL Java_io_greycat_impl_ReferenceImpl_nToString(JNIEnv *env, jclass class, jlong value) {
    gref_t ref;
    ref.raw = value;
    uint32_t len = (uint32_t) snprintf(NULL, 0, "%" PRIu64 ".%" PRIu16, (u64_t) ref.block_id, (u16_t) ref.offset);
    char buffer[len + 1];
    snprintf(buffer, len +1, "%" PRIu64 ".%" PRIu16, (u64_t) ref.block_id, (u16_t) ref.offset);
    return (*env)->NewStringUTF(env, buffer);
}