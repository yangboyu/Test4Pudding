package family.thread.reentrant;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by yangboyu on 2018/3/9.
 */
public class Test4ReentrantReadWriteLock {

    private static Map<String, Object> data = new HashMap<>();
    private static ReadWriteLock lock = new ReentrantReadWriteLock(false);
    private static Lock rlock = lock.readLock();
    private static Lock wlock = lock.writeLock();

    public static void main(String[] args){
        System.out.println((7 << 16) >>> 16);
        System.out.println(2 >>> 16);
        System.out.println(3 >>> 16);
        System.out.println(4 >>> 16);
        System.out.println(5 >>> 16);
        System.out.println(6 >>> 16);
        System.out.println(7 >>> 16);
        System.out.println(8 >>> 16);
    }

    public static Object get(String key) {

        rlock.lock();
        try {
            return data.get(key);
        } finally {
            rlock.unlock();
        }
    }

    public static Object put(String key, Object value) {
        wlock.lock();
        try {
            return data.put(key, value);
        } finally {
            wlock.unlock();
        }
    }


}
