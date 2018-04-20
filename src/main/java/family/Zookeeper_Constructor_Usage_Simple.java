package family;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by yangboyu on 17/7/14.
 */
public class Zookeeper_Constructor_Usage_Simple implements Watcher {
    private static CountDownLatch connectedSemaphore = new CountDownLatch(1);
    private static ZooKeeper zk = null;

    @Override
    public void process(WatchedEvent event) {
        System.out.println("Receive watched event : " + event);
        if (Event.KeeperState.SyncConnected == event.getState()) {
            connectedSemaphore.countDown();
        }

        if (Event.KeeperState.SyncConnected == event.getState()) {
            if (Event.EventType.None == event.getType() && null == event.getPath()) {
                connectedSemaphore.countDown();
            } else if (event.getType() == Event.EventType.NodeChildrenChanged) {
                try {
                    System.out.println("ReGet Child:" + zk.getChildren(event.getPath(), true));
                } catch (Exception e) {
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        createPath();
//        createPathAsyn();
//        createPath();
//        urge();
    }

    private static void createPath() throws IOException {
        ZooKeeper zookeeper = new ZooKeeper("127.0.0.1:2181", 5000, new Zookeeper_Constructor_Usage_Simple());
        System.out.println(zookeeper.getState());
        try {
//            connectedSemaphore.await();

//            String path1 = zookeeper.create("/nameserver", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//            System.out.println("Success create znode: " + path1);

            for (int i =0; i< 5; i++){
                String path2 = zookeeper.create("/nameserver/server-", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
                System.out.println("Success create znode: " + path2);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
//        Thread.sleep(1000000);
        System.out.println("Zookeeper session established");
    }

    private static void urge() throws InterruptedException, IOException, KeeperException {
        String path = "/nameserver";
        zk = new ZooKeeper("127.0.0.1:2181", 20000, new Zookeeper_Constructor_Usage_Simple());
//        connectedSemaphore.await();
        Stat stat = zk.exists(path, true);
        System.out.println(stat);
        Stat statT = new Stat();

        System.out.println("-------------------");

        List<String> list = zk.getChildren(path, true);
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------");
        byte[] b = zk.getData(path, true, statT);
        System.out.println(new String(b));
        System.out.println(statT);
        byte[] cc = "i love you my girl pudding.".getBytes();
        zk.setData(path, cc, statT.getVersion());
//        zk.create(path, "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//        System.out.println("success create znode: " + path);
//        zk.create(path + "/c1", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
//        System.out.println("success create znode: " + path + "/c1");
//        List<String> childrenList = zk.getChildren(path, false);
//        System.out.println(childrenList);
//
//        zk.create(path + "/c2", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
//        System.out.println("success create znode: " + path + "/c2");
//        Thread.sleep(1000);
//        zk.create(path + "/c3", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
//        System.out.println("success create znode: " + path + "/c3");
        Thread.sleep(Integer.MAX_VALUE);
    }


    private static void createPathAsyn() throws InterruptedException, IOException {
        ZooKeeper zookeeper = new ZooKeeper("127.0.0.1:2181", 5000, new Zookeeper_Constructor_Usage_Simple());
        System.out.println(zookeeper.getState());
        connectedSemaphore.await();

        zookeeper.create("/zk-test-ephemeral-", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL,
                new IStringCallback(), "I am context. ");

        zookeeper.create("/zk-test-ephemeral-", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL,
                new IStringCallback(), "I am context. ");

        zookeeper.create("/zk-test-ephemeral-", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL,
                new IStringCallback(), "I am context. ");
        Thread.sleep(Integer.MAX_VALUE);

    }
}

class IStringCallback implements AsyncCallback.StringCallback {
    public void processResult(int rc, String path, Object ctx, String name) {
        System.out.println("Create path result: [" + rc + ", " + path + ", " + ctx + ", real path name: " + name);
    }
}
