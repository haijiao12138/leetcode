package com.haijiao12138.demo.leetcode.九月刷题.test0905;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: 复原Ip地址
 * @description: TODO
 * @date: 2021/9/5 10:21
 */
public class 复原Ip地址 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5};
        int[] b = {2, 3, 4, 6};//1 2 2 3 3 4 5 6
        int merge = merge(a, b, 6);
    }

    public static int merge(int[] a, int[] b, int n) {
        if (n > a.length + b.length) {
            return -1;
        }
        int aa = a.length;
        int bb = b.length;
        int c[] = new int[aa + bb];
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        for (i = 0, j = 0; i < aa; ) {
            if (a[i] > b[j]) {
                list.add(b[j]);//将小的放进去
                j++;
            } else {
                list.add(a[i]);//将小的放进去
                i++;
            }
        }
        if (i == a.length ) {
            for (int k = j; k < bb; k++) {
                list.add(b[k]);
            }
        }
    /*    if (j == b.length - 1) {
            for (int k = i; k < aa; k++) {
                list.add(a[k]);
            }
        }*/
        System.out.println(list);
        System.out.println(list.get(n));

        return list.get(n);
    }
}