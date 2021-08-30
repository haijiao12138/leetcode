package com.haijiao12138.demo.leetcode;

/**
 * @author: haijiao12138
 * @ClassName: Thread
 * @description: TODO
 * @date: 2021/8/30 18:17
 */
public class TestThread {
    public static int count=0;
    private static final Object object = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 100) {
                    synchronized (object) {
                        if (count % 2 == 0) {
                            System.out.println(count);
                            count++;
                        }
                    }
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 100) {
                    synchronized (object) {
                        if (count % 2 == 1) {
                            System.out.println(count);
                            count++;
                        }
                    }
                }
            }
        });
        thread.start();
        thread1.start();
    }


}
