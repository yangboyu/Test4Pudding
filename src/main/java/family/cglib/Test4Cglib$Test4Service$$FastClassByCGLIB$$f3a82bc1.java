package family.cglib;

import family.cglib.Test4Cglib.Test4Service;
import java.lang.reflect.InvocationTargetException;
import net.sf.cglib.core.Signature;
import net.sf.cglib.reflect.FastClass;

/* compiled from: <generated> */
public class Test4Cglib$Test4Service$$FastClassByCGLIB$$f3a82bc1 extends FastClass {
    public Test4Cglib$Test4Service$$FastClassByCGLIB$$f3a82bc1(Class cls) {
        super(cls);
    }

    public int getIndex(String str, Class[] clsArr) {
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    switch (clsArr.length) {
                        case 0:
                            return 6;
                        default:
                            break;
                    }
                }
                break;
            case -1295482945:
                if (str.equals("equals")) {
                    switch (clsArr.length) {
                        case 1:
                            if (clsArr[0].getName().equals("java.lang.Object")) {
                                return 5;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            case -1039689911:
                if (str.equals("notify")) {
                    switch (clsArr.length) {
                        case 0:
                            return 9;
                        default:
                            break;
                    }
                }
                break;
            case 102:
                if (str.equals("f")) {
                    switch (clsArr.length) {
                        case 0:
                            return 1;
                        default:
                            break;
                    }
                }
                break;
            case 103:
                if (str.equals("g")) {
                    switch (clsArr.length) {
                        case 0:
                            return 0;
                        default:
                            break;
                    }
                }
                break;
            case 3641717:
                if (str.equals("wait")) {
                    switch (clsArr.length) {
                        case 0:
                            return 4;
                        case 1:
                            if (clsArr[0].getName().equals("long")) {
                                return 3;
                            }
                            break;
                        case 2:
                            if (clsArr[0].getName().equals("long") && clsArr[1].getName().equals("int")) {
                                return 2;
                            }
                        default:
                            break;
                    }
                }
                break;
            case 147696667:
                if (str.equals("hashCode")) {
                    switch (clsArr.length) {
                        case 0:
                            return 7;
                        default:
                            break;
                    }
                }
                break;
            case 1902066072:
                if (str.equals("notifyAll")) {
                    switch (clsArr.length) {
                        case 0:
                            return 10;
                        default:
                            break;
                    }
                }
                break;
            case 1950568386:
                if (str.equals("getClass")) {
                    switch (clsArr.length) {
                        case 0:
                            return 8;
                        default:
                            break;
                    }
                }
                break;
        }
        return -1;
    }

    public int getIndex(Signature signature) {
        String obj = signature.toString();
        switch (obj.hashCode()) {
            case -1725733088:
                if (obj.equals("getClass()Ljava/lang/Class;")) {
                    return 8;
                }
                break;
            case -1026001249:
                if (obj.equals("wait(JI)V")) {
                    return 2;
                }
                break;
            case 3078479:
                if (obj.equals("f()V")) {
                    return 1;
                }
                break;
            case 3108270:
                if (obj.equals("g()V")) {
                    return 0;
                }
                break;
            case 243996900:
                if (obj.equals("wait(J)V")) {
                    return 3;
                }
                break;
            case 946854621:
                if (obj.equals("notifyAll()V")) {
                    return 10;
                }
                break;
            case 1116248544:
                if (obj.equals("wait()V")) {
                    return 4;
                }
                break;
            case 1826985398:
                if (obj.equals("equals(Ljava/lang/Object;)Z")) {
                    return 5;
                }
                break;
            case 1902039948:
                if (obj.equals("notify()V")) {
                    return 9;
                }
                break;
            case 1913648695:
                if (obj.equals("toString()Ljava/lang/String;")) {
                    return 6;
                }
                break;
            case 1984935277:
                if (obj.equals("hashCode()I")) {
                    return 7;
                }
                break;
        }
        return -1;
    }

    public int getIndex(Class[] clsArr) {
        switch (clsArr.length) {
            case 0:
                return 0;
            default:
                return -1;
        }
    }

    public int getMaxIndex() {
        return 10;
    }

    public Object invoke(int i, Object obj, Object[] objArr) throws InvocationTargetException {
        InvocationTargetException invocationTargetException;
        Test4Service test4Service = (Test4Service) obj;
        switch (i) {
            case 0:
                try {
                    test4Service.g();
                    return null;
                } catch (Throwable th) {
                    invocationTargetException = new InvocationTargetException(th);
                }
            case 1:
                try {
                    test4Service.f();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return null;
            case 2:
                try {
                    test4Service.wait(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            case 3:
                try {
                    test4Service.wait(((Number) objArr[0]).longValue());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            case 4:
                try {
                    test4Service.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            case 5:
                return new Boolean(test4Service.equals(objArr[0]));
            case 6:
                return test4Service.toString();
            case 7:
                return new Integer(test4Service.hashCode());
            case 8:
                return test4Service.getClass();
            case 9:
                test4Service.notify();
                return null;
            case 10:
                test4Service.notifyAll();
                return null;
            default:
                throw new IllegalArgumentException("Cannot find matching method/constructor");
        }
    }

    public Object newInstance(int i, Object[] objArr) throws InvocationTargetException {
        switch (i) {
            case 0:
                try {
                    return new Test4Service();
                } catch (Throwable th) {
                    InvocationTargetException invocationTargetException = new InvocationTargetException(th);
                }
            default:
                throw new IllegalArgumentException("Cannot find matching method/constructor");
        }
    }
}