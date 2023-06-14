package samples;

import ai.greycat.GreyCat;
import ai.greycat.algebra;
import ai.greycat.project_lib;
import ai.greycat.std.*;

public class Sandbox {

    public static void main(String... args) throws Exception {
        long t0 = System.currentTimeMillis();
        GreyCat greycat = new GreyCat("http://localhost:8080", new algebra());
//        System.out.println(runtime.Runtime.info(greycat));
//        long t1 = System.currentTimeMillis();
        Object o = null;
//        for (int i = 0; i < 10; i++) {
            o = project_lib.project.rpc_bin(greycat, 42L);
//        }
//        long t2 = System.currentTimeMillis();
        System.out.println(o);
//        System.out.println("v=" + core.TimeZone.America_Phoenix(greycat).value);
//        System.out.println("abi " + (t1 - t0) + "ms");
//        System.out.println("call " + ((t2 - t1) / 10.0) + "ms");
//        System.out.println(math.MathConstants.pi(greycat));
//        long t3 = System.currentTimeMillis();
//        java.lang.Object t = project_lib.project.table(greycat);
//        long t4 = System.currentTimeMillis();
//        System.out.println("table " + (t4 - t3) + "ms");
//        System.out.println(t);
//
//

//        GreyCat.Task t = project_lib.project.long_task(greycat);
//        t.info(greycat);



    }

}

//protocol

//=> connect
//-> self
//-> code_fun : u32
//-> params ABI
//again
////exec
//<- ABI object


//builder
//task

