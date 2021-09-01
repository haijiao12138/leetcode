package com.haijiao12138.demo.leetcode.八月刷题;/**
 * @author 候苑博
 * @date 2021/8/1 17:18
 * @description
 */

import java.util.*;

/**
 * @author
 * @description
 * @date 2021/8/1
 *
 */
public class Order {
    private Date createTime;
    private Double money;
    private String addr;
    private User owner;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
 class User {
    public String name;
    public String addr;
    public Integer gender;
    public List<Order> myOrders;


     private static void sortOrderByCreateTimeDesc(List<Order> orderList) {
       /*  Collections.sort(orderList, new Comparator<Order>() {
             @Override
             public int compare(Order o1, Order o2) {
                 Date dt1 = o1.getCreateTime();
                 Date dt2 = o2.getCreateTime();
                 if (dt1.getTime() > dt2.getTime()){
                     return -1;
                 }else if (dt1.getTime() < dt2.getTime()){
                     return 1;
                 }else {
                     return 0;
                 }

             }
         });*/
       /*  List<Order> list = new ArrayList<>();
         list.add(new Order(new Date(1000)));*/




     }

     public static void main(String[] args) {
         Integer[] arr = new Integer[3];
         arr[0] = 130;
         arr[1] = 400;
         arr[2] = 500;
         Arrays.sort(arr, (Comparator<Integer>) (o1, o2) -> o2-o1);
         System.out.println(Arrays.toString(arr));
     }
}



