package com.haijiao12138.demo.leetcode.code2021.八月.test0829小冰面试;

/**
 * @author: haijiao12138
 * @ClassName: Thread
 * @description: TODO  wait notify；
 * @date: 2021/8/30 18:17
 */
public class 多线程交替打印 {
    private static Object object = new Object();
    private static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (i < 3) {
                synchronized (object) {
                    if (i % 3 == 0) {
                        System.out.println("奇数线程A" + i++);
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (i < 3) {
                synchronized (object) {
                    if (i % 3 == 1) {
                        System.out.println("偶数线程B" + i++);

                    }
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            while (i < 3) {
                synchronized (object) {
                    if (i % 3 == 2) {
                        System.out.println("奇数线程C" + i++);
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
