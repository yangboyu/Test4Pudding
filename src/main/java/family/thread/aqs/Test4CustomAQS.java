package family.thread.aqs;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * Created by yangboyu on 2018/3/7.
 */
public class Test4CustomAQS {
    static Test4CustomAQS tool = new Test4CustomAQS(2);
    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    tool.acquireLock(1);
                    System.out.println(Thread.currentThread().getId() + " acquired the lock!");
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    System.out.println(Thread.currentThread().getId() + " acquired the unlock!");
                    tool.release(1);
                }
            }).start();
            Thread.sleep(100);
        }
    }


    private MzzSync mzzSync;

    public Test4CustomAQS(int lockNum) {
        mzzSync = new MzzSync(lockNum);
    }

    /**
     * 获取当前还剩余的锁
     *
     * @return
     */
    public int getLockNum() {
        return mzzSync.getLockNum();
    }

    public void acquireLock(int num) {
        mzzSync.acquireShared(num);
    }


    public void release(int num) {
        mzzSync.releaseShared(num);
    }

    private static class MzzSync extends AbstractQueuedSynchronizer {
        public MzzSync(int lockNum) {
            setState(lockNum);
        }

        public int getLockNum() {
            return getState();
        }

        @Override
        protected final int tryAcquireShared(int lockNum) {
            for (; ; ) {
                int available = getState();
                int remaining = available - lockNum;
                if (remaining < 0 ||
                        compareAndSetState(available, remaining))
                    return remaining;
            }
        }

        protected final boolean tryReleaseShared(int lockNum) {
            for (; ; ) {
                int current = getState();
                int next = current + lockNum;

                if (compareAndSetState(current, next))
                    return true;

            }
        }
    }
}
