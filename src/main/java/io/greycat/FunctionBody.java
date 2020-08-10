package io.greycat;

@FunctionalInterface
public interface FunctionBody {

    void on(final Context ctx);

}
