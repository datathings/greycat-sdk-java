package io.greycat.impl;

import io.greycat.*;

import java.io.*;

public final class FunctionImpl extends ObjectImpl implements Function {

    private static native String nGetName(final long ptr);

    private static native void nPipeBody(final long ptr, final java.lang.Object sub_function_body);

    private static native void nPipe(final long ptr,
                                     final int to_key, String to_name,
                                     final int src_key, String src_name,
                                     final int function_key, String func_name,
                                     final long sub_function_ptr);

    private static native boolean nParse(final long function_ptr, final String gcl_data, final String gcl_path);

    private static native long nNewContext(final long function_ptr);

    private static native void nExecute(final long ctx_ptr, final long native_ptr, final java.lang.Object callback);

    FunctionImpl(final long ptr) {
        super(ptr);
    }

    @Override
    public final String name() {
        return nGetName(this.native_ptr);
    }

    @Override
    public final Function then(final FunctionBody sub_body) {
        nPipeBody(this.native_ptr, sub_body);
        return this;
    }

    @Override
    public final Function then(final Function sub) {
        nPipe(this.native_ptr,
                0, null,
                0, null,
                0, null,
                ((FunctionImpl) sub).native_ptr);
        return this;
    }

    @Override
    public final Function then(final String content) throws IOException, GreyCatParseException {
        if (content.endsWith(".gcl")) {
            InputStream stream = this.getClass().getClassLoader().getResourceAsStream(content);
            if (stream != null) {
                return internal_then(stream, content);
            } else {
                File f = new File(content);
                if (f.exists()) {
                    return then(f);
                } else {
                    throw new FileNotFoundException("Can't resolve resource: " + content);
                }
            }
        } else {
            if (!nParse(this.native_ptr, content, null)) {
                throw new GreyCatParseException("Unable to parse script");
            }
        }
        return this;
    }

    @Override
    public final Function then(final File f) throws IOException, GreyCatParseException {
        internal_then(new FileInputStream(f), f.getAbsolutePath());
        return this;
    }

    @Override
    public final Function then(final InputStream stream) throws IOException, GreyCatParseException {
        BufferedInputStream bis = new BufferedInputStream(stream);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        int result = bis.read();
        while (result != -1) {
            buf.write((byte) result);
            result = bis.read();
        }
        if (!nParse(this.native_ptr, buf.toString(), null)) {
            throw new GreyCatParseException("Unable to parse script");
        }
        return this;
    }

    @Override
    public final Function execute() {
        ContextImpl ctx = new ContextImpl(nNewContext(this.native_ptr));
        final FunctionBody callback = (c) -> ctx.unmark();
        nExecute(ctx.native_ptr(), this.native_ptr, callback);
        return this;
    }

    @Override
    public final Function execute(ExecutionCallback cb) {
        ContextImpl ctx = new ContextImpl(nNewContext(this.native_ptr));
        return this.execute(ctx, cb);
    }

    @Override
    public final Function execute(Context ctx, ExecutionCallback cb) {
        final ContextImpl finalCtx;
        if (ctx == null) {
            finalCtx = new ContextImpl(nNewContext(this.native_ptr));
        } else {
            finalCtx = (ContextImpl) ctx;
        }
        final ErrorCallback previousErrorHandler = finalCtx.errorHandler;
        finalCtx.onError((reason, stack) -> {
            if (previousErrorHandler != null) {
                previousErrorHandler.on(reason, stack);
            }
            cb.on(reason, finalCtx);
        });
        final FunctionBody callback = (c) -> cb.on(null, finalCtx);
        nExecute(finalCtx.native_ptr(), this.native_ptr, callback);
        return this;
    }

    private Function internal_then(final InputStream stream, final String streamName) throws IOException, GreyCatParseException {
        BufferedInputStream bis = new BufferedInputStream(stream);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        int result = bis.read();
        while (result != -1) {
            buf.write((byte) result);
            result = bis.read();
        }
        if (!nParse(this.native_ptr, buf.toString(), streamName)) {
            throw new GreyCatParseException("Unable to parse script");
        }
        return this;
    }
}
