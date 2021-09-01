package com.haijiao12138.demo.leetcode.八月刷题.a八大排序;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: a8基数排序
 * @description: TODO
 * @date: 2021/8/29 23:17
 */
public class a8基数排序 {
    public static void main(String[] args) {
        int[] data = {654,123,7,12,987,122,234,18,46,10};
        sort(data);

    }
    //基数排序方法
    public static void sort(int[] arr) {

        //得到数组当中最大数的位数
        int max = arr[0]; //假设第一个数就是最大数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max ) {
                max = arr[i];
            }
        }
        //得到最大数的位数
        int maxLength = (max + "").length();

        //定义一个二维数组，表示10个桶，每个桶就是一个一位数组
        //说明
        //1.二维数组包含10个一位数组
        //2.为了防止放入数的时候，数据溢出，则每一个一位数组(桶)，大小定义为arr.length
        //3.明确：基数排序是使用空间换时间的经典算法
        int[][] bucket = new int[10][arr.length];
        //为了记录每个桶当中实际存放了多少数据，我们定义一个一位数组来记录每个桶的每次被放入的数据个数
        //可以这样理解：比如 bucketElementCounts[0],记录的就是bucket[0]桶的放入数据个数
        int[] bucketElementCounts = new int[10];

        //定义能够针对这个位的除数
        int n = 1;

        //这里我们可以使用循环将代码处理
        //第一轮（真的每个元素的个位进行处理）
        for (int h = 0 ; h < maxLength; h++) {
            for (int i = 0; i < arr.length; i++) {
                //取出每个元素的个位的值
                int digitofElement = arr[ i ] / n % 10;
                //放入对应的桶当中
                bucket[digitofElement][bucketElementCounts[digitofElement]] = arr[i];
                bucketElementCounts[digitofElement] ++;
            }
            //按照这个桶的顺序(一位数组的下标依次取出数据，放入原来的数组)
            int index = 0;
            //遍历每一个桶，并将桶当中的数据放入到原数组
            for(int k=0;k < bucketElementCounts.length;k++) {
                //如果桶中有数据我们才放入到原数组当中
                if(bucketElementCounts[k] !=0) {
                    //循环遍历，将桶当中的数据放入
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        arr[index++] = bucket[k][l];
                    }
                }
                //第一轮处理后 bucketElementCounts[k] 置0  ，，，这个很重要
                bucketElementCounts[k] = 0;

            }
            n = n*10;
            System.out.println("第一轮的排序结构"+ Arrays.toString(arr));
        }

    }
}
