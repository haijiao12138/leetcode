package com.haijiao12138.demo.leetcode.八月.test0829小冰面试;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: Leetcode1089
 * @description: TODO
 * @date: 2021/8/30 21:07
 */
public class Leetcode1089 {
    public static void main(String[] args) {
      /*  int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] ints = duplicateZeros(arr);
        System.out.println(Arrays.toString(ints));*/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());
    }

    public static int[] duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (arr[i] == 0) {
                list.add(0);
            }
            arr[i] = list.get(i);
        }
    return arr;
    }

}
