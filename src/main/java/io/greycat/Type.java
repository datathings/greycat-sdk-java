package io.greycat;

public interface Type extends Object {

    String name();

    int key();

    Type setClass(Class<?> clazz);

    Type isOpen();

    Type declareAttribute(final int propertyKey, final int propertyType);

    Type declareAttribute(final String propertyKey, final int propertyType);

    Type declareAttribute(final int propertyKey, final String propertyType);

    Type declareAttribute(final String propertyKey, final String propertyType);

    Type declareStatic(final String propertyName, final java.lang.Object value);

    Type declareStatic(final int propertyName, final java.lang.Object value);

    Type declareFunction(final String propertyName, final FunctionBody body);

    Type declareFunction(final int propertyName, final FunctionBody body);

    Type seal();

}
