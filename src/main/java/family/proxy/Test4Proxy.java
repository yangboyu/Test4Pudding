package family.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yangboyu on 2018/2/12.
 */
public class Test4Proxy {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
//        Properties properties = System.getProperties();
//        for (String name : properties.stringPropertyNames()) {
//            System.out.println(String.format("name:[%s],valie:[%s]", name, properties.getProperty(name)));
//        }

//        Method hashCodeMethod = Object.class.getMethod("hashCode", new Class[0]);
//        Method toStringMethod = Object.class.getMethod("toString");

//        Class class4Constructor = Object.class;
//        System.out.println(ProxyInvocationHandler.class.getName());
//        Class class4ProxyInvocationHandler = Class.forName("family.proxy.HelloWorld$ProxyInvocationHandler", false, HelloWorld.class.getClassLoader());
//        Class clazz = ProxyInvocationHandler.class;
//        Constructor[] list = clazz.getConstructors();
//        Constructor constructor = clazz.getConstructor(class4Constructor);

//        ClassLoader cl = HelloWorld.class.getClassLoader();
//
//        System.out.println("ClassLoader is:" + cl.toString());
//        System.out.println("ClassLoader\'s parent is:" + cl.getParent().toString());
//        System.out.println("ClassLoader\'s grand father is:" + cl.getParent().getParent().toString());


//        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
//        for (int i = 0; i < urls.length; i++) {
//            System.out.println(urls[i].toExternalForm());
//        }
//        System.out.println(System.getProperty("java.ext.dirs"));
//        System.out.println(System.getProperty("java.class.path"));

        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        ClassLoader classLoader1 = ProxyImp.class.getClassLoader();
//        ClassLoader classLoader2 = new UserClassLoader();
        InvocationHandler handler = new ProxyInvocationHandler(new ProxyImp());

        IProxy proxy1 = (IProxy) Proxy.newProxyInstance(classLoader1, new Class[]{IProxy.class}, handler);
        proxy1.test1();
        proxy1.test1(1, 2);

//        C$Proxy1 c$Proxy1 = new C$Proxy1(handler);
//        c$Proxy1.test1();
//        c$Proxy1.test1(1, 2);

//        IProxy proxy2 = (IProxy) Proxy.newProxyInstance(classLoader2, new Class[]{IProxy.class}, handler);
//        proxy2.test1();
//        proxy2.test1(1, 2);
    }

    private static class ProxyInvocationHandler implements InvocationHandler {

        static {
            System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        }

        Object imp;

        public ProxyInvocationHandler(Object imp) {
            this.imp = imp;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(String.format("%s begin", Thread.currentThread().getStackTrace()[1].getMethodName()));
            Object object = method.invoke(this.imp, args);
            System.out.println(String.format("%s end", Thread.currentThread().getStackTrace()[1].getMethodName()));

            return object;
        }
    }

    public interface IProxy {
        void test1();

        void test1(Integer a, Integer b);
    }

    private static class ProxyImp implements IProxy {

        @Override
        public void test1() {
            System.out.println(String.format("%s", Thread.currentThread().getStackTrace()[1].getMethodName()));
        }

        @Override
        public void test1(Integer a, Integer b) {
            System.out.println(String.format("%s-p1(%s),p2(%s)", Thread.currentThread().getStackTrace()[1].getMethodName(), a, b));
        }
    }
}
