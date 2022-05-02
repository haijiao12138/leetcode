package com.haijiao12138.demo.leetcode.code2021.八月.a八大排序;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: a6希尔排序
 * @description: TODO
 * @date: 2021/8/29 22:58
 */
public class a6希尔排序 {
    public static void main(String[] args) {
        int[] array = {3,5,1,2,4,6,8,10,9};
        sort(array);
    }

    public static void  sort(int[] array){
        //1.定义一个用于进行交换的中间变量
        int temp = 0;
        //2.定义一个用于记录是希尔排序的第几轮排序
        int count = 0;
        //3.开始进行希尔排序 ,初始步长为数组长度的一半，每一次步长减半
        for(int gap = array.length / 2;gap > 0;gap /= 2) {
            //第一层for循环定义的是我们总共要多少次排序
            for(int i = gap;i < array.length;i++) {
                //遍历各组中的所有元素(共 gap组)，步长gap
                for(int j = i - gap;j >= 0; j-=gap) {
                    //如果当前元素大于 加上步长之后的那个元素，则进行交换
                    if(array[j] > array[j+gap]) {
                        temp = array[j];
                        array[j] = array[j+gap];
                        array[j+gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序的第"+(++count)+"轮排序的结果是："+ Arrays.toString(array));
        }

    }
}
