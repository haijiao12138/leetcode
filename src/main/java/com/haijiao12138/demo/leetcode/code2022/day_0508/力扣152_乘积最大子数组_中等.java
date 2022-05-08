package com.haijiao12138.demo.leetcode.code2022.day_0508;

/**
 * @ClassName 力扣152_乘积最大子数组_中等
 * @Author houyuanbo
 * @Date 2022/5/8 17:11
 * @Description TODO
 * @Version
 **/
public class 力扣152_乘积最大子数组_中等 {
    public static void main(String[] args) {
    int[] arr = {2,3,-2,4};
        int i = maxProduct(arr);

    }

    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE,imax=1,imin=1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]< 0){//负数交换大小值
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax*nums[i],nums[i]);
            imin = Math.min(imin*nums[i],nums[i]);
            max = Math.max(max,imax);
        }
        return max;
    }
}
