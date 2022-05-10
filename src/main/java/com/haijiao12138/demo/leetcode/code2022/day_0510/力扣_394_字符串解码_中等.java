package com.haijiao12138.demo.leetcode.code2022.day_0510;

import lombok.var;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName 力扣_394_字符串解码_中等
 * @Author houyuanbo
 * @Date 2022/5/10 11:12
 * @Description TODO
 * @Version 双栈压入法
 * 输入：s = "3[a]2[bc]"
 * 输出："aaabcbc"
 **/
public class 力扣_394_字符串解码_中等 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String s1 = decodeString(s);
        System.out.println(s1);
    }
    public static String decodeString(String s) {
        int i = 0;
        char[] arr = s.toCharArray();
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<StringBuilder> stack2 = new ArrayDeque<>();
        stack2.push(new StringBuilder());
        while (i < arr.length){
            char c = arr[i];
            //数字入栈
            if (c<='9' && c>='0'){
                int p = i;//记录初始数字的位置 为了防止两位的数字和3位数字  直接截取再转换成Integer
                while (i<arr.length && arr[i]<='9' &&arr[i]>='0'){
                    i++;
                }
                stack.push(Integer.parseInt(s.substring(p,i)));
                stack2.push(new StringBuilder());
            }else if (c>='a' && c<='z'){
                //字符串的入栈
                stack2.peek().append(c);//字符追加
            }else if (c ==']'){
                Integer time = stack.pop();
                StringBuilder lastSb = stack2.pop();
                StringBuilder d = new StringBuilder(lastSb);//建立新的连接地址 防止二者串位置
                for (Integer integer = 2; integer <= time; integer++) {
                    lastSb.append(d);
                }
                stack2.peek().append(lastSb);
            }
            i++;
        }


        return stack2.peek().toString();



    }

}
