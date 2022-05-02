package com.haijiao12138.demo.util;

/**
 * @ClassName Swamp
 * @Author houyuanbo
 * @Date 2022/5/2 12:50
 * @Description TODO  互相交换元素的工具类
 * @Version
 **/
public class Swamp {
    //交换制定数组中的指定下标的位置
    public static void swapArr(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
