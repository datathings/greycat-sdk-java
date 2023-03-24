package samples;

import ai.greycat.GreyCat;
import ai.greycat.algebra;
import ai.greycat.std;

public class Sandbox {

    public static void main(String... args) throws Exception {
        GreyCat greycat = new GreyCat("http://localhost:8080", new std(), new algebra());
        Object result = GreyCat.call(greycat, "project.rpc_bin");
        System.out.println(result.getClass());
        GreyCat.call(greycat, "project.push", result);
    }
}

