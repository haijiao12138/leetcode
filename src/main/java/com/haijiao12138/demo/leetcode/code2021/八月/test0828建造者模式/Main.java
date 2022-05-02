package com.haijiao12138.demo.leetcode.code2021.八月.test0828建造者模式;

/**
 * @author: haijiao12138
 * @ClassName: Main
 * @description: TODO
 * @date: 2021/8/28 9:13
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("张三","男")
                .age("12")
                .money("1000000")
                .car("宝马")
                .build();

        Student.StudentBuilder address = new Student.StudentBuilder().name("候苑博").age(25).address("河北保定");
        System.out.println(address);

    }
}
