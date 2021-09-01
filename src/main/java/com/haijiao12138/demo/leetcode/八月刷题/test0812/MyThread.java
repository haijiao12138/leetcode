package com.haijiao12138.demo.leetcode.八月刷题.test0812;/**
 * @author 候苑博
 * @date 2021/8/12 18:32
 * @description
 */

/**
 * @author: 候苑博
 * @ClassName: MyThread
 * @description: TODO
 * 这说明在使用多线程技术时，代码的运行结果与代码执行顺序后调用代码的顺序是无关的
 *       即线程是一个子任务，CPU以随机的时间来调用线程中的方法。
 *       注意:1.不能多次调用Thread中的start()方法，否则会抛出IllegalThreadStateException异常。
 *            2.启动线程的方法不是run()方法而是start方法，如果调用的是run()方法就是同步的，并不能异步执行。
 *            3.执行start()方法的顺序不代表线程启动的顺序，即并不是说，越早调用某个线程的start()方法，它就能
 *              越早的执行其中的run()方法。
 * @date: 2021/8/12 18:32
 *
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println("创建多线程1");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }
}
