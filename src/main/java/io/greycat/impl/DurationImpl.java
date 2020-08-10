package io.greycat.impl;

import io.greycat.Duration;

public class DurationImpl implements Duration {

    private long value;

    private static native String nToString(final long value);

    public DurationImpl(long value) {
        this.value = value;
    }

    @Override
    public final String toString() {
        return nToString(this.value);
    }

}
