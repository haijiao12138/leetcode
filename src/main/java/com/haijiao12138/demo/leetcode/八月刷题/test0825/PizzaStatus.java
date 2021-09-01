package com.haijiao12138.demo.leetcode.八月刷题.test0825;

public enum PizzaStatus {
    ORDERED,
    READY,
    DELIVERED;
}

class A{
    public static void main(String[] args) {
        System.out.println(PizzaStatus.ORDERED.name());
        System.out.println(PizzaStatus.ORDERED);
        System.out.println(PizzaStatus.ORDERED.name().getClass());
        System.out.println(PizzaStatus.ORDERED.getClass());
    }
}
