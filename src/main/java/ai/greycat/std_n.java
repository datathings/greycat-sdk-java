package ai.greycat;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedList;

@SuppressWarnings({"unchecked", "unused"})
class std_n {

    public static final class core {

        protected static class nodeTimeCursor extends GreyCat.Object {
            protected nodeTimeCursor(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }


        @SuppressWarnings("unused")
        protected static class Array<T> extends GreyCat.Object {
            protected Array(GreyCat.Type type) {
                super(type, null);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final int size = stream.read_i32();
                final core.Array<java.lang.Object> array = (Array<Object>) type.factory.build(type);
                array.attributes = new java.lang.Object[size];
                for (int offset = 0; offset < size; offset++) {
                    array.set(offset, stream.read());
                }
                return array;
            }

            @Override
            public java.lang.String toString() {
                StringBuilder b = new StringBuilder();
                b.append('[');
                for (int i = 0; i < this.attributes.length; i++) {
                    if (i != 0) {
                        b.append(',');
                    }
                    b.append(this.attributes[i]);
                }
                b.append(']');
                return b.toString();
            }
        }

        protected static class Date extends GreyCat.Object {
            public long localizedEpochS;
            public long epochUs;
            public int timeZone;

            protected Date(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i64(localizedEpochS);
                stream.write_i64(epochUs);
                stream.write_i32(timeZone);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                Date res = (Date) type.factory.build(type);
                res.localizedEpochS = stream.read_i64();
                res.epochUs = stream.read_i64();
                res.timeZone = stream.read_i32();
                return res;
            }
        }

        protected static class duration extends GreyCat.Object {
            public long value;

            protected duration(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.DURATION);
                stream.write_i64(value);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.duration res = (duration) type.factory.build(type);
                res.value = stream.read_i64();
                return res;
            }

        }

        protected static class Error extends GreyCat.Object {
            public int code;
            public core.Error.Frame[] frames;
            public java.lang.String msg;

            public Object value;

            protected Error(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i32(code);
                stream.write_i32(frames.length);
                final byte[] msg_bytes = msg.getBytes(StandardCharsets.UTF_8);
                stream.write_i32(msg_bytes.length);
                int offset = 0;
                while (offset < frames.length) {
                    core.Error.Frame frame = frames[offset];
                    stream.write_i32(frame.modSymbol);
                    stream.write_i32(frame.typeSymbol);
                    stream.write_i32(frame.fnSymbol);
                    stream.write_i32(frame.line);
                    stream.write_i32(frame.column);
                    offset++;
                }
                stream.write_i8_array(msg_bytes, 0, msg_bytes.length);
                stream.write_object(value);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final int code = stream.read_i32();
                final int framesLen = stream.read_i32();
                final int msgLen = stream.read_i32();
                final core.Error.Frame[] frames = new core.Error.Frame[framesLen];
                for (int offset = 0; offset < framesLen; offset++) {
                    final int modSymbol = stream.read_i32();
                    final int typeSymbol = stream.read_i32();
                    final int fnSymbol = stream.read_i32();
                    final int line = stream.read_i32();
                    final int column = stream.read_i32();
                    frames[offset] = new core.Error.Frame(modSymbol, typeSymbol, fnSymbol, line, column);
                }
                core.Error res = (Error) type.factory.build(type);
                res.code = code;
                res.frames = frames;
                res.msg = stream.read_string(msgLen);
                res.value = stream.read();
                return res;
            }

            public final static class Frame {
                private final int modSymbol,
                        typeSymbol,
                        fnSymbol,
                        line,
                        column;

                public Frame(int modSymbol, int typeSymbol, int fnSymbol, int line, int column) {
                    this.modSymbol = modSymbol;
                    this.typeSymbol = typeSymbol;
                    this.fnSymbol = fnSymbol;
                    this.line = line;
                    this.column = column;
                }
            }

            @Override
            public java.lang.String toString() {
                return type.name + "{" +
                        "msg='" + msg + '\'' +
                        ", value=" + value +
                        '}';
            }
        }

