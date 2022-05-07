package com.haijiao12138.demo.leetcode.code2022.day_0507;

/**
 * @Author:候苑博
 * @Date:2022-05-07 20:11
 * description:
 * Todo:   动态五部曲
 */
public class 力扣96_不同的二叉搜索树_中等 {
    public static void main(String[] args) {
    int n = 3;
        System.out.println(numTrees(n));
    }

    public static int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n-1];
    }

}
