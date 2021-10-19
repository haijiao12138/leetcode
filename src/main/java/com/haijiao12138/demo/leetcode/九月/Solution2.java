package com.haijiao12138.demo.leetcode.九月;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: Solution
 * @description: TODO
 * @date: 2021/9/8 14:17
 */


public class Solution2 {

    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1,8,5,2},
                {4,1,7,3},
                {3,6,2,9}
        };
        int[][] dp = new int[a.length][a[0].length];
        for (int i = 0; i < a[0].length; i++) {
            dp[0][i] = a[0][i];//确定第一行
        }
        for (int i = 1; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
              if(j == 0){
                  dp[i][j] = a[i][j]+Math.min(dp[i-1][j],dp[i-1][j+1]);
              }else if (j == a[i].length-1){
                  dp[i][j] = a[i][j]+Math.min(dp[i-1][j],dp[i-1][j-1]);
              }else {
                  int min = Math.min(dp[i-1][j],dp[i-1][j-1]);
                  min = Math.min(min,dp[i-1][i+1]);
                  dp[i][j] = a[i][j]+min;
              }
            }

        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        System.out.println(dp);
        int min =Integer.MAX_VALUE;
        for (int i : dp[a.length-1]) {
            if(min>i){
                min=i;
            }
        }
        System.out.println(min);
    }
}
