package com.haijiao12138.demo.leetcode.九月刷题.test0901;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: 数字去重
 * @description: TODO
 * @date: 2021/9/1 20:42
 */
public class 数字去重 {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,3,2,6};
        test(arr);
    }

    //1-通过list去重
    public static void test(int[] arr) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list);

    }
}
