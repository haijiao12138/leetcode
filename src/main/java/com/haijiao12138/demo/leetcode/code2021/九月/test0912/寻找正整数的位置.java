package com.haijiao12138.demo.leetcode.code2021.九月.test0912;

/**
 * @author: haijiao12138
 * @ClassName: 寻找正整数的位置
 * @description: TODO
 * @date: 2021/9/12 17:45
 */
public class 寻找正整数的位置 {

    public static void main(String[] args) {
        int[] a = {1,0,0,0,2,0,3,4,5,6,7,8,9};
        int search = search(a, 2);
        System.out.println(search);
    }
    public static int search(int[] array,int q){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == q){
                temp = i;
            }
        }
        return temp;
    }
}
