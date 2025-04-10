package ai.greycat;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class std_n {

    public static final class core {

        // Primitive types

        @SuppressWarnings("unused")
        protected static class node<T> extends GreyCat.Object {
            public long ref;

            protected node(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu64(ref);
            }

            static core.node<?> load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.node<?> res = (core.node<?>) type.factory.build(type);
                res.ref = stream.read_vu64();
                return res;
            }

        }

        @SuppressWarnings("unused")
        protected static class nodeTime<T> extends GreyCat.Object {
            public long ref;

            protected nodeTime(GreyCat.Type type) {
                super(type, null);

            }

            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_TIME);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu64(ref);
            }

            static core.nodeTime<?> load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeTime<?> res = (core.nodeTime<?>) type.factory.build(type);
                res.ref = stream.read_vu64();
                return res;
            }
        }

        @SuppressWarnings("unused")
        protected static class nodeIndex<T, U> extends GreyCat.Object {
            public static final java.lang.String type_name = "core::nodeIndex";

            public long ref;

            protected nodeIndex(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_INDEX);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu64(ref);
            }

            static core.nodeIndex<?, ?> load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeIndex<?, ?> res = (core.nodeIndex<?, ?>) type.factory.build(type);
                res.ref = stream.read_vu64();
                return res;
            }
        }

        @SuppressWarnings("unused")
        protected static class nodeList<T> extends GreyCat.Object {
            public long ref;

            protected nodeList(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_LIST);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu64(ref);
            }

            static core.nodeList<?> load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeList<?> res = (core.nodeList<?>) type.factory.build(type);
                res.ref = stream.read_vu64();
                return res;
            }

        }

        @SuppressWarnings("unused")
        protected static class nodeGeo<T> extends GreyCat.Object {
            public long ref;

            protected nodeGeo(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_GEO);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu64(ref);
            }

            static core.nodeGeo<?> load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeGeo<?> res = (core.nodeGeo<?>) type.factory.build(type);
                res.ref = stream.read_vu64();
                return res;
            }

        }

        protected static class field extends GreyCat.Object {
            protected field(GreyCat.Type type) {
                super(type, null);
            }

            static java.lang.Object load(@SuppressWarnings("unused") GreyCat.Type type, @SuppressWarnings("unused") GreyCat.Stream stream) throws IOException {
                throw new RuntimeException("unsupported");
            }
        }

        protected static class function extends GreyCat.Object {
            protected function(GreyCat.Type type) {
                super(type, null);
            }

            static java.lang.Object load(@SuppressWarnings("unused") GreyCat.Type type, @SuppressWarnings("unused") GreyCat.Stream stream) throws IOException {
                throw new RuntimeException("unsupported");
            }
        }

        protected static class geo extends GreyCat.Object {
            private static final double GC_CORE_GEO_LAT_EPS = 0.00000001;
            private static final double GC_CORE_GEO_LAT_MIN = -85.05112878;
            private static final double GC_CORE_GEO_LAT_MAX = 85.05112878;
            private static final double GC_CORE_GEO_LNG_MIN = -180;
            private static final double GC_CORE_GEO_LNG_MAX = 180;

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.GEO);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i64(geocode);
            }

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
            public java.lang.String toString() {
                return "geo{" +
                        "lat=" + lat +
                        ",lng=" + lng +
                        '}';
            }
        }

        protected static class time extends GreyCat.Object {
            public long value;

            protected time(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TIME);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vi64(value);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.time res = (core.time) type.factory.build(type);
                res.value = stream.read_vi64();
                return res;
            }

        }

        protected static class duration extends GreyCat.Object {
            public long value;

            protected duration(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.DURATION);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vi64(value);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.duration res = (duration) type.factory.build(type);
                res.value = stream.read_vi64();
                return res;
            }

        }

        protected static class str extends GreyCat.Object {
            protected str(GreyCat.Type type) {
                super(type, null);
            }

            static java.lang.Object load(@SuppressWarnings("unused") GreyCat.Type type, @SuppressWarnings("unused") GreyCat.Stream stream) throws IOException {
                throw new RuntimeException("unsupported");
            }
        }

        protected static class t2 extends GreyCat.Object {
            public int x0, x1;

            private final static long UINT32_MIN = 2147483648L;

            protected t2(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.T2);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                t2 res = (t2) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "ti2d{x0=" + x0 + ",x1=" + x1 + "}";
            }

            long interleave() {
                return interleave64_2d(((long) x0) + UINT32_MIN, ((long) x1) + UINT32_MIN);
            }

            private void deinterleave(long interleaved) {
                long dc = deinterleave64_2d(interleaved);
                x0 = (int) (dc + Integer.MIN_VALUE);
                x1 = (int) ((dc >>> 32) + Integer.MIN_VALUE);
            }
        }

        protected static class t3 extends GreyCat.Object {
            public int x0, x1, x2;

            private final static int INT21_MIN = -1048575 - 1;
            @SuppressWarnings("unused")
            private final static int INT_21_MAX = 1048575;
            private final static long UINT21_MIN = 4293918720L;

            protected t3(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.T3);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                t3 res = (t3) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "ti3d{x0=" + x0 + ",x1=" + x1 + ",x2=" + x2 + "}";
            }

            long interleave() {
                return interleave64_3d(((long) x0) + UINT21_MIN, ((long) x1) + UINT21_MIN, ((long) x2) + UINT21_MIN);
            }

            private void deinterleave(long interleaved) {
                @SuppressWarnings("unused") final long[] B = {0x10c30c30c30c30c3L, 0x100f00f00f00f00fL, 0x001f0000ff0000ffL, 0xffff00000000ffffL, 0x0001fffffL};
                @SuppressWarnings("unused") final int[] S = {2, 4, 8, 16, 32};

                x0 = (int) ((long) deinterleave64_3d(interleaved) + INT21_MIN);
                x1 = (int) ((long) deinterleave64_3d(interleaved >>> 1) + INT21_MIN);
                x2 = (int) ((long) deinterleave64_3d(interleaved >>> 2) + INT21_MIN);
            }
        }

        protected static class t4 extends GreyCat.Object {

            public short x0, x1, x2, x3;
            private final static int UINT16_MIN = 32768;

            protected t4(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.T4);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                t4 res = (t4) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "ti4d{x0=" + x0 + ",x1=" + x1 + ",x2=" + x2 + ",x3=" + x3 + "}";
            }

            long interleave() {
                return interleave64_2d(
                        interleave64_2d(((int) x0) + UINT16_MIN, ((int) x2) + UINT16_MIN),
                        interleave64_2d(((int) x1) + UINT16_MIN, ((int) x3) + UINT16_MIN)
                );
            }

            private void deinterleave(long interleaved) {
                long x3120 = deinterleave64_2d(interleaved);
                long x20 = deinterleave64_2d(x3120 & 0xffffffffL);
                long x31 = deinterleave64_2d(x3120 >>> 32);
                x0 = (short) ((x20 & 0xffffL) + Short.MIN_VALUE);
                x1 = (short) ((x31 & 0xffffL) + Short.MIN_VALUE);
                x2 = (short) ((x20 >>> 32) + Short.MIN_VALUE);
                x3 = (short) ((x31 >>> 32) + Short.MIN_VALUE);
            }
        }

        protected static class t2f extends GreyCat.Object {

            float x0, x1;

            protected t2f(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.T2F);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                t2f res = (t2f) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "tf2d{x0=" + x0 + ",x1=" + x1 + "}";
            }

            long interleave() {
                return interleave64_2d(
                        ((long) Float.floatToIntBits(x0)) + t2.UINT32_MIN,
                        ((long) Float.floatToIntBits(x1)) + t2.UINT32_MIN
                );
            }

            private void deinterleave(long interleaved) {
                long dc = deinterleave64_2d(interleaved);
                x0 = Float.intBitsToFloat((int) (dc + Integer.MIN_VALUE));
                x1 = Float.intBitsToFloat((int) ((dc >>> 32) + Integer.MIN_VALUE));
            }
        }

        protected static class t3f extends GreyCat.Object {

            float x0, x1, x2;

            protected t3f(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.T3F);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                t3f res = (t3f) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "tf3d{x0=" + x0 + ",x1=" + x1 + ",x2=" + x2 + "}";
            }

            long interleave() {
                return interleave64_3d(
                        (((long) Float.floatToIntBits(x0)) >>> 11) + t3.UINT21_MIN,
                        (((long) Float.floatToIntBits(x1)) >>> 11) + t3.UINT21_MIN,
                        (((long) Float.floatToIntBits(x2)) >>> 11) + t3.UINT21_MIN
                );
            }

            public void deinterleave(long interleaved) {
                x0 = Float.intBitsToFloat((int) (((long) deinterleave64_3d(interleaved) + t3.INT21_MIN) << 11));
                x1 = Float.intBitsToFloat((int) (((long) deinterleave64_3d(interleaved >>> 1) + t3.INT21_MIN) << 11));
                x2 = Float.intBitsToFloat((int) (((long) deinterleave64_3d(interleaved >>> 2) + t3.INT21_MIN) << 11));
            }
        }

        protected static class t4f extends GreyCat.Object {

            float x0, x1, x2, x3;

            protected t4f(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.T4F);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                t4f res = (t4f) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "tf3d{x0=" + x0 + ",x1=" + x1 + ",x2=" + x2 + ",x3=" + x3 + "}";
            }

            long interleave() {
                return interleave64_2d(
                        interleave64_2d(
                                ((Float.floatToIntBits(x0)) >>> 16) + t4.UINT16_MIN,
                                (Float.floatToIntBits(x2) >>> 16) + t4.UINT16_MIN
                        ),
                        interleave64_2d(
                                (Float.floatToIntBits(x1) >>> 16) + t4.UINT16_MIN,
                                (Float.floatToIntBits(x3) >>> 16) + t4.UINT16_MIN
                        )
                );
            }

            private void deinterleave(long interleaved) {
                long d3120 = deinterleave64_2d(interleaved);
                long d20 = deinterleave64_2d(d3120 & 0xffffffffL);
                long d31 = deinterleave64_2d(d3120 >>> 32);
                x0 = Float.intBitsToFloat((int) (((d20 & 0xffff) + Short.MIN_VALUE) << 16));
                x1 = Float.intBitsToFloat((int) (((d31 & 0xffff) + Short.MIN_VALUE) << 16));
                x2 = Float.intBitsToFloat((int) (((d20 >>> 32) + Short.MIN_VALUE) << 16));
                x3 = Float.intBitsToFloat((int) (((d31 >>> 32) + Short.MIN_VALUE) << 16));
            }
        }

        protected static class type extends GreyCat.Object {
            protected type(GreyCat.Type type) {
                super(type, null);
            }

            static java.lang.Object load(@SuppressWarnings("unused") GreyCat.Type type, @SuppressWarnings("unused") GreyCat.Stream stream) throws IOException {
                throw new RuntimeException("unsupported");
            }
        }

        // Object types

        protected static class Array<T> extends GreyCat.Object {
            protected Array(GreyCat.Type type) {
                super(type, null);
            }

            private void save_typed(GreyCat.Stream stream, int type_offset, boolean type_nullable) throws IOException {
                byte[] nullables = null;
                if (type_nullable) {
                    for (int offset = 0; offset < size(); ++offset) {
                        Object e = attributes[offset];
                        if (null == e) {
                            if (null == nullables) {
                                nullables = new byte[(int) Math.ceil((float) size() / 8)];
                                Arrays.fill(nullables, (byte) 0);
                            }
                            nullables[offset >>> 3] |= (byte) (1 << (offset & 7));
                        }
                        stream.write_bool(null != nullables);
                        if (null != nullables) {
                            stream.write_i8_array(nullables, 0, nullables.length);
                        }
                    }
                } else {
                    stream.write_bool(false);
                }
                if (stream.greycat.type_offset_core_bool == type_offset) {
                    stream.write_i8(GreyCat.PrimitiveType.BOOL);
                    stream.write_i8((byte) 0); // TODO: manage monotonic
                    if (type_nullable) {
                        for (Object e : attributes) {
                            if (null != e) {
                                stream.write_bool((boolean) e);
                            }
                        }
                    } else {
                        for (Object e : attributes) {
                            stream.write_bool((boolean) e);
                        }
                    }
                } else if (stream.greycat.type_offset_core_char == type_offset) {
                    stream.write_i8(GreyCat.PrimitiveType.CHAR);
                    stream.write_i8((byte) 0); // TODO: manage monotonic
                    if (type_nullable) {
                        for (Object e : attributes) {
                            if (null != e) {
                                char c = (char) e;
                                if (c > GreyCat.Stream.ASCII_MAX) {
                                    throw new IllegalArgumentException("Only ASCII characters are allowed: " + c);
                                }
                                stream.write_i8((byte) c);
                            }
                        }
                    } else {
                        for (Object e : attributes) {
                            char c = (char) e;
                            if (c > GreyCat.Stream.ASCII_MAX) {
                                throw new IllegalArgumentException("Only ASCII characters are allowed: " + c);
                            }
                            stream.write_i8((byte) c);
                        }
                    }
                } else if (stream.greycat.type_offset_core_int == type_offset) {
                    stream.write_i8(GreyCat.PrimitiveType.INT);
                    stream.write_i8((byte) 0); // TODO: manage monotonic
                    if (type_nullable) {
                        for (Object e : attributes) {
                            if (null != e) {
                                stream.write_vi64((long) e);
                            }
                        }
                    } else {
                        for (Object e : attributes) {
                            stream.write_vi64((long) e);
                        }
                    }
                } else if (stream.greycat.type_offset_core_float == type_offset) {
                    stream.write_i8(GreyCat.PrimitiveType.FLOAT);
                    stream.write_i8((byte) 0); // TODO: manage monotonic
                    if (type_nullable) {
                        for (Object e : attributes) {
                            if (null != e) {
                                stream.write_f64((double) e);
                            }
                        }
                    } else {
                        for (Object e : attributes) {
                            stream.write_f64((double) e);
                        }
                    }
                } else {
                    if (stream.greycat.type_offset_core_node == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.NODE);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_node_time == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.NODE_TIME);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_node_index == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.NODE_INDEX);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_node_list == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.NODE_LIST);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_node_geo == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.NODE_GEO);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_geo == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.GEO);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_time == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.TIME);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_duration == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.DURATION);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_t2 == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.T2);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_t3 == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.T3);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_t4 == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.T4);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_t2f == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.T2F);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_t3f == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.T3F);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                    } else if (stream.greycat.type_offset_core_t4f == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.T4F);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        // } else if () { TODO: other types
                    } else {
                        stream.write_i8((GreyCat.PrimitiveType.OBJECT));
                        stream.write_vu32(type_offset);
                    }
                    if (type_nullable) {
                        for (Object e : attributes) {
                            if (null != e) {
                                ((GreyCat.Object) e).save(stream, type_offset);
                            }
                        }
                    } else {
                        for (Object e : attributes) {
                            ((GreyCat.Object) e).save(stream, type_offset);
                        }
                    }
                }
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                if (null == attributes || 0 == size()) {
                    stream.write_vu32(0);
                    return;
                }
                stream.write_vu32(size());
                if (null != type_offset && 0 != stream.greycat.types[type_offset].generic_abi_type) {
                    int g1_abi_type_desc = stream.greycat.types[type_offset].g1_abi_type_desc;
                    save_typed(stream, g1_abi_type_desc >> 1, 1 == (g1_abi_type_desc & 1));
                    return;
                }
                byte[] nullables = null;
                boolean type_is_unique = false;
                Class<?> unique_type = null;
                boolean value_is_monotonic = false;
                Object monotonic_value = null;
                for (int offset = 0; offset < size(); ++offset) {
                    Object e = attributes[offset];
                    if (null == e) {
                        if (null == nullables) {
                            nullables = new byte[(int) Math.ceil((double) attributes.length / 8)];
                            Arrays.fill(nullables, (byte) 0);
                        }
                        nullables[offset >>> 3] |= (byte) (1 << (offset & 7));
                    } else {
                        Class<?> type = e.getClass();
                        if (null == unique_type) {
                            type_is_unique = true;
                            unique_type = type;
                        } else if (type_is_unique && !unique_type.equals(type)) {
                            type_is_unique = false;
                        }
                        if (null == monotonic_value) {
                            value_is_monotonic = true;
                            monotonic_value = e;
                        } else if (value_is_monotonic && !monotonic_value.equals(e)) {
                            value_is_monotonic = false;
                        }
                    }
                }
                System.out.println(null != nullables);
                stream.write_bool(null != nullables);
                if (null != nullables) {
                    stream.write_i8_array(nullables, 0, nullables.length);
                }
                if (!type_is_unique) {
                    stream.write_i8(GreyCat.PrimitiveType.UNDEFINED);
                    for (Object e : attributes) {
                        if (null != e) {
                            stream.write(e);
                        }
                    }
                } else {
                    if (java.lang.Boolean.class.equals(unique_type)) {
                        stream.write_i8(GreyCat.PrimitiveType.BOOL);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        for (Object e : attributes) {
                            if (null != e) {
                                stream.write_bool((boolean) e);
                            }
                        }
                    } else if (java.lang.Character.class.equals(unique_type)) {
                        stream.write_i8(GreyCat.PrimitiveType.CHAR);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        for (Object e : attributes) {
                            if (null != e) {
                                char c = (char) e;
                                if (c > GreyCat.Stream.ASCII_MAX) {
                                    throw new IllegalArgumentException("Only ASCII characters are allowed: " + c);
                                }
                                stream.write_i8((byte) c);
                            }
                        }
                    } else if (java.lang.Long.class.equals(unique_type)) {
                        stream.write_i8(GreyCat.PrimitiveType.INT);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        for (Object e : attributes) {
                            if (null != e) {
                                stream.write_vi64((long) e);
                            }
                        }
                    } else if (java.lang.Integer.class.equals(unique_type)) {
                        stream.write_i8(GreyCat.PrimitiveType.INT);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        for (Object e : attributes) {
                            if (null != e) {
                                stream.write_vi64((int) e);
                            }
                        }
                    } else if (java.lang.Double.class.equals(unique_type)) {
                        stream.write_i8(GreyCat.PrimitiveType.FLOAT);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        for (Object e : attributes) {
                            if (null != e) {
                                stream.write_f64((double) e);
                            }
                        }
                    } else if (java.lang.Float.class.equals(unique_type)) {
                        stream.write_i8(GreyCat.PrimitiveType.FLOAT);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        for (Object e : attributes) {
                            if (null != e) {
                                stream.write_f64((float) e);
                            }
                        }
                    } else if (java.lang.String.class.equals(unique_type)) {
                        stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                        stream.write_vu32(stream.greycat.type_offset_core_string);
                        for (Object e : attributes) {
                            if (null != e) {
                                java.lang.String string = (java.lang.String) e;
                                final byte[] data = string.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                                stream.write_vu32(data.length << 1);
                                stream.write_i8_array(data, 0, data.length);
                            }
                        }
                    } else if (GreyCat.Object.class.isAssignableFrom(unique_type)) {
                        ((GreyCat.Object) monotonic_value).saveType(stream);
                        for (Object e : attributes) {
                            if (null != e) {
                                ((GreyCat.Object) e).save(stream);
                            }
                        }
                    } else {
                        throw new RuntimeException("wrong state");
                    }
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final int size = stream.read_vu32();
                @SuppressWarnings("unchecked") final core.Array<java.lang.Object> array = (Array<Object>) type.factory.build(type);
                array.attributes = new java.lang.Object[size];
                if (0 == size) {
                    return array;
                }
                boolean[] nullables = null;
                if (1 == stream.read_i8()) {
                    nullables = new boolean[size];
                    for (int offset = 0; offset < size; offset += 8) {
                        byte flags = stream.read_i8();
                        for (int flags_offset = 0; flags_offset < Math.min(size - offset, 8); ++flags_offset) {
                            nullables[offset + flags_offset] = 1 == (flags >>> flags_offset & 1);
                        }
                    }
                }
                byte array_primitive_type = stream.read_i8();
                GreyCat.Type array_type = null;
                Object monotonic_value = null;
                if (GreyCat.PrimitiveType.OBJECT == array_primitive_type || GreyCat.PrimitiveType.STATIC_FIELD == array_primitive_type) {
                    int type_offset = stream.read_vu32();
                    if (-1 != type_offset) {
                        array_type = stream.greycat.types[type_offset];
                    }
                }
                if (GreyCat.PrimitiveType.OBJECT != array_primitive_type && GreyCat.PrimitiveType.UNDEFINED != array_primitive_type) {
                    if (1 == stream.read_i8()) {
                        monotonic_value = GreyCat.Stream.PRIMITIVE_LOADERS[array_primitive_type].load(stream);
                    }
                }
                if (GreyCat.PrimitiveType.UNDEFINED == array_primitive_type) {
                    for (int offset = 0; offset < size; ++offset) {
                        array.setAttribute(offset, null != nullables && nullables[offset] ? null : stream.read());
                        System.out.println(array.getAttribute(offset));
                    }
                } else if (GreyCat.PrimitiveType.OBJECT == array_primitive_type || (GreyCat.PrimitiveType.STATIC_FIELD == array_primitive_type && null == monotonic_value)) {
                    if (null == array_type) {
                        for (int offset = 0; offset < size; ++offset) {
                            // TODO: check for enums
                            array.setAttribute(offset, null != nullables && nullables[offset] ? null : stream.read_object());
                        }
                    } else {
                        for (int offset = 0; offset < size; ++offset) {
                            array.setAttribute(offset, null != nullables && nullables[offset] ? null : array_type.loader.load(array_type, stream));
                        }
                    }
                } else if (null == monotonic_value) {
                    for (int offset = 0; offset < size; ++offset) {
                        array.setAttribute(offset, null != nullables && nullables[offset] ? null : GreyCat.Stream.PRIMITIVE_LOADERS[array_primitive_type].load(stream));
                    }
                } else {
                    for (int offset = 0; offset < size; ++offset) {
                        array.setAttribute(offset, null != nullables && nullables[offset] ? null : monotonic_value);
                    }
                }
                return array;
            }

            @SuppressWarnings("unused")
            public final void setAll(T[] array) {
                attributes = array;
            }

            @SuppressWarnings("unused")
            public final void setAll(java.util.Collection<T> collection) {
                attributes = new Object[collection.size()];
                collection.toArray(attributes);
            }

            @SuppressWarnings("unused")
            public final void setAll(java.util.Iterator<T> it) {
                attributes = new Object[4096];
                int index = 0;
                while (it.hasNext()) {
                    if (index == 4096) {
                        attributes = java.util.Arrays.copyOf(attributes, attributes.length + 4096);
                    }
                    attributes[index++] = it.next();
                }
                attributes = java.util.Arrays.copyOf(attributes, index);
            }

            @SuppressWarnings("unused")
            public final T[] toArray() {
                //noinspection unchecked
                return (T[]) attributes;
            }

            @SuppressWarnings("unused")
            public final java.util.List<T> toList() {
                //noinspection unchecked
                return (java.util.List<T>) java.util.Arrays.asList(attributes);
            }

            @SuppressWarnings("unused")
            public final java.util.Iterator<T> iterator() {
                //noinspection unchecked
                return ((java.util.stream.Stream<T>) java.util.Arrays.stream(attributes)).iterator();
            }

            @SuppressWarnings("unused")
            public final void add(T value) {
                attributes = java.util.Arrays.copyOf(attributes, attributes.length + 1);
                attributes[attributes.length - 1] = value;
            }

            @SuppressWarnings("unused")
            public final void addAll(T[] values) {
                int currentLength = attributes.length;
                attributes = java.util.Arrays.copyOf(attributes, currentLength + values.length);
                java.lang.System.arraycopy(values, 0, attributes, currentLength, values.length);
            }

            public final T getAttribute(int index) {
                //noinspection unchecked
                return (T) attributes[index];
            }

            @SuppressWarnings("unused")
            public final T setAt(int index, T value) {
                attributes[index] = value;
                return value;
            }

            @SuppressWarnings("unused")
            public final void swap(int i, int j) {
                Object buf = attributes[i];
                attributes[i] = attributes[j];
                attributes[j] = attributes[i];
            }

            @SuppressWarnings("unused")
            public final int size() {
                return attributes.length;
            }

            @SuppressWarnings("unused")
            public final int indexOf(T value) {
                for (int index = 0; index < attributes.length; ++index) {
                    if (value == attributes[index]) {
                        return index;
                    }
                }
                return -1;
            }

            @SuppressWarnings("unused")
            public final void remove(int i) {
                java.lang.System.arraycopy(attributes, i + 1, attributes, i, attributes.length - i - 1);
                attributes = java.util.Arrays.copyOf(attributes, attributes.length - 1);
            }

            @Override
            public java.lang.String toString() {
                StringBuilder b = new StringBuilder(type.name);
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

        protected static class Buffer extends GreyCat.Object {
            private byte[] data;

            protected Buffer(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu32(data.length);
                stream.write_i8_array(data, 0, data.length);
            }

            static Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                Buffer res = (Buffer) type.factory.build(type);
                res.data = stream.read_i8_array(stream.read_vu32());
                return res;
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
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vi64(localizedEpochS);
                stream.write_vi64(epochUs);
                stream.write_vu32(timeZone);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                Date res = (Date) type.factory.build(type);
                res.localizedEpochS = stream.read_vi64();
                res.epochUs = stream.read_vi64();
                res.timeZone = stream.read_vu32();
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
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu32(code);
                stream.write_vu32(frames.length);
                final byte[] msg_bytes = msg.getBytes(StandardCharsets.UTF_8);
                stream.write_vu32(msg_bytes.length);
                int offset = 0;
                while (offset < frames.length) {
                    core.Error.Frame frame = frames[offset];
                    stream.write_vu32(frame.modSymbol);
                    stream.write_vu32(frame.typeSymbol);
                    stream.write_vu32(frame.fnSymbol);
                    stream.write_vu32(frame.line);
                    stream.write_vu32(frame.column);
                    offset++;
                }
                stream.write_i8_array(msg_bytes, 0, msg_bytes.length);
                stream.write(value);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final int code = stream.read_vu32();
                final int framesLen = stream.read_vu32();
                final int msgLen = stream.read_vu32();
                final core.Error.Frame[] frames = new core.Error.Frame[framesLen];
                for (int offset = 0; offset < framesLen; offset++) {
                    final int modSymbol = stream.read_vu32();
                    final int typeSymbol = stream.read_vu32();
                    final int fnSymbol = stream.read_vu32();
                    final int line = stream.read_vu32();
                    final int column = stream.read_vu32();
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

        protected static class Map<T, U> extends GreyCat.Object {
            @SuppressWarnings("unused")
            public static final java.lang.String type_name = "core::Map";

            private final java.util.Map<T, U> map = new java.util.HashMap<>();

            protected Map(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu32(size());
                for (T key : keys()) {
                    stream.write(key);
                    stream.write(get(key));
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                //noinspection unchecked
                final core.Map<Object, Object> map = (Map<Object, Object>) type.factory.build(type);
                final int mapLength = stream.read_vu32();
                for (int offset = 0; offset < mapLength; offset++) {
                    map.set(stream.read(), stream.read());
                }
                return map;
            }

            public final int size() {
                return map.size();
            }

            public final U get(T key) {
                return map.get(key);
            }

            public final void set(T key, U value) {
                map.put(key, value);
            }

            @SuppressWarnings({"unused", "FieldCanBeLocal"})
            public final void remove(T key) {
                map.remove(key);
            }

            @SuppressWarnings({"unused"})
            public final void clear() {
                map.clear();
            }

            public final java.util.Set<T> keys() {
                return map.keySet();
            }

            @SuppressWarnings("unused")
            public final java.util.Collection<U> values() {
                return map.values();
            }
        }

        protected static class String extends GreyCat.Object {

            protected String(GreyCat.Type type) {
                super(type, null);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                int len = stream.read_vu32();
                if (0 != (len & 1)) {
                    int offset = len >>> 1;
                    return type.greycat.symbols[offset];
                }
                len >>>= 1;
                return stream.read_string(len);
            }
        }

        protected static class Table<T> extends GreyCat.Object {
            public int cols;

            public int rows;
            public T[] data;

            protected Table(GreyCat.Type type) {
                super(type, null);
            }

            private void save_typed(GreyCat.Stream stream, int type_offset, boolean type_nullable) throws IOException {
                for (int col = 0; col < cols; ++col) {
                    byte[] nullables = null;
                    if (type_nullable) {
                        for (int row = 0; row < rows; ++row) {
                            Object e = data[col * rows + row];
                            if (null == e) {
                                if (null == nullables) {
                                    nullables = new byte[(int) Math.ceil((double) rows / 8)];
                                    Arrays.fill(nullables, (byte) 0);
                                }
                                nullables[row >>> 3] |= (byte) (1 << (row & 7));
                            }
                            stream.write_bool(null != nullables);
                            if (null != nullables) {
                                stream.write_i8_array(nullables, 0, nullables.length);
                            }
                        }
                    } else {
                        stream.write_bool(false);
                    }
                    if (stream.greycat.type_offset_core_bool == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.BOOL);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        if (type_nullable) {
                            for (int row = 0; row < rows; ++row) {
                                Object e = data[col * rows + row];
                                if (null != e) {
                                    stream.write_bool((boolean) e);
                                }
                            }
                        }
                    } else if (stream.greycat.type_offset_core_char == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.CHAR);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        if (type_nullable) {
                            for (int row = 0; row < rows; ++row) {
                                Object e = data[col * rows + row];
                                if (null != e) {
                                    char c = (char) e;
                                    if (GreyCat.Stream.ASCII_MAX < c) {
                                        throw new IllegalArgumentException("Only ASCII characters are allowed: " + c);
                                    }
                                    stream.write_i8((byte) c);
                                }
                            }
                        }
                    } else if (stream.greycat.type_offset_core_int == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.INT);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        if (type_nullable) {
                            for (int row = 0; row < rows; ++row) {
                                Object e = data[col * rows + row];
                                if (null != e) {
                                    stream.write_vi64((long) e);
                                }
                            }
                        }
                    } else if (stream.greycat.type_offset_core_float == type_offset) {
                        stream.write_i8(GreyCat.PrimitiveType.FLOAT);
                        stream.write_i8((byte) 0); // TODO: manage monotonic
                        if (type_nullable) {
                            for (int row = 0; row < rows; ++row) {
                                Object e = data[col * rows + row];
                                if (null != e) {
                                    stream.write_f64((double) e);
                                }
                            }
                        }
                    } else {
                        if (stream.greycat.type_offset_core_node == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.NODE);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_node_time == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.NODE_TIME);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_node_index == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.NODE_INDEX);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_node_list == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.NODE_LIST);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_node_geo == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.NODE_GEO);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_geo == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.GEO);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_time == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.TIME);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_duration == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.DURATION);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_t2 == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.T2);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_t3 == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.T3);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_t4 == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.T4);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_t2f == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.T2F);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_t3f == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.T3F);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                        } else if (stream.greycat.type_offset_core_t4f == type_offset) {
                            stream.write_i8(GreyCat.PrimitiveType.T4F);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                            // } else if () { TODO: other types
                        } else {
                            stream.write_i8((GreyCat.PrimitiveType.OBJECT));
                            stream.write_vu32(type_offset);
                        }
                        if (type_nullable) {
                            for (int row = 0; row < rows; ++row) {
                                Object e = data[col * rows + row];
                                if (null != e) {
                                    ((GreyCat.Object) e).save(stream, type_offset);
                                }
                            }
                        } else {
                            for (int row = 0; row < rows; ++row) {
                                Object e = data[col * rows + row];
                                ((GreyCat.Object) e).save(stream, type_offset);
                            }
                        }
                    }
                }
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu32(rows);
                stream.write_vu32(cols);
                if (null != type_offset && 0 != stream.greycat.types[type_offset].generic_abi_type) {
                    int g1_abi_type_desc = stream.greycat.types[type_offset].g1_abi_type_desc;
                    save_typed(stream, g1_abi_type_desc >>> 1, 1 == (g1_abi_type_desc & 1));
                    return;
                }
                for (int col = 0; col < cols; ++col) {
                    byte[] nullables = null;
                    boolean type_is_unique = false;
                    Class<?> unique_type = null;
                    boolean value_is_monotonic = false;
                    Object monotonic_value = null;
                    for (int row = 0; row < rows; ++row) {
                        Object e = data[col * rows + row];
                        if (null == e) {
                            if (null == nullables) {
                                nullables = new byte[(int) Math.ceil((float) rows / 8)];
                            }
                            nullables[row >>> 3] |= (byte) (1 << (row & 7));
                        } else {
                            Class<?> type = e.getClass();
                            if (null == unique_type) {
                                type_is_unique = true;
                                unique_type = type;
                            } else if (type_is_unique && !unique_type.equals(type)) {
                                type_is_unique = false;
                            }
                            if (null == monotonic_value) {
                                value_is_monotonic = true;
                                monotonic_value = e;
                            } else if (value_is_monotonic && !monotonic_value.equals(e)) {
                                value_is_monotonic = false;
                            }
                        }
                    }
                    stream.write_bool(null != nullables);
                    if (null != nullables) {
                        stream.write_i8_array(nullables, 0, nullables.length);
                    }
                    if (!type_is_unique) {
                        stream.write_i8(GreyCat.PrimitiveType.UNDEFINED);
                        for (int row = 0; row < rows; ++row) {
                            Object e = data[col * rows + row];
                            if (null != e) {
                                stream.write(e);
                            }
                        }
                    } else {
                        if (Boolean.class.equals(unique_type)) {
                            stream.write_i8(GreyCat.PrimitiveType.BOOL);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                            for (int row = 0; row < rows; ++row) {
                                Boolean b = (Boolean) data[col * rows + row];
                                if (null != b) {
                                    stream.write_bool(b);
                                }
                            }
                        } else if (Character.class.equals(unique_type)) {
                            stream.write_i8(GreyCat.PrimitiveType.CHAR);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                            for (int row = 0; row < rows; ++row) {
                                Character c = (Character) data[col * rows + row];
                                if (null != c) {
                                    if (c > GreyCat.Stream.ASCII_MAX) {
                                        throw new IllegalArgumentException("Only ASCII characters are allowed: " + c);
                                    }
                                    stream.write_i8((byte) ((char) c));
                                }
                            }
                        } else if (Long.class.equals(unique_type)) {
                            stream.write_i8(GreyCat.PrimitiveType.INT);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                            for (int row = 0; row < rows; ++row) {
                                Long l = (Long) data[col * rows + row];
                                if (null != l) {
                                    stream.write_vi64(l);
                                }
                            }
                        } else if (Integer.class.equals(unique_type)) {
                            stream.write_i8(GreyCat.PrimitiveType.INT);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                            for (int row = 0; row < rows; ++row) {
                                Integer i = (Integer) data[col * rows + row];
                                if (null != i) {
                                    stream.write_vi64(i);
                                }
                            }
                        } else if (Double.class.equals(unique_type)) {
                            stream.write_i8(GreyCat.PrimitiveType.FLOAT);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                            for (int row = 0; row < rows; ++row) {
                                Double d = (Double) data[col * rows + row];
                                if (null != d) {
                                    stream.write_f64(d);
                                }
                            }
                        } else if (Float.class.equals(unique_type)) {
                            stream.write_i8(GreyCat.PrimitiveType.FLOAT);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                            for (int row = 0; row < rows; ++row) {
                                Float f = (Float) data[col * rows + row];
                                if (null != f) {
                                    stream.write_f64(f);
                                }
                            }
                        } else if (java.lang.String.class.equals(unique_type)) {
                            stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                            for (int row = 0; row < rows; ++row) {
                                java.lang.String s = (java.lang.String) data[col * rows + row];
                                if (null != s) {
                                    final byte[] data = s.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                                    stream.write_vu32(data.length << 1);
                                    stream.write_i8_array(data, 0, data.length);
                                }
                            }
                        } else if (GreyCat.Object.class.isAssignableFrom(unique_type)) {
                            ((GreyCat.Object) monotonic_value).saveType(stream);
                            stream.write_i8((byte) 0); // TODO: manage monotonic
                            for (int row = 0; row < rows; ++row) {
                                GreyCat.Object o = (GreyCat.Object) data[col * rows + row];
                                if (null != o) {
                                    o.save(stream);
                                }
                            }
                        } else {
                            throw new RuntimeException("wrong state");
                        }
                    }
                }
            }

            @SuppressWarnings("unchecked")
            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                int rows = stream.read_vu32();
                int cols = stream.read_vu32();
                Object[] data = new Object[rows * cols];
                for (int col = 0; col < cols; ++col) {
                    // Read column metadata
                    java.util.List<Boolean> nullables = null;
                    if (1 == stream.read_i8()) {
                        nullables = new java.util.ArrayList<>(rows);
                        for (int row = 0; row < rows; row += 8) {
                            byte flags = stream.read_i8();
                            for (int offset = 0; offset < Math.min(rows - row, 8); ++offset) {
                                nullables.add(1 == (flags >>> offset & 1));
                            }
                        }
                    }
                    byte col_primitive_type = stream.read_i8();
                    GreyCat.Type col_type = null;
                    Object monotonic_value = null;
                    if (GreyCat.PrimitiveType.OBJECT == col_primitive_type || GreyCat.PrimitiveType.STATIC_FIELD == col_primitive_type) {
                        int type_offset = stream.read_vu32();
                        if (-1 != type_offset) {
                            col_type = stream.greycat.types[type_offset];
                        }
                    }
                    if (GreyCat.PrimitiveType.OBJECT != col_primitive_type && GreyCat.PrimitiveType.UNDEFINED != col_primitive_type) {
                        if (1 == stream.read_i8()) {
                            monotonic_value = GreyCat.Stream.PRIMITIVE_LOADERS[col_primitive_type].load(stream);
                        }
                    }
                    // Read column data
                    if (null != monotonic_value || (null != nullables && !nullables.contains(false))) {
                        Arrays.fill(data, col * rows, (col + 1) * rows, monotonic_value);
                    } else if (GreyCat.PrimitiveType.FLOAT == col_primitive_type) {
                        if (null == nullables) {
                            Arrays.fill(data, col * rows, (col + 1) * rows, stream.read_i8_array(8 * rows));
                        } else {
                            for (int row = 0; row < rows; ++row) {
                                data[col * rows + row] = nullables.get(row) ? null : stream.read_f64();
                            }
                        }
                    } else if (GreyCat.PrimitiveType.UNDEFINED == col_primitive_type) {
                        for (int row = 0; row < rows; ++row) {
                            data[col * rows + row] = null != nullables && nullables.get(row) ? null : stream.read();
                        }
                    } else if (GreyCat.PrimitiveType.OBJECT == col_primitive_type || GreyCat.PrimitiveType.STATIC_FIELD == col_primitive_type) {
                        if (null == col_type) {
                            for (int row = 0; row < rows; ++row) {
                                data[col * rows + row] = null != nullables && nullables.get(row) ? null : stream.read_object();
                            }
                        } else {
                            for (int row = 0; row < rows; ++row) {
                                data[col * rows + row] = null != nullables && nullables.get(row) ? null : col_type.loader.load(col_type, stream);
                            }
                        }
                    } else {
                        for (int row = 0; row < rows; ++row) {
                            data[col * rows + row] = null != nullables && nullables.get(row) ? null : GreyCat.Stream.PRIMITIVE_LOADERS[col_primitive_type].load(stream);
                        }
                    }
                }
                Table<Object> table = (Table<Object>) type.factory.build(type);
                table.rows = rows;
                table.cols = cols;
                table.data = data;
                return table;
            }

            @Override
            public java.lang.String toString() {
                java.lang.StringBuilder builder = new java.lang.StringBuilder(type.name).append('{');
                boolean firstRow = true;
                for (int row = 0; row < rows; ++row) {
                    if (firstRow) {
                        builder.append('\n');
                        firstRow = false;
                    }
                    builder.append("\t[");
                    boolean firstCol = true;
                    for (int col = 0; col < cols; ++col) {
                        if (firstCol) {
                            firstCol = false;
                        } else {
                            builder.append(", ");
                        }
                        builder.append(data[col * rows + row]);
                    }
                    builder.append("],\n");
                }
                return builder.append('}').toString();
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
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
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
                        throw new IllegalArgumentException(java.lang.String.valueOf(tensorType));
                }
                core.Tensor res = (Tensor) type.factory.build(type);
                res.shape = shape;
                res.tensorType = tensorType;
                res.size = size;
                res.data = stream.read_i8_array(bin_size);
                return res;
            }
        }

        // Deliberately unsupported types

        protected static class nodeIndexBucket extends GreyCat.Object {
            protected nodeIndexBucket(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                if (attributes == null) {
                    stream.write_i32(0);
                } else {
                    stream.write_i32(attributes.length);
                    int i = 0;
                    while (i < attributes.length) {
                        Object object = attributes[i];
                        stream.write(object);
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

        // ti*d & tf*d (de)interleaving algorithms

        private final static long[] B_2D = {0x5555555555555555L, 0x3333333333333333L, 0x0F0F0F0F0F0F0F0FL,
                0x00FF00FF00FF00FFL, 0x0000FFFF0000FFFFL, 0x00000000FFFFFFFFL};
        private final static int[] S_2D = {0, 1, 2, 4, 8, 16};

        private static long interleave64_2d(long x, long y) {
            x = (x | (x << S_2D[5])) & B_2D[4];
            y = (y | (y << S_2D[5])) & B_2D[4];

            x = (x | (x << S_2D[4])) & B_2D[3];
            y = (y | (y << S_2D[4])) & B_2D[3];

            x = (x | (x << S_2D[3])) & B_2D[2];
            y = (y | (y << S_2D[3])) & B_2D[2];

            x = (x | (x << S_2D[2])) & B_2D[1];
            y = (y | (y << S_2D[2])) & B_2D[1];

            x = (x | (x << S_2D[1])) & B_2D[0];
            y = (y | (y << S_2D[1])) & B_2D[0];

            return x | (y << 1);
        }

        private static long deinterleave64_2d(long interleaved) {
            long x = interleaved;
            long y = interleaved >>> 1;

            x = (x | (x >>> S_2D[0])) & B_2D[0];
            y = (y | (y >>> S_2D[0])) & B_2D[0];

            x = (x | (x >>> S_2D[1])) & B_2D[1];
            y = (y | (y >>> S_2D[1])) & B_2D[1];

            x = (x | (x >>> S_2D[2])) & B_2D[2];
            y = (y | (y >>> S_2D[2])) & B_2D[2];

            x = (x | (x >>> S_2D[3])) & B_2D[3];
            y = (y | (y >>> S_2D[3])) & B_2D[3];

            x = (x | (x >>> S_2D[4])) & B_2D[4];
            y = (y | (y >>> S_2D[4])) & B_2D[4];

            x = (x | (x >>> S_2D[5])) & B_2D[5];
            y = (y | (y >>> S_2D[5])) & B_2D[5];

            return x | (y << 32);
        }

        private final static long[] B_3D = {0x1249249249249249L, 0x10C30C30C30C30C3L, 0x100F00F00F00F00FL,
                0x001F0000FF0000FFL, 0xFFFF00000000FFFFL, 0x00000000001FFFFFL};
        private final static int[] S_3D = {2, 4, 8, 16, 32};

        private static long interleave64_3d(long x, long y, long z) {
            x &= B_3D[5];
            x = (x ^ (x << S_3D[4])) & B_3D[4];
            x = (x ^ (x << S_3D[3])) & B_3D[3];
            x = (x ^ (x << S_3D[2])) & B_3D[2];
            x = (x ^ (x << S_3D[1])) & B_3D[1];
            x = (x ^ (x << S_3D[0])) & B_3D[0];

            y &= B_3D[5];
            y = (y ^ (y << S_3D[4])) & B_3D[4];
            y = (y ^ (y << S_3D[3])) & B_3D[3];
            y = (y ^ (y << S_3D[2])) & B_3D[2];
            y = (y ^ (y << S_3D[1])) & B_3D[1];
            y = (y ^ (y << S_3D[0])) & B_3D[0];

            z &= B_3D[5];
            z = (z ^ (z << S_3D[4])) & B_3D[4];
            z = (z ^ (z << S_3D[3])) & B_3D[3];
            z = (z ^ (z << S_3D[2])) & B_3D[2];
            z = (z ^ (z << S_3D[1])) & B_3D[1];
            z = (z ^ (z << S_3D[0])) & B_3D[0];

            return x | (y << 1) | (z << 2);
        }

        private static int deinterleave64_3d(long interleaved) {
            long x = interleaved & B_3D[0];
            x = (x ^ (x >>> S_3D[0])) & B_3D[1];
            x = (x ^ (x >>> S_3D[1])) & B_3D[2];
            x = (x ^ (x >>> S_3D[2])) & B_3D[3];
            x = (x ^ (x >>> S_3D[3])) & B_3D[4];
            x = (x ^ (x >>> S_3D[4])) & B_3D[5];
            return (int) x;
        }

        private final static long[] B_5D = {0x0084210842108421L, 0x000C0300C0300C03L, 0x00000F0000F0000FL,
                0x0000FF00000000FFL, 0x0000000000000FFFL};
        private final static int[] S_5D = {4, 8, 16, 32};

        private static long interleave64_5d(long x0, long x1, long x2, long x3, long x4) {
            x0 &= B_5D[4];
            x0 = (x0 ^ (x0 << S_5D[3])) & B_5D[3];
            x0 = (x0 ^ (x0 << S_5D[2])) & B_5D[2];
            x0 = (x0 ^ (x0 << S_5D[1])) & B_5D[1];
            x0 = (x0 ^ (x0 << S_5D[0])) & B_5D[0];

            x1 &= B_5D[4];
            x1 = (x1 ^ (x1 << S_5D[3])) & B_5D[3];
            x1 = (x1 ^ (x1 << S_5D[2])) & B_5D[2];
            x1 = (x1 ^ (x1 << S_5D[1])) & B_5D[1];
            x1 = (x1 ^ (x1 << S_5D[0])) & B_5D[0];

            x2 &= B_5D[4];
            x2 = (x2 ^ (x2 << S_5D[3])) & B_5D[3];
            x2 = (x2 ^ (x2 << S_5D[2])) & B_5D[2];
            x2 = (x2 ^ (x2 << S_5D[1])) & B_5D[1];
            x2 = (x2 ^ (x2 << S_5D[0])) & B_5D[0];

            x3 &= B_5D[4];
            x3 = (x3 ^ (x3 << S_5D[3])) & B_5D[3];
            x3 = (x3 ^ (x3 << S_5D[2])) & B_5D[2];
            x3 = (x3 ^ (x3 << S_5D[1])) & B_5D[1];
            x3 = (x3 ^ (x3 << S_5D[0])) & B_5D[0];

            x4 &= B_5D[4];
            x4 = (x4 ^ (x4 << S_5D[3])) & B_5D[3];
            x4 = (x4 ^ (x4 << S_5D[2])) & B_5D[2];
            x4 = (x4 ^ (x4 << S_5D[1])) & B_5D[1];
            x4 = (x4 ^ (x4 << S_5D[0])) & B_5D[0];

            return x0 | (x1 << 1) | (x2 << 2) | (x3 << 3) | (x4 << 4);
        }

        private static short deinterleave64_5d(long interleaved) {
            long x = interleaved & B_5D[0];
            x = (x ^ (x >>> S_5D[0])) & B_5D[1];
            x = (x ^ (x >>> S_5D[1])) & B_5D[2];
            x = (x ^ (x >>> S_5D[2])) & B_5D[3];
            x = (x ^ (x >>> S_5D[3])) & B_5D[4];
            return (short) x;
        }

    }

    public static final class util {

        protected static class Quantizer extends GreyCat.Object {

            protected Quantizer(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(@SuppressWarnings("unused") GreyCat.Type type, @SuppressWarnings("unused") GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }

        protected static class Buffer extends GreyCat.Object {
            public byte[] data;

            protected Buffer(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu32(data.length);
                stream.write_i8_array(data, 0, data.length);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                util.Buffer buf = (Buffer) type.factory.build(type);
                buf.data = stream.read_i8_array(stream.read_vu32());
                return buf;
            }
        }

        @SuppressWarnings("unused")
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
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_f64(sum);
                stream.write_f64(sumSq);
                stream.write_vi64(size);
                stream.write_vi64(nbAccepted);
                stream.write_vi64(nbRejected);
                stream.write_vi64(nbNull);
                stream.write_f64(min);
                stream.write_f64(max);
                stream.write_f64(minBound);
                stream.write_f64(maxBound);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                util.Gaussian g = (Gaussian) type.factory.build(type);
                g.sum = stream.read_f64();
                g.sumSq = stream.read_f64();
                g.size = stream.read_vi64();
                g.nbAccepted = stream.read_vi64();
                g.nbRejected = stream.read_vi64();
                g.nbNull = stream.read_vi64();
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
            private int size;

            protected GaussianProfile(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
//                stream.write_i32(size);
                stream.write_i32(size);
                stream.write_i32(data.length);
                stream.write_i8_array(data, 0, data.length);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                util.GaussianProfile g = (GaussianProfile) type.factory.build(type);
                g.size = stream.read_i32();
                int bin_len = stream.read_i32();
                g.data = stream.read_i8_array(bin_len);
                return g;
            }

        }

        protected static class HistogramFloat extends GreyCat.Object {
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

            protected HistogramFloat(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
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
                HistogramFloat h = (HistogramFloat) type.factory.build(type);
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

        protected static class HistogramInt extends GreyCat.Object {
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

            protected HistogramInt(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
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
                HistogramInt h = (HistogramInt) type.factory.build(type);
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

        @SuppressWarnings("unused")
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
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
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
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vu32(infoOff);
                stream.write_vu32(data.length);
                stream.write_i8_array(data, 0, data.length);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                util.Iban iban = (Iban) type.factory.build(type);
                iban.infoOff = stream.read_vu32();
                iban.data = stream.read_i8_array(stream.read_vu32());
                return iban;
            }

        }

        protected static class Queue<T> extends GreyCat.Object {

            private final java.util.Queue<T> queue = new java.util.LinkedList<>();

            protected Queue(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vi64(size()); // width
                stream.write_vu32(size()); // size
                stream.write_vu32(size()); // capacity
                stream.write_vi64(size()); // TODO: head - values
                stream.write_vi64(0); // TODO: tail - values
                for (T t : queue) {
                    stream.write(t);
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                stream.read_vi64(); // width
                final int size = stream.read_vu32();
                final int capacity = stream.read_vu32();
                stream.read_vi64(); // head - values;
                stream.read_vi64(); // tail - values;
                @SuppressWarnings("unchecked") final util.Queue<Object> queue = (Queue<Object>) type.factory.build(type);
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
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vi64(width);
                stream.write_i8(sumType);
                stream.write_f64(sum);
                stream.write_f64(sumSq);
                stream.write_vu32(size);
                stream.write_vu32(capacity);
                stream.write_vi64(toHead);
                stream.write_vi64(toTail);
                int i = 0;
                while (i < values.length) {
                    stream.write(values[i]);
                    i++;
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final long width = stream.read_vi64();
                final byte sumType = stream.read_i8();
                final double sum = stream.read_f64();
                final double sumSq = stream.read_f64();
                final int size = stream.read_vu32();
                final int capacity = stream.read_vu32();
                final long toHead = stream.read_vi64();
                final long toTail = stream.read_vi64();
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
            protected final void save(GreyCat.Stream stream, Integer type_offset) throws IOException {
                stream.write_vi64(timeWidth);
                stream.write_i8(sumType);
                stream.write_f64(sum);
                stream.write_f64(sumSq);
                stream.write_vu32(size);
                stream.write_vu32(capacity);
                stream.write_vi64(toHead);
                stream.write_vi64(toTail);
                int i = 0;
                while (i < valueTimes.length) {
                    final ValueTime valueTime = valueTimes[i];
                    stream.write(valueTime.value);
                    stream.write_i64(valueTime.time);
                    i++;
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final long timeWidth = stream.read_vi64();
                final byte sumType = stream.read_i8();
                final double sum = stream.read_f64();
                final double sumSq = stream.read_f64();
                final int size = stream.read_vu32();
                final int capacity = stream.read_vu32();
                final long toHead = stream.read_vi64();
                final long toTail = stream.read_vi64();
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

}
