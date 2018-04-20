package family.entity;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by yangboyu on 2018/1/27.
 */
public class TestAtomicInteger {
    public static void main(String[] args) throws InterruptedException {

//        ThreadLocal

        AtomicReference atomicReference = new AtomicReference();

        AtomicInteger integer = new AtomicInteger();
        integer.incrementAndGet();

        AtomicBoolean atomicBoolean = new AtomicBoolean();
//        TestAtomicInteger.run();
    }

    private static void run() throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(30);
        final AtomicInteger atomicInteger = new AtomicInteger();
        for(int count = 0; count < 30; count++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        atomicInteger.incrementAndGet();
                    }
                    countDownLatch.countDown();
                }
            });
            t.start();
        }

        countDownLatch.await();
        System.out.println(atomicInteger.get());
    }
}
