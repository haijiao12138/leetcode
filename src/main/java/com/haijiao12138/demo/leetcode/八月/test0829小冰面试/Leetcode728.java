package com.haijiao12138.demo.leetcode.八月.test0829小冰面试;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: Leetcode
 * @description: TODO
 * @date: 2021/8/30 20:23
 */
public class Leetcode728 {
    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(1, 22);
        System.out.println(list);
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            Boolean aTrue = isTrue(i);
            if (aTrue == true){
                list.add(i);
            }
        }

        return list;
    }
    public static Boolean isTrue(int m){
        String s = String.valueOf(m);//int类型转化为String类型
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer a = Integer.valueOf(String.valueOf(s.charAt(i)));//char类型转化为String类型
            if (a!=0 && m % a == 0){
                count++;
            }
        }
        if (count == s.length()){
            return true;
        }
        return false;
    }
}
