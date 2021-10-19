package com.haijiao12138.demo.leetcode.九月.test0905;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author: haijiao12138
 * @ClassName: 二维数组根绝每个数组的第一个值进行排序
 * @description: TODO
 * @date: 2021/9/5 14:02
 */
public class 奥运金牌排序 {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{2,3,4}};//奥运金牌
        ArrayList<int[]> ints = new ArrayList<>();
        ints.add(new int[]{8, 2, 3});
        ints.add(new int[]{4, 5, 6});
        ints.add(new int[]{1, 3, 4});

        System.out.println("排序前：");
        for (int i = 0; i < ints.size(); i++) {
            System.out.println(Arrays.toString(ints.get(i)));
        }
        Collections.sort(ints,(a,b)->a[0]-b[0]);//正序排序
        System.out.println("排序后：");
        for (int i = 0; i < ints.size(); i++) {
            System.out.println(Arrays.toString(ints.get(i)));
        }

        //Arrays.sort(arr[0], (Comparator<Integer>) (o1, o2) -> o2-o1);
    }


}
