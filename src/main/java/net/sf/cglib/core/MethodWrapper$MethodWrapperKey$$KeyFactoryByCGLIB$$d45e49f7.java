package net.sf.cglib.core;

import net.sf.cglib.core.MethodWrapper.MethodWrapperKey;

/* compiled from: <generated> */
public class MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7 extends KeyFactory implements MethodWrapperKey {
    private final String FIELD_0;
    private final String[] FIELD_1;
    private final String FIELD_2;

    public MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7(String str, String[] strArr, String str2) {
        this.FIELD_0 = str;
        this.FIELD_1 = strArr;
        this.FIELD_2 = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7)) {
            return false;
        }
        String str = this.FIELD_0;
        String str2 = ((MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7) obj).FIELD_0;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (str == null || !str.equals(str2)) {
            return false;
        }
        String[] strArr = this.FIELD_1;
        String[] strArr2 = ((MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7) obj).FIELD_1;
        if (strArr2 == null) {
            if (strArr != null) {
                return false;
            }
        } else if (strArr == null || strArr2.length != strArr.length) {
            return false;
        } else {
            for (int i = 0; i < strArr2.length; i++) {
                Object obj2 = strArr2[i];
                Object obj3 = strArr[i];
                if (obj3 == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (obj2 == null || !obj2.equals(obj3)) {
                    return false;
                }
            }
        }
        str2 = this.FIELD_2;
        str = ((MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7) obj).FIELD_2;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (str2 == null || !str2.equals(str)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        String str = this.FIELD_0;
        int hashCode = (str != null ? str.hashCode() : 0) - 1953967065;
        String[] strArr = this.FIELD_1;
        if (strArr != null) {
            for (Object obj : strArr) {
                hashCode = (obj != null ? obj.hashCode() : 0) + (hashCode * 362693231);
            }
        }
        String str2 = this.FIELD_2;
        hashCode *= 362693231;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public Object newInstance(String str, String[] strArr, String str2) {
        return new MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7(str, strArr, str2);
    }

    public String toString() {
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
        str = this.FIELD_2;
        return (str != null ? stringBuffer.append(str.toString()) : stringBuffer.append("null")).toString();
    }
}