        protected static class geo extends GreyCat.Object {
            private static final double GC_CORE_GEO_LAT_EPS = 0.00000001;
            private static final double GC_CORE_GEO_LAT_MIN = -85.05112878;
            private static final double GC_CORE_GEO_LAT_MAX = 85.05112878;
            private static final double GC_CORE_GEO_LNG_MIN = -180;
            private static final double GC_CORE_GEO_LNG_MAX = 180;

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.geo geo = (core.geo) type.factory.build(type);
                long value = stream.read_i64();
                geo.geocode = value;
                final long[] decoded = deinterleave64(value);
                geo.lat = GC_CORE_GEO_LAT_MIN + ((decoded[0] + 0.5) / 4294967296d) * (GC_CORE_GEO_LAT_MAX - GC_CORE_GEO_LAT_MIN);
                geo.lng = GC_CORE_GEO_LNG_MIN + ((decoded[1] + 0.5) / 4294967296d) * (GC_CORE_GEO_LNG_MAX - GC_CORE_GEO_LNG_MIN);
                return geo;
            }

            private static long interleave64(long xlo, long ylo) {
                final long[] B = {Long.parseUnsignedLong("6148914691236517205"), Long.parseUnsignedLong("3689348814741910323"), Long.parseUnsignedLong("1085102592571150095"), Long.parseUnsignedLong("71777214294589695"), Long.parseUnsignedLong("281470681808895")};
                final long[] S = {1, 2, 4, 8, 16};
                long x = xlo;
                long y = ylo;
                x = (x | (x << S[4])) & B[4];
                y = (y | (y << S[4])) & B[4];
                x = (x | (x << S[3])) & B[3];
                y = (y | (y << S[3])) & B[3];
                x = (x | (x << S[2])) & B[2];
                y = (y | (y << S[2])) & B[2];
                x = (x | (x << S[1])) & B[1];
                y = (y | (y << S[1])) & B[1];
                x = (x | (x << S[0])) & B[0];
                y = (y | (y << S[0])) & B[0];
                return x | (y << 1);
            }

            private static long[] deinterleave64(long interleaved) {
                final long[] B = {Long.parseUnsignedLong("6148914691236517205"), Long.parseUnsignedLong("3689348814741910323"), Long.parseUnsignedLong("1085102592571150095"),
                        Long.parseUnsignedLong("71777214294589695"), Long.parseUnsignedLong("281470681808895"), Long.parseUnsignedLong("4294967295")};
                final long[] S = {0, 1, 2, 4, 8, 16};
                long x = interleaved;
                long y = (interleaved >> 1);
                x = (x | (x >> S[0])) & B[0];
                y = (y | (y >> S[0])) & B[0];
                x = (x | (x >> S[1])) & B[1];
                y = (y | (y >> S[1])) & B[1];
                x = (x | (x >> S[2])) & B[2];
                y = (y | (y >> S[2])) & B[2];
                x = (x | (x >> S[3])) & B[3];
                y = (y | (y >> S[3])) & B[3];
                x = (x | (x >> S[4])) & B[4];
                y = (y | (y >> S[4])) & B[4];
                x = (x | (x >> S[5])) & B[5];
                y = (y | (y >> S[5])) & B[5];
                return new long[]{x, y};
            }

            private static long encode(double latitude, double longitude) {
                if (latitude < GC_CORE_GEO_LAT_MIN) {
                    latitude = GC_CORE_GEO_LAT_MIN;
                }
                if (latitude >= GC_CORE_GEO_LAT_MAX) {
                    latitude = GC_CORE_GEO_LAT_MAX - GC_CORE_GEO_LAT_EPS;
                }
                if (longitude < GC_CORE_GEO_LNG_MIN) {
                    longitude = GC_CORE_GEO_LNG_MIN;
                }
                if (longitude >= GC_CORE_GEO_LNG_MAX) {
                    longitude = GC_CORE_GEO_LNG_MAX - GC_CORE_GEO_LAT_EPS;
                }
                double lat_offset = (latitude - GC_CORE_GEO_LAT_MIN) / (GC_CORE_GEO_LAT_MAX - GC_CORE_GEO_LAT_MIN);
                double lon_offset = (longitude - GC_CORE_GEO_LNG_MIN) / (GC_CORE_GEO_LNG_MAX - GC_CORE_GEO_LNG_MIN);
                lat_offset *= 4294967296d;
                lon_offset *= 4294967296d;
                return interleave64((long) lat_offset, (long) lon_offset);
            }

            public long geocode;
            public double lat;
            public double lng;

            public geo(GreyCat.Type type) {
                super(type, null);
            }

