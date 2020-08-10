package io.greycat.impl;

import io.greycat.Date;

public class DateImpl implements Date {

    private long value;

    private static native String nToLocale(final long value);

    private static native String nToString(final long value);

    public DateImpl(final long value) {
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
