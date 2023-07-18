package ai.greycat;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public final class GreyCat {
    public static final short abi_proto = 1;

    public static final class AbiReader {

        private AbiReader(Stream stream) {
            this.stream = stream;
        }

        private final Stream stream;

        public java.lang.Object read() throws IOException {
            return stream.read();
        }

    }

    public AbiReader openAbiRead(String path) throws IOException {
        Stream s = new Stream(this, new BufferedInputStream(new FileInputStream(path)));
        s.readAbiHeader();
        return new AbiReader(s);
    }

    public static final class Stream {
        private final byte[] tmp = new byte[8];
        private InputStream is;
        private OutputStream os;

        public final GreyCat greycat;

        public Stream(GreyCat greycat, OutputStream os) {
            this.greycat = greycat;
            this.os = os;
        }

        public Stream(GreyCat greycat, InputStream is) {
            this.greycat = greycat;
            this.is = is;
        }

        public void readAbiHeader() throws IOException {
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

        public void writeAbiHeader() throws IOException {
            this.write_i16(GreyCat.abi_proto);
            this.write_i16(greycat.abi_magic);
            this.write_i32(greycat.abi_version);
        }

        public void close() throws IOException {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }

        public void write_i8(final byte b) throws IOException {
            os.write(b);
        }

        public void write_bool(final boolean b) throws IOException {
            os.write((byte) (b ? 1 : 0));
        }

        public void write_i8_array(final byte[] bytes, final int offset, final int length) throws IOException {
            os.write(bytes, offset, length);
        }

        public void write_i32(final int i) throws IOException {
            tmp[0] = (byte) (i & 0xFF);
            tmp[1] = (byte) ((i >>> 8) & 0xFF);
            tmp[2] = (byte) ((i >>> 16) & 0xFF);
            tmp[3] = (byte) ((i >>> 24) & 0xFF);
            os.write(tmp, 0, 4);
        }

        public void write_i16(final int i) throws IOException {
            tmp[0] = (byte) (i & 0xFF);
            tmp[1] = (byte) ((i >>> 8) & 0xFF);
            os.write(tmp, 0, 2);
        }

        public void write_i64(final long l) throws IOException {
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

        public void write_f64(final double d) throws IOException {
            write_i64(Double.doubleToLongBits(d));
        }

        byte read_i8() throws IOException {
            return (byte) is.read();
        }

        char read_char() throws IOException {
            return (char) is.read();
        }

        java.lang.Object read_null() {
            return null;
        }

        int read_i16() throws IOException {
            if (is.read(tmp, 0, 2) == -1) {
                throw new IOException();
            }
            return ((tmp[1] << 24) >>> 16) + ((tmp[0] << 24) >>> 24);
        }

        int read_i32() throws IOException {
            if (is.read(tmp, 0, 4) == -1) {
                throw new IOException();
            }
            return (tmp[3] << 24) + ((tmp[2] << 24) >>> 8) + ((tmp[1] << 24) >>> 16) + ((tmp[0] << 24) >>> 24);
        }

        long read_i64() throws IOException {
            if (is.read(tmp, 0, 8) == -1) {
                throw new IOException();
            }
            return ((long) tmp[7] << 56) + (((long) tmp[6] << 56) >>> 8) + (((long) tmp[5] << 56) >>> 16) + (((long) tmp[4] << 56) >>> 24) + (((long) tmp[3] << 56) >>> 32) + (((long) tmp[2] << 56) >>> 40) + (((long) tmp[1] << 56) >>> 48) + (((long) tmp[0] << 56) >>> 56);
        }

        long read_vi64() throws IOException {
            byte header = read_i8();
            byte nbytes = len_varu64(header);
            byte[] bytes = new byte[nbytes];
            switch (nbytes) {
                case 9:
                    bytes[nbytes - 8] = read_i8();
                case 8:
                    bytes[nbytes - 7] = read_i8();
                case 7:
                    bytes[nbytes - 6] = read_i8();
                case 6:
                    bytes[nbytes - 5] = read_i8();
                case 5:
                    bytes[nbytes - 4] = read_i8();
                case 4:
                    bytes[nbytes - 3] = read_i8();
                case 3:
                    bytes[nbytes - 2] = read_i8();
                case 2:
                    bytes[nbytes - 1] = read_i8();
                case 1:
                    bytes[0] = header;
            }
            long unpacked_varu64 = unpack_varu64(bytes);
            return sign_of(unpacked_varu64);
        }

        private static byte len_varu64(byte header) throws IOException {
            if ((header & 0x80) == 0) {
                return 1;
            }
            if ((header & 0x40) == 0) {
                return 2;
            }
            if ((header & 0x20) == 0) {
                return 3;
            }
            if ((header & 0x10) == 0) {
                return 4;
            }
            if ((header & 0x08) == 0) {
                return 5;
            }
            if ((header & 0x04) == 0) {
                return 6;
            }
            if ((header & 0x02) == 0) {
                return 7;
            }
            if ((header & 0x01) == 0) {
                return 8;
            }
            return 9;
        }

        private static long unpack_varu64(byte[] bytes) throws IOException {
            byte n = (byte) bytes.length;
            switch (n) {
                case 1:
                    return ((long) bytes[0]) & 0x7f;
                case 2:
                    return (((long) bytes[0]) & 0x3f) | (((long) bytes[1]) << 6);
                case 3:
                    return (((long) bytes[0]) & 0x1f) | (((long) bytes[1]) << 5) | (((long) bytes[2]) << 13);
                case 4:
                    return (((long) bytes[0]) & 0x0f) | (((long) bytes[1]) << 4) | (((long) bytes[2]) << 12) | (((long) bytes[3]) << 20);
                case 5:
                    return (((long) bytes[0]) & 0x07) | (((long) bytes[1]) << 3) | (((long) bytes[2]) << 11) | (((long) bytes[3]) << 19) | (((long) bytes[4]) << 27);
                case 6:
                    return (((long) bytes[0]) & 0x03) | (((long) bytes[1]) << 2) | (((long) bytes[2]) << 10) | (((long) bytes[3]) << 18) | (((long) bytes[4]) << 26) | (((long) bytes[5]) << 34);
                case 7:
                    return (((long) bytes[0]) & 0x01) | (((long) bytes[1]) << 1) | (((long) bytes[2]) << 9) | (((long) bytes[3]) << 17) | (((long) bytes[4]) << 25) | (((long) bytes[5]) << 33) | (((long) bytes[6]) << 41);
                case 8:
                    return (((long) bytes[1])) | (((long) bytes[2]) << 8) | (((long) bytes[3]) << 16) | (((long) bytes[4]) << 24) | (((long) bytes[5]) << 32) | (((long) bytes[6]) << 40) | (((long) bytes[7] << 48));
                case 9:
                    return (((long) bytes[1])) | (((long) bytes[2]) << 8) | (((long) bytes[3]) << 16) | (((long) bytes[4]) << 24) | (((long) bytes[5]) << 32) | (((long) bytes[6]) << 40) | (((long) bytes[7] << 48)) | (((long)bytes[8]) << 56);
                default:
                    throw new IOException("wrong state");
            }
        }

        private static long sign_of(long x) {
            return ((x >>> 1) ^ (-(x & 1)));
        }

        byte[] read_i8_array(final int len) throws IOException {
            byte[] newArr = new byte[len];
            if (is.read(newArr, 0, len) == -1) {
                throw new IOException();
            }
            return newArr;
        }

        double read_f64() throws IOException {
            return Double.longBitsToDouble(read_i64());
        }

        String read_string(int len) throws IOException {
            return new String(read_i8_array(len), StandardCharsets.UTF_8);
        }

        boolean read_bool() throws IOException {
            return read_i8() != 0;
        }

        private final static byte ASCII_MAX = 127;

        public void write_object(java.lang.Object object) throws IOException {
            if (object == null) {
                write_i8(GreyCat.PrimitiveType.NULL);
            } else if (object instanceof Boolean) {
                write_i8(GreyCat.PrimitiveType.BOOL);
                write_bool((Boolean) object);
            } else if (object instanceof Character) {
                write_i8(GreyCat.PrimitiveType.CHAR);
                char c = (Character) object;
                if ((int) c > ASCII_MAX) {
                    throw new IllegalArgumentException("Only ASCII characters are allowed: " + c);
                }
                write_i8((byte) c);
            } else if (object instanceof Long) {
                write_i8(GreyCat.PrimitiveType.INT);
                write_i64((long) object);
            } else if (object instanceof Integer) {
                write_i8(GreyCat.PrimitiveType.INT);
                write_i64((int) object);
            } else if (object instanceof Short) {
                write_i8(GreyCat.PrimitiveType.INT);
                write_i64((short) object);
            } else if (object instanceof Double || object instanceof Float) {
                write_i8(GreyCat.PrimitiveType.FLOAT);
                write_f64((double) object);
            } else if (object instanceof String) {
                String string = (String) object;
                Integer symbolOffset = greycat.symbols_off_by_value.get(string);
                if (symbolOffset != null) {
                    write_i8(GreyCat.PrimitiveType.STRING_LIT);
                    write_i32(symbolOffset);
                } else {
                    write_i8(GreyCat.PrimitiveType.OBJECT);
                    write_i32(greycat.type_offset_core_string);
                    write_i32(string.length());
                    final byte[] data = string.getBytes(StandardCharsets.UTF_8);
                    write_i8_array(data, 0, data.length);
                }
            } else if (object instanceof Object) {
                ((Object) object).save(this);
            } else {
                throw new IllegalArgumentException("wrong state");
            }
        }

        @FunctionalInterface
        private interface PrimitiveLoader {
            java.lang.Object load(Stream stream) throws IOException;
        }

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
            PRIMITIVE_LOADERS[PrimitiveType.BLOCK] = error_loader;
            PRIMITIVE_LOADERS[PrimitiveType.BLOCK_REF] = error_loader;
            PRIMITIVE_LOADERS[PrimitiveType.FUNCTION] = error_loader;
            PRIMITIVE_LOADERS[PrimitiveType.UNDEFINED] = error_loader;
            PRIMITIVE_LOADERS[PrimitiveType.STRING_LIT] = Stream::read_string_lit;
        }

        java.lang.Object read() throws IOException {
            if (this.is.available() == 0) {
                this.is.close();
                return null;
            }
            byte primitiveOffset = read_i8();
            return PRIMITIVE_LOADERS[primitiveOffset].load(this);
        }

        java.lang.Object read_object() throws IOException {
            final Type type = greycat.types[read_i32()];
            return type.loader.load(type, this);
        }

        java.lang.Object read_string_lit() throws IOException {
            final int offset = read_i32();
            if (offset < greycat.symbols.length) {
                return greycat.symbols[offset];
            }
            throw new IllegalArgumentException("invalid primitive type");
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
        public final Map<String, Integer> attribute_off_by_name = new HashMap<>();
        public final GreyCat greycat;
        public final GreyCat.Factory factory;
        public final GreyCat.Loader loader;
        public final Enum[] enum_values;
        @SuppressWarnings("unused")
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
            final int valueOffset = stream.read_i16();
            final Type.Attribute abiTypeAtt = type.attributes[valueOffset];
            return programType.enum_values[abiTypeAtt.mappedAttOffset];
        };

        static final Loader object_loader = (type, stream) -> {
            final Type programType = type.greycat.types[type.mapped_type_off];
            final java.lang.Object[] attributes = new java.lang.Object[programType.attributes.length];
            byte[] previous_nullable = stream.read_i8_array(type.nullable_nb_bytes);
            int nullable_offset = -1;
            for (int attOffset = 0; attOffset < type.attributes.length; attOffset++) {
                Type.Attribute att = type.attributes[attOffset];
                java.lang.Object loadedField;
                if (att.nullable) {
                    ++nullable_offset;
                    // #define gc_object__is_not_null(bitset, offset) ((((bitset)[(offset) >> 3]) >> ((offset) & (gc_object_bitset_block_size - 1))) & 1)
                    if (0 == (((previous_nullable[(nullable_offset) >> 3]) >> ((nullable_offset) & 7)) & 1)) {
                        continue;
                    }
                }
                switch (att.sbiType) {
                    case PrimitiveType.ENUM: {
                        Type fieldType = type.greycat.types[att.abiType];
                        loadedField = enum_loader.load(fieldType, stream);
                        break;
                    }
                    case PrimitiveType.OBJECT: {
                        Type fieldType = type.greycat.types[att.abiType];
                        if (fieldType.is_native) {
                            loadedField = fieldType.loader.load(fieldType, stream);
                        } else {
                            loadedField = stream.read();
                        }
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
        public final void save(Stream stream) throws IOException {
            stream.write_i8(GreyCat.PrimitiveType.ENUM);
            stream.write_i32(type.offset);
            stream.write_i16(offset);
        }

        @Override
        public String toString() {
            if (value == null) {
                return type.name + "." + key;
            } else {
                return type.name + "." + key + "{value=" + value + '}';
            }
        }
    }

    @FunctionalInterface
    public interface Loader {
        java.lang.Object load(Type type, Stream stream) throws IOException;

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

        /* todo */
//    gc_type_tu2 = 16,
//    gc_type_tu3 = 17,
//    gc_type_tu4 = 18,
//    gc_type_tu8 = 19,
//    gc_type_tu10 = 20,
//    gc_type_tf2 = 21,
//    gc_type_tf3 = 22,
//    gc_type_tf4 = 23,
        /* todo */

        static final byte BLOCK = 24;
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

        public final java.lang.Object get(int offset) {
            return attributes[offset];
        }

        public final void set(int offset, java.lang.Object value) {
            attributes[offset] = value;
        }

        public void save(Stream stream) throws IOException {
            stream.write_i8(GreyCat.PrimitiveType.OBJECT);
            stream.write_i32(type.offset);
            if (attributes != null) {
                int offset = 0;
                while (offset < attributes.length) {
                    stream.write_object(get(offset));
                    offset++;
                }
            }
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

        public static java.lang.Object get(GreyCat greycat, String path) throws IOException {
            String url = greycat.runtime_url +
                    "/files/" +
                    path;
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/octet-stream");
            connection.setRequestProperty("Content-Type", "application/octet-stream");
            int status = connection.getResponseCode();
            if (200 > status || 300 <= status) {
                Stream stream = new Stream(greycat, connection.getErrorStream());
                java.lang.Object result = stream.read();
                stream.close();
                throw new IOException(result.toString());
            }
            Stream buf = new Stream(greycat, new BufferedInputStream(connection.getInputStream()));
            java.lang.Object result = buf.read();
            buf.close();
            return result;
        }
    }

    private final String[] symbols;
    private final java.util.Map<String, Integer> symbols_off_by_value = new HashMap<>();
    public final Type[] types;
    public final Map<String, Library> libs_by_name;
    public final java.util.Map<String, Type> types_by_name = new HashMap<>();
    public final java.util.Map<String, Function> functions_by_name = new HashMap<>();
    private final String runtime_url;
    public final int type_offset_core_string;
    public final int type_offset_core_duration;
    public final int type_offset_core_time;
    public final int type_offset_core_geo;
    public final int type_offset_core_node_list;
    public final int type_offset_core_node_index;
    public final int type_offset_core_node_time;
    public final int type_offset_core_node;
    public final int type_offset_core_node_geo;

    private boolean is_remote = false;
    private final int abi_magic;
    private final int abi_version;

    public GreyCat(String url, Library... libraries) throws Exception {
        libs_by_name = new HashMap<>();
        std std = new std();
        libs_by_name.put(std.name(), std);
        int i = 0;
        while (i < libraries.length) {
            final Library lib = libraries[i];
            libs_by_name.put(lib.name(), lib);
            i++;
        }
        final java.util.Map<String, Loader> loaders = new HashMap<>();
        final java.util.Map<String, Factory> factories = new HashMap<>();
        for (Library lib : libs_by_name.values()) {
            lib.configure(loaders, factories);
        }
        this.runtime_url = url;
        final Stream abiStream = getAbi(url);
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
            String symbol = abiStream.read_string(abiStream.read_i32());
            symbols[offset] = symbol;
            symbols_off_by_value.put(symbol, offset);
        }
        // step 2: create all types
        final long typesBytes = abiStream.read_i64();
        final int typesSize = abiStream.read_i32();
        types = new Type[typesSize];
        final int attributesSize = abiStream.read_i32();
        StringBuilder builder = new StringBuilder();
        for (i = 0; i < typesSize; i++) {
            /* build type qualified name */
            final String moduleName = symbols[abiStream.read_i32()];
            final String typeName = symbols[abiStream.read_i32()];
            final String libName = symbols[abiStream.read_i32()];
            builder.setLength(0);
            if (moduleName != null) {
                builder.append(moduleName);
                builder.append("::");
            }
            builder.append(typeName);
            final String fqn = builder.toString();
            int attributesLen = abiStream.read_i32();
            abiStream.read_i32();/* unused field */
            abiStream.read_i32();/* unused field */
            int mappedAbiTypeOffset = abiStream.read_i32();
            int maskedAbiTypeOffset = abiStream.read_i32();
            int nullableNbBytes = abiStream.read_i32();
            boolean isNative = abiStream.read_bool();
            boolean isAbstract = abiStream.read_bool();
            boolean isEnum = abiStream.read_bool();
            boolean isMasked = abiStream.read_bool();
            final Type.Attribute[] typeAttributes = new Type.Attribute[attributesLen];
            for (int enumOffset = 0; enumOffset < attributesLen; ++enumOffset) {
                final String name = symbols[abiStream.read_i32()];
                final int abiType = abiStream.read_i32();
//                final String typeModuleName = symbols[abiStream.read_i32()];
//                final String attributeTypeName = symbols[abiStream.read_i32()];
                final int progTypeOffset = abiStream.read_i32();
                final int mappedAnyOffset = abiStream.read_i32();
                final int mappedAttOffset = abiStream.read_i32();
                final byte sbiType = abiStream.read_i8();
                final boolean nullable = abiStream.read_bool();
                final boolean mapped = abiStream.read_bool();
                typeAttributes[enumOffset] = new Type.Attribute(name, abiType, progTypeOffset, mappedAnyOffset, mappedAttOffset, sbiType, nullable, mapped);
            }
            Type abiType = new Type(i, fqn, mappedAbiTypeOffset, maskedAbiTypeOffset, nullableNbBytes, isMasked, isAbstract, isEnum, isNative, typeAttributes, factories.get(fqn), loaders.get(fqn), this);
            /* only the program related abi type (last version) is mapped to himself */
            if (abiType.mapped_type_off == i && fqn.length() != 0) {
                types_by_name.put(abiType.name, abiType);
            }
            types[i] = abiType;
        }
        // step 3: create all functions
        final long functionsBytes = abiStream.read_i64();
        final int functionSizes = abiStream.read_i32();
        for (i = 0; i < functionSizes; i++) {
            /* build type qualified name */
            final String moduleName = symbols[abiStream.read_i32()];
            final String typeName = symbols[abiStream.read_i32()];
            final String functionName = symbols[abiStream.read_i32()];
            final String libName = symbols[abiStream.read_i32()];
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

            int nb_params = abiStream.read_i32();
            for (int j = 0; j < nb_params; j++) {
                abiStream.read_i8();
                abiStream.read_i32();
                abiStream.read_i32();
            }
            abiStream.read_i32();
            abiStream.read_i8();
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
        abiStream.close();
        for (Library lib : libs_by_name.values()) {
            lib.init(this);
        }
    }

    public static java.lang.Object call(GreyCat greycat, String fqn, java.lang.Object... parameters) throws IOException {
        if (!greycat.is_remote) {
            throw new RuntimeException("Remote Call are not available on this GreyCat handle");
        }
        GreyCat.Function fn = greycat.functions_by_name.get(fqn);
        if (fn == null) {
            for (String name : greycat.functions_by_name.keySet()) {
                System.out.println(name);
            }
            throw new RuntimeException("Function not found with name " + fqn);
        }
        StringBuilder url = new StringBuilder();
        url.append(greycat.runtime_url);
        url.append('/');
        url.append(fqn);
        HttpURLConnection connection = (HttpURLConnection) new URL(url.toString()).openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Accept", "application/octet-stream");
        connection.setRequestProperty("Content-Type", "application/octet-stream");
        if (parameters.length > 0) {
            connection.setDoOutput(true);
            OutputStream os = connection.getOutputStream();
            Stream b = new Stream(greycat, new BufferedOutputStream(os));
            b.writeAbiHeader();
            int paramOffset = 0;
            while (paramOffset < parameters.length) {
                b.write_object(parameters[paramOffset]);
                paramOffset++;
            }
            b.close();
        }
        int status = connection.getResponseCode();
        if (200 > status || 300 <= status) {
            Stream stream = new Stream(greycat, connection.getErrorStream());
            stream.readAbiHeader();
            java.lang.Object result = stream.read();
            stream.close();
            throw new IOException(result.toString());
        }
        Stream buf = new Stream(greycat, new BufferedInputStream(connection.getInputStream()));
        buf.readAbiHeader();
        java.lang.Object result = buf.read();
        buf.close();
        return result;
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

    private Stream getRemoteAbi(String runtime_url) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(runtime_url + "/runtime::Runtime::abi").openConnection();
        connection.setRequestMethod("POST");
        int status = connection.getResponseCode();
        if (200 > status || 300 <= status) {
            StringBuilder builder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            String line = reader.readLine();
            while (line != null) {
                builder.append(line);
                line = reader.readLine();
            }
            throw new RuntimeException(builder.toString());
        }
        this.is_remote = true;
        return new Stream(this, connection.getInputStream());
    }

    private Stream getLocalAbi(String runtime_url) throws IOException {
        StringBuilder b = new StringBuilder();
        if (!runtime_url.startsWith("file")) {
            b.append("file://");
        }
        b.append(runtime_url);
        b.append(File.separator);
        b.append("gcdata");
        b.append(File.separator);
        b.append("store");
        b.append(File.separator);
        b.append("abi");
        return new Stream(this, new FileInputStream(new URL(b.toString()).getFile()));
    }

    private Stream getAbi(String runtime_url) throws IOException {
        if (runtime_url.startsWith("http") || runtime_url.startsWith("https")) {
            return getRemoteAbi(runtime_url);
        } else {
            return getLocalAbi(runtime_url);
        }
    }

}
