package ai.greycat;

import java.util.ArrayList;
import java.util.List;

import ai.greycat.GreyCat.Library;

public class Sandbox {

    public static void main(String... args) throws Exception {
        String url = "http://localhost:8080";
        String username = "admin";
        String password = "admin";

        GreyCat greycat = new GreyCat(url, username, password, null);

        System.out.println(greycat.call("runtime::User::me"));
        //System.out.println(System.getProperty("user.dir"));
        //GreyCat greycat = new GreyCat(System.getProperty("user.dir"));
    }


}

