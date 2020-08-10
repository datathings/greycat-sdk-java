package io.greycat.impl;

import io.greycat.Blob;

public class BlobImpl extends ObjectImpl implements Blob {

    private static native int nSize(final long ptr);

    private static native void nReset(final long ptr);

    private static native void nPrepare(final long ptr, final int size);

    private static native char nGet(final long ptr, final int offset);

    private static native void nAppend(final long ptr, final byte[] data);

    BlobImpl(long ptr) {
        super(ptr);
    }

    @Override
    public final int size() {
        return nSize(this.native_ptr);
    }

    @Override
    public Blob prepare(int len) {
        nPrepare(this.native_ptr, len);
        return this;
    }

    @Override
    public final Blob set(final byte[] data) {
        nReset(this.native_ptr);
        nAppend(this.native_ptr, data);
        return this;
    }

    @Override
    public final Blob add(final byte[] data) {
        nAppend(this.native_ptr, data);
        return this;
    }

    @Override
    public final char get(final int offset) {
        return nGet(this.native_ptr, offset);
    }

}
