package family;

import family.entity.TextEditor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangboyu on 17/3/23.
 */
public class StaticClass {
    static int i = 10;

    static {
        System.out.println("init static method StaticClass ");
    }

    public static void load() {
        System.out.println("init load method StaticClass ");
    }

    private static void thorwException() throws Exception {
        Class a = Class.forName("family.MainApp");

        System.out.println("This is newException() function");
        Throwable t = new Throwable("121321321321");
        throw new Exception("Exception...", t);

    }
}