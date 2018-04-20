package family.cglib;

import family.cglib.Test4Cglib.Test4Service;
import java.lang.reflect.Method;
import net.sf.cglib.core.ReflectUtils;
import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Factory;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/* compiled from: <generated> */
public class Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 extends Test4Service implements Factory {
    private static  Callback[] CGLIB$STATIC_CALLBACKS = null;
    private static  ThreadLocal CGLIB$THREAD_CALLBACKS = null;
    private static  Method CGLIB$clone$6$Method = null;
    private static  MethodProxy CGLIB$clone$6$Proxy = null;
    private static  Object[] CGLIB$emptyArgs = null;
    private static  Method CGLIB$equals$3$Method = null;
    private static  MethodProxy CGLIB$equals$3$Proxy = null;
    private static  Method CGLIB$f$1$Method = null;
    private static  MethodProxy CGLIB$f$1$Proxy = null;
    private static  Method CGLIB$finalize$2$Method = null;
    private static  MethodProxy CGLIB$finalize$2$Proxy = null;
    private static  Method CGLIB$g$0$Method = null;
    private static  MethodProxy CGLIB$g$0$Proxy = null;
    private static  Method CGLIB$hashCode$5$Method = null;
    private static  MethodProxy CGLIB$hashCode$5$Proxy = null;
    private static  Method CGLIB$toString$4$Method = null;
    private static  MethodProxy CGLIB$toString$4$Proxy = null;
    private boolean CGLIB$BOUND;
    private MethodInterceptor CGLIB$CALLBACK_0;

