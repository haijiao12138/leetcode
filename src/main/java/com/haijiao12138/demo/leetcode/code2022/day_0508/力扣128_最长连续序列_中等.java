package com.haijiao12138.demo.leetcode.code2022.day_0508;

import org.thymeleaf.standard.processor.AbstractStandardMultipleAttributeModifierTagProcessor;

import java.util.HashSet;

/**
 * @Author:候苑博
 * @Date:2022-05-08 1:10
 * description:
 * Todo:
 */
public class 力扣128_最长连续序列_中等 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,8,7,9,8,5,6};
        longestConsecutive(arr);
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);//去重加排序
        }
        int maxLen = 0;
        for (Integer num : set) {
            if (!set.contains(num-1)){
                //前一个不包括的话
                int cur = num;//取当前的数作为新的开始
                int curLen = 1;
                while (set.contains(cur+1)){
                    cur++;
                    curLen++;
                }
                maxLen = Math.max(maxLen,curLen);
            }
        }

        return maxLen;
    }
}
