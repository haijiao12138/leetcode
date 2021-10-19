package com.haijiao12138.demo.leetcode.九月.test0911;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: haijiao12138
 * @ClassName: Test2
 * @description: TODO
 * @date: 2021/9/11 14:13
 */
public class Test2华为od {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int i = maxLength(a);
        System.out.println(i);
    }
    public static int maxLength(String s){
        int max = 0;
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');set.add('o');set.add('u');set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        int count = 0;
        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (set.contains(c)){
                count++;
                max=Math.max(count,max);
            }else {
                count=0;
            }
        }
        return max;
    }

}
