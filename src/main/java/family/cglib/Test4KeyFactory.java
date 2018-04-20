package family.cglib;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.core.KeyFactory;

/**
 * Created by yangboyu on 2018/2/11.
 */
public class Test4KeyFactory {

    public interface MyFactory {
        public Object newInstance(int a);
    }
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/yangboyu/work/temp/");


        MyFactory f = (MyFactory)KeyFactory.create(MyFactory.class);
        Object key1 = f.newInstance(20);
        Object key2 = f.newInstance(20);
        Object key3 = f.newInstance(21);
        System.out.println(key1.equals(key2));
        System.out.println(key1.toString());
        System.out.println(key2.equals(key3));
    }
}
