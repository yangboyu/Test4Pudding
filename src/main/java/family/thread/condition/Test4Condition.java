package family.thread.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yangboyu on 2018/3/11.
 */
public class Test4Condition {
    public static void main(String[] args) throws InterruptedException {
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition condition = reentrantLock.newCondition();

        Thread thread = new Thread(new Runnable()   {
            public void run() {
                try {
                    reentrantLock.lock();
                    System.out.println("我要等一个新信号" + this);
                    condition.await();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("拿到一个信号！！" + this);
                reentrantLock.unlock();
            }
        }, "waitThread1");

        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                reentrantLock.lock();
                System.out.println("我拿到锁了");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                condition.signalAll();
                System.out.println("我发了一个信号！！");
                reentrantLock.unlock();
            }

        }, "signalThread");

        thread1.start();
    }
}
