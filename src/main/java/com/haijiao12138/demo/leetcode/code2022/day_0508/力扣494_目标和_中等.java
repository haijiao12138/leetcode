package com.haijiao12138.demo.leetcode.code2022.day_0508;

/**
 * @ClassName 力扣494_目标和_中等
 * @Author houyuanbo
 * @Date 2022/5/8 15:46
 * @Description TODO
 * @Version  回溯法-递归遍历  耗时很严重；0-1背包动态规划
 **/
public class 力扣494_目标和_中等 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        int targetSumWays = findTargetSumWays(arr, 3);
        System.out.println(targetSumWays);
    }
 /*   static int count = 0;

    public static int findTargetSumWays(int[] nums, int target) {
        backtrack(nums,target,0,0);
        return count;
    }
    public static void backtrack(int[] nums,int target,int index,int sum){
        if (index == nums.length){//相当于遍历结束
            if (sum == target){
                count ++;
            }
        }else {
            backtrack(nums,target,index+1,sum+nums[index]);
            backtrack(nums,target,index+1,sum - nums[index]);
        }
    }*/
 /**
  * @Author houyuanbo
  * @Date 16:08 2022/5/8
  * @Param [nums, target]
  * @return
  * @Description //TODO  背包问题 sum(p) - sum（n）=target => sum(nums)是数组中所有的没符号的数的总和
  *     sum(nums)+sum(p) -sum(n) = target+sum(nums)
  *     2sum(p) = target+sum(nums)
  *     sum（p） = (target+sum(nums))/2;
  **/
    public static int findTargetSumWays(int[] nums, int target) {
        int sum  = 0;
        for (int num : nums) {
            sum+=num;
        }
        if (sum < target || (sum + target)%2 == 1){
            return 0;
        }
        int w = (sum +target)/2;//正数的总和
        int[] dp = new int[w+1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = w; j >= num ; j--) {
               dp[j] += dp[j - num];
            }
        }
        return dp[w];

    }
}
