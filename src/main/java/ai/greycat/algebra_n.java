package ai.greycat;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import static ai.greycat.std_n.*;

class algebra_n {

    public static final class powerflow {
        protected static class PowerNetwork extends GreyCat.Object {

            protected PowerNetwork(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }
    }

    public static final class compute {
        protected static class ComputeState extends GreyCat.Object {

            protected ComputeState(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }

        protected static class ComputeEngine extends GreyCat.Object {

            protected ComputeEngine(GreyCat.Type type) {
                super(type, null);
                throw new RuntimeException("unsupported");
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                throw new IOException("unsupported");
            }
        }

    }


    public static final class ml {
        public static class Polynomial extends GreyCat.Object {
            public byte degree;
            public double x_start;
            public double x_step;
            public byte tensor_type;
            public byte[] data;

            public Polynomial(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i8(degree);
                stream.write_i64(data.length);
                stream.write_f64(x_start);
                stream.write_f64(x_step);
                stream.write_i8(tensor_type);
                stream.write_i8_array(data, 0, data.length);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final byte degree = stream.read_i8();
                final long coefficientSize = stream.read_i64();
                final double xStart = stream.read_f64();
                final double xStep = stream.read_f64();
                final byte tensorType = stream.read_i8();
                final byte[] data = stream.read_i8_array((int) coefficientSize);
                ml.Polynomial poly = (Polynomial) type.factory.build(type);
                poly.degree = degree;
                poly.x_start = xStart;
                poly.x_step = xStep;
                poly.tensor_type = tensorType;
                poly.data = data;
                return poly;
            }

            @SuppressWarnings("unused")
            public double predict(final double x) {
                switch (tensor_type) {
                    case 2:
                        return predictF32(x);
                    case 3:
                        return predictF64(x);
                    default:
                        throw new IllegalArgumentException("wrong state");
                }
            }

            private double predictF32(double x) {
                ByteBuffer buffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
                double y = buffer.getFloat();
                double factor = x - x_start;
                if (x_step != 0.0) {
                    factor /= x_step;
                }
                double xDeg = factor;
                for (byte i = 1; i <= degree; i++) {
                    y += buffer.getFloat() * xDeg;
                    xDeg *= factor;
                }
                return y;
            }

            private double predictF64(double x) {
                ByteBuffer buffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
                double y = buffer.getDouble();
                double factor = x - x_start;
                if (x_step != 0.0) {
                    factor /= x_step;
                }
                double xDeg = factor;
                for (byte i = 1; i <= degree; i++) {
                    y += buffer.getDouble() * xDeg;
                    xDeg *= factor;
                }
                return y;
            }
        }

        public static class PCA extends GreyCat.Object {
            private int bestDim;
            private int selectedDim;
            private double threshold;
            @SuppressWarnings({"unused", "FieldCanBeLocal"})
            private core.Tensor eigenVectors;
            private core.Tensor eigenValues;
            private core.Tensor avg;
            private core.Tensor std;
            private core.Tensor correlation;
            private core.Tensor explainedVariance;
            private core.Tensor spaceOrigin;
            private core.Tensor spaceCropped;
            private core.Tensor dimInfo;

            public PCA(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i32(bestDim);
                stream.write_i32(selectedDim);
                stream.write_f64(threshold);
                stream.write_object(eigenValues);
                stream.write_object(avg);
                stream.write_object(std);
                stream.write_object(correlation);
                stream.write_object(explainedVariance);
                stream.write_object(spaceOrigin);
                stream.write_object(spaceCropped);
                stream.write_object(dimInfo);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final int bestDim = stream.read_i32();
                final int selectedDim = stream.read_i32();
                final double threshold = stream.read_f64();
                final core.Tensor eigenVectors = (core.Tensor) stream.read();
                final core.Tensor eigenValues = (core.Tensor) stream.read();
                final core.Tensor avg = (core.Tensor) stream.read();
                final core.Tensor std = (core.Tensor) stream.read();
                final core.Tensor correlation = (core.Tensor) stream.read();
                final core.Tensor explainedVariance = (core.Tensor) stream.read();
                final core.Tensor spaceOrigin = (core.Tensor) stream.read();
                final core.Tensor spaceCropped = (core.Tensor) stream.read();
                final core.Tensor dimInfo = (core.Tensor) stream.read();
                ml.PCA pca = (PCA) type.factory.build(type);
                pca.bestDim = bestDim;
                pca.selectedDim = selectedDim;
                pca.threshold = threshold;
                pca.eigenVectors = eigenVectors;
                pca.eigenValues = eigenValues;
                pca.avg = avg;
                pca.std = std;
                pca.correlation = correlation;
                pca.explainedVariance = explainedVariance;
                pca.spaceOrigin = spaceOrigin;
                pca.spaceCropped = spaceCropped;
                pca.dimInfo = dimInfo;
                return pca;
            }

        }

        public static class GaussianND extends GreyCat.Object {
            private long count;
            private core.Tensor min;
            private core.Tensor max;
            private core.Tensor sum;
            private core.Tensor sum_sq;

            public GaussianND(GreyCat.Type type) {
                super(type, null);
            }

            @Override
            public void save(GreyCat.Stream stream) throws IOException {
                stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                stream.write_i32(type.offset);
                stream.write_i64(count);
                stream.write_object(min);
                stream.write_object(max);
                stream.write_object(sum);
                stream.write_object(sum_sq);
            }

            static java.lang.Object load(GreyCat.Type type, GreyCat.Stream stream) throws IOException {
                final long count = stream.read_i64();
                final core.Tensor min = (core.Tensor) stream.read();
                final core.Tensor max = (core.Tensor) stream.read();
                final core.Tensor sum = (core.Tensor) stream.read();
                final core.Tensor sum_sq = (core.Tensor) stream.read();
                ml.GaussianND g = (GaussianND) type.factory.build(type);
                g.count = count;
                g.min = min;
                g.max = max;
                g.sum = sum;
                g.sum_sq = sum_sq;
                return g;
            }
        }
    }

}
