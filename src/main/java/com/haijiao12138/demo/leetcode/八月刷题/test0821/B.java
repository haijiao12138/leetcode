package com.haijiao12138.demo.leetcode.八月刷题.test0821;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: haijiao12138
 * @ClassName: B
 * @description: TODO
 * @date: 2021/8/21 20:12
 */
public class B {
    public static void main(String[] args) {
        int[] ints = test01(1, "0");
        System.out.println(Arrays.toString(ints));
    }
    public static int[] test01(int n,String S) {

        int[] B=new int[n];
        Map<Double, Integer> map = new HashMap<>();
        int r = S.charAt(0) == '1' ? 1 : 0;
        B[0] = 1;
        map.put((double) (r/1),0);
        for (int i = 0; i < n; i++) {
            r= r + (S.charAt(i) == '1' ? 1 : 0);
            B[i] = 1;
           double key =  (double)r / (i+1);
            Integer value = map.get(key);
            if(map.get(key) !=null){
                B[i]  += B[value];
            }
            map.put((double) (key),i);
        }
        return B;
    }
}
