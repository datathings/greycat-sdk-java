package io.greycat.impl;

import io.greycat.Context;
import io.greycat.ErrorCallback;
import io.greycat.Graph;
import io.greycat.GreyCatRuntimeError;

public final class ContextImpl extends ObjectImpl implements Context {

    public static native void nAttach(final long ptr, final Object companion);

    private static native void nDeclare(final long ptr, final int key, final java.lang.Object value);

    private static native long nOrdinal(final long ptr);

    ErrorCallback errorHandler = (String reason, String stack) -> {
        System.err.println("GreyCat Runtime Error: " + reason + "\n\t" + stack);
    };

    ContextImpl(final long ptr) {
        super(ptr);
        nAttach(this.native_ptr, this);
    }

    public Context onError(ErrorCallback cb) {
        this.errorHandler = cb;
        return this;
    }

    @Override
    public final Context declare(final String varName) {
        Graph g = this.graph();
        if (!g.isMeta(varName)) {
            g.declareMeta(varName);
        }
        nDeclare(native_ptr, varName.hashCode(), null);
        return this;
    }

    @Override
    public Context declare(String varName, Object param) {
        Graph g = this.graph();
        if (!g.isMeta(varName)) {
            g.declareMeta(varName);
        }
        nDeclare(native_ptr, varName.hashCode(), param);
        return this;
    }

    @Override
    public final long ordinal() {
        return nOrdinal(native_ptr);
    }

    private static native void nSetResult(final long ptr, final java.lang.Object value);

    @Override
    public final void setResult(final java.lang.Object param) {
        nSetResult(this.native_ptr, param);
    }

}
