package com.haijiao12138.demo.leetcode.九月.test0912;

import java.util.Scanner;

/**
 * @author: haijiao12138
 * @ClassName: 递归实现回文串
 * @description: TODO
 * @date: 2021/9/12 16:51
 */
public class 递归实现回文串 {
    static String s=new String();
    static int len=0;
    static int k;
    public static boolean  f(int i,int j)
    {
        if(i==k&&s.charAt(i)==s.charAt(j))//判断结束的条件
        {
            System.out.println("true");
            return true;
        }

        if(s.charAt(i)==s.charAt(j))//若满足则进行下一步的递归
            f(i+1,j-1);
        else//若不满足则输出
        {
            System.out.println("false");
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
        int k=0;
        len=s.length();//获取字符串长度
        if(len%2==0)//通过奇偶个数来找到中间值
            k=len/2-1;//找到中间的下标
        else
            k=len/2;//找到中间的下标
        if(len==1||len==0)//若是空串或只有一个字符
            System.out.println("true");
        else
        {
            f(0,len-1);//递归计算
        }
    }
}