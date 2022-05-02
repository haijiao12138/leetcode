package com.haijiao12138.demo.leetcode.code2021.八月.test0825装饰器模式;

/**
 * @author: haijiao12138
 * @ClassName: ShapeDecorator
 * @description: TODO
 * @date: 2021/8/25 21:21
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
