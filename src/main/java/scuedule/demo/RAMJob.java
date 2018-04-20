package scuedule.demo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yangboyu on 2018/4/17.
 */
public class RAMJob implements Job {
    AtomicInteger atomicInteger = new AtomicInteger();
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        while (true){
            int i = atomicInteger.incrementAndGet();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName());
        }
    }
}
