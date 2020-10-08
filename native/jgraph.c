#include <stdlib.h>

#include <jni.h>

#include <greycat/graph.h>
#include <greycat/log.h>
#include <greycat/rt/buffer.h>
#include <greycat/rt/string.h>
#include <greycat/rt/type.h>

extern const char *gc_core_version();

static void ggraph_ext_cleaner(void *companion, void *env, uint64_t id) {
    JNIEnv *jni_env = env;
    (*jni_env)->DeleteGlobalRef(jni_env, companion);
}

static void ggraph_ext_body(void *companion, void *env, int64_t id, gctx_t *ctx) {
    JNIEnv *jni_env = env;
    (*jni_env)->CallVoidMethod(jni_env, companion, (jmethodID)(intptr_t) id, ctx->ext.companion);
}

JNIEXPORT jlong JNICALL
Java_io_greycat_impl_GraphImpl_nCreate(JNIEnv *env, jclass class, jlong cacheSize, jlong bufferSize, jboolean useMeta, jobject companion) {
    gc_graph_t *new_graph = gc_graph__create((uint64_t) cacheSize, (uint64_t) bufferSize, useMeta, NULL);//TODO
    new_graph->ext.env = env;
    new_graph->ext.companion = (*env)->NewGlobalRef(env, companion);
    new_graph->ext_cleaner = ggraph_ext_cleaner;
    new_graph->ext_body = ggraph_ext_body;
    return (jlong)(intptr_t) new_graph;
}

JNIEXPORT void JNICALL Java_io_greycat_impl_GraphImpl_nDestroy(JNIEnv *env, jclass class, jlong ptr) { gc_graph__destroy((gc_graph_t *) (intptr_t) ptr); }

JNIEXPORT jlong JNICALL Java_io_greycat_impl_GraphImpl_nType(JNIEnv *env, jclass class, jlong ptr, jint hash) {
    return (jlong)(intptr_t) gc_graph__type((gc_graph_t *) (intptr_t) ptr, hash);
}

JNIEXPORT jlong JNICALL Java_io_greycat_impl_GraphImpl_nDeclareType(JNIEnv *env, jclass class, jlong ptr, jint key, jboolean is_open) {
    gtype_t *type = gc_graph__type((gc_graph_t *) (intptr_t) ptr, key);
    if (type != NULL) {
        return (jlong)(intptr_t) type;
    }
    if (is_open) {
        type = gc_graph__create_type((gc_graph_t *) (intptr_t) ptr);
    } else {
        type = gc_graph__create_fixed_node_type((gc_graph_t *) (intptr_t) ptr);
    }
    type->create = NULL;//pure abstract
    type->compute_size = NULL;
    type->key = key;
    return (jlong)(intptr_t) type;
}

JNIEXPORT jlong JNICALL Java_io_greycat_impl_GraphImpl_nNewContext(JNIEnv *env, jclass class, jlong ptr) {
    return (jlong)(intptr_t) gc_graph__create_context((gc_graph_t *) (intptr_t) ptr);
}

JNIEXPORT jlong JNICALL Java_io_greycat_impl_GraphImpl_nNewFunction(JNIEnv *env, jclass class, jlong ptr) {
    return (jlong)(intptr_t) gc_graph__create_function((gc_graph_t *) (intptr_t) ptr);
}

extern jobject jtype__g2j(JNIEnv *env, gc_graph_t *graph, gc_rt_slot_t slot, gptype_t slot_type);

