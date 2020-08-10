package io.greycat;


import io.greycat.impl.GraphImpl;

public interface Graph {

    Type declareType(String name, boolean isOpen);

    Type type(final String typeName);

    Type type(final int left);

    Context newContext();

    Function newFunction();

    io.greycat.Object newObject(String typeName);

    void logInfo(String message);

    void logWarning(String message);

    void logError(String message);

    void destroy();

    String exportTypes();

    String version();

    String versionFull();

    boolean isMeta(String name);

    int declareMeta(String name);

    static Graph newGraph() {
        return new GraphImpl(10000, 1000, true, false);
    }

    static Graph newGraph(final long cacheSize) {
        return new GraphImpl(cacheSize, (long) (cacheSize * 0.1), true, false);
    }

    static Graph newGraph(final long cacheSize, final long bufferSize) {
        return new GraphImpl(cacheSize, bufferSize, true, false);
    }

    static Graph newGraph(final long cacheSize, final long bufferSize, final boolean useCuda) {
        return new GraphImpl(cacheSize, bufferSize, true, useCuda);
    }

}