package com.haijiao12138.demo.leetcode.code2022.day_0508;

/**
 * @ClassName 力扣581_最短无序连续子数组_中等
 * @Author houyuanbo
 * @Date 2022/5/8 13:21
 * @Description TODO
 * @Version
 **/
public class 力扣581_最短无序连续子数组_中等 {
    public static void main(String[] args) {

    }

    public static int findUnsortedSubarray(int[] nums) {
        if (nums.length <=1){
            return 0;
        }
        int max = nums[0];
        int high = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= max){
                max = nums[i];
            }else {
                high = i;//找到最右边不符合排序的数的下标
            }
        }
        int min = nums[nums.length - 1];
        int low = nums.length -1;
        for (int i = nums.length-2; i >=0; i--) {
            if (nums[i] <= min){
                min = nums[i];
            }else{
                low = i;
            }
        }
        return high >= low ? high - low +1:0;
    }
}
