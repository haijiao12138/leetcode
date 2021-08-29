package com.haijiao12138.demo.leetcode.test0825装饰器模式;

/**
 * @author: haijiao12138
 * @ClassName: Circle
 * @description: TODO
 * @date: 2021/8/25 21:20
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
