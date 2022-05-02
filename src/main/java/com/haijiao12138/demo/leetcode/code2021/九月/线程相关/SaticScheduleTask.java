package com.haijiao12138.demo.leetcode.code2021.九月.线程相关;

import org.springframework.context.annotation.Configuration;

/**
 * @author: haijiao12138
 * @ClassName: SaticScheduleTask
 * @description: TODO
 * @date: 2021/9/5 23:03
 */
@Configuration
public class SaticScheduleTask extends Thread {
/*

    //@Scheduled(fixedRate = 1000)
    @Scheduled(cron = "0/5 * * * * ?")
    private void configurationTask(){
       // System.out.println("11111111111");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(50000);
                    System.out.println("11111111111");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }


    @Scheduled(cron = "0/5 * * * * ?")
    private void configurationTask1(){
      //  System.out.println("222222222222");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("222222222222");
            }
        });
        thread.start();
    }*/

}