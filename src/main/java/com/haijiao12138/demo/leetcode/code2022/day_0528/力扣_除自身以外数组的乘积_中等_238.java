package com.haijiao12138.demo.leetcode.code2022.day_0528;

/**
 * @Author:候苑博
 * @Date:2022-05-28 21:00
 * description:
 * Todo:
 */
public class 力扣_除自身以外数组的乘积_中等_238 {
    public static void main(String[] args) {

    }

    public static int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int len = nums.length;
        int[] output = new int[len];
        for (int i = 0; i < len; i++) {
            output[i] = left;
            left *=nums[i];
        }
        for (int i = len - 1; i >=0 ; i--) {
            output[i] *=right;
            right *= nums[i];
        }
        return output;
    }
}
