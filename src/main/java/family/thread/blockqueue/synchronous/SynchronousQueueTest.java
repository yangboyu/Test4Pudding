package family.thread.blockqueue.synchronous;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by yangboyu on 2018/4/4.
 */
public class SynchronousQueueTest {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        SynchronousQueue<Object> queue = new SynchronousQueue<Object>();
        for (int i = 0; i < 2; i++) {
            Thread t = new SQThread(queue, 1);
            t.start();
        }
        Thread.sleep(1000111);
        for (int i = 0; i < 1; i++) {
            if (!queue.offer(new Object())) {
                System.out.println("Failure");
            }
        }
    }

    public static class SQThread extends Thread {
        private SynchronousQueue<Object> queue;
        int mode;

        SQThread(SynchronousQueue<Object> queue, int mode) {
            this.queue = queue;
            this.mode = mode;
        }

        @Override
        public void run() {
            Object item = null;
            try {
                System.out.println(Thread.currentThread().getId());
                if (mode == 1) {
                    if((item = queue.take()) != null){
                        System.out.println(item.toString());
                    }
//                    while ((item = queue.take()) != null) {
//                        System.out.println(item.toString());
//                    }
                } else {
                    //
                }
            } catch (Exception e) {
                //
            }
            System.out.println("end");
        }
    }
}