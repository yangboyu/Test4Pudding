package family.cglib;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yangboyu on 17/4/16.
 */
public class BusinessImpl {

    public BusinessImpl(){

    }

    public BusinessImpl(Integer i) {
        System.out.println("Here's in BusinessImpl Constructor");
    }

    public String getElement(String id) {
        return id + "_CGLib";
    }

    public List<String> getAllElements() {
        return Arrays.asList("Hello_CGLib1", "Hello_CGLib2");
    }

    public String methodForNoop() {
        return "Hello_Noop";
    }

    public String methodForFixedValue(String param) {
        return "Hello_" + param;
    }

    public final String sayHello() {
        return "Hello Everyone！";
    }

}
