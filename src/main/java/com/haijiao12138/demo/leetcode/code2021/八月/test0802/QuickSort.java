package com.haijiao12138.demo.leetcode.code2021.八月.test0802;/**
 * @author 候苑博
 * @date 2021/8/2 14:11
 * @description
 */

import java.util.Arrays;

/**
 * @author
 * @description:快速排序
 * @date 2021/8/2
 *
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,1,2,7,93,4,5,10,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[],int left,int right){
        if(left>right){
            return;
        }
        int base = arr[left];
        int i = left;//指向左边
        int j=right;//指向右边
        while (i!=j){
            //从j向右检索
            while (arr[j] >=base && i<j){
                //后面的数比基数大同时 大于i  j向左移动
                j--;
            }
            //i向左边检索
            while (arr[i]<=base && i<j){
                //左边的比技术小  那么i继续加一
                i++;
            }
            //交换i和j的位置
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[left] = arr[i];
        arr[i] = base;

        //将基数左边进行排序
        quickSort(arr,left,i-1);
        quickSort(arr,j+1,right);
    }
}
