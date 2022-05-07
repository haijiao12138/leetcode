package main.java.com.haijiao12138.demo.leetcode.code2022.day_0501;

import java.util.Arrays;

/**
 * @ClassName No8_基数排序
 * @Author houyuanbo
 * @Date 2022/5/2 14:49
 * @Description TODO
 * @Version 将所有的数先按位补全成一样的位数的数 然后从低位进行排序 一致进行到高危 结束后 整个数组就有序了 是稳定的排序
 **/
public class No8_基数排序 {
    public static void main(String[] args) {
        int[] data = {654,123,7,12,987,122,234,18,46,10};
        Sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void Sort(int[] arr){
        //得到数组中最大数的位数
        int max = arr[0];//默认第一个是
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        int maxLength =String.valueOf(max).length();//得到最大数的位数
        int[][] bucket = new int[10][arr.length];
        int[] bucketElementCounts = new int[10];
        int n = 1;
        for (int h = 0; h < maxLength; h++) {
            for (int i = 0; i < arr.length; i++) {
                //读出每个元素个位的值
                int digitoElement = arr[i]/n % 10;
                //放入对应的桶中
                bucket[digitoElement][bucketElementCounts[digitoElement]] = arr[i];
                bucketElementCounts[digitoElement]++;
            }
            int index = 0;
            for (int k = 0; k < bucketElementCounts.length; k++) {
                //如果桶中有数据 我们放到原来的桶中
                if (bucketElementCounts[k] != 0){
                    //循环遍历 将桶中的数据放入
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        arr[index++] = bucket[k][l];
                    }
                }
                bucketElementCounts[k] = 0;//重新置0  等待下一次使用
            }
            n = n*10;

        }
    }

}
