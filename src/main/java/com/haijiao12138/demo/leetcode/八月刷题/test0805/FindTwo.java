package com.haijiao12138.demo.leetcode.八月刷题.test0805;/**
 * @author 候苑博
 * @date 2021/8/5 14:50
 * @description
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author
 * @description
 * @date 2021/8/5
 *
 */
public class FindTwo {
    public static void main(String[] args) {
       /* Random random = new Random();
        int[] nums= new int[10];
        for(int i = 0;i<10;i++){
            nums[i]=random.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));*/
        int[] nums = {1,2,2,3,3,4,4,5};
        printTwoArray(nums);
    }

    public static void printTwoArray(int[] nums){
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        for(int i :map.keySet()){
            if(map.get(i)>1){
                System.out.print(i+" ");
            }
        }
    }
}
