package ai.greycat;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.*;

@SuppressWarnings("IOStreamConstructor")
public class Generator {

    private static final class Type {
        final int offset;
        final String lib;
        final String module;
        final String name;
        final int genericAbiType;
        final int g1AbiTypeDesc;
        final int g2AbiTypeDesc;
        final int mappedAbiTypeOffset;
        final int maskedAbiTypeOffset;
        final boolean isNative;
        final boolean isEnum;
        final GreyCat.Type.Attribute[] attributes;

        private Type(int offset, String lib, String module, String name, int genericAbiType, int g1AbiTypeDesc, int g2AbiTypeDesc, int mappedAbiTypeOffset, int maskedAbiTypeOffset, boolean isNative, boolean isEnum, GreyCat.Type.Attribute[] attributes) {
            this.offset = offset;
            this.lib = lib;
            this.module = module;
            this.name = name;
            this.genericAbiType = genericAbiType;
            this.g1AbiTypeDesc = g1AbiTypeDesc;
            this.g2AbiTypeDesc = g2AbiTypeDesc;
            this.mappedAbiTypeOffset = mappedAbiTypeOffset;
            this.maskedAbiTypeOffset = maskedAbiTypeOffset;
            this.isNative = isNative;
            this.isEnum = isEnum;
            this.attributes = attributes;
        }

        private int getOffset() {
            return offset;
        }

        private String generics() {
            StringBuilder builder = new StringBuilder();
            builder.append(TYPES[g1AbiTypeDesc >>> 1].fqn());
            if (0 != g2AbiTypeDesc) {
                builder.append(", ").append(TYPES[g2AbiTypeDesc >>> 1].fqn());
            }
            return builder.toString();
        }

        private String fqn() {
            if (CORE_NULL == offset) {
                return "?";
            }
            if (CORE_ANY == offset) {
                return "java.lang.Object";
            }
            if (CORE_BOOL == offset) {
                return "java.lang.Boolean";
            }
            if (CORE_CHAR == offset) {
                return "java.lang.Character";
            }
            if (CORE_INT == offset) {
                return "java.lang.Long";
            }
            if (CORE_FLOAT == offset) {
                return "java.lang.Double";
            }
            if (genericAbiType == 0) {
                return "ai.greycat." + lib + '.' + module + '.' + name;
            }
            return "ai.greycat." + lib + '.' + module + '.' + name.replaceAll("<(.*)>", "<" + generics() + ">");
        }
    }

    private static final class Module {
        final String name;
        final Map<String, Type> types = new LinkedHashMap<>();

        private Module(String name) {
            this.name = name;
        }
    }

    private static final class Library {
        final String name;
        Map<String, Module> modules = new LinkedHashMap<>();

        private Library(String name) {
            this.name = name;
        }
    }

    private static String ABI_PATH = "file://" + System.getProperty("user.dir") + File.separator +
            "gcdata" + File.separator + "abi";

    private static String[] SYMBOLS;
    private static Map<String, Library> LIBRARIES = new LinkedHashMap<>();
    private static Type[] TYPES;

    private static int CORE_NULL,
            CORE_ANY,
            CORE_BOOL,
            CORE_CHAR,
            CORE_INT,
            CORE_FLOAT;

    private static void parseArgs(String... args) {
        Iterator<String> argsIt = Arrays.stream(args).iterator();
        String arg;
        if (argsIt.hasNext()) {
            arg = argsIt.next();
            StringBuilder b = new StringBuilder();
            if (!arg.startsWith("file://")) {
                b.append("file://");
                if (!arg.startsWith("/")) {
                    b.append(System.getProperty("user.dir")).append(File.separator);
                }
            }
            b.append(arg);
            ABI_PATH = b.toString();
        }
    }

