package com.haijiao12138.demo.leetcode.code2022.day_0528;

/**
 * @Author:候苑博
 * @Date:2022-05-08 18:05
 * description:
 * 输入：s = "(()())  (())"
 * 输出："()()()"
 * Todo:
 */
public class 力扣_删除最外层的括号_简单 {
    public static void main(String[] args) {
        String s = "(()())(())";
        String s1 = removeOuterParentheses(s);
        System.out.println(s1);
    }

    public static String removeOuterParentheses(String s) {
        int left = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && left++ > 0){
                res.append('(');
            }
            if (s.charAt(i) == ')' && --left > 0){
                res.append(')');
            }
        }
        return  res.toString();
    }
}
