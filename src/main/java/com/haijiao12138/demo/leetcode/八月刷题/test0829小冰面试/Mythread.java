package com.haijiao12138.demo.leetcode.八月刷题.test0829小冰面试;

/**
 * @author: haijiao12138
 * @ClassName: Mythread
 * @description: TODO
 * @date: 2021/8/30 20:02
 */
public class Mythread {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是小冰！");
            }
        });
        thread.start();

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是小冰2！");
            }
        });
        thread1.start();
    }
}
