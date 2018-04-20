package family.thread.executor;

import java.util.concurrent.*;

/**
 * Created by yangboyu on 2018/3/15.
 */
public class Test4CallableTask {
    static class CallableTask implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(5000);
            System.out.println("call runing");
            return 1;
        }
    }

    public static void main(String args[]) {

        CallableTask task = new CallableTask();
        try {
            System.out.println("call start");
            ExecutorService service = Executors.newSingleThreadExecutor();
            Future fu = service.submit(task);
            Thread.yield();
//            Thread.sleep(50000);
            System.out.println(fu.get());
            service.shutdown();
            System.out.println("call end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
