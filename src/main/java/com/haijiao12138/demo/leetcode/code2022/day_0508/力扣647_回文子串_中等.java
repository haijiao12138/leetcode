package com.haijiao12138.demo.leetcode.code2022.day_0508;

/**
 * @Author:候苑博
 * @Date:2022-05-08 2:07
 * description:
 * Todo:
 */
public class 力扣647_回文子串_中等 {
   static int num = 0;
    public static void main(String[] args) {
        String s = "aaa";
        int i = countSubstrings(s);
        System.out.println(i);

    }
    public static int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            count(s,i,i);//判断每一个单字符 奇
            count(s,i,i+1);
        }
        return num;
    }

    public static void count(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            num++;
            start--;
            end++;
        }
    }

}
