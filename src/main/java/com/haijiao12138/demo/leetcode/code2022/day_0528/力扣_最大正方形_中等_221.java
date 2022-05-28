package com.haijiao12138.demo.leetcode.code2022.day_0528;

/**
 * @Author:候苑博
 * @Date:2022-05-28 20:42
 * description:
 * Todo:
 */
public class 力扣_最大正方形_中等_221 {
    public static void main(String[] args) {

    }
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        if (m < 0){
            return 0;
        }
        int n  =matrix[0].length;//列宽
        int max = 0;
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = 1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
}
