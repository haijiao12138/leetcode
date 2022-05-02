package com.haijiao12138.demo.leetcode.code2022.五月.day_0502;

import com.haijiao12138.demo.util.Swamp;

import java.util.Arrays;

/**
 * @ClassName 力扣31_下一个排列_中等
 * @Author houyuanbo
 * @Date 2022/5/2 18:01
 * @Description TODO  数组中两个最小的数进行交换 然后将最小的数以及右边的数进行升序排列即为较大的数
 * @Version
 **/
public class 力扣31_下一个排列_中等 {
    public static void main(String[] args) {
    int[] arr ={4,5,2,6,3,1};
    nestPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nestPermutation(int[] nums){//找到倒数第2,3个最小的数
        int i = nums.length - 2;
        while ( i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if (i >= 0){
            int j = nums.length - 1;
            while (j >=0 & nums[i] >= nums[j]){
                j --;
            }
            Swamp.swapArr(nums,i,j);
        }
        reverse(nums,i+1);//重新排列i后面的数字 按着从小到大的顺序
    }
    public  static void reverse(int[] nums,int start){
        int left = start,right = nums.length - 1;
        while (left < right){//交换之后 剩下的部分肯定是降序排列的
            Swamp.swapArr(nums,left,right);
            left++;
            right--;
        }
    }
}
