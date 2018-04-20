package scuedule.demo;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * Created by yangboyu on 2018/4/17.
 */
public class Test4ScheduleDemo {
    public static void main(String[] args) throws SchedulerException, InterruptedException {
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("boolean", true);
        jobDataMap.put("string", "String");
        jobDataMap.put("int", 1);


        JobDetail jobDetail = JobBuilder.newJob(RAMJob.class)
                .setJobData(jobDataMap)
                .withDescription("first schedule demo 4 jobDetail")
                .withIdentity("test 4 job detail name", "test 4 job detail group name")
                .build();

        //任务运行的时间，SimpleSchedle类型触发器有效
        long time = System.currentTimeMillis() + 1 * 1000L; //3秒后启动任务
        Date statTime = new Date(time);
        Trigger trigger = TriggerBuilder.newTrigger()
                .withDescription("first schedule demo 4 trigger")
                .withIdentity("test 4 trigger name", "test 4 trigger group name")
                .startAt(statTime)
                .withSchedule(CronScheduleBuilder.cronSchedule("0/55 * * * * ?"))
                .build();

        SchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();

//        scheduler.deleteJob(jobDetail.getKey());

        //6.启动 调度器
//        scheduler.start();
//        scheduler.start();

//        Thread.sleep(5000);
//        scheduler.interrupt(jobDetail.getKey());
//        scheduler.clear();
//        for (JobExecutionContext executionContext : scheduler.getCurrentlyExecutingJobs()) {
//            System.out.println(executionContext);
//        }
//        scheduler.pauseJob(jobDetail.getKey());
//        scheduler.shutdown();
        System.out.println("-----------");
    }
}