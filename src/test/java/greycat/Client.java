package greycat;

import greycat.GreyCat;

public class Client {

    public static void main(String... args) throws Exception {
        String url = "http://localhost:8080";
        String username = "admin";
        String password = "changeme";

        GreyCat greycat = new GreyCat(url, username, password, null, null);
        greycat.putFile("pom.xml", new java.io.File("pom.xml"));

        gc.core.Array<Object> gcb = (gc.core.Array<Object>) greycat.call("project::get_gcb");
        java.util.Iterator<Object> gcbIt = gcb.iterator();
        while (gcbIt.hasNext()) {
            Object o = gcbIt.next();
            System.out.println(o);
            System.out.println(greycat.call("project::display", o));
        }
    }
}
