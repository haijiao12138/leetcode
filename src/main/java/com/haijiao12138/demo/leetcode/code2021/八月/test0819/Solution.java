package com.haijiao12138.demo.leetcode.code2021.八月.test0819;

/**
 * @author: haijiao12138
 * @ClassName: Solution
 * @description: TODO
 * @date: 2021/8/19 16:11
 */
public class Solution {
    public static void main(String[] args) {
        int[][] a = {{1,3,1,},{1,5,1},{4,2,1}};
        int i = minPathSum(a);
        System.out.println(i);
    }
    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int row=grid.length;//Hang长
        int col=grid[0].length;//列长
        int dp[][]=new int[row][col];//动态规划数组
        dp[0][0]=grid[0][0];
        for(int j=1;j<row;j++){//行长
            dp[j][0]=dp[j-1][0]+grid[j][0];
        }
        for(int i=1;i<col;i++){
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                dp[i][j]=Math.min(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]);//从左往右走和从上往下走
            }
        }

        return dp[row-1][col-1];
    }
}
