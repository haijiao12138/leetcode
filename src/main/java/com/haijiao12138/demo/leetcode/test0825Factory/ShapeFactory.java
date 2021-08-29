package com.haijiao12138.demo.leetcode.test0825Factory;

/**
 * @author: haijiao12138
 * @ClassName: ShapeFactory
 * @description: TODO 步骤3：创建一个工厂  生成基于给定信息的实体类对象
 * @date: 2021/8/25 20:56
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
