package family.thread.clh;

/**
 * Created by yangboyu on 2018/3/6.
 */
public class Test4CustomCLH {
    public static void main(String[] args) throws InterruptedException {
        final ClhSpinLock lock = new ClhSpinLock();
//        lock.lock();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    System.out.println(Thread.currentThread().getId() + " acquired the lock!");
                    try {
                        Thread.sleep(1100);
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
