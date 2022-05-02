package com.haijiao12138.demo.leetcode.code2021.九月.test0912;

/**
 * @author: haijiao12138
 * @ClassName: 让字符串变成回文串的最少操作次数
 * @description: TODO
 * @date: 2021/9/12 17:36
 */
public class 让字符串变成回文串的最少操作次数 {
    public static void main(String[] args) {
        String s = "abbab";
        int i = minInsertions(s);
        System.out.println(i);
    }
    public static int minInsertions(String s){
        final int n = s.length();
        int[][] dp = new int[n][n];
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
               if (s.charAt(i) == s.charAt(j)){
                   dp[i][j] = dp[i+1][j-1];
               }else {
                   dp[i][j] = Math.min(Math.min(dp[i+1][j-1],dp[i][j-1]),dp[i+1][j])+1;
               }
            }
        }
        return dp[0][n-1];

    }
//    public static int minInsertions(String s){
//        int len = s.length();
//        int[][] dp = new int[len][len];
//        for (int i = 1; i < len; i++) {
//            for (int j = 1; j < len; j++) {
//                if (s.charAt(i) == s.charAt(len - j)){
//                    dp[i][j] = dp[i-1][j-1]+1;
//                }else {
//                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
//                }
//            }
//        }
//        return len-1-dp[len-1][len-1];
//    }

//    public static int minInsertions(String s) {
//        if(s==null || s.length()<=1) return 0;
//        int n = s.length();
//        int [][]dp = new int[n][n];
//        for(int i=n-2;i>=0;i--){
//            for(int j=i;j<n;j++){
//                if(i<j){
//                    if(s.charAt(i)==s.charAt(j)){
//                        dp[i][j] = dp[i+1][j-1];
//                    }else{
//                        dp[i][j] = Math.min(dp[i+1][j]+1,dp[i][j-1]+1);
//                    }
//                }
//            }
//        }
//        return dp[0][n-1];
//    }
}
