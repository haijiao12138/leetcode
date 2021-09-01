package com.haijiao12138.demo.leetcode.八月刷题.test0829;

/**
 * @author: haijiao12138
 * @ClassName: Singleton
 * @description: TODO
 * @date: 2021/8/30 17:00
 * 懒汉模式：多线程不安全，哪会调用他哪会才会创建对象
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("我创建了");
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton =  Singleton.getInstance();
        System.out.println(singleton);
    }
}
