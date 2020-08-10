package io.greycat;

import io.greycat.impl.ArrayImpl;
import io.greycat.impl.ObjectImpl;
import org.junit.Assert;
import org.junit.Test;

public class ObjectTest {

    @Test
    public void EmptyObjectTest() {
        Graph graph = Graph.newGraph();

        Object arr = graph.newObject("Object");
        Assert.assertTrue(arr instanceof ObjectImpl);
        Assert.assertEquals(arr.toString(), "{}");
        arr.unmark();
        arr = null;

        graph.destroy();
    }

    @Test
    public void ArrayObjectTest() {
        Graph graph = Graph.newGraph();

        Array arr = (Array) graph.newObject("Array");
        Assert.assertTrue(arr instanceof ArrayImpl);
        Assert.assertEquals(arr.toString(), "[]");
        arr.add("p1").add("p2").add("p3");
        Assert.assertEquals(arr.toString(), "[\"p1\",\"p2\",\"p3\"]");

        arr.unmark();
        arr = null;

        graph.destroy();
    }

//    @Test
//    public void TensorObjectTest() {
//        Graph graph = Graph.newGraph();
//
//        Tensor t = (Tensor) graph.newObject("Tensor");
//        t.rawInitDouble(15);
//        double[] v = {0.1, 0.2, 0.3, 0.4, 0.5};
//        t.fillDouble(0, v);
//        double[] v2 = {1.1, 1.2, 1.3, 1.4, 1.5};
//        t.fillDouble(5, v2);
//        double[] v3 = {2.1, 2.2, 2.3, 2.4, 2.5};
//        t.fillDouble(10, v3);
//
//        System.out.println(t.toString());
//
//        t.unmark();
//        t = null;
//
//        graph.destroy();
//    }

    @Test
    public void TensorPassThroughTest() {
        Graph graph = Graph.newGraph();
        Tensor t = (Tensor) graph.newObject("Tensor");
        t.rawInitDouble(5);
        double[] v = {0.1, 0.2, 0.3, 0.4, 0.5};
        t.fillDouble(0, v);
        try {
            Context ctx = graph.newContext();
            ctx.declare("tensor", t);
            Function readTensor = graph.newFunction()
                    .then("tensor.get([2]);");
            readTensor.execute(ctx, (error, ctxResp) -> {
                System.out.println(ctxResp.toString());
                Assert.assertNull(error);
                ctxResp.unmark();
            });
            ctx.unmark();
            t.unmark();
            t = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        graph.destroy();
    }


    @Test
    public void NestedObjectTest() {
        Graph graph = Graph.newGraph();

        Object state = graph.newObject("Object");

        Object sub1 = graph.newObject("Object")
                .set("name", "sensor1")
                .set("value", 42.5);

        Object sub2 = graph.newObject("Object")
                .set("name", "sensor2")
                .set("value", false);

        state.set("s1", sub1).set("s2", sub2);

        sub1.unmark();
        sub1 = null;
        sub2.unmark();
        sub2 = null;

        Assert.assertEquals("{\"s1\":{\"name\":\"sensor1\",\"value\":42.500000},\"s2\":{\"name\":\"sensor2\",\"value\":false}}", state.toString());
        state.unmark();
        state = null;

        graph.destroy();
    }

    /*
    @Test
    public void NestedArrayTest() {
        Graph graph = Graph.newGraph();

        Object state = graph.newObject("Object");
        int[] a = {1, 2};
        state.set("hello", a);

        graph.destroy();
    }

     */

}
