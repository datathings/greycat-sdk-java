package samples;

import ai.greycat.GreyCat;
import ai.greycat.std;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.Arrays;

public class Sandbox {

    public static void main(String... args) throws Exception {

        GreyCat greycat = new GreyCat("/home/agarnier/datathings/greycat/sdk/java", new std()/*, new algebra()*/);
        GreyCat.AbiReader reader = greycat.openAbiRead("/home/agarnier/datathings/greycat/sdk/java/fail.gcb");

        OutputStream out = new FileOutputStream("check.gcb");
        out.write(new byte[]{0x01, 0x00, (byte) 0xa0, 0x47, 0x01, 0x00, 0x00, 0x00});
        GreyCat.Stream stream = new GreyCat.Stream(greycat, out);

        Object res = reader.read();
        while (res != null) {
            System.out.println(res.getClass());
            System.out.println(res);
            ((GreyCat.Object) res).save(stream);
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

