package family.thread.mcs;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by yangboyu on 2018/3/7.
 */
public class MCSLock   {
    AtomicReference<QNode> tail = new AtomicReference<QNode>(null);
    ThreadLocal<QNode> node;

    public MCSLock() {
        this.node = new ThreadLocal<QNode>() {
            protected QNode initialValue() {
                return new QNode();
            }
        };
    }

    public void lock() {
        final QNode qnode = node.get();
        QNode pred = tail.getAndSet(qnode);
        if (pred != null) {
            qnode.locked = true;
            pred.next = qnode;

            // wait until predecessor gives up the lock
            while (qnode.locked) {
            }
        }
    }

    public void unlock() {
        final QNode qnode = node.get();
        if (qnode.next == null) {
            if (tail.compareAndSet(qnode, null))
                return;

            // wait until predecessor fills in its next field
            while (qnode.next == null) {
            }
        }
        qnode.next.locked = false;
        qnode.next = null;
    }

    class QNode {
        volatile boolean locked = false;
        QNode next = null;
    }

}
