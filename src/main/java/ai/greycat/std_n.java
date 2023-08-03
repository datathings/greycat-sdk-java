package ai.greycat;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedList;

@SuppressWarnings({"unchecked", "unused"})
class std_n {

    public static final class core {

        // Primitive types

        protected static class node extends GreyCat.Object {
            public long ref;

            protected node(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_vu64(ref);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.node res = (core.node) type.factory.build(type);
                res.ref = stream.read_vu64();
                return res;
            }

        }

        protected static class nodeTime extends GreyCat.Object {
            public long ref;

            protected nodeTime(GreyCat.Type type) {
                super(type, null);

            }

            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_TIME);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_vu64(ref);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeTime res = (nodeTime) type.factory.build(type);
                res.ref = stream.read_vu64();
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
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_INDEX);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_vu64(ref);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeIndex res = (nodeIndex) type.factory.build(type);
                res.ref = stream.read_vu64();
                return res;
            }
        }

        protected static class nodeList extends GreyCat.Object {
            public long ref;

            protected nodeList(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_LIST);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_vu64(ref);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeList res = (nodeList) type.factory.build(type);
                res.ref = stream.read_vu64();
                return res;
            }

        }

        protected static class nodeGeo extends GreyCat.Object {
            public long ref;

            protected nodeGeo(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.NODE_GEO);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_vu64(ref);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.nodeGeo res = (core.nodeGeo) type.factory.build(type);
                res.ref = stream.read_vu64();
                return res;
            }

        }

        protected static class geo extends GreyCat.Object {
            private static final double GC_CORE_GEO_LAT_EPS = 0.00000001;
            private static final double GC_CORE_GEO_LAT_MIN = -85.05112878;
            private static final double GC_CORE_GEO_LAT_MAX = 85.05112878;
            private static final double GC_CORE_GEO_LNG_MIN = -180;
            private static final double GC_CORE_GEO_LNG_MAX = 180;

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.GEO);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TIME);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.DURATION);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_vi64(value);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.duration res = (duration) type.factory.build(type);
                res.value = stream.read_vi64();
                return res;
            }

        }

        protected static class ti2d extends GreyCat.Object {
            public int x0, x1;

            private final static long UINT32_MIN = 2147483648L;

            protected ti2d(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TU2D);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.ti2d res = (core.ti2d) type.factory.build(type);
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

        protected static class ti3d extends GreyCat.Object {
            public int x0, x1, x2;

            private final static int INT21_MIN = -1048575 - 1;
            private final static int INT_21_MAX = 1048575;
            private final static long UINT21_MIN = 4293918720L;

            protected ti3d(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TU3D);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.ti3d res = (core.ti3d) type.factory.build(type);
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
                final long[] B = {0x10c30c30c30c30c3L, 0x100f00f00f00f00fL, 0x001f0000ff0000ffL, 0xffff00000000ffffL, 0x0001fffffL};
                final int[] S = {2, 4, 8, 16, 32};

                x0 = (int) ((long) deinterleave64_3d(interleaved) + INT21_MIN);
                x1 = (int) ((long) deinterleave64_3d(interleaved >>> 1) + INT21_MIN);
                x2 = (int) ((long) deinterleave64_3d(interleaved >>> 2) + INT21_MIN);
            }
        }

        protected static class ti4d extends GreyCat.Object {

            public short x0, x1, x2, x3;
            private final static int UINT16_MIN = 32768;

            protected ti4d(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TU4D);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.ti4d res = (core.ti4d) type.factory.build(type);
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

        protected static class ti5d extends GreyCat.Object {
            public short x0, x1, x2, x3, x4;

            private final static short INT12_MIN = -2047 - 1;
            private final static short INT12_MAX = 2047;
            private final static int UINT12_MIN = 63488;

            protected ti5d(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TU5D);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.ti5d res = (core.ti5d) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "ti5d{x0=" + x0 + ",x1=" + x1 + ",x2=" + x2 + ",x3=" + x3 + ",x4=" + x4 + "}";
            }

            long interleave() {
                return interleave64_5d(((int) x0) + UINT12_MIN, ((int) x1) + UINT12_MIN, ((int) x2) + UINT12_MIN,
                        ((int) x3) + UINT12_MIN, ((int) x4) + UINT12_MIN);
            }

            private void deinterleave(long interleaved) {
                final long[] B = {0x0c0300c0300c03L, 0x0f0000f0000fL, 0x00f00000000ffL, 0x0fffL};
                final int[] S = {4, 8, 16, 32};

                x0 = (short) ((long) deinterleave64_5d(interleaved) + INT12_MIN);
                x1 = (short) ((long) deinterleave64_5d(interleaved >>> 1) + INT12_MIN);
                x2 = (short) ((long) deinterleave64_5d(interleaved >>> 2) + INT12_MIN);
                x3 = (short) ((long) deinterleave64_5d(interleaved >>> 3) + INT12_MIN);
                x4 = (short) ((long) deinterleave64_5d(interleaved >>> 4) + INT12_MIN);
            }
        }

        protected static class ti6d extends GreyCat.Object {

            public short x0, x1, x2, x3, x4, x5;
            private final static short INT10_MIN = -511 - 1;
            private final static short INT10_MAX = 511;
            private final static int UINT10_MIN = 65024;

            protected ti6d(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TU6D);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.ti6d res = (core.ti6d) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "ti6d{x0=" + x0 + ",x1=" + x1 + ",x2=" + x2 + ",x3=" + x3 + ",x4=" + x4 + ",x5=" + x5 + "}";
            }

            long interleave() {
                return interleave64_3d(
                        interleave64_2d((((int) x0) + UINT10_MIN) & 0x3ff, (((int) x3) + UINT10_MIN) & 0x3ff),
                        interleave64_2d((((int) x1) + UINT10_MIN) & 0x3ff, (((int) x4) + UINT10_MIN) & 0x3ff),
                        interleave64_2d((((int) x2) + UINT10_MIN) & 0x3ff, (((int) x5) + UINT10_MIN) & 0x3ff)
                );
            }

            private void deinterleave(long interleaved) {
                long y30 = deinterleave64_2d(deinterleave64_3d(interleaved));
                long y41 = deinterleave64_2d(deinterleave64_3d(interleaved >>> 1));
                long y52 = deinterleave64_2d(deinterleave64_3d(interleaved >>> 2));

                x0 = (short) ((y30 & 0x3ffL) + INT10_MIN);
                x1 = (short) ((y41 & 0x3ffL) + INT10_MIN);
                x2 = (short) ((y52 & 0x3ffL) + INT10_MIN);
                x3 = (short) ((y30 >>> 32) + INT10_MIN);
                x4 = (short) ((y41 >>> 32) + INT10_MIN);
                x5 = (short) ((y52 >>> 32) + INT10_MIN);
            }
        }

        protected static class ti10d extends GreyCat.Object {

            public byte x0, x1, x2, x3, x4, x5, x6, x7, x8, x9;

            private final static byte INT10_MIN = -31 - 1;
            private final static byte INT10_MAX = 31;
            private final static char UINT10_MIN = 224;

            protected ti10d(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TU10D);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.ti10d res = (core.ti10d) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "ti10d{x0=" + x0 + ",x1=" + x1 + ",x2=" + x2 + ",x3=" + x3 + ",x4=" + x4 +
                        ",x5=" + x5 + ",x6=" + x6 + ",x7=" + x7 + ",x8=" + x8 + ",x9=" + x9 + "}";
            }

            long interleave() {
                return interleave64_5d(
                        interleave64_2d((((char) x0) + UINT10_MIN) & 0x3f, (((char) x5) + UINT10_MIN) & 0x3f),
                        interleave64_2d((((char) x1) + UINT10_MIN) & 0x3f, (((char) x6) + UINT10_MIN) & 0x3f),
                        interleave64_2d((((char) x2) + UINT10_MIN) & 0x3f, (((char) x7) + UINT10_MIN) & 0x3f),
                        interleave64_2d((((char) x3) + UINT10_MIN) & 0x3f, (((char) x8) + UINT10_MIN) & 0x3f),
                        interleave64_2d((((char) x4) + UINT10_MIN) & 0x3f, (((char) x9) + UINT10_MIN) & 0x3f)
                );
            }

            private void deinterleave(long interleaved) {
                x0 = (byte) ((deinterleave64_2d(deinterleave64_5d(interleaved)) & 0x3f) + INT10_MIN);
                x1 = (byte) ((deinterleave64_2d(deinterleave64_5d(interleaved >>> 1)) & 0x3f) + INT10_MIN);
                x2 = (byte) ((deinterleave64_2d(deinterleave64_5d(interleaved >>> 2)) & 0x3f) + INT10_MIN);
                x3 = (byte) ((deinterleave64_2d(deinterleave64_5d(interleaved >>> 3)) & 0x3f) + INT10_MIN);
                x4 = (byte) ((deinterleave64_2d(deinterleave64_5d(interleaved >>> 4)) & 0x3f) + INT10_MIN);
                x5 = (byte) ((deinterleave64_2d(deinterleave64_5d(interleaved >>> 5)) & 0x3f) + INT10_MIN);
                x6 = (byte) ((deinterleave64_2d(deinterleave64_5d(interleaved >>> 6)) & 0x3f) + INT10_MIN);
                x7 = (byte) ((deinterleave64_2d(deinterleave64_5d(interleaved >>> 7)) & 0x3f) + INT10_MIN);
                x8 = (byte) ((deinterleave64_2d(deinterleave64_5d(interleaved >>> 8)) & 0x3f) + INT10_MIN);
                x9 = (byte) ((deinterleave64_2d(deinterleave64_5d(interleaved >>> 9)) & 0x3f) + INT10_MIN);
            }
        }

        protected static class tf2d extends GreyCat.Object {

            float x0, x1;

            protected tf2d(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TUF2D);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.tf2d res = (core.tf2d) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "tf2d{x0=" + x0 + ",x1=" + x1 + "}";
            }

            long interleave() {
                return interleave64_2d(
                        ((long) Float.floatToIntBits(x0)) + ti2d.UINT32_MIN,
                        ((long) Float.floatToIntBits(x1)) + ti2d.UINT32_MIN
                );
            }

            private void deinterleave(long interleaved) {
                long dc = deinterleave64_2d(interleaved);
                x0 = Float.intBitsToFloat((int) (dc + Integer.MIN_VALUE));
                x1 = Float.intBitsToFloat((int) ((dc >>> 32) + Integer.MIN_VALUE));
            }
        }

        protected static class tf3d extends GreyCat.Object {

            float x0, x1, x2;

            protected tf3d(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TUF3D);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.tf3d res = (core.tf3d) type.factory.build(type);
                res.deinterleave(stream.read_i64());
                return res;
            }

            @Override
            public java.lang.String toString() {
                return "tf3d{x0=" + x0 + ",x1=" + x1 + ",x2=" + x2 + "}";
            }

            long interleave() {
                return interleave64_3d(
                        (((long) Float.floatToIntBits(x0)) >>> 11) + ti3d.UINT21_MIN,
                        (((long) Float.floatToIntBits(x1)) >>> 11) + ti3d.UINT21_MIN,
                        (((long) Float.floatToIntBits(x2)) >>> 11) + ti3d.UINT21_MIN
                );
            }

            public void deinterleave(long interleaved) {
                x0 = Float.intBitsToFloat((int) (((long) deinterleave64_3d(interleaved) + ti3d.INT21_MIN) << 11));
                x1 = Float.intBitsToFloat((int) (((long) deinterleave64_3d(interleaved >>> 1) + ti3d.INT21_MIN) << 11));
                x2 = Float.intBitsToFloat((int) (((long) deinterleave64_3d(interleaved >>> 2) + ti3d.INT21_MIN) << 11));
            }
        }

        protected static class tf4d extends GreyCat.Object {

            float x0, x1, x2, x3;

            protected tf4d(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void saveType(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.TUF4D);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i64(interleave());
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                core.tf4d res = (core.tf4d) type.factory.build(type);
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
                                ((Float.floatToIntBits(x0)) >>> 16) + ti4d.UINT16_MIN,
                                (Float.floatToIntBits(x2) >>> 16) + ti4d.UINT16_MIN
                        ),
                        interleave64_2d(
                                (Float.floatToIntBits(x1) >>> 16) + ti4d.UINT16_MIN,
                                (Float.floatToIntBits(x3) >>> 16) + ti4d.UINT16_MIN
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

        // Object types

        protected static class Array<T> extends GreyCat.Object {
            protected Array(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_vu32(attributes.length);
                for (int offset = 0; offset < attributes.length; ++offset) {
                    stream.write(attributes[offset]);
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final int size = stream.read_vu32();
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            public static final java.lang.String type_name = "core::Map";

            private final java.util.Map<Object, Object> map = new HashMap<>();

            protected Map(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_vu32(size());
                for (Object key : map.keySet()) {
                    stream.write(key);
                    stream.write(get(key));
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final core.Map<Object, Object> map = (Map<Object, Object>) type.factory.build(type);
                final int mapLength = stream.read_vu32();
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
            public core.Table.TableColumnMeta[] meta;
            public T[] data;

            protected Table(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_vu32(cols);
                stream.write_vu32(rows);
                for (int i = 0; i < meta.length; ++i) {
                    core.Table.TableColumnMeta colMeta = meta[i];
                    stream.write_vu32(colMeta.colType);
                    stream.write_vu32(colMeta.type);
                    stream.write_bool(colMeta.index);
                }
                for (int c = 0; c < cols; ++c) {
                    switch (meta[c].colType) {
                        case GreyCat.PrimitiveType.NULL:
                            break;
                        case GreyCat.PrimitiveType.INT:
                            for (int r = 0; r < rows; ++r) {
                                Object i = data[c + r];
                                if (i instanceof Long) {
                                    stream.write_vi64((long) i);
                                } else if (i instanceof Integer) {
                                    stream.write_vi64((int) i);
                                } else if (i instanceof Short) {
                                    stream.write_vi64((short) i);
                                } else {
                                    stream.write_vi64((byte) i);
                                }
                            }
                            break;
                        case GreyCat.PrimitiveType.FLOAT:
                            for (int r = 0; r < rows; ++r) {
                                Object f = data[c + r];
                                if (f instanceof Double) {
                                    stream.write_f64((double) f);
                                } else {
                                    stream.write_f64((float) f);
                                }
                            }
                            break;
                        case GreyCat.PrimitiveType.TIME:
                        case GreyCat.PrimitiveType.DURATION:
                        case GreyCat.PrimitiveType.ENUM:
                            for (int r = 0; r < rows; ++r) {
                                ((GreyCat.Object) data[c + r]).save(stream);
                            }
                            break;
                        default:
                            for (int r = 0; r < rows; ++r) {
                                stream.write(data[c + r]);
                            }
                            break;
                    }
                }
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final int cols = stream.read_vu32();
                final int rows = stream.read_vu32();
                core.Table.TableColumnMeta[] meta = new core.Table.TableColumnMeta[cols];
                for (int col = 0; col < cols; col++) {
                    final int metaColType = stream.read_vu32();
                    final int metaType = stream.read_vu32();
                    final boolean metaIndex = stream.read_bool();
                    meta[col] = new core.Table.TableColumnMeta(metaColType, metaType, metaIndex);
                }
                final Object[] data = new Object[cols * rows];
                for (int c = 0; c < cols; c++) {
                    switch (meta[c].colType) {
                        case GreyCat.PrimitiveType.NULL:
                            break;
                        case GreyCat.PrimitiveType.INT:
                            for (int r = 0; r < rows; ++r) {
                                data[c + r] = stream.read_vi64();
                            }
                            break;
                        case GreyCat.PrimitiveType.FLOAT:
                            for (int r = 0; r < rows; ++r) {
                                data[c + r] = stream.read_f64();
                            }
                            break;
                        case GreyCat.PrimitiveType.TIME:
                            for (int r = 0; r < rows; ++r) {
                                data[c + r] = time.load(type.greycat.types[type.greycat.type_offset_core_time], stream);
                            }
                            break;
                        case GreyCat.PrimitiveType.DURATION:
                            for (int r = 0; r < rows; ++r) {
                                data[c + r] = duration.load(type.greycat.types[type.greycat.type_offset_core_duration], stream);
                            }
                            break;
                        case GreyCat.PrimitiveType.ENUM:
                            for (int r = 0; r < rows; ++r) {
                                GreyCat.Type enumType = type.greycat.types[meta[c].type];
                                data[c + r] = enumType.loader.load(enumType, stream);
                            }
                            break;
                        default:
                            for (int r = 0; r < rows; ++r) {
                                data[c + r] = stream.read();
                            }
                            break;
                    }
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
                public final boolean index;

                public TableColumnMeta(int colType, int type, boolean index) {
                    this.colType = colType;
                    this.type = type;
                    this.index = index;
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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

        // Deliberately unsupported types

        protected static class nodeIndexBucket extends GreyCat.Object {
            protected nodeIndexBucket(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_vu32(type.offset);
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
            long x = interleaved & core.B_3D[0];
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
            protected final void save(GreyCat.Stream stream) throws IOException {
                stream.write_vu32(data.length);
                stream.write_i8_array(data, 0, data.length);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                util.Buffer buf = (Buffer) type.factory.build(type);
                buf.data = stream.read_i8_array(stream.read_vu32());
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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

            private final java.util.Queue<T> queue = new LinkedList<>();

            protected Queue(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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
            protected final void save(GreyCat.Stream stream) throws IOException {
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
