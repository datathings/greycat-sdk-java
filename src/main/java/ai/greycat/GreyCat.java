package ai.greycat;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

@SuppressWarnings("IOStreamConstructor")
public final class GreyCat {
    public static final short abi_proto = 1;

    public static final class AbiReader {

        private final Stream stream;

        private AbiReader(final Stream stream) {
            this.stream = stream;
        }

        public java.lang.Object read() throws java.io.IOException {
            return stream.read();
        }

        public int available() {
            try {
                return stream.is.available();
            } catch (java.io.IOException ex) {
                return 0;
            }
        }
    }

    public static final class AbiWriter {

        private final Stream stream;

        private AbiWriter(final Stream stream) {
            this.stream = stream;
        }

        public void write(java.lang.Object object) throws java.io.IOException {
            stream.write(object);
        }
    }

    public AbiReader openAbiRead(String path) throws java.io.IOException {
        Stream s = new Stream(this, new java.io.BufferedInputStream(new java.io.FileInputStream(path)));
        s.readAbiHeader();
        return new AbiReader(s);
    }

    public AbiWriter openAbiWrite(String path) throws java.io.IOException {
        Stream s = new Stream(this, new java.io.PrintStream(new java.io.FileOutputStream(path)));
        s.writeAbiHeader();
        return new AbiWriter(s);
    }

    static final protected class Stream {

        private final static byte ASCII_MAX = 127;

        private static final PrimitiveLoader[] PRIMITIVE_LOADERS = new PrimitiveLoader[PrimitiveType.SIZE];

        static {
            final PrimitiveLoader error_loader = (stream) -> {
                throw new IllegalArgumentException("invalid primitive type");
            };
            PRIMITIVE_LOADERS[PrimitiveType.NULL] = Stream::read_null;
            PRIMITIVE_LOADERS[PrimitiveType.BOOL] = Stream::read_bool;
            PRIMITIVE_LOADERS[PrimitiveType.CHAR] = Stream::read_char;
            PRIMITIVE_LOADERS[PrimitiveType.INT] = Stream::read_vi64;
            PRIMITIVE_LOADERS[PrimitiveType.FLOAT] = Stream::read_f64;
            PRIMITIVE_LOADERS[PrimitiveType.NODE] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_node];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.NODE_TIME] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_node_time];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.NODE_INDEX] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_node_index];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.NODE_LIST] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_node_list];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.NODE_GEO] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_node_geo];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.GEO] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_geo];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.TIME] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_time];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.DURATION] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_duration];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.ENUM] = Stream::read_object;
            PRIMITIVE_LOADERS[PrimitiveType.OBJECT] = Stream::read_object;
            PRIMITIVE_LOADERS[PrimitiveType.TU2D] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_ti2d];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.TU3D] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_ti3d];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.TU4D] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_ti4d];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.TU5D] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_ti5d];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.TU6D] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_ti6d];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.TU10D] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_ti10d];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.TUF2D] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_tf2d];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.TUF3D] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_tf3d];
                return t.loader.load(t, stream);
            };
            PRIMITIVE_LOADERS[PrimitiveType.TUF4D] = (GreyCat.Stream stream) -> {
                final GreyCat.Type t = stream.greycat.types[stream.greycat.type_offset_core_tf4d];
                return t.loader.load(t, stream);
            };
