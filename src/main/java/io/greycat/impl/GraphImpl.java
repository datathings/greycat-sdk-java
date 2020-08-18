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

    private enum GreyCatTarget {
        x64_cuda_11("x64-cuda-11"),
        x64_cuda_10_2("x64-cuda-10-2"),
        x64_libc("x64-libc"),
        arm64_v8a_bionic("arm64_v8a_bionic"),
        aarch64_libc("aarch64-libc"),
        armv7_eabihf_libc("armv7-eabihf-libc"),
        x64_mac("x64-mac");

        private final String prefix;

        GreyCatTarget(String envUrl) {
            this.prefix = envUrl;
        }

        public String getPrefix() {
            return prefix;
        }
    }

    private static boolean load_native(GreyCatTarget target) {
        if (target.equals(GreyCatTarget.arm64_v8a_bionic)) {
            try {
                System.loadLibrary("greycat-java");
                return true;
            } catch (Throwable e) {
                return false;
            }
        } else {
            String cl_path = "lib/" + target.getPrefix() + "/libgreycat-java.so";
            File targetFile;
            try {
                targetFile = File.createTempFile("greycat_", ".so", null);
                InputStream is_lib = GraphImpl.class.getClassLoader().getResourceAsStream(cl_path);
                if (is_lib == null) {
                    is_lib = ClassLoader.getSystemResourceAsStream(cl_path);
                    if (is_lib == null) {
                        Thread.currentThread().getContextClassLoader().getResourceAsStream(cl_path);
                    }
                }
                if (is_lib != null) {
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
                    return true;
                }
            } catch (IOException e) {
                //nothing
            }
        }
        return false;
    }

    private static void load_lib() throws RuntimeException {
        String vmName = System.getProperty("java.vm.name");
        if (vmName.toLowerCase().equals("dalvik")) {
            if (load_native(GreyCatTarget.arm64_v8a_bionic)) {
                return;
            }
        } else {
            String os_name = System.getProperty("os.name").toLowerCase().trim();
            String os_arch = System.getProperty("os.arch").toLowerCase().trim();
            if (os_name.equals("mac os x")) {
                if (load_native(GreyCatTarget.x64_mac)) {
                    return;
                }
            } else if (os_name.startsWith("linux")) {
                if (os_arch.equals("x86_64") || os_arch.equals("amd64")) {
                    if (load_native(GreyCatTarget.x64_cuda_11)) {
                        return;
                    }
                    if (load_native(GreyCatTarget.x64_cuda_10_2)) {
                        return;
                    }
                    if (load_native(GreyCatTarget.x64_libc)) {
                        return;
                    }
                } else if (os_arch.startsWith("arm64") || os_arch.equals("aarch64")) {
                    if (load_native(GreyCatTarget.aarch64_libc)) {
                        return;
                    }
                } else if (os_arch.startsWith("armv7") || os_arch.equals("armv7l")) {
                    if (load_native(GreyCatTarget.armv7_eabihf_libc)) {
                        return;
                    }
                }
            }
        }
        throw new RuntimeException("GreyCat runtime can not be loaded!");
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

    public GraphImpl(final long cacheSize, final long bufferSize) {
        if (!is_loaded) {
            try {
                load_lib();
                is_loaded = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        native_ptr = nCreate(cacheSize, bufferSize, true, this);

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
        declare_mapping("Time", TimeImpl.class);
        declare_mapping("Ref", ReferenceImpl.class);
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
