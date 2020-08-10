package io.greycat.impl;

import io.greycat.Graph;
import io.greycat.Object;
import io.greycat.Type;

public class ObjectImpl implements Object {

    protected long native_ptr;

    ObjectImpl(final long ptr) {
        this.native_ptr = ptr;
    }

    private static native void nUnMark(final long ptr);

    @Override
    public final void unmark() {
        if (this.native_ptr != 0) {
            nUnMark(this.native_ptr);
            this.native_ptr = 0;
        }
    }

    private static native long nType(final long ptr);

    @Override
    public final Type type() {
        if (this.native_ptr != 0) {
            return new TypeImpl(nType(this.native_ptr));
        } else {
            return null;
        }
    }

    private static native String nToString(final long ptr);

    @Override
    public final String toString() {
        if (this.native_ptr != 0) {
            return nToString(this.native_ptr);
        } else {
            return null;
        }
    }

    private static native Graph nGraph(final long ptr);

    @Override
    public final Graph graph() {
        return nGraph(this.native_ptr);
    }

    private static native long nTime(final long ptr);

    @Override
    public final long time() {
        return nTime(this.native_ptr);
    }

    private static native void nSet(final long ptr, final int key, final java.lang.Object value);

    @Override
    public final Object set(final String varName, final java.lang.Object param) {
        Graph g = this.graph();
        if (!g.isMeta(varName)) {
            g.declareMeta(varName);
        }
        nSet(this.native_ptr, varName.hashCode(), param);
        return this;
    }


    private static native java.lang.Object nGet(final long ptr, final int key);

    @Override
    public final java.lang.Object get(final String varName) {
        return nGet(this.native_ptr, varName.hashCode());
    }

    @Override
    public final long native_ptr() {
        return this.native_ptr;
    }

}
