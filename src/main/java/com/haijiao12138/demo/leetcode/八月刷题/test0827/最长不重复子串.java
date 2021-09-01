package com.haijiao12138.demo.leetcode.八月刷题.test0827;

import java.util.HashMap;

/**
 * @author: haijiao12138
 * @ClassName: 最长不重复子串
 * @description: TODO
 * @date: 2021/8/27 17:30
 */
public class 最长不重复子串 {
    public static void main(String[] args) {

        String a = "abcabcbb";
        int i = lengthOfLongestSubstring(a);
        System.out.println(i);
    }
    public static int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> dic = new HashMap<>();
        int i = -1;
        int res = 0;
        for (int j = 0; j < s.length(); j++) {
            if (dic.containsKey(s.charAt(j))){
                i = Math.max(i,dic.get(s.charAt(j)));;//更新左指针 i
            }
            dic.put(s.charAt(j),j);//哈希表记录
            res = Math.max(res,j-i);//更新结果
        }
        return  res;


    }
}
