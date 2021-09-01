package com.haijiao12138.demo.leetcode.八月刷题.test0829;

/**
 * @author: haijiao12138
 * @ClassName: SingletonPatternDemo
 * @description: TODO
 * @date: 2021/8/30 16:54
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}
