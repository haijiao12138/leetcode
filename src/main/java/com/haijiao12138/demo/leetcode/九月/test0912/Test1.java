package com.haijiao12138.demo.leetcode.九月.test0912;

import java.util.Scanner;

/**
 * @author: haijiao12138
 * @ClassName: 判断是否是回文字符串
 * @description: TODO
 * @date: 2021/9/12 16:46
 */
//题1：是否是回文串
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isHuiWen(s));
    }
    public static boolean isHuiWen(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.toCharArray()[i] != s.toCharArray()[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
