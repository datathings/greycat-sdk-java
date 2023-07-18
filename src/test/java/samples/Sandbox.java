package samples;

import ai.greycat.GreyCat;
import ai.greycat.std;

public class Sandbox {

    public static void main(String... args) throws Exception {

        GreyCat greycat = new GreyCat("/home/agarnier/datathings/greycat/sdk/java", new std()/*, new algebra()*/);
        GreyCat.AbiReader reader = greycat.openAbiRead("/home/agarnier/datathings/greycat/sdk/java/out.gcb");
        Object res = reader.read();
        while (res != null) {
            System.out.println(res);
            System.out.println(res.getClass());
                res = reader.read();
        }

//        GreyCat greycat = new GreyCat("http://localhost:8080", new std()/*, new algebra()*/);
//        Object res = GreyCat.call(greycat, "project::getInt()");
//        //Object result = GreyCat.call(greycat, "project::hello");
//        Object result = GreyCat.call(greycat, "project::hello2",100);
//        System.out.println(result);
//        System.out.println(result.getClass());


        //GreyCat.call(greycat, "project.push", result);


        // System.in;


    }


}

