package com.haijiao12138.demo.leetcode.九月.test0914;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: haijiao12138
 * @ClassName: 无重复字符的最长子串_3-连续
 * @description: TODO
 * @date: 2021/9/14 12:33
 */
public class 无重复字符的最长子串_3 {
    public static void main(String[] args) {
       // String a="abcabcbb";
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.next();
        int i = maxLength("");
        System.out.println("===="+i);

    }
    public static int maxLength(String s){
        int count = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))){
                max = Math.max(count,max);
                count = 1;
            }else {
                set.add(s.charAt(i));
                count++;
            }
        }
        return max;
    }
}
