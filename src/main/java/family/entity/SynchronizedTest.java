package family.entity;

/**
 * Created by yangboyu on 2018/1/27.
 */
public class SynchronizedTest {
    public synchronized void test1(){

    }

    public void test2(){
        synchronized (this){

        }
    }
}
