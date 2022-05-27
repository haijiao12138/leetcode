package com.haijiao12138.demo.leetcode.code2022.day_0509;

/**
 * @ClassName 力扣942_增减字符串匹配_简单
 * @Author houyuanbo
 * @Date 2022/5/9 10:28
 * @Description TODO
 * @Version
 **/
public class 力扣942_增减字符串匹配_简单 {
    public static void main(String[] args) {

    }
    public int[] diStringMatch(String s) {
        int n = s.length(),lo=0,hi=n;
        int[] per = new int[n+1];
        for (int i = 0; i < n; i++) {
            per[i] =s.charAt(i)=='I'? lo++ : hi--;
        }
        per[n] = lo;//最后的时候lo=hi
        return per;
    }

}
