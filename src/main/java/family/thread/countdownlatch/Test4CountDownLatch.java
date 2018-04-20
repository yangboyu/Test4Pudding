package family.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by yangboyu on 2018/3/6.
 */
public class Test4CountDownLatch {
    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);

        new Thread() {
            public void run() {
                try {
                    System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
                    latch.countDown();
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

//        new Thread() {
//            public void run() {
//                try {
//                    System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
//                    Thread.sleep(4000);
//                    System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
//                    latch.countDown();
//                    latch.countDown();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }.start();


        new Thread() {
            public void run() {
                try {

                    latch.await();
                    System.out.println("子线程" + Thread.currentThread().getName() + " await1 正在执行");
                    Thread.sleep(4000);
                    System.out.println("子线程" + Thread.currentThread().getName() + " await1 执行完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();



        new Thread() {
            public void run() {
                try {
                    latch.await();
                    System.out.println("子线程" + Thread.currentThread().getName() + " await2 正在执行");
                    Thread.sleep(5000);
                    System.out.println("子线程" + Thread.currentThread().getName() + " await2 执行完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        try {
            latch.await();
            System.out.println("2个子线程已经执行完毕");
            System.out.println("继续执行主线程");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}