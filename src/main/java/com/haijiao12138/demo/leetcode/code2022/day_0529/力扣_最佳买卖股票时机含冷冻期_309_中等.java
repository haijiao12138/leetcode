package com.haijiao12138.demo.leetcode.code2022.day_0529;

/**
 * @Author:候苑博
 * @Date:2022-05-29 18:28
 * description:
 * Todo:
 */
public class 力扣_最佳买卖股票时机含冷冻期_309_中等 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int n = prices.length;
        int[][] f = new int[n][3];
        for (int i = 1; i <= n; i++) {
            f[i][0] = Math.max(f[i - 1][0],f[i-1][2] - prices[i]);
            f[i][1] = f[i -1][0] +prices[i];
            f[i][2] = Math.max(f[i-1][1],f[i - 1][2]);
        }
        return Math.max(f[n-1][1],f[n-1][2]);
    }
}
