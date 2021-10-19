package com.haijiao12138.demo.leetcode.八月.sceduleJob;/**
 * @author 候苑博
 * @date 2021/8/12 16:30
 * @description
 */


import org.quartz.Job;
import org.quartz.JobExecutionContext;


/**
 * @author: 候苑博
 * @ClassName: ScheduleJob
 * @description: TODO
 * @date: 2021/8/12 16:30
 *
 */
public class MyJob implements Job {

    public void execute(JobExecutionContext context){
        System.out.println("quartz Myjob date:"+System.currentTimeMillis());
    }
}
