package com.haijiao12138.demo.leetcode.code2022.day_0508;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName 力扣560_和为k的子数组_中等
 * @Author houyuanbo
 * @Date 2022/5/8 13:36
 * @Description TODO
 * @Version   连续子数组
 **/
public class 力扣560_和为k的子数组_中等 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,-4,5,-1,6,-2};
        // 2 3 -1
        //,2,3,-1,-4,5,-1
        // **5 -1
        // **4 5 -1 6 -2
        // **6 -2
        int i = subarraySum(arr, 4);
        System.out.println("力扣560_和为k的子数组_中等.main"+i);
    }
    public static int subarraySum(int[] nums, int k) {// 2 3 4 5 6    20
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0,ret = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)){//减去后有包含的  说明肯定之前的数加上k等于总数
                ret += map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1); //2 1；5
        }
        return ret;
    }
}
