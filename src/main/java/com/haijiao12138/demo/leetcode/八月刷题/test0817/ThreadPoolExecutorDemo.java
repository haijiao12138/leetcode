package com.haijiao12138.demo.leetcode.八月刷题.test0817;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static com.haijiao12138.demo.leetcode.八月刷题.test0809.Thread.newCachedThreadPool;
import static java.util.concurrent.Executors.newSingleThreadExecutor;

/**
 * @author: haijiao12138
 * @ClassName: ThreadPoolExecutorDemo
 * @description: TODO   Executors.newCachedThreadPool() 创建一个可缓存线程池，如果线程池 长度超过处理处理需要,可灵活回收空闲线程  若无可回收 则创建新线程
 *  常见的4种线程池的使用；
 * @date: 2021/8/17 20:17
 */
@Configuration
public class ThreadPoolExecutorDemo {

/*
    @Scheduled(cron = "0/5 * * * * ?")
    public static void main1() {
        //四种常见的线程池
       *//*
        1-newCachedThreadPool(); 创建一个可缓存线程池   如果线程池长度超过处理需要   可灵活回收空闲线程  若无可回收  则新建线程
        2-newFixedThreadPool();  创建一个定长线程池  可控制线程最大并发数  超出的线程 会在队列中等得
        3-newScheduledThreadPool();
        4-newSingleThreadExecutor();
        *//*
       //第三种线程池
        //Executors.newScheduledThreadPool(int n)
        //创建一个定长线程池，支持定时及周期性任务执行。
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 3; i++) {
            scheduledThreadPool.schedule(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("延迟5秒执行："+Thread.currentThread().getName());
                }
            },1, TimeUnit.SECONDS);
        }



        //第二种线程池
        //2-Executors.newFixedThreadPool(int n)
        //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
   *//*     ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);//线程池种拥有三个线程
        //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
        for (int i = 0; i < 10; i++) {
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName()+"正在执行！");
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
*//*


        //第一种线程池
        *//*ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            try {
              Thread.sleep(1);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"正在被执行");
                }
            });
        }*//*

    }*/


    //第三种线程池
   /* public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //延迟1秒执行
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1秒后每3秒执行一次:"+Thread.currentThread().getName());
            }
        }, 1,3 , TimeUnit.SECONDS);

    }*/
    public static void main(String[] args) {
        //第四种线程池：
        //Executors.newSingleThreadExecutor()
        //创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
        //创建一个单线程化的线程池
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        //结果依次输出，相当于顺序执行各个任务
                        System.out.println(Thread.currentThread().getName()+"正在被执行,打印的值是:"+index);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }
}
