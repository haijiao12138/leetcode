package com.haijiao12138.demo.leetcode.九月.test0912;

import java.util.*;

/**
 * @author: haijiao12138
 * @ClassName: MetApp
 * @description: TODO
 * @date: 2021/9/12 14:28
 */
public class MetApp {
    public static void main(String[] args) {
        int i = test1(4);
        int[] ints = test2(i);
        int[] ints1 = test3(ints);
        System.out.println(Arrays.toString(ints1));
    }

    public static int test1(int x){
        return x*31;
    }

    public static int[] test2(int x){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0){
                list.add(i);
            }
        }
        //System.out.println(list);
        if (list.size()>11){
            int[] arr = new int[11];
            for (int i = 0; i < 11; i++) {
                arr[i] = list.get(i);
            }
            return arr;
        }else {
            int[] arr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }
            return arr;
        }

    }
    public static int[] test3(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        if (n > 5){
            for (int i = 0; i < 5; i++) {
                stack.push(arr[i]);//前五个入栈
            }
        }else {
            for (int i = 0; i < n; i++) {
                stack.push(arr[i]);
            }
        }
        int temp= 0;
        while (!stack.isEmpty() && temp!=2){
            Integer pop = stack.pop();
            temp++;
        }
        int size = stack.size();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = stack.pop();
        }
        return  a;

    }
}
