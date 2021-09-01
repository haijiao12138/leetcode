package com.haijiao12138.demo.leetcode.八月刷题.a八大排序;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: a5快速排序
 * @description: TODO
 * @date: 2021/8/29 22:57
 */
public class a5快速排序 {
    public static void main(String[] args) {
        int[] arr = new int[] {6,1,2,7,9,3,4,5,10,8};
        quickSort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));

    }

    /**
     *	 定义方法，实现快速排序
     * @param arr     数组
     * @param left
     * @param right
     */
    public static void quickSort(int arr[],int left,int right) {
        // 进行判断 如果左边索引比右边的索引要大 是不合法的 直接使用 return 结束这个方法
        if (left > right) {
            return ;
        }

        //定义变量保存基准数
        int base = arr[left];
        //定义变量 i 指向最左边
        int i = left;
        //定义变量 j 指向最右边
        int j = right;

        //当 i 和  j 不相遇的时候，再循环中进行解锁
        while (i != j) {
            //先由j 从 右向左检索比基准数小的，如果检索到比基准数小的就停下
            while (arr[j] >= base && i < j) {
                j--; //j从右往左移动
            }
            // i 从左向右检索
            while (arr[i] <= base && i < j) {
                i++; //i从右往左移动
            }
            //代码走到这里。i 和 j 都停下了，然后交换 i 和 j的位置元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // 如果while循环条件不成立，这就代表了 i和 j相遇了，就停止检索
        //交换基准数和这个相遇位置的元素进行交换
        arr[left] = arr[i];
        //把基准数赋值给相遇位置的元素
        arr[i] = base;

        //交换完成之后基准数就归位了 左边的数字都比他小 右边的都比他大
        //下一步该排基准数的左边
        quickSort(arr, left, i -1);
        //排右边
        quickSort(arr, j+1, right);
    }
}
