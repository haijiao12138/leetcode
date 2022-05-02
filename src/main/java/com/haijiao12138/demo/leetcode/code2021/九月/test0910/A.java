package com.haijiao12138.demo.leetcode.code2021.九月.test0910;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author: haijiao12138
 * @ClassName: A
 * @description: TODO
 * @date: 2021/9/10 20:36
 */

public class A {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] ints = test1(a);
        System.out.println(Arrays.toString(ints));
        int[] ints1 = test2(ints);
        System.out.println(Arrays.toString(ints1));
        int i = test3(ints1);
        System.out.println("======="+i);
    }
//    public static int answer(int[] a){
//        return test3(test2(test1(a)));
//    }

    //方法1
    private static int[] test1(int[] a){
        if(a == null || a.length == 0){
            return a;
        }
        // 声明一个栈
        Stack<Integer> stack  = new Stack<>();
        int l1 =  a.length > 10 ? 11 : a.length;
        // 入栈
        for (int i = 0; i < l1; i++) {
            stack.push(a[i]);
        }
        int l2 = stack.size() > 6 ? 6 :stack.size();
        for (int i = 0; i < l2; i++) {
            stack.pop();
        }
        if(stack.empty()){
            // 少于7个元素，已全部出栈
            return new int[]{};
        }
        // 接收下一步结果
        int[] a1 = new int[stack.size()];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = stack.pop();
        }
        return a1;
    }

    //方法2
    private static int[] test2(int[] a1){
        if(a1.length<2){
            return a1;
        }else{
            for(int m=0;m<a1.length;m++){
                for(int n=m+1;n<a1.length;n++){
                    if(a1[m]+a1[n]==46){
                        return new int[]{m,n};
                    }
                }
            }
            return new int[]{a1[0],a1[1]};
        }

    }

    //方法3
    private static int test3(int[] a2){
        if(a2.length==0)return 0;
        if(a2.length==1)return a2[0];
        if(a2.length>=18){
            return a2[17];
        }else{
            int t=2;
            int x=18;
            while(a2.length-1<Math.floorDiv(x,t)){
                t*=2;
            }
            return a2[Math.floorDiv(x,t)];
        }
    }
}

