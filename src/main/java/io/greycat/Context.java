package io.greycat;

public interface Context extends Object {

    long ordinal();//TODO maybe drop this

    Context declare(final String varName);

    Context declare(final String varName, final java.lang.Object param);

    Context onError(ErrorCallback cb);

    void setResult(java.lang.Object param);

}
