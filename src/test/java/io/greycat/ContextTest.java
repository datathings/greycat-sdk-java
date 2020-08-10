package io.greycat;

import io.greycat.impl.GreyCatParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ContextTest {

    @Test
    public void ContextVariableManipulation() {
        Graph g = Graph.newGraph();
        Context ctx = g.newContext();
        ctx.set("i", 42);
        Assert.assertEquals(42, ctx.get("i"));
        ctx.set("l", 42000000L);
        Assert.assertEquals(42000000L, ctx.get("l"));
        ctx.set("b", true);
        Assert.assertEquals(true, ctx.get("b"));
        ctx.set("d", 0.42);
        Assert.assertEquals(0.42, ctx.get("d"));
        ctx.set("msg", "hello GreyCat");
        Assert.assertEquals("hello GreyCat", ctx.get("msg"));
        ctx.set("i", null);
        Assert.assertNull(ctx.get("i"));
        ctx.set("i", 42);
        Assert.assertEquals(42, ctx.get("i"));
        Assert.assertEquals(ctx.toString(), "{\"i\":42,\"l\":42000000,\"d\":0.420000,\"b\":true,\"msg\":\"hello GreyCat\"}");
        g.destroy();
    }

    @Test
    public void ContextNestedSubObjects() {
        Graph g = Graph.newGraph();
        Context ctx = g.newContext();
        ctx.declare("values", null);
        Assert.assertNull(ctx.get("values"));

        Array values = (Array) g.newObject("Array");

        Object sub1 = g.newObject("Object")
                .set("name", "sensor1")
                .set("value", 42.5);

        Object sub2 = g.newObject("Object")
                .set("name", "sensor2")
                .set("value", false);

        values.add(sub1).add(sub2);

        sub1.unmark();
        sub1 = null;
        sub2.unmark();
        sub2 = null;

        ctx.set("values", values);
        values.unmark();
        values = null;

        Assert.assertEquals("[{\"name\":\"sensor1\",\"value\":42.500000},{\"name\":\"sensor2\",\"value\":false}]", ctx.get("values").toString());

        ctx.unmark();
        g.destroy();
    }

    @Test
    public void multipleExecutionOfTheSameFunction() throws IOException, GreyCatParseException {
        Graph g = Graph.newGraph();
        // init
        g.newFunction().then("Graph::setRoot(Graph::newNode({})); var root = Graph::getRoot(); root->users = Graph::newNode(Map {});").execute().unmark();

        // function to execute multiple times
        Function fn = g.newFunction().then("var root = Graph::getRoot(); root->users->set(id, value);");

        // #1 execution
        Context c1 = g.newContext();
        c1.set("id", "one");
        c1.set("value", 40);
        fn.execute(c1, (ex, c) -> c1.unmark());

        // #2 execution
        Context c2 = g.newContext();
        c2.set("id", "two");
        c2.set("value", 2);
        fn.execute(c2, (ex, c) -> c2.unmark());

        fn.unmark();

        // validate
        g.newFunction()
                .then("var users = []; Graph::getRoot()->users->foreach((k: Any, v: Any) { users.add(v); });")
                .execute((ex, ctx) -> {
                    Array users = (Array) ctx.get("users");
                    Assert.assertEquals((int) users.get(0) + (int) users.get(1), 42);

                    // cleanup
                    ctx.unmark();

                })
                .unmark();
        g.destroy();
    }

    @Test
    public void runtimeError() throws IOException, GreyCatParseException {
        Graph g = Graph.newGraph();
        final String script = "var olc = Geocode::from('8FX894WH+G76'); function add(key: Geocode) {}; add('some code');";

        g.newFunction()
                .then(script)
                .execute(g.newContext().onError(null), (ex, ctx) -> {
                    Assert.assertTrue(ex.endsWith("param 'key' type mismatch in function 'add' expected type 'Geocode' found 'String' instead"));
                    ctx.unmark();
                })
                .unmark();

        g.destroy();

    }

}
