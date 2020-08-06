#include <stdint.h>

#include <jni.h>

#include <greycat/runtime/geo/ggeo_code.h>
#include <greycat/runtime/geo/ggeo_code_common.h>

JNIEXPORT jstring JNICALL Java_io_greycat_impl_GeoCodeImpl_nToString(JNIEnv *env, jclass class, jlong value) {
    uint64_t code = (uint64_t) value;
    if (code != GEOCODE_INVALID_CODE) {
        uint64_t precision = RAW_PRECISION(code);
        int size = MAX(9, 13 - precision);
        char buffer[size + 1];
        buffer[SEPARATOR_POSITION] = SEPARATOR;
        int padding = precision - 4;

        if (padding > 0) {
            for (int i = 7; i > 7 - padding; i--) {
                buffer[i] = PADDING_CHARACTER;
            }
        } else if (padding < 0) {
            uint64_t startBitInsert = 19;
            for (int i = 9; i < size; i++) {
                int valueb = VALUE_FROM_BIT(code, startBitInsert);
                buffer[i] = ALPHABET[valueb];
                startBitInsert -= 5;
            }
        }
        uint64_t startBitInsert = START_BIT_INSERTION;
        int maxIter = MIN(8, 12 - precision);
        for (int i = 0; i < maxIter; i++) {
            int valueb = (int) VALUE_FROM_BIT(code, startBitInsert);
            buffer[i] = ALPHABET[valueb];
            startBitInsert -= 5;
        }
        buffer[size] = '\0';
        return (*env)->NewStringUTF(env, buffer);
    } else {
        return NULL;
    }
}