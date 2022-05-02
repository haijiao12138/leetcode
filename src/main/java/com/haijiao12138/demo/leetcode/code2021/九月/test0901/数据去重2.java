package com.haijiao12138.demo.leetcode.code2021.九月.test0901;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: 数据去重2
 * @description: TODO
 * @date: 2021/9/1 20:55
 */
public class 数据去重2 {
    public static void main(String[] args) {
        int[] data = new int[]{1,2,4,3,5,6,7,4,4};
        test(data);
    }
    private static void test(int[] data){
        //Arrays.sort(data);
        int[] ints = Arrays.stream(data).distinct().toArray();
        System.out.println(Arrays.toString(ints));
    }
}
