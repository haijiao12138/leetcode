package main.java.com.haijiao12138.demo.leetcode.code2022.day_0501;

import java.util.Arrays;

/**
 * @ClassName No3_简单选择排序
 * @Author houyuanbo
 * @Date 2022/5/1 19:18
 * @Description TODO
 * @Version   也是分为两部分   从后面的一部分中不断比较并从中从选取一个最小的  然后直接放到前面
 *              直接插入： 分为两部分  从后面中选取一个  然后仿造前面 在前面进行倒叙比较交换
 **/
public class No3_简单选择排序 {

    public static void main(String[] args) {
        int[] arr = {8,9,1,7,5,85,12,45,6};
        System.out.println("排序前---");
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  static void selectSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;//将当前坐标值作为最小值  以后哟用此变量来记录
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {//每进行一轮 选取一个最小的与前面的进行交换 并放在合适的位置
                    if (min > arr[j]){
                        min = arr[j];
                        minIndex = j;//记录当前最小值和最小的坐标
                    }
            }
            //记录完毕一组后  将持有的最小值和最小坐标进行交换
            arr[minIndex] = arr[i];
            arr[i] = min;

        }
    }
}
