package com.haijiao12138.demo.leetcode.八月刷题.test0825;

import java.util.ArrayList;

/**
 * @author: haijiao12138
 * @ClassName: Pizza
 * @description: TODO
 * @date: 2021/8/25 19:43
 */
public class Pizza {
    private PizzaStatus status;
    public enum PizzaStatus{
       ORDERED,
        READY,
        DELIVERED;
    }
  /*  public boolean isDeliverable() {
        return getStatus() == PizzaStatus.READY;
    }*/
  public static void main(String[] args) {
      ArrayList<String> integers = new ArrayList<String>();
      integers.add("abc");
      integers.add("aaa");
      integers.add("abv");
      integers.add("bbb");
      integers.stream().filter((s)->s.startsWith("a"))
                        .forEach(System.out::println);



  }

}
