package family.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by yangboyu on 2018/2/8.
 */
public class Demo4ClassLoader {
    public static void main(String[] args){
        UserClassLoader1 diskLoader1 = new UserClassLoader1("/Users/yangboyu/work/idea/test-pudding-entity/classloader/test1/com/demo");

        UserClassLoader2 diskLoader2 = new UserClassLoader2("/Users/yangboyu/work/idea/test-pudding-entity/classloader/test2/com/demo");

        test(diskLoader1);

//        Thread.currentThread().setContextClassLoader(diskLoader2);


        test(diskLoader2);
    }

    private static void test(ClassLoader diskLoader){
        try {
            //加载class文件
            Class c = diskLoader.loadClass("com.demo.Test");

            if(c != null){
                try {
                    Object obj = c.newInstance();
                    Method method = c.getDeclaredMethod("say",null);
                    //通过反射调用Test类的say方法
                    method.invoke(obj, null);
                } catch (InstantiationException | IllegalAccessException
                        | NoSuchMethodException
                        | SecurityException |
                        IllegalArgumentException |
                        InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
