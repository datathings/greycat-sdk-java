package io.greycat;

public interface Object {

    long native_ptr();

    void unmark();

    Type type();

    Graph graph();

    long time();

    Object set(String varName, java.lang.Object param);

    java.lang.Object get(String varName);

}
