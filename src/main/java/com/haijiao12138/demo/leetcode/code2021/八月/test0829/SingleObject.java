package com.haijiao12138.demo.leetcode.code2021.八月.test0829;

/**
 * @author: haijiao12138
 * @ClassName: SingleObject
 * @description: TODO
 * @date: 2021/8/30 16:51
 */
public class SingleObject {

    //创建SingleObject的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为private  这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
