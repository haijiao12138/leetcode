package com.haijiao12138.demo.leetcode.test0812;


import com.haijiao12138.demo.leetcode.test0809.LocalCache;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @author: 候苑博
 * @ClassName: SaticScheduleTask
 * @description: TODO  5-springboot 的 @Scheduled 注解实现定时任务
 * @date: 2021/8/12 14:35
 *
 */
@Configuration  //1-配置类 实现Component
@EnableScheduling  //  开启定时任务
public class SaticScheduleTask {

    public static void main(String[] args) {
        SaticScheduleTask saticScheduleTask = new SaticScheduleTask();
        saticScheduleTask.configurationTask();
    }
    //@Scheduled(fixedRate = 1000)
    @Scheduled(cron = "0/5 * * * * ?")
    private void configurationTask(){
        System.out.println("执行定时任务的时间："+ LocalDateTime.now());
    }


}
