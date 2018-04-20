package family.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yangboyu on 17/4/16.
 */
public class BusinessProcessorHandler implements InvocationHandler {
    private Object target = null;

    public BusinessProcessorHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        if(method.getName().equalsIgnoreCase("processbusiness")){
            System.out.println(String.format("%s,%s", args, method.getName()));
            System.out.println(String.format("proxy is : %s", proxy));
        }
        Object result = method.invoke(target, args);
        return result;
    }
}
