package com.haijiao12138.demo.leetcode.test0828建造者模式;

import lombok.Builder;

/**
 * @author: haijiao12138
 * @ClassName: Student
 * @description: TODO
 * @date: 2021/8/28 9:14
 */
@Builder
public class Student {

    private String name;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
