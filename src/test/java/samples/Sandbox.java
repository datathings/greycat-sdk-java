package samples;

import ai.greycat.GreyCat;
import ai.greycat.std;

public class Sandbox {

    public static void main(String... args) throws Exception {

        GreyCat greycat = new GreyCat("/Users/duke/dev/greycat/greycat/cmake-build-debug/bin", new std()/*, new algebra()*/);
        //GreyCat greycat = new GreyCat("http://localhost:8080", new std()/*, new algebra()*/);

        GreyCat.AbiReader reader = GreyCat.AbiReader.open(greycat,"/Users/duke/dev/greycat/greycat/cmake-build-debug/bin/out.gcb");
        Object res = reader.read();
        System.out.println(res);
        System.out.println(res.getClass());



        //Object result = GreyCat.call(greycat, "project.rpc_bin");
        //System.out.println(result.getClass());
        //GreyCat.call(greycat, "project.push", result);
    }
}

