package com.haijiao12138.demo.leetcode.八月刷题.test0829小冰面试;

/**
 * @author: haijiao12138
 * @ClassName: test0829小冰面试
 * @description: TODO
 * @date: 2021/8/30 19:58
 */
public class test0829小冰面试 extends Thread {
    @Override
    public void run() {
        System.out.println("创建多线程！");
    }

    public static void main(String[] args) {
        test0829小冰面试 thread = new test0829小冰面试();
        thread.start();

    }

}
