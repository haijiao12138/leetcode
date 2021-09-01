package com.haijiao12138.demo.leetcode.八月刷题.a八大排序;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: a7归并排序
 * @description: TODO
 * @date: 2021/8/29 23:06
 */
public class a7归并排序 {
    public static void main(String[] args) {
        int a[] = {6,5,3,1,8,7,2,4};
        mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }
    //分
    public static void mergeSort(int[] a, int low, int high) {
        //首先判断 low 和 high是否指向一个地方
        if(low >= high) {
            return;
        }
        int mid = (low + high)/2;
        //先递归左边
        mergeSort(a, low, mid);
        //在递归右边
        mergeSort(a, mid+1, high);
        //合并
        merge(a,low,mid,high);
        System.out.println(Arrays.toString(a));
    }
    //合并
    public static void merge(int[] a, int low, int mid, int high) {
        //定义第一个段的开始
        int s1 = low;
        //定义第二个段的开始
        int s2 = mid+1;
        //定义临时数组
        int[] temp = new int[high-low+1];
        int i = 0;//定义临时数组的下标
        //判断大小将数组放入到临时数组当中去
        while(s1<=mid && s2<=high) {
            if(a[s1] <= a[s2]) {
                temp[i++] = a[s1++];
            }else {
                temp[i++] = a[s2++];
            }
        }
        //判断s1当中是否有数据，如果有将其全部拷贝到临死数组当中去
        while (s1 <= mid) {
            temp[i++] = a[s1++];

        }
        //判断s1当中是否有数据，如果有将其全部拷贝到临死数组当中去
        while (s2 <= high) {
            temp[i++] = a[s2++];
        }
        //将临时数组当中的代码放回原数组
        for (int j = 0; j < temp.length; j++) {
            a[j+low] = temp[j];
        }

    }
}
