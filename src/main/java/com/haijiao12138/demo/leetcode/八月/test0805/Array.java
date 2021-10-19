package com.haijiao12138.demo.leetcode.八月.test0805;/**
 * @author 候苑博
 * @date 2021/8/5 18:51
 * @description
 */

import java.util.Arrays;

/**
 * @author
 * @description：每次将数据放在排好的奇数的后面保持稳定性
 * 一个奇数 三个偶数
 * @date 2021/8/5
 */
public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9, 6};
        int[] ints = orderArray(arr);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] orderArray(int[] array) {
        int count = 0;
        int len = array.length - 1;
        for (int i = 0; i <= len; i++) {
            if (array[i] % 2 == 1) {
                int j = i;
                while (j > count) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    j--;
                }
                count++;
            }
        }
        return array;
    }

}
