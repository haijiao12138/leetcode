package com.haijiao12138.demo.leetcode.test0813;/**
 * @author 候苑博
 * @date 2021/8/13 20:46
 * @description
 */

import java.util.Arrays;

/**
 * @author: 候苑博
 * @ClassName: Test1
 * @description: TODO
 * @date: 2021/8/13 20:46
 *
 */
public class Test1 {
    public static void main(String[] args) {

        int[] test = test(4, 6);
        System.out.println(Arrays.toString(test));
    }
    public static int[] test(int n,int m){
        int[] A = new int[n];
        A[0] = 1;
        int num = (m-1) / (n-1);
        boolean zheng = num % 2 == 0;
        int yu = (m-1) % (n-1);
        for (int i = 0; i < n - 1; i++) {
            A[i] = num + ((zheng && i<=yu || !zheng && i>=n-yu-1) ? 1:0);
        }
        A[0] += num /2;
        A[n-1] +=(num + 1) /2;
        return A;
    }
}