//            PRIMITIVE_LOADERS[PrimitiveType.BLOCK] = error_loader;
            PRIMITIVE_LOADERS[PrimitiveType.BLOCK_REF] = error_loader;
            PRIMITIVE_LOADERS[PrimitiveType.FUNCTION] = error_loader; // TODO?
            PRIMITIVE_LOADERS[PrimitiveType.UNDEFINED] = error_loader;
            PRIMITIVE_LOADERS[PrimitiveType.STRING_LIT] = Stream::read_string_lit;
        }

        private final byte[] tmp = new byte[8];
        private java.io.BufferedInputStream is;
        private java.io.OutputStream os;

        final GreyCat greycat;

        Stream(GreyCat greycat, java.io.OutputStream os) {
            this.greycat = greycat;
            this.os = os;
        }

        Stream(GreyCat greycat, java.io.BufferedInputStream is) {
            this.greycat = greycat;
            this.is = is;
        }

        void readAbiHeader() throws java.io.IOException {
            int abi_major = this.read_i16();
            if (abi_major != GreyCat.abi_proto) {
                throw new RuntimeException("wrong ABI protocol major version");
            }
            int abi_magic = this.read_i16();
            if (abi_magic != greycat.abi_magic) {
                throw new RuntimeException("wrong ABI magic");
            }
            int abi_version = this.read_i32();
            if (abi_version > greycat.abi_version) {
                throw new RuntimeException("greater abi version, please reload this handler");
            }
        }

        java.lang.Object read() throws java.io.IOException {
            byte primitiveOffset = read_i8();
            if (61 == primitiveOffset) {
                System.out.println("DEBUG");
            }
            return PRIMITIVE_LOADERS[primitiveOffset].load(this);
        }

        void writeAbiHeader() throws java.io.IOException {
            this.write_i16(GreyCat.abi_proto);
            this.write_i16(greycat.abi_magic);
            this.write_i32(greycat.abi_version);
        }

        void write(java.lang.Object value) throws java.io.IOException {
            if (value == null) {
                write_i8(GreyCat.PrimitiveType.NULL);
            } else if (value instanceof Boolean) {
                write_i8(GreyCat.PrimitiveType.BOOL);
                write_bool((Boolean) value);
            } else if (value instanceof Character) {
                write_i8(GreyCat.PrimitiveType.CHAR);
                char c = (Character) value;
                if ((int) c > ASCII_MAX) {
                    throw new IllegalArgumentException("Only ASCII characters are allowed: " + c);
                }
                write_i8((byte) c);
            } else if (value instanceof Long) {
                write_i8(GreyCat.PrimitiveType.INT);
                write_vi64((long) value);
            } else if (value instanceof Integer) {
                write_i8(GreyCat.PrimitiveType.INT);
                write_vi64((int) value);
            } else if (value instanceof Short) {
                write_i8(GreyCat.PrimitiveType.INT);
                write_vi64((short) value);
            } else if (value instanceof Double || value instanceof Float) {
                write_i8(GreyCat.PrimitiveType.FLOAT);
                write_f64((double) value);
            } else if (value instanceof String) {
                String string = (String) value;
                Integer symbolOffset = greycat.symbols_off_by_value.get(string);
                if (symbolOffset != null) {
                    write_i8(GreyCat.PrimitiveType.STRING_LIT);
                    write_vu32((symbolOffset << 1) | 1);
                } else {
                    write_i8(GreyCat.PrimitiveType.OBJECT);
                    write_vu32(greycat.type_offset_core_string);
                    final byte[] data = string.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                    write_vu32(data.length << 1);
                    write_i8_array(data, 0, data.length);
                }
            } else if (value instanceof Object) {
                Object object = (Object) value;
                object.saveType(this);
                object.save(this);
            } else {
                throw new IllegalArgumentException("wrong state");
            }
        }

        void close() throws java.io.IOException {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }

        java.lang.Object read_null() {
            return null;
        }

        boolean read_bool() throws java.io.IOException {
            return read_i8() != 0;
        }

        char read_char() throws java.io.IOException {
            return (char) is.read();
        }

        byte read_i8() throws java.io.IOException {
            return (byte) is.read();
        }

        int read_i16() throws java.io.IOException {
            if (is.read(tmp, 0, 2) == -1) {
                throw new java.io.IOException();
            }
            return ((tmp[1] << 24) >>> 16) +
                    ((tmp[0] << 24) >>> 24);
        }

        int read_i32() throws java.io.IOException {
            if (is.read(tmp, 0, 4) == -1) {
                throw new java.io.IOException();
            }
            return (tmp[3] << 24) +
                    ((tmp[2] << 24) >>> 8) +
                    ((tmp[1] << 24) >>> 16) +
                    ((tmp[0] << 24) >>> 24);
        }

        int read_vu32() throws java.io.IOException {
            byte current;
            int value = 0;
            is.mark(5);
            byte[] bytes = new byte[5];
            if (-1 == is.read(bytes, 0, 5)) {
                throw new java.io.IOException();
            }

            current = bytes[0];
            value |= Byte.toUnsignedLong(current) & 0x7f;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(1);
                return value;
            }

            current = bytes[1];
            value |= (Byte.toUnsignedLong(current) & 0x7f) << 7;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(2);
                return value;
            }

            current = bytes[2];
            value |= (Byte.toUnsignedLong(current) & 0x7f) << 14;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(3);
                return value;
            }

            current = bytes[3];
            value |= (Byte.toUnsignedLong(current) & 0x7f) << 21;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(4);
                return value;
            }

            current = bytes[4];
            value |= (Byte.toUnsignedLong(current)) << 28;
            return value;
        }

        long read_i64() throws java.io.IOException {
            if (is.read(tmp, 0, 8) == -1) {
                throw new java.io.IOException();
            }
            return ((long) tmp[7] << 56) +
                    (((long) tmp[6] << 56) >>> 8) +
                    (((long) tmp[5] << 56) >>> 16) +
                    (((long) tmp[4] << 56) >>> 24) +
                    (((long) tmp[3] << 56) >>> 32) +
                    (((long) tmp[2] << 56) >>> 40) +
                    (((long) tmp[1] << 56) >>> 48) +
                    (((long) tmp[0] << 56) >>> 56);
        }

        long read_vi64() throws java.io.IOException {
            long sign_swapped_value = read_vu64();
            return (sign_swapped_value >>> 1) ^ (-(sign_swapped_value & 1));
        }

        long read_vu64() throws java.io.IOException {
            byte current;
            long value = 0;
            is.mark(9);
            byte[] bytes = new byte[9];
            if (-1 == is.read(bytes, 0, 9)) {
                throw new java.io.IOException();
            }

            current = bytes[0];
            value |= Byte.toUnsignedLong(current) & 0x7f;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(1);
                return value;
            }

            current = bytes[1];
            value |= (Byte.toUnsignedLong(current) & 0x7f) << 7;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(2);
                return value;
            }

            current = bytes[2];
            value |= (Byte.toUnsignedLong(current) & 0x7f) << 14;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(3);
                return value;
            }

            current = bytes[3];
            value |= (Byte.toUnsignedLong(current) & 0x7f) << 21;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(4);
                return value;
            }

            current = bytes[4];
            value |= (Byte.toUnsignedLong(current) & 0x7f) << 28;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(5);
                return value;
            }

            current = bytes[5];
            value |= (Byte.toUnsignedLong(current) & 0x7f) << 35;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(6);
                return value;
            }

            current = bytes[6];
            value |= (Byte.toUnsignedLong(current) & 0x7f) << 42;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(7);
                return value;
            }

            current = bytes[7];
            value |= (Byte.toUnsignedLong(current) & 0x7f) << 49;
            if (0 == (current & 0x80)) {
                is.reset();
                //noinspection ResultOfMethodCallIgnored
                is.skip(8);
                return value;
            }

            current = bytes[8];
            value |= (Byte.toUnsignedLong(current)) << 56;
            return value;
        }

        double read_f64() throws java.io.IOException {
            return Double.longBitsToDouble(read_i64());
        }

        byte[] read_i8_array(final int len) throws java.io.IOException {
            byte[] newArr = new byte[len];
            if (is.read(newArr, 0, len) == -1) {
                throw new java.io.IOException();
            }
            return newArr;
        }

        String read_string(int len) throws java.io.IOException {
            return new String(read_i8_array(len), java.nio.charset.StandardCharsets.UTF_8);
        }

        String read_string_lit() throws java.io.IOException {
            int offset = read_vu32();
            if (0 == (offset & 1)) {
                throw new java.io.IOException("wrong state");
            }
            offset >>>= 1;
            if (offset < greycat.symbols.length) {
                return greycat.symbols[offset];
            }
            throw new IllegalArgumentException("invalid primitive type");
        }

        java.lang.Object read_object() throws java.io.IOException {
            int typeOffset = read_vu32();
            final Type type = greycat.types[typeOffset];
            return type.loader.load(type, this);
        }

        void write_bool(final boolean b) throws java.io.IOException {
            os.write((byte) (b ? 1 : 0));
        }

        void write_i8(final byte b) throws java.io.IOException {
            os.write(b);
        }

        void write_i16(final int i) throws java.io.IOException {
            tmp[0] = (byte) (i & 0xFF);
            tmp[1] = (byte) ((i >>> 8) & 0xFF);
            os.write(tmp, 0, 2);
        }

        void write_i32(final int i) throws java.io.IOException {
            tmp[0] = (byte) (i & 0xFF);
            tmp[1] = (byte) ((i >>> 8) & 0xFF);
            tmp[2] = (byte) ((i >>> 16) & 0xFF);
            tmp[3] = (byte) ((i >>> 24) & 0xFF);
            os.write(tmp, 0, 4);
        }

        void write_vu32(final int i) throws java.io.IOException {
            byte[] packed_value = new byte[5];
            int value = i;

            packed_value[0] = (byte) (value & 0x7f);
            if (Integer.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 1);
                return;
            }

            packed_value[0] |= 0x80;
            value >>>= 7;
            packed_value[1] = (byte) (value & 0x7f);
            if (Integer.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 2);
                return;
            }

            packed_value[1] |= 0x80;
            value >>>= 7;
            packed_value[2] = (byte) (value & 0x7f);
            if (Integer.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 3);
                return;
            }

            packed_value[2] |= 0x80;
            value >>>= 7;
            packed_value[3] = (byte) (value & 0x7f);
            if (Integer.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 4);
                return;
            }

            packed_value[3] |= 0x80;
            value >>>= 7;
            packed_value[4] = (byte) value;
            write_i8_array(packed_value, 0, 5);
        }

        void write_i64(final long l) throws java.io.IOException {
            tmp[0] = (byte) (l & 0xFF);
            tmp[1] = (byte) ((l >>> 8) & 0xFF);
            tmp[2] = (byte) ((l >>> 16) & 0xFF);
            tmp[3] = (byte) ((l >>> 24) & 0xFF);
            tmp[4] = (byte) ((l >>> 32) & 0xFF);
            tmp[5] = (byte) ((l >>> 40) & 0xFF);
            tmp[6] = (byte) ((l >>> 48) & 0xFF);
            tmp[7] = (byte) ((l >>> 56) & 0xFF);
            os.write(tmp, 0, 8);
        }

        void write_vi64(final long l) throws java.io.IOException {
            write_vu64((l << 1) ^ (l >> 63));
        }

        void write_vu64(final long l) throws java.io.IOException {
            byte[] packed_value = new byte[9];
            long value = l;

            packed_value[0] = (byte) (value & 0x7f);
            if (Long.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 1);
                return;
            }

            packed_value[0] |= 0x80;
            value >>>= 7;
            packed_value[1] = (byte) value;
            if (Long.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 2);
                return;
            }

            packed_value[1] |= 0x80;
            value >>>= 7;
            packed_value[2] = (byte) value;
            if (Long.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 3);
                return;
            }

            packed_value[2] |= 0x80;
            value >>>= 7;
            packed_value[3] = (byte) value;
            if (Long.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 4);
                return;
            }

            packed_value[3] |= 0x80;
            value >>>= 7;
            packed_value[4] = (byte) value;
            if (Long.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 5);
                return;
            }

            packed_value[4] |= 0x80;
            value >>>= 7;
            packed_value[5] = (byte) value;
            if (Long.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 6);
                return;
            }

            packed_value[5] |= 0x80;
            value >>>= 7;
            packed_value[6] = (byte) value;
            if (Long.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 7);
                return;
            }

            packed_value[6] |= 0x80;
            value >>>= 7;
            packed_value[7] = (byte) value;
            if (Long.compareUnsigned(value, 0x80) < 0) {
                write_i8_array(packed_value, 0, 8);
                return;
            }

            packed_value[7] |= 0x80;
            value >>>= 7;
            packed_value[8] = (byte) value;
            write_i8_array(packed_value, 0, 9);
        }

        void write_f64(final double d) throws java.io.IOException {
            write_i64(Double.doubleToLongBits(d));
        }

        @SuppressWarnings("SameParameterValue")
        void write_i8_array(final byte[] bytes, final int offset, final int length) throws java.io.IOException {
            os.write(bytes, offset, length);
        }

        @FunctionalInterface
        private interface PrimitiveLoader {
            java.lang.Object load(Stream stream) throws java.io.IOException;
        }
    }

    public static final class Function {

        public final String name;

        public Function(String name) {
            this.name = name;
        }
    }

    public static final class Type {

        public static final class Attribute {
            public final String name;
            public final int abiType;
            public final int progTypeOffset;
            public final int mappedAnyOffset;
            public final int mappedAttOffset;
            public final byte sbiType;
            public final boolean nullable;
            public final boolean mapped;

            public Attribute(String name, int abiType, int progTypeOffset, int mappedAnyOffset, int mappedAttOffset, byte sbiType, boolean nullable, boolean mapped) {
                this.name = name;
                this.abiType = abiType;
                this.progTypeOffset = progTypeOffset;
                this.mappedAnyOffset = mappedAnyOffset;
                this.mappedAttOffset = mappedAttOffset;
                this.sbiType = sbiType;
                this.nullable = nullable;
                this.mapped = mapped;
            }
        }

        public final int offset;
        public final String name;
        public final int mapped_type_off;
        @SuppressWarnings({"unused", "FieldCanBeLocal"})
        public final int masked_type_off;
        public final int nullable_nb_bytes;
        public final boolean is_masked;

        public final boolean is_abstract;
        public final boolean is_enum;
        public final boolean is_native;
        /**
         * this follows the abi order
         */
        public final Attribute[] attributes;
        public final java.util.Map<String, Integer> attribute_off_by_name = new java.util.HashMap<>();
        public final GreyCat greycat;
        public final GreyCat.Factory factory;
        public final GreyCat.Loader loader;
        public final Enum[] enum_values;
        public java.lang.Object[] static_values;

        /**
         * this follows the code gen order
         */
        public int[] generated_offsets = null;

        static final Loader error_loader = (type, stream) -> {
            throw new IllegalArgumentException("wrong state");
        };

        static final Loader enum_loader = (type, stream) -> {
            final Type programType = type.greycat.types[type.mapped_type_off];
            final int valueOffset = stream.read_vu32();
            final Type.Attribute abiTypeAtt = type.attributes[valueOffset];
            return programType.enum_values[abiTypeAtt.mappedAttOffset];
        };

        static final Loader object_loader = (type, stream) -> {
            final Type programType = type.greycat.types[type.mapped_type_off];
            final java.lang.Object[] attributes = new java.lang.Object[programType.attributes.length];
            byte[] nullable_bitset = stream.read_i8_array(type.nullable_nb_bytes);
            int nullable_offset = -1;
            for (int attOffset = 0; attOffset < type.attributes.length; attOffset++) {
                Type.Attribute att = type.attributes[attOffset];
                java.lang.Object loadedField;
                if (att.nullable) {
                    ++nullable_offset;
                    // #define gc_object__is_not_null(bitset, offset) ((((bitset)[(offset) >> 3]) >> ((offset) & (gc_object_bitset_block_size - 1))) & 1)
                    if (0 == (((nullable_bitset[(nullable_offset) >> 3]) >> ((nullable_offset) & 7)) & 1)) {
                        continue;
                    }
                }
                byte loadType = att.sbiType;
                if (loadType == PrimitiveType.UNDEFINED) {
                    loadType = stream.read_i8();
                }
                switch (loadType) {
                    case PrimitiveType.ENUM: {
                        Type fieldType = type.greycat.types[att.abiType];
                        if (att.sbiType == PrimitiveType.UNDEFINED) {
                            loadedField = enum_loader.load(type.greycat.types[stream.read_vu32()], stream);
                        } else {
                            loadedField = enum_loader.load(fieldType, stream);
                        }
                        break;
                    }
                    case PrimitiveType.OBJECT: {
                        Type fieldType = type.greycat.types[att.abiType];
                        if (!fieldType.is_native && (fieldType.is_abstract || att.sbiType == PrimitiveType.UNDEFINED)) {
                            fieldType = type.greycat.types[stream.read_vu32()];
                        }
                        loadedField = fieldType.loader.load(fieldType, stream);
                        break;
                    }
                    default: {
                        loadedField = Stream.PRIMITIVE_LOADERS[att.sbiType].load(stream);
                        break;
                    }
                }
                if (att.mapped) {
                    attributes[att.mappedAttOffset] = loadedField;
                }
            }
            if (programType.factory == null) {
                return new Object(programType, attributes);
            } else {
                return programType.factory.build(programType, attributes);
            }
        };

        public Type(int offset, String name, int mapped_type_off, int masked_type_off, int nullable_nb_bytes, boolean is_masked, boolean is_abstract, boolean is_enum, boolean is_native, Attribute[] typeAttributes, Factory factory, Loader loader, GreyCat greycat) {
            this.offset = offset;
            this.name = name;
            this.mapped_type_off = mapped_type_off;
            this.masked_type_off = masked_type_off;
            this.nullable_nb_bytes = nullable_nb_bytes;
            this.is_masked = is_masked;
            this.is_abstract = is_abstract;
            this.is_enum = is_enum;
            this.is_native = is_native;
            this.attributes = typeAttributes;
            for (int i = 0; i < typeAttributes.length; i++) {
                attribute_off_by_name.put(typeAttributes[i].name, i);
            }
            this.greycat = greycat;
            this.factory = factory;
            if (offset == mapped_type_off) {
                /* this is a program type, so let init all needed fields */
                /* for enum, create all values */
                if (this.is_enum) {
                    this.enum_values = new Enum[typeAttributes.length];
                    for (int enumOffset = 0; enumOffset < typeAttributes.length; enumOffset++) {
                        final java.lang.Object[] attributes = {enumOffset, typeAttributes[enumOffset].name, null};
                        if (this.factory == null) {
                            this.enum_values[enumOffset] = new Enum(this, attributes);
                        } else {
                            this.enum_values[enumOffset] = (Enum) this.factory.build(this, attributes);
                        }
                    }
                } else {
                    this.enum_values = null;
                }
            } else {
                this.enum_values = null;
            }
            if (loader != null) {
                this.loader = loader;
            } else if (this.is_native) {
                this.loader = error_loader;
            } else if (this.is_enum) {
                this.loader = enum_loader;
            } else {
                this.loader = object_loader;
            }
        }

        public void resolveGeneratedOffsets(String... attributeNames) {
            this.generated_offsets = new int[attributeNames.length];
            for (int i = 0; i < attributeNames.length; i++) {
                Integer resolved = attribute_off_by_name.get(attributeNames[i]);
                if (resolved == null) {
                    throw new IllegalArgumentException("unmapped generated field, please re-generate this code!");
                }
                generated_offsets[i] = resolved;
            }
        }

        public void resolveGeneratedOffsetWithValues(java.lang.Object... name_values) {
            this.generated_offsets = new int[name_values.length / 2];
            for (int i = 0; i < name_values.length; i += 2) {
                Integer resolved = attribute_off_by_name.get(name_values[i].toString());
                if (resolved == null) {
                    throw new IllegalArgumentException("unmapped generated field, please re-generate this code!");
                }
                generated_offsets[i / 2] = resolved;
                enum_values[resolved].value = name_values[i + 1];
            }
        }

    }

    public static class Enum extends GreyCat.Object {
        private final int offset;
        public final String key;
        public java.lang.Object value;

        protected Enum(GreyCat.Type type, java.lang.Object[] attributes) {
            super(type, null);
            this.offset = (Integer) attributes[0];
            this.key = (String) attributes[1];
            this.value = attributes[2];
        }

        @Override
        protected final void saveType(Stream stream) throws java.io.IOException {
            stream.write_i8(GreyCat.PrimitiveType.ENUM);
            stream.write_vu32(type.offset);
        }

        @Override
        protected final void save(Stream stream) throws java.io.IOException {
            stream.write_vu32(offset);
        }

        @Override
        public String toString() {
            if (value == null) {
                return type.name + "." + key;
            }
            return type.name + "." + key + "{value=" + value + '}';
        }
    }

    @FunctionalInterface
    public interface Loader {
        java.lang.Object load(Type type, Stream stream) throws java.io.IOException;

    }

    @FunctionalInterface
    public interface Factory {
        java.lang.Object build(Type type, java.lang.Object... parameters);
    }

    public abstract static class Library {

        GreyCat.Type[] mapped = null;

        abstract String name();

        abstract void configure(java.util.Map<String, Loader> loaders, java.util.Map<String, Factory> factories);

        abstract void init(GreyCat greycat);
    }

    public static final class PrimitiveType {
        static final byte NULL = 0;
        static final byte BOOL = 1;
        static final byte CHAR = 2;
        static final byte INT = 3;
        static final byte FLOAT = 4;
        static final byte NODE = 5;
        static final byte NODE_TIME = 6;
        static final byte NODE_INDEX = 7;
        static final byte NODE_LIST = 8;
        static final byte NODE_GEO = 9;
        static final byte GEO = 10;
        static final byte TIME = 11;
        static final byte DURATION = 12;
        static final byte CUBIC = 13;
        static final byte ENUM = 14;
        static final byte OBJECT = 15;
        static final byte TU2D = 16;
        static final byte TU3D = 17;
        static final byte TU4D = 18;
        static final byte TU5D = 19;
        static final byte TU6D = 20;
        static final byte TU10D = 21;
        static final byte TUF2D = 22;
        static final byte TUF3D = 23;
        static final byte TUF4D = 24;
        static final byte BLOCK_REF = 25;
        static final byte FUNCTION = 26;
        static final byte UNDEFINED = 27;
        static final byte STRING_LIT = 28;
        static final byte SIZE = 29;
    }

    public static class Object {
        public final Type type;
        public java.lang.Object[] attributes;

        public Object(Type type, java.lang.Object[] attributes) {
            this.type = type;
            this.attributes = attributes;
        }

        @SuppressWarnings({"unused"})
        public final java.lang.Object get(String attributeName) {
            return get(type.attribute_off_by_name.get(attributeName));
        }

        @SuppressWarnings({"unused"})
        public final void set(String attributeName, java.lang.Object value) {
            set(type.attribute_off_by_name.get(attributeName), value);
        }

        protected java.lang.Object get(int offset) {
            return attributes[offset];
        }

        protected void set(int offset, java.lang.Object value) {
            attributes[offset] = value;
        }

        protected void saveType(Stream stream) throws java.io.IOException {
            stream.write_i8(GreyCat.PrimitiveType.OBJECT);
            stream.write_vu32(type.offset);
        }

        protected void save(Stream stream) throws java.io.IOException {
            byte[] nullable_bitset = new byte[type.nullable_nb_bytes];
            byte nullable_offset = 0;
            Type.Attribute field;
            for (int offset = 0; offset < type.attributes.length; ++offset) {
                field = type.attributes[offset];
                if (field.nullable) {
                    nullable_bitset[nullable_offset >> 3] |= (byte) ((null == get(offset) ? 0 : 1) << (nullable_offset & 7));
                    ++nullable_offset;
                }
            }
            stream.write_i8_array(nullable_bitset, 0, nullable_bitset.length);

            java.lang.Object value;
            for (int offset = 0; offset < type.attributes.length; ++offset) {
                field = type.attributes[offset];
                value = get(offset);
                if (field.nullable && null == value) {
                    continue;
                }
                switch (field.sbiType) {
                    case PrimitiveType.NULL:
                        break;
                    case PrimitiveType.BOOL:
                        stream.write_bool((boolean) value);
                        break;
                    case PrimitiveType.CHAR:
                        char c = (Character) value;
                        if ((int) c > Stream.ASCII_MAX) {
                            throw new IllegalArgumentException("Only ASCII characters are allowed: " + c);
                        }
                        stream.write_i8((byte) c);
                        break;
                    case PrimitiveType.INT:
                        stream.write_vi64((long) value);
                        break;
                    case PrimitiveType.FLOAT:
                        stream.write_f64((double) value);
                        break;
                    case PrimitiveType.NODE:
                    case PrimitiveType.NODE_TIME:
                    case PrimitiveType.NODE_INDEX:
                    case PrimitiveType.NODE_LIST:
                    case PrimitiveType.NODE_GEO:
                    case PrimitiveType.GEO:
                    case PrimitiveType.TU2D:
                    case PrimitiveType.TU3D:
                    case PrimitiveType.TU4D:
                    case PrimitiveType.TU5D:
                    case PrimitiveType.TU6D:
                    case PrimitiveType.TU10D:
                    case PrimitiveType.TUF2D:
                    case PrimitiveType.TUF3D:
                    case PrimitiveType.TUF4D:
                    case PrimitiveType.TIME:
                    case PrimitiveType.DURATION:
//                    case PrimitiveType.CUBIC: // TODO
                    case PrimitiveType.ENUM:
                        ((Object) value).save(stream);
                        break;
                    case PrimitiveType.OBJECT:
                        if (value instanceof String) {
                            String string = (String) value;
                            Integer symbolOffset = type.greycat.symbols_off_by_value.get(string);
                            if (symbolOffset != null) {
                                stream.write_vu32((symbolOffset << 1) | 1);
                            } else {
                                final byte[] data = string.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                                stream.write_vu32(data.length << 1);
                                stream.write_i8_array(data, 0, data.length);
                            }
                        } else {
                            Object object = (Object) value;
                            if (field.abiType != object.type.offset) {
                                stream.write_vu32(object.type.offset);
                            }
                            object.save(stream);
                        }
                        break;
//                    case PrimitiveType.BLOCK_REF: // TODO
//                        break;
//                    case PrimitiveType.FUNCTION: // TODO
//                        break;
                    case PrimitiveType.UNDEFINED:
                        stream.write(value);
                        break;
                    default:
                        throw new IllegalArgumentException("wrong state");
                }
            }
//            if (attributes != null) {
//                int offset = 0;
//                while (offset < attributes.length) {
//                    stream.write_object(get(offset));
//                    offset++;
//                }
//            }
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(type.name);
            builder.append('{');
            for (int i = 0; i < type.attributes.length; i++) {
                if (i != 0) {
                    builder.append(',');
                }
                builder.append(type.attributes[i].name);
                builder.append('=');
                builder.append(attributes[i]);
            }
            builder.append('}');
            return builder.toString();
        }
    }

    public final static class Files {

        public static java.lang.Object get(GreyCat greycat, String path) throws java.io.IOException {
            String url = greycat.runtime_url +
                    "/files/" +
                    path;
            java.net.HttpURLConnection connection = (java.net.HttpURLConnection) new java.net.URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/octet-stream");
            connection.setRequestProperty("Content-Type", "application/octet-stream");
            int status = connection.getResponseCode();
            if (200 > status || 300 <= status) {
                Stream stream = new Stream(greycat, new java.io.BufferedInputStream(connection.getErrorStream()));
                java.lang.Object result = stream.read();
                stream.close();
                throw new java.io.IOException(result.toString());
            }
            Stream buf = new Stream(greycat, new java.io.BufferedInputStream(connection.getInputStream()));
            java.lang.Object result = buf.read();
            buf.close();
            return result;
        }
    }

    public final String[] symbols;
    private final java.util.Map<String, Integer> symbols_off_by_value = new java.util.HashMap<>();
    public final Type[] types;
    public final java.util.Map<String, Library> libs_by_name = new java.util.HashMap<>();
    public final java.util.Map<String, Type> types_by_name = new java.util.HashMap<>();
    public final java.util.Map<String, Function> functions_by_name = new java.util.HashMap<>();
    private final String runtime_url;
    private String token;
    public final int type_offset_core_string;
    public final int type_offset_core_duration;
    public final int type_offset_core_time;
    public final int type_offset_core_geo;
    public final int type_offset_core_node_list;
    public final int type_offset_core_node_index;
    public final int type_offset_core_node_time;
    public final int type_offset_core_node;
    public final int type_offset_core_node_geo;
    public final int type_offset_core_ti2d;
    public final int type_offset_core_ti3d;
    public final int type_offset_core_ti4d;
    public final int type_offset_core_ti5d;
    public final int type_offset_core_ti6d;
    public final int type_offset_core_ti10d;
    public final int type_offset_core_tf2d;
    public final int type_offset_core_tf3d;
    public final int type_offset_core_tf4d;
    private boolean is_remote = false;
    private final int abi_magic;
    private final int abi_version;

    public static void main(String... args) throws IOException {
        int port = 8080;
        Iterator<String> argsIt = Arrays.stream(args).iterator();
        while (argsIt.hasNext()) {
            String arg = argsIt.next();
            switch (arg) {
                case "-p":
                case "--port":
                    port = Integer.parseInt(argsIt.next());
                    break;
                default:
                    throw new IllegalArgumentException(arg);
            }
        }
        try (java.net.ServerSocket serverSocket = new java.net.ServerSocket(port)) {
            while (true) {
                java.net.Socket socket = serverSocket.accept();
                new Thread(() -> {
                    try {
                        GreyCat.handle(socket);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }).start();
            }
        }
    }

    public interface Handler {
    }

    @FunctionalInterface
    public interface ReturnHandler<T> extends Handler {
        T handle(java.lang.Object... parameters);
    }

    @FunctionalInterface
    public interface VoidHandler extends Handler {
        void handle(java.lang.Object... parameters);
    }

    private final static java.util.Map<String, Handler> HANDLERS = new HashMap<>();

    public static void addHandler(String key, ReturnHandler<?> handler) {
        HANDLERS.put(key, handler);
    }

    public static void addHandler(String key, VoidHandler handler) {
        HANDLERS.put(key, handler);
    }

    private static void handle(java.net.Socket socket, Library... libraries) throws Exception {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        GreyCat greycat = new GreyCat(null, null, null, false, bufferedInputStream, libraries);
        Stream stream = new Stream(greycat, bufferedInputStream);
        Handler handler = HANDLERS.get(stream.read_string(stream.read_vu32()));
        if (handler instanceof ReturnHandler) {
            new Stream(greycat, socket.getOutputStream()).write(
                    ((ReturnHandler<?>) handler).handle(((std.core.Array<?>) std.core.Array.load(
                            greycat.types_by_name.get(std.core.Array.name),
                            stream
                    )).attributes)
            );
        } else if (handler instanceof VoidHandler) {
            ((VoidHandler) handler).handle(((std.core.Array<?>) std.core.Array.load(
                    greycat.types_by_name.get(std.core.Array.name),
                    stream
            )).attributes);
        } else {
            throw new RuntimeException("Wrong state");
        }
        socket.close();
    }

    public GreyCat(String url, String username, String password, Boolean use_cookie, Library... libraries) throws Exception {
        this(url, username, password, use_cookie, null, libraries);
    }

    private GreyCat(String url, String username, String password, Boolean use_cookie, BufferedInputStream bufferedInputStream, Library... libraries) throws Exception {
        this.runtime_url = url;
        this.token = null;

        if (username != null && password != null) {
            login(username, password, use_cookie);
        }

        std std = new std();
        this.libs_by_name.put(std.name(), std);

        for (Library lib : libraries) {
            this.libs_by_name.put(lib.name(), lib);
        }

        final java.util.Map<String, Loader> loaders = new java.util.HashMap<>();
        final java.util.Map<String, Factory> factories = new java.util.HashMap<>();

        for (Library lib : this.libs_by_name.values()) {
            lib.configure(loaders, factories);
        }

        final Stream abiStream;
        if (null == bufferedInputStream) {
            abiStream = getAbi(url);
        } else {
            abiStream = new Stream(this, bufferedInputStream);
        }

        // step 0: verify abi version
        int abi_major = abiStream.read_i16();
        if (abi_major != GreyCat.abi_proto) {
            throw new RuntimeException("wrong ABI proto");
        }
        this.abi_magic = abiStream.read_i16();
        this.abi_version = abiStream.read_i32();
        long crc = abiStream.read_i64();

        // step 1: create all symbols
        final long symbolsBytes = abiStream.read_i64();
        final int symbolsCount = abiStream.read_i32();
        symbols = new String[symbolsCount + 1];
        symbols[0] = null;
        for (int offset = 1; offset < (symbolsCount + 1); ++offset) {
            String symbol = abiStream.read_string(abiStream.read_vu32());
            symbols[offset] = symbol;
            symbols_off_by_value.put(symbol, offset);
        }
        // step 2: create all types
        final long typesBytes = abiStream.read_i64();
        final int typesSize = abiStream.read_i32();
        types = new Type[typesSize];
        final int attributesSize = abiStream.read_i32();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < typesSize; i++) {
            /* build type qualified name */
            final String moduleName = symbols[abiStream.read_vu32()];
            final String typeName = symbols[abiStream.read_vu32()];
            final String libName = symbols[abiStream.read_vu32()];
            builder.setLength(0);
            if (moduleName != null) {
                builder.append(moduleName);
                builder.append("::");
            }
            builder.append(typeName);
            final String fqn = builder.toString();
            int attributesLen = abiStream.read_vu32();
            abiStream.read_vu32();/* unused field */
            abiStream.read_vu32();/* unused field */
            int mappedAbiTypeOffset = abiStream.read_vu32();
            int maskedAbiTypeOffset = abiStream.read_vu32();
            int nullableNbBytes = abiStream.read_vu32();
            byte flags = abiStream.read_i8();
            boolean isNative = 0 != (flags & 1);
            boolean isAbstract = 0 != (flags & (1 << 1));
            boolean isEnum = 0 != (flags & (1 << 2));
            boolean isMasked = 0 != (flags & (1 << 3));
            final Type.Attribute[] typeAttributes = new Type.Attribute[attributesLen];
            for (int enumOffset = 0; enumOffset < attributesLen; ++enumOffset) {
                final String name = symbols[abiStream.read_vu32()];
                final int abiType = abiStream.read_vu32();
                final int progTypeOffset = abiStream.read_vu32();
                final int mappedAnyOffset = abiStream.read_vu32();
                final int mappedAttOffset = abiStream.read_vu32();
                final byte sbiType = abiStream.read_i8();
                final byte attFlags = abiStream.read_i8();
                final boolean nullable = 0 != (attFlags & 1);
                final boolean mapped = 0 != (attFlags & (1 << 1));
                typeAttributes[enumOffset] = new Type.Attribute(name, abiType, progTypeOffset, mappedAnyOffset, mappedAttOffset, sbiType, nullable, mapped);
            }
            Type abiType = new Type(i, fqn, mappedAbiTypeOffset, maskedAbiTypeOffset, nullableNbBytes, isMasked, isAbstract, isEnum, isNative, typeAttributes, factories.get(fqn), loaders.get(fqn), this);
            /* only the program related abi type (last version) is mapped to himself */
            if (abiType.mapped_type_off == i && fqn.length() != 0) {
                types_by_name.put(abiType.name, abiType);
            }
            if (abiType.name.equals("core::Table")) {
                System.out.println(i);
            }
            types[i] = abiType;
        }
        // step 3: create all functions
        final long functionsBytes = abiStream.read_i64();
        final int functionSizes = abiStream.read_i32();
        for (int i = 0; i < functionSizes; i++) {
            /* build type qualified name */
            final String moduleName = symbols[abiStream.read_vu32()];
            final String typeName = symbols[abiStream.read_vu32()];
            final String functionName = symbols[abiStream.read_vu32()];
            final String libName = symbols[abiStream.read_vu32()];
            builder.setLength(0);
            if (moduleName != null) {
                builder.append(moduleName);
                builder.append("::");
            }
            if (typeName != null) {
                builder.append(typeName);
                builder.append("::");
            }
            builder.append(functionName);
            final String fqn = builder.toString();
            int nb_params = abiStream.read_vu32();
            for (int j = 0; j < nb_params; j++) {
                abiStream.read_i8();
                abiStream.read_vu32();
                abiStream.read_vu32();
            }
            abiStream.read_vu32();
            abiStream.read_i8();
            Function fn = new Function(fqn);
            functions_by_name.put(fqn, fn);
        }
        /* pre-resolve String type avoid runtime over-head */
        Type tmp = types_by_name.get("core::String");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_string = tmp.offset;
        tmp = types_by_name.get("core::duration");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_duration = tmp.offset;
        tmp = types_by_name.get("core::time");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_time = tmp.offset;
        tmp = types_by_name.get("core::geo");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_geo = tmp.offset;

        tmp = types_by_name.get("core::nodeList");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_node_list = tmp.offset;

        tmp = types_by_name.get("core::nodeIndex");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_node_index = tmp.offset;
        tmp = types_by_name.get("core::nodeTime");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_node_time = tmp.offset;
        tmp = types_by_name.get("core::nodeGeo");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_node_geo = tmp.offset;
        tmp = types_by_name.get("core::node");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_node = tmp.offset;
        tmp = types_by_name.get("core::ti2d");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_ti2d = tmp.offset;
        tmp = types_by_name.get("core::ti3d");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_ti3d = tmp.offset;
        tmp = types_by_name.get("core::ti4d");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_ti4d = tmp.offset;
        tmp = types_by_name.get("core::ti5d");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_ti5d = tmp.offset;
        tmp = types_by_name.get("core::ti6d");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_ti6d = tmp.offset;
        tmp = types_by_name.get("core::ti10d");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_ti10d = tmp.offset;
        tmp = types_by_name.get("core::tf2d");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_tf2d = tmp.offset;
        tmp = types_by_name.get("core::tf3d");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_tf3d = tmp.offset;
        tmp = types_by_name.get("core::tf4d");
        if (tmp == null) {
            throw new IllegalArgumentException("wrong state");
        }
        type_offset_core_tf4d = tmp.offset;
        abiStream.close();
        for (Library lib : libs_by_name.values()) {
            lib.init(this);
        }
    }

    public java.lang.Object call(String fqn, java.lang.Object... parameters) throws java.io.IOException {
        if (!is_remote) {
            throw new RuntimeException("Remote Call are not available on this GreyCat handle");
        }
        GreyCat.Function fn = functions_by_name.get(fqn);
        if (fn == null) {
            throw new RuntimeException("Function not found with name " + fqn);
        }
        String url = runtime_url + '/' + fqn;

        java.net.HttpURLConnection connection = (java.net.HttpURLConnection) new java.net.URL(url).openConnection();
        if (token != null) {
            connection.setRequestProperty("Authorization", token);
        }
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Accept", "application/octet-stream");
        connection.setRequestProperty("Content-Type", "application/octet-stream");
        if (parameters.length > 0) {
            connection.setDoOutput(true);
            java.io.OutputStream os = connection.getOutputStream();
            Stream b = new Stream(this, new java.io.BufferedOutputStream(os));
            b.writeAbiHeader();
            int paramOffset = 0;
            while (paramOffset < parameters.length) {
                b.write(parameters[paramOffset]);
                paramOffset++;
            }
            b.close();
        }
        int status = connection.getResponseCode();
        if (200 > status || 300 <= status) {
            Stream stream = new Stream(this, new java.io.BufferedInputStream(connection.getErrorStream()));
            stream.readAbiHeader();
            java.lang.Object result = stream.read();
            stream.close();
            throw new java.io.IOException(result.toString());
        }
        Stream buf = new Stream(this, new java.io.BufferedInputStream(connection.getInputStream()));
        buf.readAbiHeader();
        java.lang.Object result = buf.read();
        buf.close();
        return result;
    }

    public java.lang.Object fetch(String path) throws java.io.IOException {
        if (!this.is_remote) {
            throw new RuntimeException("Remote Call is not available on this GreyCat handle");
        }
        java.net.HttpURLConnection connection = (java.net.HttpURLConnection) new java.net.URL(
                this.runtime_url + "/" + path
        ).openConnection();

        if (this.token != null) {
            connection.setRequestProperty("Authorization", this.token);
        }
        connection.setRequestProperty("Accept", "application/octet-stream");
        connection.setRequestMethod("GET");
        int status = connection.getResponseCode();
        if (status < 200 || status >= 300) {
            throw new RuntimeException("HTTP " + status + ": " + connection.getResponseMessage());
        }

        Stream buf = new Stream(this, new java.io.BufferedInputStream(connection.getInputStream()));
        buf.readAbiHeader();
        java.lang.Object result = buf.read();
        buf.close();
        return result;
    }

    public void login(String username, String password, Boolean useCookie) throws Exception {
        if (null == useCookie) {
            useCookie = false;
        }

        java.net.HttpURLConnection connection = (java.net.HttpURLConnection) new java.net.URL(
                this.runtime_url + "/runtime::User::login"
        ).openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");


        String credentials = username + ":" + hashPassword(password);
        String encodedCredentials = java.util.Base64.getEncoder().encodeToString(credentials.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        String body = "[" + "\"" + encodedCredentials + "\"" + "," + useCookie + "]";

        connection.setDoOutput(true);
        java.io.OutputStream os = connection.getOutputStream();
        java.io.PrintStream b = new java.io.PrintStream(os);
        b.print(body);
        b.close();

        int status = connection.getResponseCode();
        if (200 > status || 300 <= status) {
            throw new RuntimeException("HTTP " + status + ": " + connection.getResponseMessage());
        }
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(connection.getInputStream()));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            builder.append(line);
        }
        String response = builder.toString();
        this.token = response.substring(1, response.length() - 1);
    }

    @SuppressWarnings({"unused"})
    public java.lang.Object create(String name, java.lang.Object[] parameters) {
        final Type t = types_by_name.get(name);
        if (t == null) {
            return null;
        }
        return t.factory.build(t, parameters);
    }

    public std.core.geo createGeo(double lat, double lng) {
        final GreyCat.Type type = this.types[this.type_offset_core_geo];
        std.core.geo geo = (std.core.geo) type.factory.build(type);
        geo.lat = lat;
        geo.lng = lng;
        return geo;
    }

    public std.core.time createTime(long epoch_us) {
        final GreyCat.Type type = this.types[this.type_offset_core_time];
        std.core.time t = (std.core.time) type.factory.build(type);
        t.value = epoch_us;
        return t;
    }

    @SuppressWarnings("unused")
    public std.core.duration createDuration(long duration_us) {
        final GreyCat.Type type = this.types[this.type_offset_core_duration];
        std.core.duration dur = (std.core.duration) type.factory.build(type);
        dur.value = duration_us;
        return dur;
    }

    private Stream getRemoteAbi(String runtime_url) throws java.io.IOException {
        java.net.URL url = new java.net.URL(runtime_url + "/runtime::Runtime::abi");
        java.net.HttpURLConnection connection = (java.net.HttpURLConnection) url.openConnection();

        if (this.token != null) {
            connection.setRequestProperty("Authorization", this.token);
        }
        connection.setRequestProperty("Accept", "application/octet-stream");
        connection.setRequestMethod("POST");

        int status = connection.getResponseCode();
        if (status >= 200 && status < 300) {
            this.is_remote = true;
            return new Stream(this, new java.io.BufferedInputStream(connection.getInputStream()));
        } else {
            throw new RuntimeException("HTTP Error: " + status + " " + connection.getResponseMessage());
        }
    }

    private Stream getLocalAbi(String runtime_url) throws java.io.IOException {
        StringBuilder b = new StringBuilder();
        if (!runtime_url.startsWith("file://")) {
            b.append("file://");
        }
        b.append(runtime_url);
        b.append(java.io.File.separator);
        b.append("gcdata");
        b.append(java.io.File.separator);
        b.append("store");
        b.append(java.io.File.separator);
        b.append("abi");
        return new Stream(
                this,
                new java.io.BufferedInputStream(new java.io.FileInputStream(new java.net.URL(b.toString()).getFile()))
        );
    }

    private Stream getAbi(String runtime_url) throws java.io.IOException {
        if (runtime_url.startsWith("http") || runtime_url.startsWith("https")) {
            return getRemoteAbi(runtime_url);
        } else {
            return getLocalAbi(runtime_url);
        }
    }

    private static String hashPassword(String password) throws Exception {
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");

        byte[] hashedBytes = digest.digest(password.getBytes(java.nio.charset.StandardCharsets.UTF_8));

        StringBuilder hexString = new StringBuilder();
        for (byte hashedByte : hashedBytes) {
            String hex = Integer.toHexString(0xff & hashedByte);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }
}
