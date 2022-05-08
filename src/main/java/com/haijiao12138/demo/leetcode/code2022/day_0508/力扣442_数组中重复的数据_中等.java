package com.haijiao12138.demo.leetcode.code2022.day_0508;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName 力扣442_数组中重复的数据_中等
 * @Author houyuanbo
 * @Date 2022/5/8 17:37
 * @Description TODO
 * @Version
 **/
public class 力扣442_数组中重复的数据_中等 {
    public static void main(String[] args) {
        int[] arr = {1,8,6,7,2,3,4,5};
        findDuplicates(arr);
    }

    public static List<Integer> findDuplicates(int[] nums) {//平安无事的情况下  所有的位置 最后都是负数
        List<Integer> rs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])-1]<0){//每个数对应的小彪未知 应该是唯一的 在正常的情况下
                //如果是负数 就证明出现过 直接放进去
                rs.add(Math.abs(nums[i]));
            }else {
                nums[Math.abs(nums[i])-1]*=-1;
            }
        }
        return rs;
    }
}
