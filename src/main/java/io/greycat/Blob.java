package io.greycat;

public interface Blob {

    int size();

    Blob prepare(int len);

    Blob set(byte[] data);

    Blob add(byte[] data);

    char get(int offset);

}
