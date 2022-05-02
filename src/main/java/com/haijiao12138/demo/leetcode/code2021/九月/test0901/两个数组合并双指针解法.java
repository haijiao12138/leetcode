package com.haijiao12138.demo.leetcode.code2021.九月.test0901;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: haijiao12138
 * @ClassName: 两个数组合并双指针解法
 * @description: TODO
 * @date: 2021/9/1 23:01
 */
public class 两个数组合并双指针解法 {

    public static void main(String[] args) {
//        int[] a = {1,2,4,0,0,0};
//        int[] b = {3,4,6};
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[] a = new int[m+n];
        int[] b = new int[n];
        for (int i = 0; i < m + n; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = input.nextInt();
        }

        merge(a,3,b,3);
    }
    public static void merge(int[] nums1,int m,int[] nums2,int n){
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
