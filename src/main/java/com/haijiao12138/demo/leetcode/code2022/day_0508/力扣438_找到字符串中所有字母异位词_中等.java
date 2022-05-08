package com.haijiao12138.demo.leetcode.code2022.day_0508;

import com.haijiao12138.demo.leetcode.code2021.八月.test0805.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName 力扣438_找到字符串中所有字母异位词_中等
 * @Author houyuanbo
 * @Date 2022/5/8 16:49
 * @Description TODO
 * @Version  滑动窗口
 *
 **/
public class 力扣438_找到字符串中所有字母异位词_中等 {
    public static void main(String[] args) {

    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int length = s.length();
        int length1 = p.length();
        if (length < length1){
            return list;
        }
        int[] countS = new int[26];
        int[] countP = new int[26];
        //各自统计每个字符串中字符出现的次数
        for (int i = 0; i < length1; i++) {
            countS[s.charAt(i) - 'a']++;
            countP[p.charAt(i) - 'a']++;//是一定的  不断的移动countS
        }
        if (Arrays.equals(countS,countP)){
            list.add(0);
        }
        for (int i = length1; i <length ; i++) {
            countS[s.charAt(i) - 'a']++;
            countS[s.charAt(i - length1)-'a']--; //窗口不断向前滑动 并将之前的痕迹抹去
            if (Arrays.equals(countP,countS)){   //a s d
                list.add(i - length1+1);
            }
        }
        return list;

    }

}
