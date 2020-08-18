package io.greycat.impl;

import io.greycat.Time;

public class TimeImpl implements Time {

    private long value;

    private static native String nToLocale(final long value);

    private static native String nToString(final long value);

    public TimeImpl(final long value) {
        this.value = value;
    }

    @Override
    public final long toTimestamp() {
        return this.value;
    }

    @Override
    public final String toLocale() {
        return nToLocale(this.value);
    }

    @Override
    public final String toString() {
        return nToString(this.value);
    }
}
