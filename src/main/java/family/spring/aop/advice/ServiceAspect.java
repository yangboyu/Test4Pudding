package family.spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by yangboyu on 2018/3/21.
 */
public class ServiceAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("---------");
        return mi.proceed();
    }

//    /**
//     * 方法调用
//     */
//    @Override
//    public Object invoke(MethodInvocation mi){
//        Object result = initResult(mi);
//        interceptor.preProcess(mi);
//        try {
//            result = mi.proceed();
//        } catch (Throwable e) {
//            interceptor.afterThrowing(mi, result, e);
//        } finally {
//            interceptor.postProcess(mi, result);
//        }
//
//        // 判断如果为HTTPAPI，则返回JSON
//        if(result instanceof ServiceResponseBase ) {
//            return JSON.toJSONString(result);
//        }
//
//        if (result instanceof ServiceResponseBaseForMapi) {
//            return JSON.toJSONString(result);
//        }
//
//        return result;
//    }
//
//    /**
//     * 初始化返回值
//     * @param mi
//     * 方法代理
//     * @return
//     * 返回值
//     */
//    private Object initResult(MethodInvocation mi){
//        Object ret = null;
//        try {
//            if(mi.getMethod().isAnnotationPresent(ResponseBody.class)) {
//                ret = new ServiceResponseBase();
//                if (mi.getMethod().getDeclaringClass().isAnnotationPresent(MApiController.class)) {
//                    ret = new ServiceResponseBaseForMapi();
//                }
//            }else if(mi.getMethod().getReturnType().getName().equals(ModelAndView.class.getName())) {
//                String mv = "error";
//                ret = new ModelAndView(mv);
//            }
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//        return ret;
//    }

}
