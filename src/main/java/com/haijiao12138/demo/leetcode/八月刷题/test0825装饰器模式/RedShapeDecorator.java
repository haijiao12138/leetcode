package com.haijiao12138.demo.leetcode.八月刷题.test0825装饰器模式;

/**
 * @author: haijiao12138
 * @ClassName: RedShapeDecorator
 * @description: TODO
 * @date: 2021/8/25 21:22
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
