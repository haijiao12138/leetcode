package com.haijiao12138.demo.leetcode.九月.test0904;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: 移动0
 * @description: TODO  在原来数组的位置 将后面不为0的一个一个移动到前面  进行替换
 * @date: 2021/9/4 14:03
 */
public class 移动0 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeros(arr);
    }
    public static void moveZeros(int[] nums){
        int i=0;
        for (int j = 0; j < nums.length; j++) {
                if (nums[j] == 0){

                }else {
                    nums[i++] = nums[j];
                }
        }
        for (int k =i;k<nums.length;k++){
            nums[k] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
