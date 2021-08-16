package com.haijiao12138.demo.leetcode.sceduleJob;


import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * @author: 候苑博
 * @ClassName: JobQuartz
 * @description: TODO
 * @date: 2021/8/12 16:34
 *
 */
public class JobQuartz {
    public static void main(String[] args) throws SchedulerException {
        //1-创建sheduler的工厂
        StdSchedulerFactory sf = new StdSchedulerFactory();
        //2-从工厂中获取调度器实例
        Scheduler scheduler = sf.getScheduler();
        //3-创建JobDetail
        JobDetail jb = JobBuilder.newJob(MyJob.class)
                //job的描述
                .withDescription("this is a ram job")
                //job的name和group
                .withIdentity("ramJob", "ramGroup")
                .build();
        //任务运行的时间  simpleSchedule类型次触发器有效  3秒后启动任务
        long time = System.currentTimeMillis()+3*1000L;
        Date statTime = new Date(time);
        //创建Trigger
        //使用SimpleScheduleBuilder 或者 CronScheduleBuilder
        CronTrigger t = TriggerBuilder.newTrigger()
                .withDescription("")
                .withIdentity("ramTrigger", "ramTriggerGroup")
                //默认当前启动时间
                .startAt(statTime)
                //两秒执行一次  Quartz表达式
                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"))
                .build();
        //注册定时任务和定时器
        scheduler.scheduleJob(jb,t);
        scheduler.start();


    }
}
