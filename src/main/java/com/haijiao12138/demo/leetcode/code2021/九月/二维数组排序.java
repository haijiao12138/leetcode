package com.haijiao12138.demo.leetcode.code2021.九月;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: haijiao12138
 * @ClassName: 字节题1
 * @description: TODO
 * @date: 2021/9/12 10:08
 */
public class 二维数组排序 {
    public static void main(String[] args) {

        int[][] arr = {
                {1,3,5,6},
                {1,1,5,7},
                {2,1,5,6}
        };
        //方法1
        Arrays.sort(arr, (o1, o2) -> (o1[0] - o2[0]!=0) ?o1[0]-o2[0] :o1[1]-o2[1]);

        //方法2
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
    }
}
