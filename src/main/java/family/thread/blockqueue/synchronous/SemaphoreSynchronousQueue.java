package family.thread.blockqueue.synchronous;

import java.util.concurrent.Semaphore;

/**
 * Created by yangboyu on 2018/4/4.
 */
public class SemaphoreSynchronousQueue<E> {
    E item = null;
    Semaphore sync = new Semaphore(0);
    Semaphore send = new Semaphore(1);
    Semaphore recv = new Semaphore(0);

    public E take() throws InterruptedException {
        recv.acquire();
        E x = item;
        sync.release();
        send.release();
        return x;
    }

    public void put(E x) throws InterruptedException {
        send.acquire();
        item = x;
        recv.release();
        sync.acquire();
    }

    public static void main(String[] args) throws InterruptedException {
        SemaphoreSynchronousQueue<Integer> semaphoreSynchronousQueue = new SemaphoreSynchronousQueue<>();
        semaphoreSynchronousQueue.put(1);
        System.out.println("------end------");
    }
}

