package com.haijiao12138.demo.leetcode.八月.a八大排序;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: a1冒泡排序
 * @description: TODO
 * @date: 2021/8/28 11:49
 */
public class a1冒泡排序 {

    static int[] arr = new int[]{8,65,41,28,6,1,4,5,32,9,10};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
