package com.haijiao12138.demo.leetcode.code2021.九月.test0912;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: haijiao12138
 * @ClassName: 对战卡
 * @description: TODO
 * @date: 2021/9/12 18:45
 */
public class 对战卡 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int m = 0;
        for (int j = arr.length-1; j >=arr.length-i1 ; j--) {
            m+=arr[j];
        }
        System.out.println(m);
    }
}
