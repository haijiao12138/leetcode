package com.haijiao12138.demo.leetcode.code2021.八月.test0829小冰面试;

/**
 * @author: haijiao12138
 * @ClassName: Thread
 * @description: TODO  wait notify；
 * @date: 2021/8/30 18:17
 */
public class AlternatePrintingNotifyAndWait {
    private static Object object = new Object();
    private static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (i < 101) {
                synchronized (object) {
                    if (i % 2 == 1) {
                        System.out.println("奇数线程" + i++);
                        try {
                            object.notify();
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread thread = new Thread(() -> {
            while (i < 101) {
                synchronized (object) {
                    if (i % 2 == 0) {
                        System.out.println("偶数线程" + i++);
                        try {
                            object.notify();
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread1.start();
        thread.start();
    }
}
