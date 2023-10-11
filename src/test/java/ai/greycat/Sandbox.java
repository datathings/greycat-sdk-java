package ai.greycat;

public class Sandbox {

    enum Ballec {
        OLOL
    }

    public static void main(String... args) throws Exception {
        GreyCat greycat = new GreyCat("http://localhost:8080");
        System.out.println(GreyCat.call(greycat, "project::foo"));
    }


}

