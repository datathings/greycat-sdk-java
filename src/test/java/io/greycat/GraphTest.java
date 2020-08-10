package io.greycat;

import org.junit.Assert;
import org.junit.Test;


public final class GraphTest {

    @Test
    public final void bootstrap() {
        Graph graph = Graph.newGraph();
        graph.destroy();
    }

    @Test
    public final void meta() {
        Graph graph = Graph.newGraph();
        Assert.assertTrue(graph.isMeta("Ref"));
        Assert.assertFalse(graph.isMeta("Sensor"));
        int sensorKey = graph.declareMeta("Sensor");
        Assert.assertEquals(sensorKey, "Sensor".hashCode());
        Assert.assertTrue(graph.isMeta("Sensor"));
        graph.destroy();
    }

}
