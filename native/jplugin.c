#include <stdlib.h>

#include <jni.h>

#include <greycat/galloc.h>
#include <greycat/gplugin.h>
#include <greycat/graph.h>
#include <greycat/log.h>

/*
static void jni_gplugin__start(gplugin_t *self, ggraph_t *graph) {
    JNIEnv *env = self->ext.env;
    jobject obj = self->ext.companion;
    jclass cls = (*env)->GetObjectClass(env, obj);
    jmethodID start_id = (*env)->GetMethodID(env, cls, "start", "(Lgreycat/Graph;)V");
    (*env)->CallVoidMethod(env, obj, start_id, graph->ext.companion);
    (*env)->DeleteLocalRef(env, cls);
}

static void jni_gplugin__stop(gplugin_t *self, ggraph_t *graph) {
    JNIEnv *env = self->ext.env;
    jobject obj = self->ext.companion;
    jclass cls = (*env)->GetObjectClass(env, obj);
    jmethodID stop_id = (*env)->GetMethodID(env, cls, "stop", "(Lgreycat/Graph;)V");
    (*env)->CallVoidMethod(env, obj, stop_id, graph->ext.companion);
    (*env)->DeleteLocalRef(env, cls);
}

gplugin_t *jni_gplugin__wrap(JNIEnv *env, jobject plugin_object) {
    gplugin_t *new_plugin = gplugin__create_from(jni_gplugin__start, jni_gplugin__stop, NULL);
    new_plugin->ext.companion = (*env)->NewGlobalRef(env, plugin_object);
    new_plugin->ext.env = env;
    return new_plugin;
}
*/