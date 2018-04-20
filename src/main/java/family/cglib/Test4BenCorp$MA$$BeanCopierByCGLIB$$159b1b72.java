package family.cglib;

import family.cglib.Test4BeanCorp.MA;
import net.sf.cglib.beans.BeanCopier;
import net.sf.cglib.core.Converter;

/* compiled from: <generated> */
public class Test4BenCorp$MA$$BeanCopierByCGLIB$$159b1b72 extends BeanCopier {
    public void copy(Object obj, Object obj2, Converter converter) {
        MA ma = (MA) obj2;
        MA ma2 = (MA) obj;
        ma.setBooleanP(ma2.isBooleanP());
        ma.setByteP(ma2.getByteP());
        ma.setCharP(ma2.getCharP());
        ma.setDoubleP(ma2.getDoubleP());
        ma.setFloatP(ma2.getFloatP());
        ma.setId(ma2.getId());
        ma.setIntP(ma2.getIntP());
        ma.setLongP(ma2.getLongP());
        ma.setName(ma2.getName());
        ma.setShortP(ma2.getShortP());
        ma.setStringP(ma2.getStringP());
    }
}