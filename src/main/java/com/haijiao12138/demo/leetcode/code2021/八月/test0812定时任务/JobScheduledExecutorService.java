package com.haijiao12138.demo.leetcode.code2021.八月.test0812定时任务;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author: 候苑博
 * @ClassName: JobScheduledExecutorService
 * @description: TODO  3-使用线程池创建 job定时任务
 * @date: 2021/8/12 15:27
 *
 */
public class JobScheduledExecutorService {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello!");

            }
        };
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(runnable,1,1, TimeUnit.SECONDS);//每隔一秒执行一次
    }
}
