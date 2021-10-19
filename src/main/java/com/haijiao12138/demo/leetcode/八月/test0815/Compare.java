package com.haijiao12138.demo.leetcode.八月.test0815;

/**
 * @author: haijiao12138
 * @ClassName: Compare
 * @description: TODO
 * @date: 2021/8/16 16:13
 */
public class Compare {
    public static void main(String[] args) {

       String a="hello";
       String  b="hello";
       int s = 1;
       int g = 1;
       String aa = new String("abc");
       String bb = new String("abc");

        System.out.println(s==g);
        System.out.println(a==b);
        System.out.println(aa==bb);
        System.out.println(aa.equals(bb));
        int i = aa.hashCode();
        System.out.println("============="+i);
        System.out.println("============="+i);

    }
}