JNIEXPORT jobject JNICALL Java_io_greycat_impl_GraphImpl_nNewObject(JNIEnv *env, jclass class, jlong ptr, jint type_key) {
    gc_rt_slot_t slot = {.object = gc_graph__create_object((gc_graph_t *) (intptr_t) ptr, type_key)};
    if (slot.object == NULL) {
        return NULL;
    }
    return jtype__g2j(env, (gc_graph_t *) (intptr_t) ptr, slot, gc_sbi_slot_type_object);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_GraphImpl_nLogInfo(JNIEnv *env, jclass class, jlong ptr, jstring message) {
    const char *nativeString = (*env)->GetStringUTFChars(env, message, 0);
    glinfo("%s", nativeString);
    (*env)->ReleaseStringUTFChars(env, message, nativeString);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_GraphImpl_nLogError(JNIEnv *env, jclass class, jlong ptr, jstring message) {
    const char *nativeString = (*env)->GetStringUTFChars(env, message, 0);
    gerror("%s", nativeString);
    (*env)->ReleaseStringUTFChars(env, message, nativeString);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_GraphImpl_nLogWarning(JNIEnv *env, jclass class, jlong ptr, jstring message) {
    const char *nativeString = (*env)->GetStringUTFChars(env, message, 0);
    gwarn("%s", nativeString);
    (*env)->ReleaseStringUTFChars(env, message, nativeString);
}

/*
extern gplugin_t *jni_gplugin__wrap(JNIEnv *env, jobject plugin_object);

JNIEXPORT void JNICALL
Java_io_greycat_impl_GraphImpl_nAddPlugin(JNIEnv *env, jclass class, jlong ptr, jobject plugin_obj) {
    gc_graph__add_plugin((ggraph_t *) ptr, jni_gplugin__wrap(env, plugin_obj));
}*/

JNIEXPORT jstring JNICALL Java_io_greycat_impl_GraphImpl_nExportTypes(JNIEnv *env, jclass class, jlong ptr) {
    gc_graph_t *self = (gc_graph_t *) (intptr_t) ptr;
    gc_rt_string_t *buffer = gc_graph__create_string(self);
    gc_graph_export_types((gc_graph_t *) (intptr_t) ptr, buffer);
    gc_rt_buffer__close(buffer);
    jstring jstrBuf = (*env)->NewStringUTF(env, buffer->buffer);
    gc_rt_object__un_mark((gobject_t *) buffer);
    return jstrBuf;
}

JNIEXPORT jstring JNICALL Java_io_greycat_impl_GraphImpl_nVersion(JNIEnv *env, jclass class, jlong ptr) {
    gc_graph_t *self = (gc_graph_t *) (intptr_t) ptr;
    gc_rt_string_t *buffer = gc_graph__create_string(self);
    gc_rt_buffer__add_raw_string(buffer, (char *) gc_core_version());
    gc_rt_buffer__close(buffer);
    jstring jstrBuf = (*env)->NewStringUTF(env, buffer->buffer);
    gc_rt_object__un_mark((gobject_t *) buffer);
    return jstrBuf;
}

JNIEXPORT jstring JNICALL Java_io_greycat_impl_GraphImpl_nFullVersion(JNIEnv *env, jclass class, jlong ptr) {
    gc_graph_t *self = (gc_graph_t *) (intptr_t) ptr;
    gc_rt_string_t *buffer = gc_graph__create_string(self);
    gc_rt_buffer__add_raw_string(buffer, (char *) gc_core_version());
    gc_rt_buffer__close(buffer);
    jstring jstrBuf = (*env)->NewStringUTF(env, buffer->buffer);
    gc_rt_object__un_mark((gobject_t *) buffer);
    return jstrBuf;
}

JNIEXPORT jboolean JNICALL Java_io_greycat_impl_GraphImpl_nIsMeta(JNIEnv *env, jclass class, jlong ptr, jint key) {
    return gc_graph__is_meta((gc_graph_t *) (intptr_t) ptr, key);
}

JNIEXPORT jint JNICALL Java_io_greycat_impl_GraphImpl_nDeclareMeta(JNIEnv *env, jclass class, jlong ptr, jstring name) {
    char *nativeString = (char *) (*env)->GetStringUTFChars(env, name, 0);
    int32_t nativeStringHash = hash(nativeString);
    gc_graph__declare_meta((gc_graph_t *) (intptr_t) ptr, nativeStringHash, nativeString);
    (*env)->ReleaseStringUTFChars(env, name, nativeString);
    return nativeStringHash;
}