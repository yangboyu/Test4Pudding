package family.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yangboyu on 2018/3/12.
 */
public class executor2 {

    private final AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));
    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int CAPACITY   = (1 << COUNT_BITS) - 1;

    private static final int RUNNING    = -1 << COUNT_BITS;
    private static final int SHUTDOWN   =  0 << COUNT_BITS;
    private static final int STOP       =  1 << COUNT_BITS;
    private static final int TIDYING    =  2 << COUNT_BITS;
    private static final int TERMINATED =  3 << COUNT_BITS;

    // Packing and unpacking ctl
    private static int runStateOf(int c)     { return c & ~CAPACITY; }
    private static int workerCountOf(int c)  { return c & CAPACITY; }
    private static int ctlOf(int rs, int wc) { return rs | wc; }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        test4Execute();
        test4Submit();
    }
    private static void test4Submit() throws ExecutionException, InterruptedException {
        ExecutorService laodaA = Executors.newFixedThreadPool(2);
        //提交作业给老大，作业内容封装在Callable中，约定好了输出的类型是String。
        for(int i =0; i < 1; i++) {
            Future<String> outputs = laodaA.submit(
                    new Callable<String>() {
//                        public void run() {
//                            try {
//                                Thread.sleep(30000);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                            System.out.println("I am a task, which submited by the so called laoda, and run by those anonymous workers");
//                        }

                        public String call() throws Exception {
                            Thread.sleep(30000);
                            return "I am a task, which submited by the so called laoda, and run by those anonymous workers";
                        }
                        //提交后就等着结果吧，到底是手下7个作业中谁领到任务了，老大是不关心的。
                    });
            System.out.println(outputs.get());
        }
    }


    private static void test4Execute(){
        ExecutorService laodaA = Executors.newFixedThreadPool(2);
        //提交作业给老大，作业内容封装在Callable中，约定好了输出的类型是String。
        for(int i =0; i < 5; i++) {
            laodaA.execute(
                    new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(30000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("I am a task, which submited by the so called laoda, and run by those anonymous workers");
                        }

                        public String call() throws Exception {
                            return "I am a task, which submited by the so called laoda, and run by those anonymous workers";
                        }
                        //提交后就等着结果吧，到底是手下7个作业中谁领到任务了，老大是不关心的。
                    });
        }

//        outputs.get();
//        System.out.println(outputs);
    }
}
