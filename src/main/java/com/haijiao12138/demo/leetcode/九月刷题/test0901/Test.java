package com.haijiao12138.demo.leetcode.九月刷题.test0901;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: Test leetcode两个有序数组的合并
 * @description: TODO
 * @date: 2021/9/1 21:18
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {1,6,7,0,0,0};
        int[] b = {2,4,6};
        merge(a,3,b,3);
    }
    public static void merge(int[] nums1,int m,int[] nums2,int n){
        for (int i =m,j=0;i<m+n;i++,j++){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

}
