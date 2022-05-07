package main.java.com.haijiao12138.demo.leetcode.code2022.day_0501;

import java.util.Arrays;

/**
 * @ClassName No2_插入排序
 * @Author houyuanbo
 * @Date 2022/5/1 18:22
 * @Description TODO
 * @Version
 **/
public class No2_插入排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{6,5,8,4,9,44,12};// 5 - 6
        Sort(arr);

    }

    public static void Sort(int[] arr){
        int j = 0;//第一部分
        for (int i = 1; i < arr.length; i++) { //第二部分开始遍历  逐渐放到第一部分（和第一部分的数据进行比较大小放到合适的位置）
            int temp = arr[i];
            //插入数据到第一部分有序的数组中去
            for (j = i-1;j>=0;j--){ //因为第一部分总是有序的 所以比较插入的时候 倒着比较并插入就好 （倒叙比较并插入）
                if (arr[j] > temp){ //前面一个比当前大 就交换一下   temp是当前
                    arr[j+1] = arr[j]; //前面的不断往后移位
                }else {
                    break;//遇到 比较的当前位置 比要判断的小 前面的 也就不用比较了 因为前面的一定是有序的
                }
            }
            arr[j+1] = temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
