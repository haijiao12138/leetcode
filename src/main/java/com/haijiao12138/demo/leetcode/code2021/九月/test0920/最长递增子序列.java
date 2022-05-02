package com.haijiao12138.demo.leetcode.code2021.九月.test0920;

/**
 * @author: haijiao12138
 * @ClassName: 最长递增子序列
 * @description: TODO
 * @date: 2021/9/20 9:55
 */
public class 最长递增子序列 {
    public static void main(String[] args) {
       int[] arr = {10,9,2,5,3,7,101,18};
        int i = lengthOfLIS(arr);
        System.out.println("==="+i);

    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }
}
