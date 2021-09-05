package com.haijiao12138.demo.leetcode.九月刷题.test0905;

/**
 * @author: haijiao12138
 * @ClassName: 删除字符使字符串编号
 * @description: TODO
 * @date: 2021/9/5 12:02
 */
public class 删除字符使字符串变好 {
    public static void main(String[] args) {
    String s = "leeetcode";
        String s1 = makeFancyString(s);
        System.out.println(s1);
    }

    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int n = sb.length();
            if(sb.length()>=2 && sb.charAt(n-1)==c && sb.charAt(n-2)==c){//如果添加的元素里面  大于2了 且有两个连续的字符是相等的了  那么进行下一次循环
                continue;
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
