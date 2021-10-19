package com.haijiao12138.demo.leetcode.九月.test0911;

/**
 * @author: haijiao12138
 * @ClassName: 美团第一题
 * @description: TODO  输入一个字符串  找出字符串中能被22整除的字符串的个数
 * @date: 2021/9/11 16:22
 */
public class 美团第一题 {
    public static void main(String[] args) {
        String s = "12224441";
       // String substring = s.substring(3, 5);
        //System.out.println(substring);
        int i = maxLength(s);
        System.out.println(i);
    }
    public static int maxLength(String s){
        int count = 0;
        char[] chars = s.toCharArray();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                String substring = s.substring(i, j);
                Integer integer = Integer.valueOf(substring);
                if (integer % 22 == 0){
                        count++;
                    System.out.print(integer+" ");
                }
                //System.out.println(substring);
            }

        }

        return count;
    }
}
