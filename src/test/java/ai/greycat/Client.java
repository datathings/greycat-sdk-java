package ai.greycat;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String... args) throws Exception {
        String url = "http://localhost:8080";
        String username = "admin";
        String password = "changeme";

        GreyCat greycat = new GreyCat(url, username, password, null);

        System.out.println("Session ready!");

        std.core.Array<Object> gcb = (std.core.Array<Object>) greycat.call("project::get_gcb");
        Iterator<Object> gcbIt = gcb.iterator();
        while (gcbIt.hasNext()) {
            System.out.println(greycat.call("project::display", gcbIt.next()));
        }
    }
}
