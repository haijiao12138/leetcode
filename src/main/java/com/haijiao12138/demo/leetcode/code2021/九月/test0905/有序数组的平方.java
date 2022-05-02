package com.haijiao12138.demo.leetcode.code2021.九月.test0905;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: 有序数组的平方
 * @description: TODO
 * @date: 2021/9/5 12:00
 */
public class 有序数组的平方 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] ints = sortedSquares(arr);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] sortedSquares(int[] A){
        int start = 0;
        int end = A.length;
        int i = end - 1;
        int[] nums = new int[end--];
        while (i >= 0) {
            nums[i--] = A[start]*A[start] >= A[end]*A[end] ? A[start]*A[start++] : A[end]*A[end--];
        }
        return nums;
    }
}
