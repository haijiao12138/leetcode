package com.haijiao12138.demo.leetcode.八月;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: qqq
 * @description: TODO
 * @date: 2021/9/6 13:13
 */
public class Test {
    public static void main(String[] args) {
        String s = "354271";
        test(s,4);
       
    }

    public static List<Integer> test(String s, int m){
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i!= m-1){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        return list;
    }

}
