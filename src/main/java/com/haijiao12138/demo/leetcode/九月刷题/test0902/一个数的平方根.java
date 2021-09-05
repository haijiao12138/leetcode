package com.haijiao12138.demo.leetcode.九月刷题.test0902;

/**
 * @author: haijiao12138
 * @ClassName: 一个数的平方根
 * @description: TODO
 * @date: 2021/9/2 14:16
 */
public class 一个数的平方根 {
    public static void main(String[] args) {
        double v = mySqrt(0.01);
        System.out.println(v);
//        for (double i = 0; i < 100; i++) {
//            //String ss=String.format("%.2f", i);
//            System.out.println(mySqrt(i));
//        }

    }
    public static double mySqrt(double x) {
        double l = 0, r = x, ans = -1;
        while (l <= r) {
            double mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 0.0001;
            } else {
                r = mid - 0.0001;
            }
        }
        return ans;
    }
}
