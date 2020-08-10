package io.greycat.impl;

import io.greycat.*;
import io.greycat.Object;

import java.io.*;

public final class GraphImpl implements Graph {

    private static native long nCreate(final long cacheSize, final long bufferSize, final boolean useMeta,
                                       final Graph companion);

    private static native void nDestroy(final long ptr);

    private static native long nType(final long ptr, final int hash);

    private static native long nDeclareType(final long ptr, final int typeHash, final boolean isOpen);

    private static native long nNewContext(final long ptr);

    private static native long nNewFunction(final long ptr);

    private static native Object nNewObject(final long ptr, final int left);

    private static native void nLogInfo(final long ptr, final String message);

    private static native void nLogWarning(final long ptr, final String message);

    private static native void nLogError(final long ptr, final String message);

    private static native String nExportTypes(final long ptr);

    private static native String nVersion(final long ptr);

    private static native String nFullVersion(final long ptr);

    private static native boolean nIsMeta(final long ptr, final int key);

    private static native int nDeclareMeta(final long ptr, final String name);

    private static void load_lib(boolean useCuda) throws IOException {
        String vmName = System.getProperty("java.vm.name");
        if (vmName.toLowerCase().equals("dalvik")) {
            System.loadLibrary("greycat.jni");
        } else {
            String os_name = System.getProperty("os.name").toLowerCase().trim();
            String os_arch = System.getProperty("os.arch").toLowerCase().trim();
            String target;
            if (os_name.equals("mac os x")) {
                target = "mac-x64";
            } else if (os_name.startsWith("linux")) {
                if (os_arch.equals("x86_64") || os_arch.equals("amd64")) {
                    if (useCuda) {
                        target = "linux-x64-cuda";
                    } else {
                        target = "linux-x64";
                    }
                } else if (os_arch.startsWith("arm64") || os_arch.equals("aarch64")) {
                    target = "linux-arm64";
                } else if (os_arch.startsWith("armv7")) {
                    target = "linux-armv7";
                } else {
                    target = "unknown";
                }
            } else {
                target = "unknown";
            }
            String cl_path = "lib/" + target + "/libgreycat.jni.so";
            File targetFile = File.createTempFile("greycat_", ".so", null);
            InputStream is_lib = GraphImpl.class.getClassLoader().getResourceAsStream(cl_path);
            if (is_lib == null) {
                is_lib = ClassLoader.getSystemResourceAsStream(cl_path);
            }
            if (is_lib == null) {
                System.err.println("os.name=" + os_name);
                System.err.println("os.arch=" + os_arch);
                System.err.println("target=" + target);
                System.err.println("path=" + cl_path);
                throw new RuntimeException("GreyCat Native Library not found!");
            }
            try {
                OutputStream out = new FileOutputStream(targetFile);
                byte[] buf = new byte[1024];
                int len;
                while ((len = is_lib.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                out.close();
                is_lib.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.load(targetFile.getAbsolutePath());
            if (!targetFile.delete()) {
                System.err.println("internal error!");
            }
        }
    }

    static private boolean is_loaded = false;

    final private long native_ptr;

    private void declare_mapping(String typeName, Class<?> clazz) {
        Type type = type(typeName);
        if (type != null) {
            type.setClass(clazz);
        } else {
            System.err.println("Type is not declare " + typeName);
        }
    }

    public GraphImpl(final long cacheSize, final long bufferSize, final boolean useMeta, final boolean useCuda) {
        if (!is_loaded) {
            try {
                load_lib(useCuda);
                is_loaded = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        native_ptr = nCreate(cacheSize, bufferSize, useMeta, this);

//        declare_mapping("i8", char.class);
//        declare_mapping("i16", Short.class);
        declare_mapping("i32", Integer.class);
        declare_mapping("i64", Long.class);
//
//        declare_mapping("u8", char.class);
//        declare_mapping("u16", Short.class);
//        declare_mapping("u32", Integer.class);
//        declare_mapping("u64", Long.class);
//
//        declare_mapping("f8", Float.class);
//        declare_mapping("f16", Float.class);
        declare_mapping("f32", Float.class);
        declare_mapping("f64", Double.class);

        declare_mapping("bool", Boolean.class);
        declare_mapping("Geocode", GeoCodeImpl.class);
        declare_mapping("Date", DateImpl.class);
        declare_mapping("Ref", ReferenceImpl.class);
        declare_mapping("Duration", DurationImpl.class);
        declare_mapping("Enum", EnumCallImpl.class);
        declare_mapping("String", String.class);
        declare_mapping("Object", ObjectImpl.class);
        declare_mapping("Array", ArrayImpl.class);
        declare_mapping("Blob", BlobImpl.class);
        declare_mapping("Tensor", TensorImpl.class);
    }

    @Override
    public final void destroy() {
        nDestroy(this.native_ptr);
    }

    @Override
    public final Type type(final String typeName) {
        final long res = nType(this.native_ptr, typeName.hashCode());
        if (res == 0) {
            return null;
        }
        return new TypeImpl(res);
    }

    @Override
    public final Type type(final int left) {
        final long res = nType(this.native_ptr, left);
        if (res == 0) {
            return null;
        }
        return new TypeImpl(res);
    }

    @Override
    public final Type declareType(final String name, final boolean isOpen) {
        if (!isMeta(name)) {
            declareMeta(name);
        }
        final long res = nDeclareType(this.native_ptr, name.hashCode(), isOpen);
        if (res == 0) {
            return null;
        }
        return new TypeImpl(res);
    }

    @Override
    public final Context newContext() {
        final long new_ctx_ptr = nNewContext(this.native_ptr);
        return new ContextImpl(new_ctx_ptr);
    }

    @Override
    public final Function newFunction() {
        final long new_func_ptr = nNewFunction(this.native_ptr);
        return new FunctionImpl(new_func_ptr);
    }

    @Override
    public final io.greycat.Object newObject(String typeName) {
        return (io.greycat.Object) nNewObject(this.native_ptr, typeName.hashCode());
    }

    @Override
    public final void logInfo(final String message) {
        nLogInfo(this.native_ptr, message);
    }

    @Override
    public final void logWarning(final String message) {
        nLogWarning(this.native_ptr, message);
    }

    @Override
    public final void logError(final String message) {
        nLogError(this.native_ptr, message);
    }

    @Override
    public final String exportTypes() {
        return nExportTypes(native_ptr);
    }

    @Override
    public final String version() {
        return nVersion(native_ptr);
    }

    @Override
    public final String versionFull() {
        return nFullVersion(native_ptr);
    }

    @Override
    public final boolean isMeta(String name) {
        return nIsMeta(this.native_ptr, name.hashCode());
    }

    @Override
    public final int declareMeta(String name) {
        return nDeclareMeta(this.native_ptr, name);
    }
}
