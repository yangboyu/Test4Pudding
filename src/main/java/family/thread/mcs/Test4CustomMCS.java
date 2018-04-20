package family.thread.mcs;

import family.thread.clh.ClhSpinLock;

/**
 * Created by yangboyu on 2018/3/6.
 */
public class Test4CustomMCS {
    public static void main(String[] args) throws InterruptedException {
        final MCSLock lock = new MCSLock();
//        lock.lock();
//
//        System.out.println(Thread.currentThread().getId() + " acquired the lock!");
//        Thread.sleep(1200);
//        lock.unlock();
//        System.out.println(Thread.currentThread().getId() + " acquired the unlock!");

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    System.out.println(Thread.currentThread().getId() + " acquired the lock!");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }System.out.println(Thread.currentThread().getId() + " acquired the unlock!");
                    lock.unlock();
                }
            }).start();
            Thread.sleep(100);
        }

//        System.out.println("main thread unlock!");
//        lock.unlock();
    }

}
