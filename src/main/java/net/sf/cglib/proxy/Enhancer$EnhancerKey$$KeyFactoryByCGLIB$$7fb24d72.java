package net.sf.cglib.proxy;

import net.sf.cglib.core.KeyFactory;
import net.sf.cglib.proxy.Enhancer.EnhancerKey;
import org.objectweb.asm.Type;

/* compiled from: <generated> */
public class Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72 extends KeyFactory implements EnhancerKey {
    private final String FIELD_0;
    private final String[] FIELD_1;
    private final CallbackFilter FIELD_2;
    private final Type[] FIELD_3;
    private final boolean FIELD_4;
    private final boolean FIELD_5;
    private final Long FIELD_6;

    public Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72(String str, String[] strArr, CallbackFilter callbackFilter, Type[] typeArr, boolean z, boolean z2, Long l) {
        this.FIELD_0 = str;
        this.FIELD_1 = strArr;
        this.FIELD_2 = callbackFilter;
        this.FIELD_3 = typeArr;
        this.FIELD_4 = z;
        this.FIELD_5 = z2;
        this.FIELD_6 = l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72)) {
            return false;
        }
        int i;
        Object obj2;
        Object obj3;
        String str = this.FIELD_0;
        String str2 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72) obj).FIELD_0;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (str == null || !str.equals(str2)) {
            return false;
        }
        String[] strArr = this.FIELD_1;
        String[] strArr2 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72) obj).FIELD_1;
        if (strArr2 == null) {
            if (strArr != null) {
                return false;
            }
        } else if (strArr == null || strArr2.length != strArr.length) {
            return false;
        } else {
            for (i = 0; i < strArr2.length; i++) {
                obj2 = strArr2[i];
                obj3 = strArr[i];
                if (obj3 == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (obj2 == null || !obj2.equals(obj3)) {
                    return false;
                }
            }
        }
        CallbackFilter callbackFilter = this.FIELD_2;
        CallbackFilter callbackFilter2 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72) obj).FIELD_2;
        if (callbackFilter2 == null) {
            if (callbackFilter != null) {
                return false;
            }
        } else if (callbackFilter == null || !callbackFilter.equals(callbackFilter2)) {
            return false;
        }
        Type[] typeArr = this.FIELD_3;
        Type[] typeArr2 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72) obj).FIELD_3;
        if (typeArr2 == null) {
            if (typeArr != null) {
                return false;
            }
        } else if (typeArr == null || typeArr2.length != typeArr.length) {
            return false;
        } else {
            for (i = 0; i < typeArr2.length; i++) {
                obj2 = typeArr2[i];
                obj3 = typeArr[i];
                if (obj3 == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (obj2 == null || !obj2.equals(obj3)) {
                    return false;
                }
            }
        }
        if (this.FIELD_4 != ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72) obj).FIELD_4 || this.FIELD_5 != ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72) obj).FIELD_5) {
            return false;
        }
        Long l = this.FIELD_6;
        Long l2 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72) obj).FIELD_6;
        if (l2 == null) {
            if (l != null) {
                return false;
            }
        } else if (l == null || !l.equals(l2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        String str = this.FIELD_0;
        int hashCode = (str != null ? str.hashCode() : 0) - 762841957;
        String[] strArr = this.FIELD_1;
        if (strArr != null) {
            for (Object obj : strArr) {
                hashCode = (obj != null ? obj.hashCode() : 0) + (hashCode * 69403);
            }
        }
        CallbackFilter callbackFilter = this.FIELD_2;
        hashCode = (callbackFilter != null ? callbackFilter.hashCode() : 0) + (hashCode * 69403);
        Type[] typeArr = this.FIELD_3;
        if (typeArr != null) {
            for (Object obj2 : typeArr) {
                hashCode = (obj2 != null ? obj2.hashCode() : 0) + (hashCode * 69403);
            }
        }
        hashCode = (((hashCode * 69403) + ((this.FIELD_4 ? 1 : 0) ^ 1)) * 69403) + ((this.FIELD_5 ? 1 : 0) ^ 1);
        Long l = this.FIELD_6;
        hashCode *= 69403;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public Object newInstance(String str, String[] strArr, CallbackFilter callbackFilter, Type[] typeArr, boolean z, boolean z2, Long l) {
        return new Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72(str, strArr, callbackFilter, typeArr, z, z2, l);
    }

    public String toString() {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.FIELD_0;
        stringBuffer = (str != null ? stringBuffer.append(str.toString()) : stringBuffer.append("null")).append(", ");
        String[] strArr = this.FIELD_1;
        if (strArr != null) {
            stringBuffer = stringBuffer.append("{");
            for (Object obj : strArr) {
                stringBuffer = (obj != null ? stringBuffer.append(obj.toString()) : stringBuffer.append("null")).append(", ");
            }
            stringBuffer.setLength(stringBuffer.length() - 2);
            stringBuffer = stringBuffer.append("}");
        } else {
            stringBuffer = stringBuffer.append("null");
        }
        stringBuffer = stringBuffer.append(", ");
        CallbackFilter callbackFilter = this.FIELD_2;
        stringBuffer = (callbackFilter != null ? stringBuffer.append(callbackFilter.toString()) : stringBuffer.append("null")).append(", ");
        Type[] typeArr = this.FIELD_3;
        if (typeArr != null) {
            stringBuffer = stringBuffer.append("{");
            while (i < typeArr.length) {
                Object obj2 = typeArr[i];
                stringBuffer = (obj2 != null ? stringBuffer.append(obj2.toString()) : stringBuffer.append("null")).append(", ");
                i++;
            }
            stringBuffer.setLength(stringBuffer.length() - 2);
            stringBuffer = stringBuffer.append("}");
        } else {
            stringBuffer = stringBuffer.append("null");
        }
        stringBuffer = stringBuffer.append(", ").append(this.FIELD_4).append(", ").append(this.FIELD_5).append(", ");
        Long l = this.FIELD_6;
        return (l != null ? stringBuffer.append(l.toString()) : stringBuffer.append("null")).toString();
    }
}