    static {
        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
        CGLIB$emptyArgs = new Object[0];
        Class cls = null;
        try {
            cls = Class.forName("family.cglib.Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String[] strArr = new String[]{"g", "()V", "f", "()V"};
        Class cls2 = null;
        try {
            cls2 = Class.forName("family.cglib.Test4Cglib$Test4Service");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Method[] findMethods = ReflectUtils.findMethods(strArr, cls2.getDeclaredMethods());
        CGLIB$g$0$Method = findMethods[0];
        CGLIB$g$0$Proxy = MethodProxy.create(cls2, cls, "()V", "g", "CGLIB$g$0");
        CGLIB$f$1$Method = findMethods[1];
        CGLIB$f$1$Proxy = MethodProxy.create(cls2, cls, "()V", "f", "CGLIB$f$1");
        strArr = new String[]{"finalize", "()V", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;"};
        try {
            cls2 = Class.forName("java.lang.Object");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        findMethods = ReflectUtils.findMethods(strArr, cls2.getDeclaredMethods());
        CGLIB$finalize$2$Method = findMethods[0];
        CGLIB$finalize$2$Proxy = MethodProxy.create(cls2, cls, "()V", "finalize", "CGLIB$finalize$2");
        CGLIB$equals$3$Method = findMethods[1];
        CGLIB$equals$3$Proxy = MethodProxy.create(cls2, cls, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$3");
        CGLIB$toString$4$Method = findMethods[2];
        CGLIB$toString$4$Proxy = MethodProxy.create(cls2, cls, "()Ljava/lang/String;", "toString", "CGLIB$toString$4");
        CGLIB$hashCode$5$Method = findMethods[3];
        CGLIB$hashCode$5$Proxy = MethodProxy.create(cls2, cls, "()I", "hashCode", "CGLIB$hashCode$5");
        CGLIB$clone$6$Method = findMethods[4];
        CGLIB$clone$6$Proxy = MethodProxy.create(cls2, cls, "()Ljava/lang/Object;", "clone", "CGLIB$clone$6");
    }

    public Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9() {
        CGLIB$BIND_CALLBACKS(this);
    }

    private static final void CGLIB$BIND_CALLBACKS(Object obj) {
        Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 = (Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9) obj;
        if (!test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9.CGLIB$BOUND) {
            test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9.CGLIB$BOUND = true;
            Object obj2 = CGLIB$THREAD_CALLBACKS.get();
            if (obj2 == null) {
                obj2 = CGLIB$STATIC_CALLBACKS;
                if (obj2 == null) {
                    return;
                }
            }
            test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9.CGLIB$CALLBACK_0 = (MethodInterceptor) ((Callback[]) obj2)[0];
        }
    }

    public static void CGLIB$SET_STATIC_CALLBACKS(Callback[] callbackArr) {
        CGLIB$STATIC_CALLBACKS = callbackArr;
    }

    public static void CGLIB$SET_THREAD_CALLBACKS(Callback[] callbackArr) {
        CGLIB$THREAD_CALLBACKS.set(callbackArr);
    }

    static void CGLIB$STATICHOOK1() {

    }

    public static MethodProxy CGLIB$findMethodProxy(Signature signature) {
        String obj = signature.toString();
        switch (obj.hashCode()) {
            case -1574182249:
                if (obj.equals("finalize()V")) {
                    return CGLIB$finalize$2$Proxy;
                }
                break;
            case -508378822:
                if (obj.equals("clone()Ljava/lang/Object;")) {
                    return CGLIB$clone$6$Proxy;
                }
                break;
            case 3078479:
                if (obj.equals("f()V")) {
                    return CGLIB$f$1$Proxy;
                }
                break;
            case 3108270:
                if (obj.equals("g()V")) {
                    return CGLIB$g$0$Proxy;
                }
                break;
            case 1826985398:
                if (obj.equals("equals(Ljava/lang/Object;)Z")) {
                    return CGLIB$equals$3$Proxy;
                }
                break;
            case 1913648695:
                if (obj.equals("toString()Ljava/lang/String;")) {
                    return CGLIB$toString$4$Proxy;
                }
                break;
            case 1984935277:
                if (obj.equals("hashCode()I")) {
                    return CGLIB$hashCode$5$Proxy;
                }
                break;
        }
        return null;
    }

    final Object CGLIB$clone$6() throws CloneNotSupportedException {
        return super.clone();
    }

    final boolean CGLIB$equals$3(Object obj) {
        return equals(obj);
    }

    final void CGLIB$f$1() throws Throwable {
        super.f();
    }

    final void CGLIB$finalize$2() throws Throwable {
        super.finalize();
    }

    final void CGLIB$g$0() throws Throwable {
        super.g();
    }

    final int CGLIB$hashCode$5() {
        return hashCode();
    }

    final String CGLIB$toString$4() {
        return toString();
    }

    protected final Object clone() throws CloneNotSupportedException {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        try {
            return methodInterceptor != null ? methodInterceptor.intercept(this, CGLIB$clone$6$Method, CGLIB$emptyArgs, CGLIB$clone$6$Proxy) : clone();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return "";
        }
    }

    public final boolean equals(Object obj) {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        if (methodInterceptor == null) {
            return equals(obj);
        }
        Object intercept = null;
        try {
            intercept = methodInterceptor.intercept(this, CGLIB$equals$3$Method, new Object[]{obj}, CGLIB$equals$3$Proxy);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return intercept == null ? false : ((Boolean) intercept).booleanValue();
    }

    public final void f() throws Throwable {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        if (methodInterceptor != null) {
            methodInterceptor.intercept(this, CGLIB$f$1$Method, CGLIB$emptyArgs, CGLIB$f$1$Proxy);
        } else {
            super.f();
        }
    }

    protected final void finalize() throws Throwable {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        if (methodInterceptor != null) {
            methodInterceptor.intercept(this, CGLIB$finalize$2$Method, CGLIB$emptyArgs, CGLIB$finalize$2$Proxy);
        } else {
            finalize();
        }
    }

    public final void g() throws Throwable {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        if (methodInterceptor != null) {
            methodInterceptor.intercept(this, CGLIB$g$0$Method, CGLIB$emptyArgs, CGLIB$g$0$Proxy);
        } else {
            g();
        }
    }

    public Callback getCallback(int i) {
        CGLIB$BIND_CALLBACKS(this);
        switch (i) {
            case 0:
                return this.CGLIB$CALLBACK_0;
            default:
                return null;
        }
    }

    public Callback[] getCallbacks() {
        CGLIB$BIND_CALLBACKS(this);
        return new Callback[]{this.CGLIB$CALLBACK_0};
    }

    public final int hashCode() {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        if (methodInterceptor == null) {
            return hashCode();
        }
        Object intercept = null;
        try {
            intercept = methodInterceptor.intercept(this, CGLIB$hashCode$5$Method, CGLIB$emptyArgs, CGLIB$hashCode$5$Proxy);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return intercept == null ? 0 : ((Number) intercept).intValue();
    }

    public Object newInstance(Callback callback) {
        CGLIB$SET_THREAD_CALLBACKS(new Callback[]{callback});
        Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 = new Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9();
        CGLIB$SET_THREAD_CALLBACKS(null);
        return test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9;
    }

    public Object newInstance(Class[] clsArr, Object[] objArr, Callback[] callbackArr) {
        CGLIB$SET_THREAD_CALLBACKS(callbackArr);
        switch (clsArr.length) {
            case 0:
                Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 = new Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9();
                CGLIB$SET_THREAD_CALLBACKS(null);
                return test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9;
            default:
                throw new IllegalArgumentException("Constructor not found");
        }
    }

    public Object newInstance(Callback[] callbackArr) {
        CGLIB$SET_THREAD_CALLBACKS(callbackArr);
        Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 = new Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9();
        CGLIB$SET_THREAD_CALLBACKS(null);
        return test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9;
    }

    public void setCallback(int i, Callback callback) {
        switch (i) {
            case 0:
                this.CGLIB$CALLBACK_0 = (MethodInterceptor) callback;
            default:
        }
    }

    public void setCallbacks(Callback[] callbackArr) {
        this.CGLIB$CALLBACK_0 = (MethodInterceptor) callbackArr[0];
    }

    public final String toString() {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        try {
            return methodInterceptor != null ? (String) methodInterceptor.intercept(this, CGLIB$toString$4$Method, CGLIB$emptyArgs, CGLIB$toString$4$Proxy) : toString();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return "";
        }
    }
}