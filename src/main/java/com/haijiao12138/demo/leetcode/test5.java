package com.haijiao12138.demo.leetcode;/**
 * @author 候苑博
 * @date 2021/8/1 14:19
 * @description
 */

import org.springframework.security.core.parameters.P;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

/**
 * @author
 * @description:最长回文子串
 * @date 2021/8/1
 *
 */
public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            test(s);
        }
    }

    private static String test(String s){
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
            dp[i][i]=true;
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
                    if(j - i <3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                //只要dp[i][L] ==truee成立  就表示s[i...j]是回文  记录回文长度和起始位置
                if(dp[i][j] && j-i+1 >maxLen){
                    maxLen = j-i+1;
                    begin = i;
                }

            }
        }
        return s.substring(begin,begin+maxLen);


    }

}
