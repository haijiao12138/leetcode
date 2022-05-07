package main.java.com.haijiao12138.demo.leetcode.code2022.day_0501;

import java.util.Arrays;

/**
 * @ClassName No7_归并排序
 * @Author houyuanbo
 * @Date 2022/5/2 13:26
 * @Description TODO
 * @Version  分治法递归求解  再合并   将数组递归分成最小的一块区域 就是每块为1个数  然后再合并起来
 **/
public class No7_归并排序 {
    public static void main(String[] args) {
        int arr[] = {5,3,6,89,56,34,67,12,34};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] a,int low,int high){
        if (low >= high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(a,low,mid);//递归左边
        mergeSort(a,mid+1,high);//递归右边
        merge(a,low,mid,high);
    }
    public static void merge(int[] a,int low,int mid,int high){
        int s1 = low;
        int s2 = mid+1;
        int[] temp = new int[high - low +1];
        int i = 0;//定义临时数组的下标
        //判断大小将数组放到临时数组中去
        while (s1<=mid && s2<=high){
            if (a[s1] <= a[s2]){
                temp[i++] = a[s1++];
            }else {
                temp[i++] = a[s2++];
            }
        }
        //将s1、s2中剩下的数据全部拷贝到临时数组中去
        while (s1<=mid){
            temp[i++] = a[s1++];
        }
        while (s2<=high){
            temp[i++] = a[s2++];
        }
        //将临时数组中的值放回原数组中
        for (int j = 0; j < temp.length; j++) {
            a[j+low] = temp[j];
        }

    }
}
