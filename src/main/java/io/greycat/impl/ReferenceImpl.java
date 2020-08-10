package io.greycat.impl;

import io.greycat.Reference;

public class ReferenceImpl implements Reference {

    private long value;

    private static native String nToString(final long value);

    public ReferenceImpl(long value) {
        this.value = value;
    }

    @Override
    public final String toString() {
        return nToString(this.value);
    }

}
