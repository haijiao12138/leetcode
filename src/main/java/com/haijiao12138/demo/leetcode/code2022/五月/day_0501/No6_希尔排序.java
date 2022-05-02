package com.haijiao12138.demo.leetcode.code2022.五月.day_0501;

import com.haijiao12138.demo.util.Swamp;

import java.util.Arrays;

/**
 * @ClassName No6_希尔排序
 * @Author houyuanbo
 * @Date 2022/5/2 13:12
 * @Description TODO  排序算法不稳定
 * @Version   选取一个间距  然后对指定间距的数进行排序 然后进行合并  一轮结束后 间距/2再次进行不同间距的排序  直至间距为1 排序结束
 **/
public class No6_希尔排序 {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,24,12,5,85,4,25};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public  static void  sort(int[] array){
        //定义一个中间交换的变量
        int temp = 0;
        //定义一个记录第几轮希尔排序的变量
        for (int gap = array.length/2; gap > 0 ; gap /= 2) { //定义每次排序的间距的变化
            for (int i = gap; i <array.length ; i++) {
                for (int j = i-gap; j >= 0 ; j= j-gap) {
                    if (array[j] > array[j+gap]){
                        //交换
                        Swamp.swapArr(array,j,j+gap);//交换二者的位置 大的放在前面
                    }
                }
            }
        }
    }


}
