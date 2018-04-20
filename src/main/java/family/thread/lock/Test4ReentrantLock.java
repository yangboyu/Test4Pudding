package family.thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yangboyu on 2018/3/9.
 */
public class Test4ReentrantLock {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunIt());
        Thread t2 = new Thread(new RunIt());

        t1.start();
        t2.start();
        t2.interrupt();

    }
}

class RunIt implements Runnable{

    private static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            runJob();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" Interrrupted from runJob.");
        }
    }

    private void runJob() throws InterruptedException{
        lock.lock();
        System.out.println(Thread.currentThread().getName()+" 到此一游....");
        try{
            System.out.println(Thread.currentThread().getName() + " running");
            TimeUnit.SECONDS.sleep(3);
            System.out.println(Thread.currentThread().getName() + " finished");

        }catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }finally{
            lock.unlock();
        }
    }
}
