#include <time.h>
#include <stdbool.h>
#include <stdint.h>
#include <stdio.h>

#include <jni.h>

#include <greycat/rt/string.h>
#include <greycat/rt/time.h>

#define GC_DATE_STR_LEN 24

JNIEXPORT jstring JNICALL Java_io_greycat_impl_TimeImpl_nToLocale(JNIEnv *env, jclass class, jlong value) {
    char buffer[GC_DATE_STR_LEN + 1];
#if defined _WIN32 || defined __CYGWIN__
    // TODO
#else
    int64_t timestamp = (int64_t) value;
    const time_t epoch = timestamp / 1000;
    struct tm epoch_tm;
    localtime_r(&epoch, &epoch_tm);
    asctime_r(&epoch_tm, buffer);
#endif
    buffer[GC_DATE_STR_LEN] = '\0';
    return (*env)->NewStringUTF(env, buffer);
}

JNIEXPORT jstring JNICALL Java_io_greycat_impl_TimeImpl_nToString(JNIEnv *env, jclass class, jlong value) {

#if defined _WIN32 || defined __CYGWIN__
    // TODO
#else

    int64_t timestamp = (int64_t) value;
    const time_t epoch = timestamp / 1000000;
    struct tm epoch_tm;
    gmtime_r(&epoch, &epoch_tm);

    const uint32_t rest = timestamp % 1000000;
    if (rest == 0) {
        uint32_t len = (uint32_t) snprintf(NULL, 0, GC_RT_TIME_ISO_FMT_Z, epoch_tm.tm_year + 1900, epoch_tm.tm_mon, epoch_tm.tm_mday, epoch_tm.tm_hour,
                                           epoch_tm.tm_min, epoch_tm.tm_sec);
        char buffer[len + 1];
        snprintf(buffer, len + 1, GC_RT_TIME_ISO_FMT_Z, (uint32_t) epoch_tm.tm_year + 1900, epoch_tm.tm_mon, epoch_tm.tm_mday, epoch_tm.tm_hour, epoch_tm.tm_min,
                 epoch_tm.tm_sec);
        buffer[len] = '\0';
        return (*env)->NewStringUTF(env, buffer);
    } else {
        uint32_t len = (uint32_t) snprintf(NULL, 0, GC_RT_TIME_ISO_FMT_ZR, epoch_tm.tm_year + 1900, epoch_tm.tm_mon, epoch_tm.tm_mday, epoch_tm.tm_hour,
                                           epoch_tm.tm_min, epoch_tm.tm_sec, rest);
        char buffer[len + 1];
        snprintf(buffer, len + 1, GC_RT_TIME_ISO_FMT_ZR, (uint32_t) epoch_tm.tm_year + 1900, epoch_tm.tm_mon, epoch_tm.tm_mday, epoch_tm.tm_hour, epoch_tm.tm_min,
                 epoch_tm.tm_sec, rest);
        buffer[len] = '\0';
        return (*env)->NewStringUTF(env, buffer);
    }
#endif
    return NULL;
}
