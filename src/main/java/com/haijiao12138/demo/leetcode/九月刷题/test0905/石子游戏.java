package com.haijiao12138.demo.leetcode.九月刷题.test0905;

/**
 * @author: haijiao12138
 * @ClassName: 石子游戏
 * @description: TODO
 * @date: 2021/9/5 12:18
 */
public class 石子游戏 {
    public static void main(String[] args) {

    }
   static class Solution {
        public boolean stoneGame(int[] piles) {
            int length = piles.length;
            int[][] dp = new int[length][length];
            for (int i = 0; i < length; i++) {
                dp[i][i] = piles[i];
            }
            for (int i = length - 2; i >= 0; i--) {
                for (int j = i + 1; j < length; j++) {
                    dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
                }
            }
            return dp[0][length - 1] > 0;
        }
    }

}
