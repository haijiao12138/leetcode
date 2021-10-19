package com.haijiao12138.demo.leetcode.八月.test0812定时任务;/**
 * @author 候苑博
 * @date 2021/8/12 18:37
 * @description
 */

/**
 * @author: 候苑博
 * @ClassName: MyThread2
 * @description: TODO
 * @date: 2021/8/12 18:37
 *
 */
public class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("通过实现runanble创建多线程！！");
    }

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.start();
        System.out.println("运行结束");
    }
}
