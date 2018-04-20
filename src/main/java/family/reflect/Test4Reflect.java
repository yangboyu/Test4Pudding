package family.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by yangboyu on 2018/2/28.
 */
public class Test4Reflect {
    public static void main(String[] args) throws Exception {
        Proxy target = new Proxy();
        Constructor[] constructors = Proxy.class.getDeclaredConstructors();
        Method method = Proxy.class.getDeclaredMethod("run");
        method.invoke(target);
    }

    static class Proxy {

        public void run() {
            System.out.println("run");
        }

        public void run1() {
            System.out.println("run-1");
        }

        public void run2() {
            System.out.println("run-2");
        }

        public void run3() {
            System.out.println("run-3");
        }

    }
}
