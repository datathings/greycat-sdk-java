package io.greycat;

import io.greycat.impl.GreyCatParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class FunctionTest {

    @Test
    public void HelloWorld() throws ExecutionException, InterruptedException, IOException, GreyCatParseException {
        Graph g = Graph.newGraph();
        g.newFunction()
                .then("var text = \"Hello from ${origin}\";")
                .execute(
                        g.newContext().declare("origin", "GreyCat Java"),
                        (error, ctx) -> {
                            Assert.assertEquals("Hello from GreyCat Java", ctx.get("text"));
                            ctx.unmark();
                        })
                .unmark();

        g.destroy();

    }

    @Test
    public void PrimitivesPrint() throws IOException, GreyCatParseException {
        Graph g = Graph.newGraph();
        final String script = "var now = Time::ms(42); var geo = Geocode::from('8FX894WH+G76'); var n = Graph::newNode({});var days = TimeUnit::days;var blob = Blob {};";
        g.newFunction()
                .then(script)
                .execute((ex, ctx) -> {
                    GeoCode geoCode = (GeoCode) ctx.get("geo");
                    Assert.assertEquals(geoCode.toString(), "8FX894WH+G76");
                    Time time = (Time) ctx.get("now");
                    Assert.assertEquals("1970-00-01T00:00:00.042000Z / 42000", time.toString() + " / " + time.toTimestamp());
                    Reference n = (Reference) ctx.get("n");
                    Assert.assertEquals(n.toString(), "1.0");
                    EnumCall days = (EnumCall) ctx.get("days");
                    Assert.assertEquals(days.toString(), "TimeUnit::days");
                    Blob blob = (Blob) ctx.get("blob");
                    blob.set("hello".getBytes());
                    Assert.assertEquals(blob.get(0), (int) 'h');
                    Assert.assertEquals(blob.size(), 5);

                    ctx.unmark();
                })
                .unmark();
        g.destroy();

    }
}
