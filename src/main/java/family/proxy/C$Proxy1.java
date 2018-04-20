package family.proxy;

import family.proxy.Test4Proxy.IProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/* renamed from: family.proxy.$Proxy1 */
public final class C$Proxy1 extends Proxy implements IProxy {
    private static Method m0;
    private static Method m1;
    private static Method m2;
    private static Method m3;
    private static Method m4;

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[]{Class.forName("java.lang.Object")});
            m3 = Class.forName("family.proxy.Test4Proxy$IProxy").getMethod("test1", new Class[0]);
            m4 = Class.forName("family.proxy.Test4Proxy$IProxy").getMethod("test1", new Class[]{Class.forName("java.lang.Integer"), Class.forName("java.lang.Integer")});
            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
        } catch (Throwable e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }

    public C$Proxy1(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    public final boolean equals(Object obj) {
        RuntimeException e;
        try {
            return ((Boolean) this.h.invoke(this, m1, new Object[]{obj})).booleanValue();
        } catch (RuntimeException e2) {
            e = e2;
            throw e;
        } catch (Throwable th) {
            UndeclaredThrowableException undeclaredThrowableException = new UndeclaredThrowableException(th);
        }

        return false;
    }

    public final int hashCode() {
        RuntimeException e;
        try {
            return ((Integer) this.h.invoke(this, m0, null)).intValue();
        } catch (RuntimeException e2) {
            e = e2;
            throw e;
        } catch (Throwable th) {
            UndeclaredThrowableException undeclaredThrowableException = new UndeclaredThrowableException(th);
        }

        return 0;
    }

    public final void test1() {
        RuntimeException e;
        try {
            this.h.invoke(this, m3, null);
        } catch (RuntimeException e2) {
            e = e2;
            throw e;
        } catch (Throwable th) {
            UndeclaredThrowableException undeclaredThrowableException = new UndeclaredThrowableException(th);
        }
    }

    public final void test1(Integer num, Integer num2) {
        RuntimeException e;
        try {
            this.h.invoke(this, m4, new Object[]{num, num2});
        } catch (RuntimeException e2) {
            e = e2;
            throw e;
        } catch (Throwable th) {
            UndeclaredThrowableException undeclaredThrowableException = new UndeclaredThrowableException(th);
        }
    }

    public final String toString() {
        RuntimeException e;
        try {
            return (String) this.h.invoke(this, m2, null);
        } catch (RuntimeException e2) {
            e = e2;
            throw e;
        } catch (Throwable th) {
            UndeclaredThrowableException undeclaredThrowableException = new UndeclaredThrowableException(th);
        }

        return "";
    }
}