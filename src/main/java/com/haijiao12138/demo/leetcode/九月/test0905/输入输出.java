package com.haijiao12138.demo.leetcode.九月.test0905;

import java.util.Scanner;

/**
 * @author: haijiao12138
 * @ClassName: 输入输出
 * @description: TODO
 * @date: 2021/9/5 12:21
 */
public class 输入输出 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        while (scanner.hasNextInt()){//多组输入
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
        }
    }

}
