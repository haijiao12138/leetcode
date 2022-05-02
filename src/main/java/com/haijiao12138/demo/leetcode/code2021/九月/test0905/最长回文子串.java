package com.haijiao12138.demo.leetcode.code2021.九月.test0905;

/**
 * @author: haijiao12138
 * @ClassName: 最长回文子串
 * @description: TODO
 * @date: 2021/9/5 11:26
 */
public class 最长回文子串 {
    public static void main(String[] args) {
            String a = "babad";
        String s = longestPalindrome(a);
        System.out.println(s);
    }
    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();//将输入的字符串转为字符数组 转而求字符串的最大回文子串
        if (chars.length==0 || s==null){
            return "";//空字符串 直接返回
        }
        if(s.length()==1){
            return s;
        }
        int len = s.length();
        int maxLen = 1;
        int begin  = 0;
        //二维数组dp[i][j]表示s[i...j]是否是回文串
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i]=true;//对角线的单个字符一定为true
        }
        for (int L = 2; L <= len; L++) {
            for (int i = 0; i < len; i++) {
                //由i,j确定右边界 j-i+1=L;
                int j = L+i-1;
                //右边越界  退出当前循环
                if(j>=len){
                    break;
                }
                if (chars[i] != chars[j]){
                    dp[i][j] = false;
                }else{
                    if(j - i <3){//当子串长度为2，或者3的时候 就不用检查子串是否相等  天然相等
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];//在首尾相等的条件下使用状态转移方程
                    }
                }
                //只要dp[i][L] ==truee成立  就表示s[i...j]是回文  记录回文长度和起始位置
                if(dp[i][j] && j-i+1 >maxLen){
                    maxLen = j-i+1;//记录长度
                    begin = i;//记录位置
                }

            }
        }
        return s.substring(begin,begin+maxLen);

    }
}
