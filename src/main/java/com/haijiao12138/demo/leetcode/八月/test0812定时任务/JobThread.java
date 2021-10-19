package com.haijiao12138.demo.leetcode.八月.test0812定时任务;/**
 * @author 候苑博
 * @date 2021/8/12 15:11
 * @description
 */

/**
 * @author: 候苑博
 * @ClassName: JobThread
 * @description: TODO  1--通过线程创建Job定时任务
 * @date: 2021/8/12 15:11
 *
 */
public class JobThread {
        static long count = 0;

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        count++;
                        System.out.println("----:" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.run();
    }
}
