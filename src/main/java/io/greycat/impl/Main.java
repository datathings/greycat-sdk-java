package io.greycat.impl;

import java.io.IOException;

import io.greycat.Function;
import io.greycat.Graph;

public class Main {

    public static void main(String[] args) throws IOException, GreyCatParseException {
        Graph graph = Graph.newGraph();

        Function f = graph.newFunction();
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--print-lib") || args[i].equals("-l")) {
                System.out.println(graph.exportTypes());
            } else if (args[i].equals("--version") || args[i].equals("-version") || args[i].equals("-v")) {
                System.out.println(graph.versionFull());
            } else {
                f.then(args[i]);
            }
        }

        f.execute(null, (ex, ctx) -> {
            ctx.unmark();
        }).unmark();
        graph.destroy();
    }

}
