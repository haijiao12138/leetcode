package com.haijiao12138.demo.leetcode.九月.test0912;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: haijiao12138
 * @ClassName: 字符串中连续出现次数最多的数字和出现的次数
 * @description: TODO
 * @date: 2021/9/12 17:05
 */
public class 字符串中连续出现次数最多的数字和出现的次数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String test = test(s);
        System.out.println(test);
    }
    public static String test(String s){
        int count =0;
        Map<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < s.length()-1; i++) {
            char c = s.charAt(i);
            if (s.charAt(i) == s.charAt(i+1)  ){
                count++;
                if (((i+2)==s.length())){ //判断是不是到了最后一个字符 比如这种情况 1444112442aa444422443112222222 最
                    map.put(++count,s.charAt(i));
                }
            }else{
                map.put(++count,s.charAt(i));
                count=0;
            }
        }

        int max = 0;
        for (Integer integer : map.keySet()) {
            System.out.println(integer+"--"+map.get(integer));
            max=Math.max(max,integer);
        }

        Character character = map.get(max);


        return "字符是："+character+"出现次数是："+max;
    }
}
