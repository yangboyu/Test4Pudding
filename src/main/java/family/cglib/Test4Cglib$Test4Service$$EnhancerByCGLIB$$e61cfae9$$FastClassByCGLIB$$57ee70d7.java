package family.cglib;

import java.lang.reflect.InvocationTargetException;
import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.reflect.FastClass;

/* compiled from: <generated> */
public class Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9$$FastClassByCGLIB$$57ee70d7 extends FastClass {
    public Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9$$FastClassByCGLIB$$57ee70d7(Class cls) {
        super(cls);
    }

    public int getIndex(String str, Class[] clsArr) {
        switch (str.hashCode()) {
            case -2083498449:
                if (str.equals("CGLIB$finalize$2")) {
                    switch (clsArr.length) {
                        case 0:
                            return 8;
                        default:
                            break;
                    }
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    switch (clsArr.length) {
                        case 0:
                            return 1;
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
                                return 0;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            case -1053468136:
                if (str.equals("getCallbacks")) {
                    switch (clsArr.length) {
                        case 0:
                            return 21;
                        default:
                            break;
                    }
                }
                break;
            case -1039689911:
                if (str.equals("notify")) {
                    switch (clsArr.length) {
                        case 0:
                            return 27;
                        default:
                            break;
                    }
                }
                break;
            case -772027440:
                if (str.equals("CGLIB$f$1")) {
                    switch (clsArr.length) {
                        case 0:
                            return 7;
                        default:
                            break;
                    }
                }
                break;
            case -772026480:
                if (str.equals("CGLIB$g$0")) {
                    switch (clsArr.length) {
                        case 0:
                            return 6;
                        default:
                            break;
                    }
                }
                break;
            case -124978607:
                if (str.equals("CGLIB$equals$3")) {
                    switch (clsArr.length) {
                        case 1:
                            if (clsArr[0].getName().equals("java.lang.Object")) {
                                return 9;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            case -60403779:
                if (str.equals("CGLIB$SET_STATIC_CALLBACKS")) {
                    switch (clsArr.length) {
                        case 1:
                            if (clsArr[0].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
                                return 18;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            case -29025553:
                if (str.equals("CGLIB$hashCode$5")) {
                    switch (clsArr.length) {
                        case 0:
                            return 12;
                        default:
                            break;
                    }
                }
                break;
            case 102:
                if (str.equals("f")) {
                    switch (clsArr.length) {
                        case 0:
                            return 15;
                        default:
                            break;
                    }
                }
                break;
            case 103:
                if (str.equals("g")) {
                    switch (clsArr.length) {
                        case 0:
                            return 14;
                        default:
                            break;
                    }
                }
                break;
            case 3641717:
                if (str.equals("wait")) {
                    switch (clsArr.length) {
                        case 0:
                            return 25;
                        case 1:
                            if (clsArr[0].getName().equals("long")) {
                                return 24;
                            }
                            break;
                        case 2:
                            if (clsArr[0].getName().equals("long") && clsArr[1].getName().equals("int")) {
                                return 23;
                            }
                        default:
                            break;
                    }
                }
                break;
            case 85179481:
                if (str.equals("CGLIB$SET_THREAD_CALLBACKS")) {
                    switch (clsArr.length) {
                        case 1:
                            if (clsArr[0].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
                                return 19;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 147696667:
                if (str.equals("hashCode")) {
                    switch (clsArr.length) {
                        case 0:
                            return 2;
                        default:
                            break;
                    }
                }
                break;
            case 161998109:
                if (str.equals("CGLIB$STATICHOOK1")) {
                    switch (clsArr.length) {
                        case 0:
                            return 11;
                        default:
                            break;
                    }
                }
                break;
            case 495524492:
                if (str.equals("setCallbacks")) {
                    switch (clsArr.length) {
                        case 1:
                            if (clsArr[0].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
                                return 17;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 1154623345:
                if (str.equals("CGLIB$findMethodProxy")) {
                    switch (clsArr.length) {
                        case 1:
                            if (clsArr[0].getName().equals("net.sf.cglib.core.Signature")) {
                                return 22;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 1543336191:
                if (str.equals("CGLIB$toString$4")) {
                    switch (clsArr.length) {
                        case 0:
                            return 10;
                        default:
                            break;
                    }
                }
                break;
            case 1811874389:
                if (str.equals("newInstance")) {
                    switch (clsArr.length) {
                        case 1:
                            String name = clsArr[0].getName();
                            switch (name.hashCode()) {
                                case -845341380:
                                    if (name.equals("net.sf.cglib.proxy.Callback")) {
                                        return 4;
                                    }
                                    break;
                                case 1730110032:
                                    if (name.equals("[Lnet.sf.cglib.proxy.Callback;")) {
                                        return 3;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        case 3:
                            if (clsArr[0].getName().equals("[Ljava.lang.Class;") && clsArr[1].getName().equals("[Ljava.lang.Object;") && clsArr[2].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
                                return 5;
                            }
                        default:
                            break;
                    }
                }
                break;
            case 1817099975:
                if (str.equals("setCallback")) {
                    switch (clsArr.length) {
                        case 2:
                            if (clsArr[0].getName().equals("int") && clsArr[1].getName().equals("net.sf.cglib.proxy.Callback")) {
                                return 16;
                            }
                        default:
                            break;
                    }
                }
                break;
            case 1902066072:
                if (str.equals("notifyAll")) {
                    switch (clsArr.length) {
                        case 0:
                            return 28;
                        default:
                            break;
                    }
                }
                break;
            case 1905679803:
                if (str.equals("getCallback")) {
                    switch (clsArr.length) {
                        case 1:
                            if (clsArr[0].getName().equals("int")) {
                                return 20;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 1950568386:
                if (str.equals("getClass")) {
                    switch (clsArr.length) {
                        case 0:
                            return 26;
                        default:
                            break;
                    }
                }
                break;
            case 1951977612:
                if (str.equals("CGLIB$clone$6")) {
                    switch (clsArr.length) {
                        case 0:
                            return 13;
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
            case -2071771415:
                if (obj.equals("CGLIB$clone$6()Ljava/lang/Object;")) {
                    return 13;
                }
                break;
            case -2055565910:
                if (obj.equals("CGLIB$SET_THREAD_CALLBACKS([Lnet/sf/cglib/proxy/Callback;)V")) {
                    return 19;
                }
                break;
            case -1725733088:
                if (obj.equals("getClass()Ljava/lang/Class;")) {
                    return 26;
                }
                break;
            case -1663710620:
                if (obj.equals("CGLIB$equals$3(Ljava/lang/Object;)Z")) {
                    return 9;
                }
                break;
            case -1457535688:
                if (obj.equals("CGLIB$STATICHOOK1()V")) {
                    return 11;
                }
                break;
            case -1411783143:
                if (obj.equals("CGLIB$hashCode$5()I")) {
                    return 12;
                }
                break;
            case -1026001249:
                if (obj.equals("wait(JI)V")) {
                    return 23;
                }
                break;
            case -894172689:
                if (obj.equals("newInstance(Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;")) {
                    return 4;
                }
                break;
            case -623122092:
                if (obj.equals("CGLIB$findMethodProxy(Lnet/sf/cglib/core/Signature;)Lnet/sf/cglib/proxy/MethodProxy;")) {
                    return 22;
                }
                break;
            case -419626537:
                if (obj.equals("setCallbacks([Lnet/sf/cglib/proxy/Callback;)V")) {
                    return 17;
                }
                break;
            case 3078479:
                if (obj.equals("f()V")) {
                    return 15;
                }
                break;
            case 3108270:
                if (obj.equals("g()V")) {
                    return 14;
                }
                break;
            case 80444837:
                if (obj.equals("CGLIB$f$1()V")) {
                    return 7;
                }
                break;
            case 109044197:
                if (obj.equals("CGLIB$g$0()V")) {
                    return 6;
                }
                break;
            case 243996900:
                if (obj.equals("wait(J)V")) {
                    return 24;
                }
                break;
            case 560567118:
                if (obj.equals("setCallback(ILnet/sf/cglib/proxy/Callback;)V")) {
                    return 16;
                }
                break;
            case 811063227:
                if (obj.equals("newInstance([Ljava/lang/Class;[Ljava/lang/Object;[Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;")) {
                    return 5;
                }
                break;
            case 946854621:
                if (obj.equals("notifyAll()V")) {
                    return 28;
                }
                break;
            case 973717575:
                if (obj.equals("getCallbacks()[Lnet/sf/cglib/proxy/Callback;")) {
                    return 21;
                }
                break;
            case 1116248544:
                if (obj.equals("wait()V")) {
                    return 25;
                }
                break;
            case 1221173700:
                if (obj.equals("newInstance([Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;")) {
                    return 3;
                }
                break;
            case 1230699260:
                if (obj.equals("getCallback(I)Lnet/sf/cglib/proxy/Callback;")) {
                    return 20;
                }
                break;
            case 1365107430:
                if (obj.equals("CGLIB$finalize$2()V")) {
                    return 8;
                }
                break;
            case 1584330438:
                if (obj.equals("CGLIB$SET_STATIC_CALLBACKS([Lnet/sf/cglib/proxy/Callback;)V")) {
                    return 18;
                }
                break;
            case 1729170762:
                if (obj.equals("CGLIB$toString$4()Ljava/lang/String;")) {
                    return 10;
                }
                break;
            case 1826985398:
                if (obj.equals("equals(Ljava/lang/Object;)Z")) {
                    return 0;
                }
                break;
            case 1902039948:
                if (obj.equals("notify()V")) {
                    return 27;
                }
                break;
            case 1913648695:
                if (obj.equals("toString()Ljava/lang/String;")) {
                    return 1;
                }
                break;
            case 1984935277:
                if (obj.equals("hashCode()I")) {
                    return 2;
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
        return 28;
    }

    public Object invoke(int i, Object obj, Object[] objArr) throws InvocationTargetException {
        InvocationTargetException invocationTargetException;
        Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9 family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9 = (Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9) obj;
        switch (i) {
            case 0:
                try {
                    return new Boolean(family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.equals(objArr[0]));
                } catch (Throwable th) {
                    invocationTargetException = new InvocationTargetException(th);
                }
            case 1:
                return family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.toString();
            case 2:
                return new Integer(family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.hashCode());
            case 3:
                return family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.newInstance((Callback[]) objArr[0]);
            case 4:
                return family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.newInstance((Callback) objArr[0]);
            case 5:
                return family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.newInstance((Class[]) objArr[0], (Object[]) objArr[1], (Callback[]) objArr[2]);
            case 6:
                try {
                    family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$g$0();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return null;
            case 7:
                try {
                    family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$f$1();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return null;
            case 8:
                try {
                    family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$finalize$2();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return null;
            case 9:
                return new Boolean(family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$equals$3(objArr[0]));
            case 10:
                return family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$toString$4();
            case 11:
                family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$STATICHOOK1();
                return null;
            case 12:
                return new Integer(family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$hashCode$5());
            case 13:
                try {
                    return family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$clone$6();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            case 14:
                try {
                    family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.g();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return null;
            case 15:
                try {
                    family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.f();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return null;
            case 16:
                family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.setCallback(((Number) objArr[0]).intValue(), (Callback) objArr[1]);
                return null;
            case 17:
                family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.setCallbacks((Callback[]) objArr[0]);
                return null;
            case 18:
                family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$SET_STATIC_CALLBACKS((Callback[]) objArr[0]);
                return null;
            case 19:
                family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$SET_THREAD_CALLBACKS((Callback[]) objArr[0]);
                return null;
            case 20:
                return family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.getCallback(((Number) objArr[0]).intValue());
            case 21:
                return family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.getCallbacks();
            case 22:
                return family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.CGLIB$findMethodProxy((Signature) objArr[0]);
            case 23:
                try {
                    family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.wait(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            case 24:
                try {
                    family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.wait(((Number) objArr[0]).longValue());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            case 25:
                try {
                    family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            case 26:
                return family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.getClass();
            case 27:
                family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.notify();
                return null;
            case 28:
                family_cglib_Test4Cglib_Test4Service__EnhancerByCGLIB__e61cfae9.notifyAll();
                return null;
            default:
                throw new IllegalArgumentException("Cannot find matching method/constructor");
        }
    }

    public Object newInstance(int i, Object[] objArr) throws InvocationTargetException {
        switch (i) {
            case 0:
                try {
                    return new Test4Cglib$Test4Service$$EnhancerByCGLIB$$e61cfae9();
                } catch (Throwable th) {
                    InvocationTargetException invocationTargetException = new InvocationTargetException(th);
                }
            default:
                throw new IllegalArgumentException("Cannot find matching method/constructor");
        }
    }
}