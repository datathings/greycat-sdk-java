package ai.greycat;

import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;

public class Sandbox {

    private final static Field GREYCAT__SYMBOLS_OFF_BY_VALUE;

    static {
        getField:
        {
            for (Field field : GreyCat.class.getDeclaredFields()) {
                if ("symbols_off_by_value".equals(field.getName())) {
                    field.setAccessible(true);
                    GREYCAT__SYMBOLS_OFF_BY_VALUE = field;
                    break getField;
                }
            }
            throw new RuntimeException();
        }
    }

    public static void main(String... args) throws Exception {


        GreyCat greycat = new GreyCat("/home/agarnier/datathings/greycat/sdk/java", new std()/*, new algebra()*/);
        GreyCat.AbiReader reader = greycat.openAbiRead("/home/agarnier/datathings/greycat/sdk/java/out.gcb");

        @SuppressWarnings("IOStreamConstructor")
        GreyCat.Stream stream = new GreyCat.Stream(greycat, new FileOutputStream("check.gcb"));
        stream.write_i8_array(new byte[]{0x01, 0x00, (byte) 0xa0, 0x47, 0x01, 0x00, 0x00, 0x00}, 0, 8);

        Object res = reader.read();
        while (res != null) {
            System.out.println(res.getClass());
            System.out.println(res);
            try {
                GreyCat.Object object = (GreyCat.Object) res;
                object.saveType(stream);
                object.save(stream);
            } catch (ClassCastException ex) {
                if (res instanceof Boolean) {
                    stream.write_i8(GreyCat.PrimitiveType.BOOL);
                    stream.write_bool((boolean) res);
                } else if (res instanceof Character) {
                    stream.write_i8(GreyCat.PrimitiveType.CHAR);
                    stream.write_i8((byte) (char) res);
                } else if (res instanceof Long) {
                    stream.write_i8(GreyCat.PrimitiveType.INT);
                    stream.write_vi64((long) res);
                } else if (res instanceof Double) {
                    stream.write_i8(GreyCat.PrimitiveType.FLOAT);
                    stream.write_f64((double) res);
                } else if (res instanceof String) {
                    String string = (String) res;
                    @SuppressWarnings("unchecked")
                    Integer symbolOffset =
                            ((java.util.Map<String, Integer>) GREYCAT__SYMBOLS_OFF_BY_VALUE.get(greycat)).get(string);
                    if (symbolOffset != null) {
                        stream.write_i8(GreyCat.PrimitiveType.STRING_LIT);
                        stream.write_vu32((symbolOffset << 1) | 1);
                    } else {
                        stream.write_i8(GreyCat.PrimitiveType.OBJECT);
                        stream.write_vu32(greycat.type_offset_core_string);
                        final byte[] data = string.getBytes(StandardCharsets.UTF_8);
                        stream.write_vu32(data.length << 1);
                        stream.write_i8_array(data, 0, data.length);
                    }
                } else {
                    throw ex;
                }
            }
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

