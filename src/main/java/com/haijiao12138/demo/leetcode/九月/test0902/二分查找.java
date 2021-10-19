package com.haijiao12138.demo.leetcode.九月.test0902;

/**
 * @author: haijiao12138
 * @ClassName: 二分查找
 * @description: TODO
 * @date: 2021/9/2 20:06
 */
public class 二分查找 {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,23};
        int k = 4;
        int search = search(arr, k);
        System.out.println(search);
    }
    public static  int search(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)-1;
            if (nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else {
                return mid;
            }
        }
        return  -1;
    }
}
