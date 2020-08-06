#include <stdio.h>

#include <jni.h>

#include <greycat/function/gctx.h>
#include <greycat/ggraph.h>

extern gptype_t jtype__j2g(JNIEnv *env, ggraph_t *graph, jobject value, gslot_t *slot);

void jcontext__error_handler(gctx_t *ctx) {
    JNIEnv *env = ctx->ext.env;
    jobject jctx = ctx->ext.companion;

    // create an instance of GreyCatRuntimeError with reason and stack
    //    jclass error_cls = (*env)->FindClass(env, "io/greycat/GreyCatRuntimeError");
    //    jmethodID error_ctr = (*env)->GetMethodID(env, error_cls, "<init>",
    //    "(Ljava/lang/String;Ljava/lang/String;)V");

    jstring reason = (*env)->NewStringUTF(env, ctx->error->buffer);

    size_t stack_len = 0;
    gctx__stackframes(ctx, NULL, &stack_len, 0);
    gstackframe_t frames[stack_len];
    gctx__stackframes(ctx, frames, &stack_len, stack_len);

    gstring_t *g_stack = ggraph__create_string(ctx->header.type->graph);
    gctx__stacktrace(frames, stack_len, g_stack);
    gstring__close(g_stack);
    jstring stack = (*env)->NewStringUTF(env, g_stack->buffer);
    // release gstring_t stacktrace
    gobject__un_mark((gobject_t *) g_stack);
    //    jobject error = (*env)->NewObject(env, error_cls, error_ctr, reason, stack);

    // retrieve "errorHandler" field on "ContextImpl" and apply with "error"
    jclass jctx_cls = (*env)->GetObjectClass(env, jctx);
    jfieldID fid = (*env)->GetFieldID(env, jctx_cls, "errorHandler", "Lio/greycat/ErrorCallback;");
    jobject jctx_error_handler = (*env)->GetObjectField(env, jctx, fid);
    jmethodID jctx_error_handler_on =
      (*env)->GetMethodID(env, (*env)->GetObjectClass(env, jctx_error_handler), "on", "(Ljava/lang/String;Ljava/lang/String;)V");
    (*env)->CallVoidMethod(env, jctx_error_handler, jctx_error_handler_on, reason, stack);
    // tell the garbage collector that we no longer need "error"
    //    (*env)->DeleteLocalRef(env, error);

    // release gctx error
    gobject__un_mark((gobject_t *) ctx->error);
    ctx->error = NULL;
}

JNIEXPORT void JNICALL Java_io_greycat_impl_ContextImpl_nDeclare(JNIEnv *env, jclass class, jlong ptr, jint key, jobject value) {
    gctx_t *self = (gctx_t *) (intptr_t) ptr;
    ggraph_t *graph = self->header.type->graph;

    gslot_t slot;
    gptype_t slot_type = jtype__j2g(env, graph, value, &slot);

    gctx__declare_slot(self, key, slot, slot_type);
    if (slot_type == gc_sbi_slot_type_object) {
        gobject__un_mark(slot.object);
    }
}

JNIEXPORT void JNICALL Java_io_greycat_impl_ContextImpl_nAttach(JNIEnv *env, jclass class, jlong ctx_ptr, jobject companion) {
    gctx_t *ctx = (gctx_t *) (intptr_t) ctx_ptr;
    ctx->ext.companion = (*env)->NewGlobalRef(env, companion);
    ctx->ext.env = env;
    ctx->ext.id = 0;
    ctx->error_handler = jcontext__error_handler;
}

JNIEXPORT jlong JNICALL Java_io_greycat_impl_ContextImpl_nOrdinal(JNIEnv *env, jclass class, jlong ptr) {
    return (jlong) gctx__ordinal((gctx_t *) (intptr_t) ptr);
}

JNIEXPORT void JNICALL Java_io_greycat_impl_ContextImpl_nSetResult(JNIEnv *env, jclass class, jlong ptr, jobject value) {
    gctx_t *ctx = (gctx_t *) (intptr_t) ptr;
    ggraph_t *graph = ctx->header.type->graph;
    gslot_t slot;
    gptype_t slot_type = jtype__j2g(env, graph, value, &slot);
    gctx__set_result(ctx, slot, slot_type);
    if (slot_type == gc_sbi_slot_type_object) {
        gobject__un_mark(slot.object);
    }
}