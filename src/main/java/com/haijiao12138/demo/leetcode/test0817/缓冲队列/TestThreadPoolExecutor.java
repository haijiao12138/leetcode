package com.haijiao12138.demo.leetcode.test0817.缓冲队列;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: haijiao12138
 * @ClassName: TestThreadPoolExecutor
 * @description: TODO
 * @date: 2021/8/18 22:28
 */
public class TestThreadPoolExecutor {
    public static void main(String[] args) {
        // 创建数组型缓冲等待队列
        BlockingQueue<Runnable> bq = new ArrayBlockingQueue<Runnable>(10);
        // ThreadPoolExecutor:创建自定义线程池，池ThreadPoolExecutor中保存的线程数为3，允许最大的线程数为6
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(3, 6, 50, TimeUnit.MILLISECONDS, bq);

        // 创建3个任务
        Runnable t1 = new TempThread();
        Runnable t2 = new TempThread();
        Runnable t3 = new TempThread();


        // 3个任务在分别在3个线程上执行
        tpe.execute(t1);
        tpe.execute(t2);
        tpe.execute(t3);


        // 关闭自定义线程池
        tpe.shutdown();

    }
}
