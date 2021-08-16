package com.haijiao12138.demo.leetcode.test0803;/**
 * @author 候苑博
 * @date 2021/8/3 16:21
 * @description
 */

/**
 * @author
 * @description:打家劫舍II:
 * @date 2021/8/3
 *
 */
public class robRange {
    public static void main(String[] args) {
        int[] rob = {1,3,5,9,6};
        int rob1 = rob(rob);
        System.out.println("======="+rob1);

    }

    public static int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) {//数组不存在 直接返回空
            return nums[0];
        } else if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1));//规定下表的第一个起始和第二个额起始
    }

    public static int robRange(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }

}
