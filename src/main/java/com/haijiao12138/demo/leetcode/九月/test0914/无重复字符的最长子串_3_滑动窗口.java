package com.haijiao12138.demo.leetcode.九月.test0914;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: haijiao12138
 * @ClassName: 无重复字符的最长子串_3-滑动窗口
 * @description: TODO
 * @date: 2021/9/14 12:33
 */
public class 无重复字符的最长子串_3_滑动窗口 {
    public static void main(String[] args) {

    }
    public static int lengthOfLongestSubstring(String s)
    {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int rk = -1,ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0){
                //左指针向右移动一格  移出一格字符
                set.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !set.contains(s.charAt(rk+1))){
                //不断的移动右指针
                set.add(s.charAt(i));
                ++rk;
            }
            //第i到rk个字符是一个极长的无重复字符串
            ans = Math.max(ans,rk-i+i);
        }
        return ans;
    }

    }
