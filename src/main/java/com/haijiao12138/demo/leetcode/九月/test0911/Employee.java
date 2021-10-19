package com.haijiao12138.demo.leetcode.九月.test0911;

/**
 * @author: haijiao12138
 * @ClassName: Employee
 * @description: 定义抽象类
 * @date: 2021/9/11 10:59
 */
public abstract class Employee {
    private String name;//3个成员变量
    private String address;
    private int number;
    public Employee(String name, String address, int number)//构造方法1
    {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double computePay()//  f1
    {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }
    public void mailCheck()//f2
    {
        System.out.println("Mailing a check to " + this.name
                + " " + this.address);
    }
    public String toString()//f3
    {
        return name + " " + address + " " + number;
    }
    public String getName()//f4
    {
        return name;
    }
    public String getAddress()//f5
    {
        return address;
    }
    public void setAddress(String newAddress)//f6
    {
        address = newAddress;
    }
    public int getNumber()//f7
    {
        return number;
    }
}
