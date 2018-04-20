package family.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * Created by yangboyu on 2018/2/9.
 */
public class Demo {

    public static void main(String[] args) {

//        Student student = new Student(666, "XiaoMing");
//        System.out.println("id=" + student.getId());
//        System.out.println("name=" + student.getName());
//        // LazyLoader 只有第一次，Dispatcher是每次都会进loadObject的方法
//        System.out.println("========First Get  EnglishSchedule ========");
//        System.out.println(student.getEnglishSchedule());
//        System.out.println();
//        System.out.println("========First Get  MathSchedule ========");
//        System.out.println(student.getMathSchedule());
//        System.out.println();
//        System.out.println("========Second Get  EnglishSchedule ========");
//        System.out.println(student.getEnglishSchedule());
//        System.out.println();
//        System.out.println("========Second Get  MathSchedule ========");
//        System.out.println(student.getMathSchedule());
////
//
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/yangboyu/work/a/");
        Demo demo = new Demo();
        TestCglibMethodInterceptor1 interceptor1 = demo.getInstance4Interceptor1();
        TestCglibMethodInterceptor2 interceptor2 = demo.getInstance4Interceptor2();
        TestCglibCallbackFilter callbackFilter = demo.getInstance4Callback();
        TestCglibFix fixValue = demo.getInstance4FixValue();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(BusinessImpl.class);
        enhancer.setCallbacks(new Callback[]{interceptor1, interceptor2, NoOp.INSTANCE, fixValue});
        enhancer.setCallbackFilter(callbackFilter);
//        BusinessImpl dbQuery = (BusinessImpl) enhancer.create(new Class[]{Integer.class}, new Object[]{1});
        BusinessImpl imp = (BusinessImpl) enhancer.create();
        System.out.println(imp.getElement("Hello"));
        System.out.println();
        System.out.println(imp.getAllElements());
        System.out.println();
        System.out.println(imp.sayHello());
        System.out.println();
        System.out.println(imp.methodForFixedValue("------"));
    }

    private TestCglibMethodInterceptor1 getInstance4Interceptor1() {
        TestCglibMethodInterceptor1 interceptor = new TestCglibMethodInterceptor1();

        return interceptor;
    }

    private TestCglibMethodInterceptor2 getInstance4Interceptor2() {
        TestCglibMethodInterceptor2 interceptor = new TestCglibMethodInterceptor2();

        return interceptor;
    }

    private TestCglibCallbackFilter getInstance4Callback() {
        TestCglibCallbackFilter interceptor = new TestCglibCallbackFilter();

        return interceptor;
    }

    private TestCglibFix getInstance4FixValue() {
        TestCglibFix interceptor = new TestCglibFix();

        return interceptor;
    }

    public class TestCglibFix implements FixedValue{

        @Override
        public Object loadObject() throws Exception {
            return "kx012";
        }
    }

    public class TestCglibMethodInterceptor1 implements MethodInterceptor {
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("Here in interceptor(1) ！");
            return methodProxy.invokeSuper(o, objects);
        }
    }

    public class TestCglibMethodInterceptor2 implements MethodInterceptor {
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("Here in interceptor(2) ！");
            return methodProxy.invokeSuper(o, objects);
        }
    }

    public class TestCglibCallbackFilter implements CallbackFilter {

        @Override
        public int accept(Method method) {
            if (method.getName().equals("getElement")) {
                return 0;
            } else if (method.getName().equals("getAllElements")) {
                return 2;
            } else if (method.getName().equals("methodForFixedValue")){
                return 3;
            }

            return 1;
        }
    }

}