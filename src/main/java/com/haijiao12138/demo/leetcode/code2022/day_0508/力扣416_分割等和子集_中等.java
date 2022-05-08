package com.haijiao12138.demo.leetcode.code2022.day_0508;

/**
 * @ClassName 力扣416_分割等和子集_中等
 * @Author houyuanbo
 * @Date 2022/5/8 19:11
 * @Description TODO
 * @Version 背包问题
 **/
public class 力扣416_分割等和子集_中等 {
    public static void main(String[] args) {

    }
    public static boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum+=num;
        }
        if (sum % 2 !=0){
            return false;
        }
        int w = sum/2;
        int[] dp = new int[1+w];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = w; i >= num ; i--) {
                dp[i] += dp[i - num];
            }
        }
        return dp[w] != 0;

    }
}
