package io.greycat.impl;

import io.greycat.GeoCode;

public class GeoCodeImpl implements GeoCode {

    private long value;

    private static native String nToString(final long value);

    public GeoCodeImpl(long value) {
        this.value = value;
    }
    
    @Override
    public final String toString() {
        return nToString(this.value);
    }

}
