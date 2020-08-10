package io.greycat;

public interface Array extends io.greycat.Object, Iterable<java.lang.Object> {

    int size();

    Array set(int offset, java.lang.Object value);

    Array add(java.lang.Object value);

    java.lang.Object get(int offset);

}
