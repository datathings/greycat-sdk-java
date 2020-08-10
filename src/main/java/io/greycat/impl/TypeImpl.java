package io.greycat.impl;

import io.greycat.FunctionBody;
import io.greycat.Type;

public final class TypeImpl extends ObjectImpl implements Type {

    private static native String nName(final long ptr);

    private static native int nKey(final long ptr);

    private static native void nSetClass(final long ptr, final Class<?> wrapper);

    private static native void nIsOpen(final long ptr);

    private static native void nDeclareAttribute(final long ptr, final int prop_key, final String prop_name, final int type_key);

    private static native void nDeclareStatic(final long ptr, final int prop_key, final String prop_name, final java.lang.Object value);

    private static native void nDeclareFunction(final long ptr, final int prop_key, final String prop_name, final java.lang.Object value);

    private static native void nSeal(final long ptr);

    TypeImpl(final long ptr) {
        super(ptr);
    }

    @Override
    public final String name() {
        return nName(this.native_ptr);
    }

    @Override
    public final int key() {
        return nKey(this.native_ptr);
    }

    @Override
    public final Type setClass(final Class<?> clazz) {
        nSetClass(this.native_ptr, clazz);
        return this;
    }


    @Override
    public final Type isOpen() {
        nIsOpen(this.native_ptr);
        return this;
    }

    @Override
    public final Type declareAttribute(final int propertyKey, final int propertyType) {
        nDeclareAttribute(this.native_ptr, propertyKey, null, propertyType);
        return this;
    }

    @Override
    public final Type declareAttribute(final String propertyKey, final int propertyType) {
        nDeclareAttribute(this.native_ptr, propertyKey.hashCode(), propertyKey, propertyType);
        return this;
    }

    @Override
    public final Type declareAttribute(final int propertyKey, final String propertyType) {
        nDeclareAttribute(this.native_ptr, propertyKey, null, propertyType.hashCode());
        return this;
    }

    @Override
    public final Type declareAttribute(final String propertyKey, final String propertyType) {
        nDeclareAttribute(this.native_ptr, propertyKey.hashCode(), propertyKey, propertyType.hashCode());
        return this;
    }

    @Override
    public final Type declareStatic(final String propertyName, final java.lang.Object value) {
        nDeclareStatic(this.native_ptr, propertyName.hashCode(), propertyName, value);
        return this;
    }

    @Override
    public final Type declareStatic(final int propertyName, final java.lang.Object value) {
        nDeclareStatic(this.native_ptr, propertyName, null, value);
        return this;
    }

    @Override
    public final Type declareFunction(final String propertyName, final FunctionBody body) {
        nDeclareFunction(this.native_ptr, propertyName.hashCode(), propertyName, body);
        return this;
    }

    @Override
    public final Type declareFunction(final int propertyName, final FunctionBody body) {
        nDeclareFunction(this.native_ptr, propertyName, null, body);
        return this;
    }

    @Override
    public final Type seal() {
        nSeal(this.native_ptr);
        return this;
    }

}
