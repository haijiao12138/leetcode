package com.haijiao12138.demo.leetcode.code2021.八月.test0821;

import java.util.Scanner;

/**
 * @author: haijiao12138
 * @ClassName: A
 * @description: TODO
 * @date: 2021/8/21 19:13
 */
public class A {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[][] arr = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i =0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr[j][0]-arr[i][0])*(arr[j][0]-arr[i][0]) == (arr[j][1]-arr[i][1])*(arr[j][1]-arr[i][1])) {
                    count++;
                }
            }

        }
        System.out.println("==="+count);
    }

}
