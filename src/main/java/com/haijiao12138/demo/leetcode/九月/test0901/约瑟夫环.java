package com.haijiao12138.demo.leetcode.九月.test0901;

/**
 * @author: haijiao12138
 * @ClassName: 约瑟夫环
 * @description: TODO
 * @date: 2021/9/1 23:16
 */
public class 约瑟夫环 {
    public static void main(String[] args) {
        lastPeople(5,3);
    }
    public static void lastPeople(int n,int k){
        int res =0;
        for(int i=2;i<=n;i++){
            res = (res +3)%i;
        }
        System.out.println((res+1));
    }
}