            @SuppressWarnings("unused")
            public geo(GreyCat.Type type, double lat, double lng) {
                super(type, null);
                this.lat = lat;
                this.lng = lng;
                this.geocode = encode(lat, lng);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.GEO);
                stream.write_i64(geocode);
            }

            @Override
            public java.lang.String toString() {
                return "geo{" +
                        "lat=" + lat +
                        ",lng=" + lng +
                        '}';
            }
        }

        protected static class GeoPoly extends GreyCat.Object {
            public static final java.lang.String type_name = "core::GeoPoly";

            protected GeoPoly(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                if (this.attributes == null) {
                    stream.write_i32(0);
                } else {
                    stream.write_i32(attributes.length);
                    int i = 0;
                    while (i < attributes.length) {
                        core.geo point = (geo) attributes[i];
                        stream.write_i64(point.geocode);
                        i++;
                    }
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final int size = stream.read_i32();
                final GreyCat.Type geoType = type.greycat.types[type.greycat.type_offset_core_geo];
                final core.geo[] points = new core.geo[size];
                for (int offset = 0; offset < size; offset++) {
                    points[offset] = new core.geo(geoType);
                    points[offset].geocode = stream.read_i64();
                    //TODO update
                }
                core.GeoPoly gp = (GeoPoly) type.factory.build(type);
                gp.attributes = points;
                return gp;
            }
        }

        protected static class Map<T, U> extends GreyCat.Object {
            public static final java.lang.String type_name = "core::Map";

            private final java.util.Map<Object, Object> map = new HashMap<>();

            protected Map(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i32(size());
                for (Object key : map.keySet()) {
                    stream.write_object(key);
                    stream.write_object(get(key));
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final core.Map<Object, Object> map = (Map<Object, Object>) type.factory.build(type);
                final int mapLength = stream.read_i32();
                for (int offset = 0; offset < mapLength; offset++) {
                    map.set(stream.read(), stream.read());
                }
                return map;
            }

            public int size() {
                return map.size();
            }

            @SuppressWarnings("unchecked")
            public U get(Object o) {
                return (U) map.get(o);
            }

            public void set(T t, U u) {
                map.put(t, u);
            }

            @SuppressWarnings({"unused", "FieldCanBeLocal"})
            public void remove(Object o) {
                map.remove(o);
            }

            @SuppressWarnings({"unused"})
            public void clear() {
                map.clear();
            }
        }

        protected static class node extends GreyCat.Object {
            public long ref;

            protected node(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE);
                stream.write_i64(ref);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.node res = (core.node) type.factory.build(type);
                res.ref = stream.read_i64();
                return res;
            }

        }

        protected static class nodeGeo extends GreyCat.Object {
            public long ref;

            protected nodeGeo(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_GEO);
                stream.write_i64(ref);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeGeo res = (core.nodeGeo) type.factory.build(type);
                res.ref = stream.read_i64();
                return res;
            }

        }

        protected static class nodeIndex extends GreyCat.Object {
            @SuppressWarnings("unused")
            public static final java.lang.String type_name = "core::nodeIndex";

            public long ref;

            protected nodeIndex(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_INDEX);
                stream.write_i64(ref);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeIndex res = (nodeIndex) type.factory.build(type);
                res.ref = stream.read_i64();
                return res;
            }
        }

        protected static class nodeIndexBucket extends GreyCat.Object {
            protected nodeIndexBucket(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                if (attributes == null) {
                    stream.write_i32(0);
                } else {
                    stream.write_i32(attributes.length);
                    int i = 0;
                    while (i < attributes.length) {
                        Object object = attributes[i];
                        stream.write_object(object);
                        i++;
                    }
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final int size = stream.read_i32();
                final Object[] data = new Object[size];
                for (int offset = 0; offset < size; offset++) {
                    data[offset] = stream.read();
                }
                core.nodeIndexBucket res = (nodeIndexBucket) type.factory.build(type);
                res.attributes = data;
                return res;
            }

        }

        protected static class nodeList extends GreyCat.Object {
            public long ref;

            protected nodeList(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_LIST);
                stream.write_i64(ref);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeList res = (nodeList) type.factory.build(type);
                res.ref = stream.read_i64();
                return res;
            }

        }

        protected static class nodeTime extends GreyCat.Object {
            public long ref;

            protected nodeTime(GreyCat.Type type) {
                super(type, null);

            }

            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_TIME);
                stream.write_i64(ref);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeTime res = (nodeTime) type.factory.build(type);
                res.ref = stream.read_i64();
                return res;
            }
        }

        protected static class Table<T> extends GreyCat.Object {
            public int cols;

            public int rows;
            public core.Table.TableColumnMeta[] meta;
            public T[] data;

            protected Table(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i32(cols);
                stream.write_i32(rows);
                stream.write_bool(meta != null);
                if (meta != null) {
                    int i = 0;
                    while (i < meta.length) {
                        core.Table.TableColumnMeta colMeta = meta[i];
                        stream.write_i32(colMeta.colType);
                        stream.write_i32(colMeta.type);
                        stream.write_i32(colMeta.size);
                        stream.write_f64(colMeta.sum);
                        stream.write_f64(colMeta.sumSq);
                        stream.write_i64(colMeta.min);
                        stream.write_i64(colMeta.max);
                        stream.write_bool(colMeta.index);
                        stream.write_i32(colMeta.tz);
                        i++;
                    }
                }
                int i = 0;
                while (i < data.length) {
                    stream.write_object(data[i]);
                    i++;
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final int cols = stream.read_i32();
                final int rows = stream.read_i32();
                final boolean useMeta = 0 != stream.read_i8();
                core.Table.TableColumnMeta[] meta = null;
                if (useMeta) {
                    meta = new core.Table.TableColumnMeta[cols];
                    for (int col = 0; col < cols; col++) {
                        meta[col] = new core.Table.TableColumnMeta(stream.read_i32(), stream.read_i32(), stream.read_i32(), stream.read_f64(), stream.read_f64(), stream.read_i64(), stream.read_i64(), stream.read_bool(), stream.read_i32());
                    }
                }
                final int capacity = cols * rows;
                final Object[] data = new Object[capacity];
                for (int offset = 0; offset < capacity; offset++) {
                    data[offset] = stream.read();
                }
                core.Table<java.lang.Object> t = (Table<java.lang.Object>) type.factory.build(type);
                t.cols = cols;
                t.rows = rows;
                t.meta = meta;
                t.data = data;
                return t;
            }

            public static final class TableColumnMeta {
                public final int colType;
                public final int type;
                public final int size;
                public final double sum;
                public final double sumSq;
                public final long min;
                public final long max;
                public final boolean index;
                public final int tz;

                public TableColumnMeta(int colType, int type, int size, double sum, double sumSq, long min, long max, boolean index, int tz) {
                    this.colType = colType;
                    this.type = type;
                    this.size = size;
                    this.sum = sum;
                    this.sumSq = sumSq;
                    this.min = min;
                    this.max = max;
                    this.index = index;
                    this.tz = tz;
                }
            }
        }

        protected static class Tensor extends GreyCat.Object {
            public int[] shape;
            public byte tensorType;
            public int size;
            public byte[] data;

            protected Tensor(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i8((byte) shape.length);
                stream.write_i8(tensorType);
                int i = 0;
                while (i < shape.length) {
                    int dim = shape[i];
                    stream.write_i32(dim);
                    i++;
                }
                stream.write_i32(size);
                stream.write_i8_array(data, 0, data.length);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final byte nbDim = stream.read_i8();
                final byte tensorType = stream.read_i8();
                final int[] shape = new int[nbDim];
                for (int offset = 0; offset < nbDim; offset++) {
                    shape[offset] = stream.read_i32();
                }
                int size = stream.read_i32();
                int bin_size = size;
                switch (tensorType) {
                    case 0:
                    case 2:
                        bin_size *= 4;
                        break;
                    case 1:
                    case 3:
                    case 4:
                        bin_size *= 8;
                        break;
                    case 5:
                        bin_size *= 16;
                        break;
                    default:
                        throw new IllegalArgumentException("" + tensorType);
                }
                core.Tensor res = (Tensor) type.factory.build(type);
                res.shape = shape;
                res.tensorType = tensorType;
                res.size = size;
                res.data = stream.read_i8_array(bin_size);
                return res;
            }
        }

        protected static class time extends GreyCat.Object {
            public long value;

            protected time(GreyCat.Type type) {
                super(type, null);
            }

            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TIME);
                stream.write_i64(value);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.time res = (core.time) type.factory.build(type);
                res.value = stream.read_i64();
                return res;
            }

        }

        protected static class String extends GreyCat.Object {

            protected String(GreyCat.Type type) {
                super(type, null);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                return stream.read_string(stream.read_i32());
            }
        }

    }

    public static final class util {

        protected static class Quantizer extends GreyCat.Object {

            protected Quantizer(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }

        protected static class Buffer extends GreyCat.Object {
            public byte[] data;

            protected Buffer(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i32(data.length);
                stream.write_i8_array(data, 0, data.length);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                util.Buffer buf = (Buffer) type.factory.build(type);
                buf.data = stream.read_i8_array(stream.read_i32());
                return buf;
            }
        }

        protected static class ByteArray extends GreyCat.Object {
            public byte[] data;

            protected ByteArray(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i32(data.length);
                stream.write_i8_array(data, 0, data.length);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                util.ByteArray buf = (ByteArray) type.factory.build(type);
                buf.data = stream.read_i8_array(stream.read_i32());
                return buf;
            }
        }

        protected static class Gaussian extends GreyCat.Object {
            public double sum;
            public double sumSq;
            public long size;
            public long nbAccepted;
            public long nbRejected;
            public long nbNull;
            public double min;
            public double max;
            public double minBound;
            public double maxBound;

            protected Gaussian(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_f64(sum);
                stream.write_f64(sumSq);
                stream.write_i64(size);
                stream.write_i64(nbAccepted);
                stream.write_i64(nbRejected);
                stream.write_i64(nbNull);
                stream.write_f64(min);
                stream.write_f64(max);
                stream.write_f64(minBound);
                stream.write_f64(maxBound);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                util.Gaussian g = (Gaussian) type.factory.build(type);
                g.sum = stream.read_f64();
                g.sumSq = stream.read_f64();
                g.size = stream.read_i64();
                g.nbAccepted = stream.read_i64();
                g.nbRejected = stream.read_i64();
                g.nbNull = stream.read_i64();
                g.min = stream.read_f64();
                g.max = stream.read_f64();
                g.minBound = stream.read_f64();
                g.maxBound = stream.read_f64();
                return g;
            }

        }

        protected static class GaussianProfile extends GreyCat.Object {
            //            public int size;
            public byte[] data;

            protected GaussianProfile(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
//                stream.write_i32(size);
                stream.write_i32(data.length);
                stream.write_i8_array(data, 0, data.length);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                util.GaussianProfile g = (GaussianProfile) type.factory.build(type);
                int size = stream.read_i32();
                g.data = stream.read_i8_array(size);
                return g;
            }

        }

        protected static class HistogramF64 extends GreyCat.Object {
            public double realMin;
            public double realMax;
            public double min;
            public double max;
            public long size;
            public long nullCount;
            public long maxRange;
            public double sum;
            public double sumSq;
            public int unitMagnitude;
            public int significantFigures;
            public int subBucketHalfCountMagnitude;
            public int subBucketHalfCount;
            public long subBucketMask;
            public int subBucketCount;
            public int bucketCount;
            public long minValue;
            public long maxValue;
            public int normalizingIndexOffset;
            public int countsLen;
            public long totalCount;
            public long[] counts;

            protected HistogramF64(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_f64(realMin);
                stream.write_f64(realMax);
                stream.write_f64(min);
                stream.write_f64(max);
                stream.write_i64(size);
                stream.write_i64(nullCount);
                stream.write_i64(maxRange);
                stream.write_f64(sum);
                stream.write_f64(sumSq);
                stream.write_i32(unitMagnitude);
                stream.write_i32(significantFigures);
                stream.write_i32(subBucketHalfCountMagnitude);
                stream.write_i32(subBucketHalfCount);
                stream.write_i64(subBucketMask);
                stream.write_i32(subBucketCount);
                stream.write_i32(bucketCount);
                stream.write_i64(minValue);
                stream.write_i64(maxValue);
                stream.write_i32(normalizingIndexOffset);
                stream.write_i32(countsLen);
                stream.write_i64(totalCount);
                int i = 0;
                while (i < counts.length) {
                    stream.write_i64(counts[i]);
                    i++;
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final double realMin = stream.read_f64();
                final double realMax = stream.read_f64();
                final double min = stream.read_f64();
                final double max = stream.read_f64();
                final long size = stream.read_i64();
                final long nullCount = stream.read_i64();
                final long maxRange = stream.read_i64();
                final double sum = stream.read_f64();
                final double sumSq = stream.read_f64();
                final int unitMagnitude = stream.read_i32();
                final int significantFigures = stream.read_i32();
                final int subBucketHalfCountMagnitude = stream.read_i32();
                final int subBucketHalfCount = stream.read_i32();
                final long subBucketMask = stream.read_i64();
                final int subBucketCount = stream.read_i32();
                final int bucketCount = stream.read_i32();
                final long minValue = stream.read_i64();
                final long maxValue = stream.read_i64();
                final int normalizingIndexOffset = stream.read_i32();
                final int countsLen = stream.read_i32();
                long totalCount = stream.read_i64();
                final long[] counts = new long[countsLen];
                for (int offset = 0; offset < countsLen; offset++) {
                    counts[offset] = stream.read_i64();
                }
                util.HistogramF64 h = (HistogramF64) type.factory.build(type);
                h.realMin = realMin;
                h.realMax = realMax;
                h.min = min;
                h.max = max;
                h.size = size;
                h.nullCount = nullCount;
                h.maxRange = maxRange;
                h.sum = sum;
                h.sumSq = sumSq;
                h.unitMagnitude = unitMagnitude;
                h.significantFigures = significantFigures;
                h.subBucketHalfCountMagnitude = subBucketHalfCountMagnitude;
                h.subBucketHalfCount = subBucketHalfCount;
                h.subBucketMask = subBucketMask;
                h.subBucketCount = subBucketCount;
                h.bucketCount = bucketCount;
                h.minValue = minValue;
                h.maxValue = maxValue;
                h.normalizingIndexOffset = normalizingIndexOffset;
                h.countsLen = countsLen;
                h.totalCount = totalCount;
                h.counts = counts;
                return h;
            }
        }

        protected static class HistogramI64 extends GreyCat.Object {
            public long realMin;
            public long realMax;
            public long min;
            public long max;
            public long size;
            public long nullCount;
            public long maxRange;
            public double sum;
            public double sumSq;
            public int unitMagnitude;
            public int significantFigures;
            public int subBucketHalfCountMagnitude;
            public int subBucketHalfCount;
            public long subBucketMask;
            public int subBucketCount;
            public int bucketCount;
            public long minValue;
            public long maxValue;
            public int normalizingIndexOffset;
            public int countsLen;
            public long totalCount;
            public long[] counts;

            protected HistogramI64(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i64(realMin);
                stream.write_i64(realMax);
                stream.write_i64(min);
                stream.write_i64(max);
                stream.write_i64(size);
                stream.write_i64(nullCount);
                stream.write_i64(maxRange);
                stream.write_f64(sum);
                stream.write_f64(sumSq);
                stream.write_i32(unitMagnitude);
                stream.write_i32(significantFigures);
                stream.write_i32(subBucketHalfCountMagnitude);
                stream.write_i32(subBucketHalfCount);
                stream.write_i64(subBucketMask);
                stream.write_i32(subBucketCount);
                stream.write_i32(bucketCount);
                stream.write_i64(minValue);
                stream.write_i64(maxValue);
                stream.write_i32(normalizingIndexOffset);
                stream.write_i32(countsLen);
                stream.write_i64(totalCount);
                int i = 0;
                while (i < counts.length) {
                    stream.write_i64(counts[i]);
                    i++;
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final long realMin = stream.read_i64();
                final long realMax = stream.read_i64();
                final long min = stream.read_i64();
                final long max = stream.read_i64();
                final long size = stream.read_i64();
                final long nullCount = stream.read_i64();
                final long maxRange = stream.read_i64();
                final double sum = stream.read_f64();
                final double sumSq = stream.read_f64();
                final int unitMagnitude = stream.read_i32();
                final int significantFigures = stream.read_i32();
                final int subBucketHalfCountMagnitude = stream.read_i32();
                final int subBucketHalfCount = stream.read_i32();
                final long subBucketMask = stream.read_i64();
                final int subBucketCount = stream.read_i32();
                final int bucketCount = stream.read_i32();
                final long minValue = stream.read_i64();
                final long maxValue = stream.read_i64();
                final int normalizingIndexOffset = stream.read_i32();
                final int countsLen = stream.read_i32();
                final long totalCount = stream.read_i64();
                final long[] counts = new long[countsLen];
                for (int offset = 0; offset < countsLen; offset++) {
                    counts[offset] = stream.read_i64();
                }
                util.HistogramI64 h = (HistogramI64) type.factory.build(type);
                h.realMin = realMin;
                h.realMax = realMax;
                h.min = min;
                h.max = max;
                h.size = size;
                h.nullCount = nullCount;
                h.maxRange = maxRange;
                h.sum = sum;
                h.sumSq = sumSq;
                h.unitMagnitude = unitMagnitude;
                h.significantFigures = significantFigures;
                h.subBucketHalfCountMagnitude = subBucketHalfCountMagnitude;
                h.subBucketHalfCount = subBucketHalfCount;
                h.subBucketMask = subBucketMask;
                h.subBucketCount = subBucketCount;
                h.bucketCount = bucketCount;
                h.minValue = minValue;
                h.maxValue = maxValue;
                h.normalizingIndexOffset = normalizingIndexOffset;
                h.countsLen = countsLen;
                h.totalCount = totalCount;
                h.counts = counts;
                return h;
            }
        }

        protected static class ProgressTracker extends GreyCat.Object {
            public long initialTime;
            public long lastTime;
            public long previousTime;
            public long previousSteps;
            public long maxStep;
            public long nbStep;
            public long duration;
            public long lapDuration;
            public double totalSpeed;
            public double stepSpeed;
            public double progress;
            public long remainingTime;

            protected ProgressTracker(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i64(initialTime);
                stream.write_i64(lastTime);
                stream.write_i64(previousTime);
                stream.write_i64(previousSteps);
                stream.write_i64(maxStep);
                stream.write_i64(nbStep);
                stream.write_i64(duration);
                stream.write_i64(lapDuration);
                stream.write_f64(totalSpeed);
                stream.write_f64(stepSpeed);
                stream.write_f64(progress);
                stream.write_i64(remainingTime);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final long initialTime = stream.read_i64();
                final long lastTime = stream.read_i64();
                final long previousTime = stream.read_i64();
                final long previousSteps = stream.read_i64();
                final long maxStep = stream.read_i64();
                final long nbStep = stream.read_i64();
                final long duration = stream.read_i64();
                final long lapDuration = stream.read_i64();
                final double totalSpeed = stream.read_f64();
                final double stepSpeed = stream.read_f64();
                final double progress = stream.read_f64();
                final long remainingTime = stream.read_i64();
                util.ProgressTracker pt = (ProgressTracker) type.factory.build(type);
                pt.initialTime = initialTime;
                pt.lastTime = lastTime;
                pt.previousTime = previousTime;
                pt.previousSteps = previousSteps;
                pt.maxStep = maxStep;
                pt.nbStep = nbStep;
                pt.duration = duration;
                pt.lapDuration = lapDuration;
                pt.totalSpeed = totalSpeed;
                pt.stepSpeed = stepSpeed;
                pt.progress = progress;
                pt.remainingTime = remainingTime;
                return pt;
            }
        }

        protected static class Iban extends GreyCat.Object {

            public int infoOff;
            public byte[] data;

            public Iban(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i32(infoOff);
                stream.write_i32(data.length);
                stream.write_i8_array(data, 0, data.length);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                util.Iban iban = (Iban) type.factory.build(type);
                iban.infoOff = stream.read_i32();
                iban.data = stream.read_i8_array(stream.read_i32());
                return iban;
            }

        }

        protected static class Queue<T> extends GreyCat.Object {

            private final java.util.Queue<T> queue = new LinkedList<>();

            protected Queue(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i64(size()); // width
                stream.write_i32(size()); // size
                stream.write_i32(size()); // capacity
                stream.write_i64(size()); // TODO: head - values
                stream.write_i64(0); // TODO: tail - values
                for (T t : queue) {
                    stream.write_object(t);
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                stream.read_i64(); // width
                final int size = stream.read_i32();
                final int capacity = stream.read_i32();
                stream.read_i64(); // head - values;
                stream.read_i64(); // tail - values;
                final util.Queue<Object> queue = (Queue<Object>) type.factory.build(type);
                int offset;
                for (offset = 0; offset < size; offset++) {
                    queue.enqueue(stream.read());
                }
                for (; offset < capacity; offset++) {
                    stream.read();
                }
                return queue;
            }

            public int size() {
                return queue.size();
            }

            @SuppressWarnings({"unused", "FieldCanBeLocal"})
            public void clear() {
                queue.clear();
            }

            public void enqueue(T t) {
                queue.offer(t);
            }

            @SuppressWarnings({"unused", "FieldCanBeLocal"})
            public T dequeue() {
                return queue.poll();
            }

            @SuppressWarnings({"unused", "FieldCanBeLocal"})
            public T poll() {
                return queue.poll();
            }

            @SuppressWarnings({"unused", "FieldCanBeLocal"})
            public T head() {
                return queue.peek();
            }
        }

        protected static class SlidingWindow extends GreyCat.Object {
            public long width;
            public byte sumType;
            public double sum;
            public double sumSq;
            public int size;
            public int capacity;
            public long toHead;
            public long toTail;
            public Object[] values;

            protected SlidingWindow(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i64(width);
                stream.write_i8(sumType);
                stream.write_f64(sum);
                stream.write_f64(sumSq);
                stream.write_i32(size);
                stream.write_i32(capacity);
                stream.write_i64(toHead);
                stream.write_i64(toTail);
                int i = 0;
                while (i < values.length) {
                    stream.write_object(values[i]);
                    i++;
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final long width = stream.read_i64();
                final byte sumType = stream.read_i8();
                final double sum = stream.read_f64();
                final double sumSq = stream.read_f64();
                final int size = stream.read_i32();
                final int capacity = stream.read_i32();
                final long toHead = stream.read_i64();
                final long toTail = stream.read_i64();
                final Object[] values = new Object[capacity];
                for (int offset = 0; offset < capacity; offset++) {
                    values[offset] = stream.read();
                }
                util.SlidingWindow sw = (SlidingWindow) type.factory.build(type);
                sw.width = width;
                sw.sumType = sumType;
                sw.sum = sum;
                sw.sumSq = sumSq;
                sw.size = size;
                sw.capacity = capacity;
                sw.toHead = toHead;
                sw.toTail = toTail;
                sw.values = values;
                return sw;
            }

        }

        protected static class TimeWindow extends GreyCat.Object {
            public long timeWidth;
            public byte sumType;
            public double sum;
            public double sumSq;
            public int size;
            public int capacity;
            public long toHead;
            public long toTail;
            public ValueTime[] valueTimes;

            protected TimeWindow(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i64(timeWidth);
                stream.write_i8(sumType);
                stream.write_f64(sum);
                stream.write_f64(sumSq);
                stream.write_i32(size);
                stream.write_i32(capacity);
                stream.write_i64(toHead);
                stream.write_i64(toTail);
                int i = 0;
                while (i < valueTimes.length) {
                    final ValueTime valueTime = valueTimes[i];
                    stream.write_object(valueTime.value);
                    stream.write_i64(valueTime.time);
                    i++;
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final long timeWidth = stream.read_i64();
                final byte sumType = stream.read_i8();
                final double sum = stream.read_f64();
                final double sumSq = stream.read_f64();
                final int size = stream.read_i32();
                final int capacity = stream.read_i32();
                final long toHead = stream.read_i64();
                final long toTail = stream.read_i64();
                final util.TimeWindow.ValueTime[] values = new util.TimeWindow.ValueTime[capacity];
                for (int offset = 0; offset < capacity; offset++) {
                    values[offset] = new util.TimeWindow.ValueTime(stream.read(), stream.read_i64());
                }
                util.TimeWindow tw = (TimeWindow) type.factory.build(type);
                tw.timeWidth = timeWidth;
                tw.sumType = sumType;
                tw.sum = sum;
                tw.sumSq = sumSq;
                tw.size = size;
                tw.capacity = capacity;
                tw.toHead = toHead;
                tw.toTail = toTail;
                tw.valueTimes = values;
                return tw;
            }


            public final static class ValueTime {
                public final Object value;
                public final long time;

                public ValueTime(Object value, long time) {
                    this.value = value;
                    this.time = time;
                }
            }
        }
    }

    public static final class io {
        protected static class Directory extends GreyCat.Object {

            protected Directory(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }

        protected static class File extends GreyCat.Object {

            protected File(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }

        protected static class FileWriter extends GreyCat.Object {

            protected FileWriter(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }

        protected static class AbiWriter extends GreyCat.Object {

            protected AbiWriter(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }

        protected static class AbiReader extends GreyCat.Object {

            protected AbiReader(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }

    }

}
