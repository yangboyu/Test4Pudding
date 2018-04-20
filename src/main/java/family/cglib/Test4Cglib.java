package family.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by yangboyu on 2018/2/11.
 */
public class Test4Cglib {

    public static void main(String[] args) throws Throwable {
//        test1();
        test2();
    }

    public static void test1() throws Throwable {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/yangboyu/work/idea/test-pudding-entity/src/main/java/");
        //实例化一个增强器，也就是cglib中的一个class generator
        Enhancer eh = new Enhancer();
        eh.setSuperclass(Test4Service.class);           //设置目标类
        eh.setCallback(new Test4Interceptor());         // 设置拦截对象
        Test4Service t = (Test4Service) eh.create();    // 生成代理类并返回一个实例
        t.f();
        t.g();
    }

    public static void test2() throws Throwable {
        Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9.CGLIB$SET_STATIC_CALLBACKS(new Callback[]{new Test4Interceptor()});

        Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 test4Enhancer$Target$$EnhancerByCGLIB$$3fdfec39 = new Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9();
//        test4Enhancer$Target$$EnhancerByCGLIB$$3fdfec39.setCallbacks(new Callback[]{new Interceptor()});
        test4Enhancer$Target$$EnhancerByCGLIB$$3fdfec39.f();
//        test4Enhancer$Target$$EnhancerByCGLIB$$3fdfec39.g();
    }

    public static class Test4Service {
        public void f() throws Throwable {
            System.out.println("Target f()");
        }

        public void g() throws Throwable {
            System.out.println("Target g()");
        }
    }

    public static class Test4Interceptor implements MethodInterceptor {
        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            System.out.println("I am intercept begin!!!!");
            // Note: 此处一定要使用proxy的invokeSuper方法来调用目标类的方法
            proxy.invokeSuper(obj, args);
            System.out.println("I am intercept end");
            return null;
        }
    }
}
