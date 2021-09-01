package com.haijiao12138.demo.leetcode.八月刷题.test0829;

/**
 * @author: haijiao12138
 * @ClassName: Singleton2
 * @description: TODO
 * @date: 2021/8/30 17:08
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：较复杂
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
public class Singleton2 {
    private volatile static Singleton2 singleton;
    private Singleton2 (){}
    public static Singleton2 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {

    }
}
