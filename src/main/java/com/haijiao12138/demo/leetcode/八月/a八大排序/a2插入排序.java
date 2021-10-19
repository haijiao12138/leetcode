package com.haijiao12138.demo.leetcode.八月.a八大排序;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: a2插入排序
 * @description: TODO 时间复杂度 O（n2）
 * @date: 2021/8/28 11:59
 */
public class a2插入排序 {
    public static void main(String[] args) {
        int[] arr = new int[] {6,5,3,1,8,7,2,4};
        Sort(arr);
    }
    public static void Sort(int[] arr){
        //定义j  目的是将数据放到对应的位置
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            //定义临时变量进行存储
            int temp = arr[i];
            //将当前数据插入到已有序的数字中（倒着往前找）
            for ( j = i-1; j  >=0; j--) {
                if (arr[j] > temp){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            //将当前的数 放入到正确位置
            arr[j+1] = temp;
            System.out.println(Arrays.toString(arr));
        }
        //System.out.println(Arrays.toString(arr));
    }

}