    public static void main(String... args) throws IOException {
        parseArgs(args);

        final java.util.Map<String, GreyCat.Loader> loaders = new java.util.HashMap<>();
        final java.util.Map<String, GreyCat.Factory> factories = new java.util.HashMap<>();
        final std std = new std();
        std.configure(loaders, factories);

        GreyCat.Stream stream = new GreyCat.Stream(null, new BufferedInputStream(new FileInputStream(new URL(ABI_PATH).getFile())));

        // abi header
        final int abi_major = stream.read_i16();
        if (abi_major != GreyCat.abi_proto) {
            throw new RuntimeException("wrong ABI proto");
        }
        final int abi_magic = stream.read_i16();
        final int abi_version = stream.read_i32();
        final long crc = stream.read_i64();

        // abi symbols
        final long symbolsBytes = stream.read_i64();
        final int symbolsCount = stream.read_i32();
        SYMBOLS = new String[symbolsCount + 1];
        SYMBOLS[0] = null;
        for (int offset = 1; offset < symbolsCount + 1; ++offset) {
            String symbol = stream.read_string(stream.read_vu32());
            SYMBOLS[offset] = symbol;
        }

        // abi types
        final long typesBytes = stream.read_i64();
        final int typesSize = stream.read_i32();

        final int attributesSize = stream.read_i32();
        StringBuilder builder = new StringBuilder();
        TYPES = new Type[typesSize];
        for (int typeOffset = 0; typeOffset < typesSize; ++typeOffset) {
            // Read
            final String moduleName = SYMBOLS[stream.read_vu32()];
            final String typeName = SYMBOLS[stream.read_vu32()];
            switch (typeName) {
                default:
                    break;
                case "null":
                    CORE_NULL = typeOffset;
                    break;
                case "any":
                    CORE_ANY = typeOffset;
                    break;
                case "bool":
                    CORE_BOOL = typeOffset;
                    break;
                case "char":
                    CORE_CHAR = typeOffset;
                    break;
                case "int":
                    CORE_INT = typeOffset;
                    break;
                case "float":
                    CORE_FLOAT = typeOffset;
                    break;
            }
            final String libName = SYMBOLS[stream.read_vu32()];
            builder.setLength(0);
            if (moduleName != null) {
                builder.append(moduleName);
                builder.append("::");
            }
            builder.append(typeName);
            final String fqn = builder.toString();
            final int genericAbiType = stream.read_vu32();
            final int g1AbiTypeDesc = stream.read_vu32();
            final int g2AbiTypeDesc = stream.read_vu32();
            final int attributesLen = stream.read_vu32();
            stream.read_vu32();/* unused field */
            stream.read_vu32();/* unused field */
            final int mappedAbiTypeOffset = stream.read_vu32();
            final int maskedAbiTypeOffset = stream.read_vu32();
            final int nullableNbBytes = stream.read_vu32();
            final byte flags = stream.read_i8();
            final boolean isNative = 0 != (flags & 1);
            final boolean isAbstract = 0 != (flags & (1 << 1));
            final boolean isEnum = 0 != (flags & (1 << 2));
            final boolean isMasked = 0 != (flags & (1 << 3));
            final GreyCat.Type.Attribute[] typeAttributes = new GreyCat.Type.Attribute[attributesLen];
            for (int attOffset = 0; attOffset < attributesLen; ++attOffset) {
                final String name = SYMBOLS[stream.read_vu32()];
                final int abiType = stream.read_vu32();
                final int progTypeOffset = stream.read_vu32();
                final int mappedAnyOffset = stream.read_vu32();
                final int mappedAttOffset = stream.read_vu32();
                final byte sbiType = stream.read_i8();
                final byte precision = stream.read_i8(); // TODO: manage
                final byte attFlags = stream.read_i8();
                final boolean nullable = 0 != (attFlags & 1);
                final boolean mapped = 0 != (attFlags & (1 << 1));
                typeAttributes[attOffset] = new GreyCat.Type.Attribute(name, abiType, progTypeOffset, mappedAnyOffset, mappedAttOffset, sbiType, nullable, mapped);
            }
            // Save
            Library lib = LIBRARIES.computeIfAbsent(libName, Library::new);
            Module module = lib.modules.computeIfAbsent(moduleName, Module::new);
            Type type = new Type(typeOffset, libName, moduleName, typeName, genericAbiType, g1AbiTypeDesc,
                    g2AbiTypeDesc, mappedAbiTypeOffset, maskedAbiTypeOffset, isNative, isEnum, typeAttributes);
            module.types.put(typeName, type);
            TYPES[typeOffset] = type;
        }
        // abi functions
        // TODO
        generateTypes();
    }

