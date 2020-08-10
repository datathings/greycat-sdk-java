package io.greycat;

import io.greycat.impl.GreyCatParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class TypeTest {

    @Test
    public void declaration() {
        Graph g = Graph.newGraph(1000);

        g.declareType("Sensor", true)
                .declareAttribute("value", "Double")
                .declareAttribute("id", "String")
                .declareStatic("default_id", 42)
                .declareFunction("sayHi",
                        ctx -> ctx.graph().logInfo("hi")
                )
                .seal()
                .unmark();

        String allTypes = g.exportTypes();
        Assert.assertTrue(allTypes.contains("Sensor"));
        g.destroy();
    }

    @Test
    public void usage() throws ExecutionException, InterruptedException, IOException, GreyCatParseException {
        Graph g = Graph.newGraph(1000);

        final boolean[] jvm_b_called = {false};

        g.declareType("Sensor", true)
                .declareAttribute("value", "f64")
                .declareAttribute("id", "String")
                .declareStatic("default_id", 42)
                .declareFunction("sayHi",
                        ctx -> {
                            jvm_b_called[0] = true;
                        }
                )
                .seal()
                .unmark();

        g.newFunction()
                .then("var res = Sensor { value: 42.5 }; res.sayHi();")
                .execute((ex, ctx) -> {
                    Assert.assertEquals("{\"res\":{\"value\":42.500000}}", ctx.toString());
                    Assert.assertTrue(jvm_b_called[0]);

                    ctx.unmark();

                })
                .unmark();

        g.destroy();
    }

}
