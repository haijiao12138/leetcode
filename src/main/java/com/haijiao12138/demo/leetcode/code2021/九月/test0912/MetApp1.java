package com.haijiao12138.demo.leetcode.code2021.九月.test0912;

import java.util.*;

/**
 * @author: haijiao12138
 * @ClassName: MetApp
 * @description: TODO
 * @date: 2021/9/12 14:28
 */
public class MetApp1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,99,100,23,45,1,235,4362,23,90};




    }
    public static int[] test1(int[] arr) {
        if(arr.length<2){
            return arr;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(18 - arr[i])){
                return new int[]{map.get(18-arr[i]),i};
            }
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }

        }
        return new int[]{arr[0],arr[1]};
    }

    public static int test1111(int[] arr){
        if(arr.length<1){
            return 0;
        }
        if(arr.length==1){
            return arr[0];
        }
        if (arr.length >= 27){
            return  arr[26];
        }

        for (int i = 2; i < 27 ; i*=2) {
            if(arr.length>=27/i){
                return arr[27/i-1];
            }
        }
        return 0;
    }

    public static int[] test2(int x){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=x ; i++) {
            if (x % i == 0){
                list.add(i);
            }
        }
        if (list.size()>11){
            int temp = 0;
            int[] arr = new int[11];
            List<Integer> list1 = new ArrayList<>();
            for (int i = list.size()-1,j=0; i >0 ; i--) {
                list1.add(list.get(i));
                temp++;
                if (temp == 11){
                    i = 0;
                }

            }
            for (int i = 0; i < list1.size(); i++) {
                arr[i] = list1.get(i);
            };
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
        if (n > 11){
            for (int i = 0; i < 11; i++) {
                stack.push(arr[i]);//前五个入栈
            }
        }else {
            for (int i = 0; i < n; i++) {
                stack.push(arr[i]);
            }
        }
        int temp= 0;
        while (!stack.isEmpty() && temp!=6){
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

    public static int test33(int num){
        return 26*num;
    }

}
