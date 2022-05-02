package com.haijiao12138.demo.leetcode.code2021.八月.test0825;

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
