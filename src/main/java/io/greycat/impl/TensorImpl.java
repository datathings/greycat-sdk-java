package io.greycat.impl;

import io.greycat.Tensor;

public class TensorImpl extends ObjectImpl implements Tensor {

    private static native int nSize(final long ptr);

    private static native void nRawInitDouble(final long ptr, final int size);

    private static native void nRawInitFloat(final long ptr, final int size);

    private static native void nFillDouble(final long ptr, final int offset, final double[] data);

    private static native void nFillFloat(final long ptr, final int offset, final float[] data);

    private static native java.lang.Object nGet(final long ptr, final int[] dim);

    TensorImpl(long ptr) {
        super(ptr);
    }

    @Override
    public final int size() {
        return nSize(this.native_ptr);
    }

    @Override
    public final void rawInitDouble(final int size) {
        nRawInitDouble(this.native_ptr, size);
    }

    @Override
    public final void rawInitFloat(final int size) {
        nRawInitFloat(this.native_ptr, size);
    }

    @Override
    public void fillDouble(int offset, double[] data) {
        nFillDouble(this.native_ptr, offset, data);
    }

    @Override
    public void fillFloat(int offset, float[] data) {
        nFillFloat(this.native_ptr, offset, data);
    }

    @Override
    public java.lang.Object get(int[] dim) {
        return nGet(this.native_ptr, dim);
    }

}
