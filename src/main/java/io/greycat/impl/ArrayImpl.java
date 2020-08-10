package io.greycat.impl;

import io.greycat.Array;

import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayImpl extends ObjectImpl implements Array {

    ArrayImpl(final long ptr) {
        super(ptr);
    }

    private static native int nSize(final long ptr);

    @Override
    public final int size() {
        return nSize(this.native_ptr);
    }

    private static native void nAdd(final long ptr, final java.lang.Object value);

    @Override
    public final ArrayImpl add(final java.lang.Object element) {
        nAdd(this.native_ptr, element);
        return this;
    }

    private static native void nSet(final long ptr, final int offset, final java.lang.Object value);

    @Override
    public final ArrayImpl set(final int index, final java.lang.Object element) {
        nSet(this.native_ptr, index, element);
        return this;
    }

    private static native java.lang.Object nGet(final long ptr, final int offset);

    @Override
    public final java.lang.Object get(int index) {
        if (index >= size()) {
            throw new RuntimeException("out of bounds!");
        }
        return nGet(this.native_ptr, index);
    }

    @Override
    public final Iterator<Object> iterator() {
        final ArrayImpl self = this;
        return new Iterator<java.lang.Object>() {

            private int cursor = 0;
            private final int size = self.size();

            @Override
            public final boolean hasNext() {
                return cursor < size;
            }

            @Override
            public final java.lang.Object next() {
                return self.get(cursor++);
            }

            @Override
            public final void remove() {
                throw new RuntimeException("not implemented!");
            }

            @Override
            public final void forEachRemaining(final Consumer<? super java.lang.Object> action) {
                while (cursor < size) {
                    action.accept(self.get(cursor++));
                }
            }
        };
    }
}