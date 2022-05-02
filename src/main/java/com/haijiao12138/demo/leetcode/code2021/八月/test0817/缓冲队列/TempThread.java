package com.haijiao12138.demo.leetcode.code2021.八月.test0817.缓冲队列;

/**
 * @author: haijiao12138
 * @ClassName: TempThread
 * @description: TODO
 * @date: 2021/8/18 22:24
 */
public class TempThread extends Thread {
    @Override
    public void run() {
        // 打印正在执行的缓存线程信息
        System.out.println(Thread.currentThread().getName() + "正在被执行");
        try {
            // sleep一秒保证3个任务在分别在3个线程上执行
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
