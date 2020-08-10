package io.greycat;

public interface Tensor extends io.greycat.Object {

    int size();

    void rawInitDouble(final int size);

    void rawInitFloat(final int size);

    void fillDouble(final int offset, final double[] data);

    void fillFloat(final int offset, final float[] data);

    java.lang.Object get(int[] dim);

}
