package com.haijiao12138.demo.leetcode.code2021.八月.a八大排序;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: a3简单选择排序
 * @description: TODO 时间复杂度O(n2)
 * @date: 2021/8/28 14:28
 */
public class a3简单选择排序 {
    public static void main(String[] args) {
        int[] arr = {8,65,41,28,6,1,4,5,32,9,10};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
    }
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //寻找最小值，将当前的作为最小值来看待
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                // 当前值的下一个值和当前值判断大小，如果先一个值小，那么就进行交换 ，
                // 当然要记录一下当前值的 下标 ，目的是为了当前值和第一个值进行交换
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            //进行交换
            arr[minIndex] = arr[i];
            arr[i] = min;
            System.out.println("第" + (i + 1) + "轮后");
            System.out.println(Arrays.toString(arr));
        }
    }
}
