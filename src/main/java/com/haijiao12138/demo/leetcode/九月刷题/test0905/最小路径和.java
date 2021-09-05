package com.haijiao12138.demo.leetcode.九月刷题.test0905;

/**
 * @author: haijiao12138
 * @ClassName: 最小路径和
 * @description: TODO
 * @date: 2021/9/5 9:38
 */
public class 最小路径和 {
    public static void main(String[] args) {

        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        int i = minPathSum(arr);
        System.out.println("==="+i);
    }

    public static int minPathSum(int[][] grid){
        int m = grid.length;//行的长度
        int n = grid[0].length;//列的长度
        //dp[i][j]代表起点到(i,j)的最小路径和
        int dp[][] = new int[m][n];
        dp[0][0] = grid[0][0];
        //左侧第一列只能从上往下
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i -1][0]+grid[i][0];
        }
        //第一行只能从左到右边
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
