#include <jni.h>

#include <greycat/function/gctx.h>
#include <greycat/function/gfunction.h>
#include <greycat/function/gfunction_ops.h>
#include <greycat/ggraph.h>
#include <greycat/glog.h>
#include <greycat/language/gcl_parser.h>
#include <greycat/runtime/gstring.h>

JNIEXPORT jstring JNICALL Java_io_greycat_impl_FunctionImpl_nGetName(JNIEnv *env, jclass class, jlong ptr, jint key, jstring keyName) {
    gfunction_t *self = (gfunction_t *) (intptr_t) ptr;
    ggraph_t *graph = (ggraph_t *) self->header.type->graph;
    gstring_t *meta = ggraph__meta(graph, self->key);
    if (meta == NULL) {
        return NULL;
    }
    return (*env)->NewStringUTF(env, meta->buffer);
}

void jfunction__pipe_body(gfunction_t *self, JNIEnv *env, jobject body) {
    jobject clone = (*env)->NewGlobalRef(env, body);
    jclass cls = (*env)->GetObjectClass(env, body);
    uint64_t mid = (uint64_t)(intptr_t)(*env)->GetMethodID(env, cls, "on", "(Lio/greycat/Context;)V");
    gfunction__add_external(self, clone, mid, (gfunction_op_src_t){.line = 0, .offset = 0});
    (*env)->DeleteLocalRef(env, cls);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_FunctionImpl_nPipeBody(JNIEnv *env, jclass class, jlong ptr, jobject sub_body) {
    jfunction__pipe_body((gfunction_t *) (intptr_t) ptr, env, sub_body);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_FunctionImpl_nPipe(
  JNIEnv *env, jclass class, jlong ptr, jint to_key, jstring to_name, jint src_key, jstring src_name, jint sub_key, jstring func_name, jlong sub_ptr) {

    gfunction_op_src_t src = (gfunction_op_src_t){.line = 0, .offset = 0};


    gfunction_t *self = (gfunction_t *) (intptr_t) ptr;
    ggraph_t *graph = (ggraph_t *) self->header.type->graph;

    if (src_name != NULL && !ggraph__is_meta(graph, src_key)) {
        const char *nativeString = (*env)->GetStringUTFChars(env, src_name, 0);
        ggraph__declare_meta(graph, src_key, nativeString);
        (*env)->ReleaseStringUTFChars(env, src_name, nativeString);
    }
    if (func_name != NULL && !ggraph__is_meta(graph, sub_key)) {
        const char *nativeString = (*env)->GetStringUTFChars(env, func_name, 0);
        ggraph__declare_meta(graph, sub_key, nativeString);
        (*env)->ReleaseStringUTFChars(env, func_name, nativeString);
    }
    gfunction__add_open_scope(self, src);
    if (sub_ptr != 0) {
        gfunction__add_call_function_direct(self, (gfunction_t *) (intptr_t) sub_ptr, src);
    } else {

        gerror("not implemented!");

        //        if (to_name == NULL) {
        //            if (src_name == NULL) {
        //                gfunction__add_call_global(self, sub_key, src);
        //            } else {
        //                gfunction__add_call_method(self, src_key, g_result, sub_key, src);
        //            }
        //        } else {
        //            if (src_name == NULL) {
        //                gfunction__add_call_function(self, sub_key, to_key, src);
        //            } else {
        //                gfunction__add_call_method(self, src_key, sub_key, to_key, src);
        //            }
        //        }
    }

    gfunction__add_close_scope(self, src);
}

JNIEXPORT jboolean JNICALL Java_io_greycat_impl_FunctionImpl_nParse(JNIEnv *env, jclass class, jlong function_ptr, jstring gcl_data, jstring gcl_path) {
    gfunction_t *function = (gfunction_t *) (intptr_t) function_ptr;
    char *nativeString = (char *) (*env)->GetStringUTFChars(env, gcl_data, 0);
    char *nativePath = NULL;
    if (gcl_path != NULL) {
        nativePath = (char *) (*env)->GetStringUTFChars(env, gcl_path, 0);
    }
    bool result = gcl_parse(nativeString, nativePath, (ggraph_t *) function->header.type->graph, &function, NULL, false);
    (*env)->ReleaseStringUTFChars(env, gcl_data, nativeString);
    if (nativePath != NULL) {
        (*env)->ReleaseStringUTFChars(env, gcl_path, nativePath);
    }
    return (jboolean) result;
}

JNIEXPORT jlong JNICALL Java_io_greycat_impl_FunctionImpl_nNewContext(JNIEnv *env, jclass class, jlong function_ptr) {
    gfunction_t *function = (gfunction_t *) (intptr_t) function_ptr;
    return (jlong)(intptr_t) ggraph__create_context((ggraph_t *) function->header.type->graph);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_FunctionImpl_nExecute(JNIEnv *env, jclass class, jlong ctx_ptr, jlong function_ptr, jobject callback) {
    gfunction_t *func = (gfunction_t *) (intptr_t) function_ptr;
    gfunction_t *wrapped_fn = ggraph__create_function((ggraph_t *) func->header.type->graph);
    gfunction__add_call_function_direct(wrapped_fn, func, (gfunction_op_src_t){.line = 0, .offset = 0});
    jfunction__pipe_body(wrapped_fn, env, callback);
    gctx__execute((gctx_t *) (intptr_t) ctx_ptr, wrapped_fn);
    gobject__un_mark((gobject_t *) wrapped_fn);
}
