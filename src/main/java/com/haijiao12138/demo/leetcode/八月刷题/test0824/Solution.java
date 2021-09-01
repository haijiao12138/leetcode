package com.haijiao12138.demo.leetcode.八月刷题.test0824;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: Solution
 * @description: TODO
 * @date: 2021/8/24 15:14
 */
public class Solution {
    public static void main(String[] args) {
        int[][] f = new int[3][3];
        int[][] f1 = new int[3][4];
        System.out.println(f1.length);//3
        System.out.println(f1[0].length);//4
        for (int i = 0; i < 3; i++) {
            Arrays.fill(f[i],1000);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(f[i]));
        }
    }
}
