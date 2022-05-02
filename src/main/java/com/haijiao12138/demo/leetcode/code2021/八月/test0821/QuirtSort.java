package com.haijiao12138.demo.leetcode.code2021.八月.test0821;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: QuirtSort
 * @description: TODO
 * @date: 2021/8/21 18:40
 */
public class QuirtSort {
    public static void main(String[] args) {
        int[] arr={49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    /**
     *	 定义方法，实现快速排序
     * @param arr     数组
     * @param left
     * @param right
     */
    public static void quicksort(int arr[],int left,int right){
        if(left > right){
            return;//如果左索引大于右索引  不合法 直接使用return结束
        }
        int base = arr[left];//顶你个亿变量保存基准数目
        int i= left;//定义变量i指向最左边
        int j = right;//定义变量j指向最右边
        while (i != j){
            while (arr[j] >= base && i<j){
                j--;//从右边搜索比基数小的  如果有 就停下
            }
            while (arr[i] <=base && i<j){
                i++;//从左边开始搜索比基数大的 如果有就停下
            }
            //符合条件  进行交换元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //如果while条件不成立  代表i和j相遇了  就停止检索
        arr[left] = arr[i];//交换基准数和这个相遇位置的元素
        arr[i] = base;//把基准数交给相遇位置的元素
        //交换完毕进行归位  左边的数字都比他小 右边的数字都比他大
        quicksort(arr,left,i-1);
        quicksort(arr,j+1,right);

    }
}
