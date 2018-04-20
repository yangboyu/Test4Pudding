package family.thread.blockqueue;

import java.util.concurrent.*;

/**
 * Created by yangboyu on 2018/3/12.
 */
public class Test4BlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>(2);
        arrayBlockingQueue.offer(1, 5, TimeUnit.SECONDS);
        arrayBlockingQueue.offer(2, 5, TimeUnit.SECONDS);
        System.out.println(arrayBlockingQueue.peek());
        arrayBlockingQueue.offer(3, 5, TimeUnit.SECONDS);
        System.out.println("-------");
        for (Integer i : arrayBlockingQueue){
            System.out.println(i);
        }

        System.out.println(arrayBlockingQueue.size());
        System.out.println("-------");


//        // 声明一个容量为10的缓存队列
//        BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10);
//
//        Test4BlockingQueueProducer producer1 = new Test4BlockingQueueProducer(queue);
//        Test4BlockingQueueProducer producer2 = new Test4BlockingQueueProducer(queue);
//        Test4BlockingQueueProducer producer3 = new Test4BlockingQueueProducer(queue);
//        Test4BlockingQueueConsumer consumer = new Test4BlockingQueueConsumer(queue);
//
//        // 借助Executors
//        ExecutorService service = Executors.newCachedThreadPool();
//        // 启动线程
//        service.execute(producer1);
//        service.execute(producer2);
//        service.execute(producer3);
//        service.execute(consumer);
//
//        // 执行10s
//        Thread.sleep(10 * 1000);
//        producer1.stop();
//        producer2.stop();
//        producer3.stop();
//
//        Thread.sleep(2000);
//        // 退出Executor
//        service.shutdown();
    }

}
