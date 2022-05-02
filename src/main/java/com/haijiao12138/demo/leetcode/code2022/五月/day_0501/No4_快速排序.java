package com.haijiao12138.demo.leetcode.code2022.五月.day_0501;

import java.util.Arrays;

/**
 * @ClassName No4_快速排序
 * @Author houyuanbo
 * @Date 2022/5/1 19:34
 * @Description TODO
 * @Version 选取第一个数作为基准 然后从出初始坐标 和末尾坐标 进行比较 找到末尾坐标小于基准的同时初始坐标大于基准的然后进行交换 否则进行i+= 和j--
 *          直到i和j 相遇的时候 将基准放到中间 进行交换 然后将基准左边和基准右边的区域 进行递归的比较
 *
 **/
public class No4_快速排序 {
    public static void main(String[] args) {
        int arr[] = new int[]{4,6,8,2,4,99,45,12};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[],int left,int right){
        if (left > right){
           return;
        }else {
            int base = arr[left];int i = left;int  j = right;
            while (i != j){
                while (arr[j]  >= base && i<j){
                    j--;//如果末尾坐标对应的值 一直大于基准 进行--操作 一直找到比基准小的
                }
                while (arr[i] <= base && i<j){
                    i++;//如果初始坐标 一直小于基准 就进行+=操作 直到找到大于基准的
                }
                //然后将左边大于基准和 和右边小于基准的对应的i和h的坐标的值进行交换
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }//i和j相遇  将基准放到中间去
            arr[left] = arr[i];
            arr[i] = base;
            quickSort(arr,left,i-1);
            quickSort(arr,j+1,right);
        }
    }
}
