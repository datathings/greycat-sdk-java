package io.greycat;

@FunctionalInterface
public interface ExecutionCallback {

    /**
     * @param error  an exception raised during the execution; or <code>null</code> if the execution
     *            proceed without errors
     * @param ctx the contextual object
     */
    void on(String error,final Context ctx);
}