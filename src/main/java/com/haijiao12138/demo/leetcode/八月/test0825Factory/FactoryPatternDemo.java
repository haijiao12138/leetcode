package com.haijiao12138.demo.leetcode.八月.test0825Factory;

/**
 * @author: haijiao12138
 * @ClassName: FactoryPatternDemo
 * @description: TODO 4-使用该工厂，通过传递类型信息来获取实体类的对象。
 * @date: 2021/8/25 21:01
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");//获取circle对象并调用方法
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");//获取RECTANGLE对象并调用方法
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");//获取SQUARE对象并调用方法
        shape3.draw();

    }

}
