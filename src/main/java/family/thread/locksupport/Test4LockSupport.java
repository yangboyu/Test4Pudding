package family.thread.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * Created by yangboyu on 2018/3/7.
 */
public class Test4LockSupport {
    public static void main(String[] args) throws InterruptedException {
        Test4LockSupport test4LockSupport = new Test4LockSupport();
        test4LockSupport.test();
    }

    private void test() throws InterruptedException {
        ThreadA thread = new ThreadA();
        thread.start();

        System.out.println("b");
        Thread.sleep(5000);
        LockSupport.unpark(thread);//释放许可
    }

    class ThreadA extends  Thread {
        @Override
        public void run() {
            System.out.println(String.format("%s,begin", Thread.currentThread().getName()));

            LockSupport.park();

            System.out.println(String.format("%s,end", Thread.currentThread().getName()));
        }
    }
}
