package io.greycat.impl;

import io.greycat.EnumCall;

public class EnumCallImpl implements EnumCall {

    private int type;

    private int value;

    private long ptr;

    private static native String nType(final long ptr, final long type);

    private static native String nValue(final long ptr, final long value);

    public EnumCallImpl(int type, int value, long ptr) {
        this.type = type;
        this.value = value;
        this.ptr = ptr;
    }

    @Override
    public final String type() {
        return nType(ptr, type);
    }

    @Override
    public final String value() {
        return nValue(ptr, value);
    }

    @Override
    public final String toString() {
        return nType(ptr, type) + "::" + nValue(ptr, value);
    }

}
