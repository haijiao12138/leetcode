package com.haijiao12138.demo.leetcode.八月.test0803;/**
 * @author 候苑博
 * @date 2021/8/3 14:12
 * @description
 */

/**
 * @author
 * @description：打家劫舍I，leetcode198
 * @date 2021/8/3
 *
 */
public class Hobby {
    public static void main(String[] args) {
        int[] rob = {1,2,3,1};
        int rob1 = rob(rob);
        System.out.println("======="+rob1);

    }

    public static int rob(int[] nums){
        if (nums==null || nums.length==0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];//只有一个元素  返回本身
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);
        for (int i =2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
       /* for (int i : dp) {
            System.out.println("----"+i);
        }*/
        return dp[nums.length-1];
    }
}