    private final static String T1 = "  ",
            T2 = T1 + T1,
            T3 = T2 + T1,
            T4 = T3 + T1;

    private static boolean isPrimitive(int typeOffset) {
        return CORE_NULL == typeOffset || CORE_ANY == typeOffset || CORE_BOOL == typeOffset || CORE_CHAR == typeOffset || CORE_INT == typeOffset || CORE_FLOAT == typeOffset;
    }

    private static void generateTypes() {
        StringBuilder builder = new StringBuilder();
        for (Library lib : LIBRARIES.values()) {
            builder.setLength(0);
            builder.append("public final class ").append(lib.name).append(" extends ai.greycat.GreyCat.Library{\n");
            builder.append(T1).append("public static final java.lang.String name = \"").append(lib.name).append("\";\n");
            builder.append(T1).append("@Override\n");
            builder.append(T1).append("public java.lang.String name() {\n");
            builder.append(T2).append("return name;\n");
            builder.append(T1).append("}\n");
            for (Module module : lib.modules.values()) {
                builder.append(T1).append("public static final class ").append(module.name).append(" {\n");
                for (Type type : module.types.values()) {
                    if (0 == type.genericAbiType && !isPrimitive(type.offset)) {
                        builder.append(T2).append("public static final class ").append(type.name).append(" extends ai.greycat.");
                        if (type.isNative) {
                            builder.append(lib.name).append("_n.").append(module.name).append('.').append(type.name);
                        } else if (type.isEnum) {
                            builder.append("GreyCat.Enum");
                        } else {
                            builder.append("GreyCat.Object");
                        }
                        builder.append(" {\n");
                        builder.append(T3).append("public static final java.lang.String name = \"").append(module.name).append("::").append(type.name).append("\";\n");
                        builder.append(T3).append("private ").append(type.name).append("(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {\n");
                        builder.append(T4).append("super(type);\n");
                        builder.append(T3).append("}\n");
                        if (type.isEnum) {
                            for (GreyCat.Type.Attribute attribute : type.attributes) {
                                builder.append(T3).append("public static ai.greycat.").append(lib.name).append('.').append(module.name).append('.').append(type.name).append(' ').append(attribute.name).append("(ai.greycat.GreyCat greycat) {\n");
                                builder.append(T4).append("final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.").append(lib.name).append(".name).mapped[").append(type.offset).append("];\n");
                                builder.append(T4).append("return (ai.greycat.").append(lib.name).append('.').append(module.name).append('.').append(type.name).append(") t.enum_values[t.generated_offsets[").append(attribute.mappedAttOffset).append("]];\n");
                                builder.append(T3).append("}\n");
                            }
                        } else if (!type.isNative) {
                            for (GreyCat.Type.Attribute attribute : type.attributes) {
                                String fqn = TYPES[attribute.abiType].fqn();
                                // getter
                                builder.append(T3).append("public ").append(fqn).append(' ').append(attribute.name).append("() {\n");
                                builder.append(T4).append("return (").append(fqn).append(") super.get(super.type.generated_offsets[").append(attribute.mappedAttOffset).append("]);\n");
                                builder.append(T3).append("}\n");
                                // setter
                                builder.append(T3).append("public void set_").append(attribute.name).append('(').append(fqn).append(" v) {\n");
                                builder.append(T4).append("super.set(super.type.generator_offsets[").append(attribute.mappedAttOffset).append("], v);\n");
                                builder.append(T3).append("}\n");
                            }
                        }
                        builder.append(T3).append("public static ").append(type.name).append(" create(ai.greycat.GreyCat greycat) {\n");
                        builder.append(T4).append("return new ").append(type.name).append("(greycat.libs_by_name.get(ai.greycat.").append(lib.name).append(".name).mapped[").append(type.offset).append("]);\n");
                        builder.append(T3).append("}\n");
                        builder.append(T2).append("}\n");
                    }
                }
                builder.append(T1).append("}\n");
            }
            builder.append("}\n");
            System.out.println(builder);
        }
    }
}
