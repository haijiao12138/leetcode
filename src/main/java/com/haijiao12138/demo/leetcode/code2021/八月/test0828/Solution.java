package com.haijiao12138.demo.leetcode.code2021.八月.test0828;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: Solution
 * @description: TODO
 * @date: 2021/8/28 19:48
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ints = runningSum(arr);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] runningSum(int[] nums) {
        int temp =0;
        for (int i = 1; i <nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];

        }
        return nums;
    }
}
