package family.cglib;

import net.sf.cglib.beans.BeanCopier;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.io.ObjectStreamException;
import java.lang.reflect.Method;

/**
 * Created by yangboyu on 2018/2/11.
 */
public class Test4BeanCorp {
    static class MA {
        private Long id;
        private String name;
        private String privateName;
        private int intP;
        private long longP;
        private boolean booleanP;
        private char charP;
        private byte byteP;
        private short shortP;
        private float floatP;
        private double doubleP;
        private String stringP;
        public  String publicField;

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return null;
        }

        /* package */ String getPrivateName() {
            return privateName;
        }

        /* package */ void setPrivateName(String name) {
            this.privateName = name;
        }

        public int getIntP() {
            return this.intP;
        }

        public void setIntP(int intP) {
            this.intP = intP;
        }

        public long getLongP() {
            return this.longP;
        }

        public void setLongP(long longP) {
            this.longP = longP;
        }

        public boolean isBooleanP() {
            return this.booleanP;
        }

        public void setBooleanP(boolean booleanP) {
            this.booleanP = booleanP;
        }

        public char getCharP() {
            return this.charP;
        }

        public void setCharP(char charP) {
            this.charP = charP;
        }

        public byte getByteP() {
            return this.byteP;
        }

        public void setByteP(byte byteP) {
            this.byteP = byteP;
        }

        public short getShortP() {
            return this.shortP;
        }

        public void setShortP(short shortP) {
            this.shortP = shortP;
        }

        public float getFloatP() {
            return this.floatP;
        }

        public void setFloatP(float floatP) {
            this.floatP = floatP;
        }

        public double getDoubleP() {
            return this.doubleP;
        }

        public void setDoubleP(double doubleP) {
            this.doubleP = doubleP;
        }

        public String getStringP() {
            return this.stringP;
        }

        public void setStringP(String stringP) {
            this.stringP = stringP;
        }
    }

    public static void main(String[] args) throws Throwable {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/yangboyu/work/temp/");

        BeanCopier copier = BeanCopier.create(MA.class, MA.class, false);
        MA bean1 = new MA();
        bean1.setIntP(42);
        MA bean2 = new MA();
        copier.copy(bean1, bean2, null);

//        Test4BenCorp$MA$$BeanCopierByCGLIB$$159b1b72 test4BenCorp$MA$$BeanCopierByCGLIB$$159b1b72 = new Test4BenCorp$MA$$BeanCopierByCGLIB$$159b1b72();
//        test4BenCorp$MA$$BeanCopierByCGLIB$$159b1b72.copy(bean1, bean2, null);

        System.out.println(bean1.hashCode());

        System.out.println(bean1.getIntP());
        System.out.println(bean2.getIntP());
    }
}
