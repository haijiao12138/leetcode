package com.haijiao12138.demo.leetcode.九月刷题.test0905;

/**
 * @author: haijiao12138
 * @ClassName: 位1的个数
 * @description: TODO
 * @date: 2021/9/5 9:32
 */
public class 位1的个数 {
    public static void main(String[] args) {
        int a  = 00000000000000000000000010000000;
        int i = hammingWeight(a);
        System.out.println("1的个数是："+i);
    }
    public static int hammingWeight(int n){

        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n &(1 << i)) != 0){
                ret++;
            }
        }
        return ret;
    }
}
