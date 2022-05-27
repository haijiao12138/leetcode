package main.java.com.haijiao12138.demo.leetcode.code2022.day_0501;

import java.util.Arrays;

/**
 * @ClassName No1_冒泡排序
 * @Author houyuanbo
 * @Date 2022/5/1 18:11
 * @Description TODO
 * @Version 时间复杂度O(n2)
 * hybhybhyb
 **/
public class No1_冒泡排序 {
    static int[] arr = new int[]{8,65,41,8,7,5,9,45,23,11};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
