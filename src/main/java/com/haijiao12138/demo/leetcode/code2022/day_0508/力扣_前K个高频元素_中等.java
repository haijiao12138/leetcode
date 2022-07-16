package com.haijiao12138.demo.leetcode.code2022.day_0508;

import com.haijiao12138.demo.leetcode.code2021.八月.test0825.HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @Author:候苑博
 * @Date:2022-05-08 22:07
 * description:
 * Todo:
 */
public class 力扣_前K个高频元素_中等 {
    public static void main(String[] args) {
        int[] arr={1};
        int[] ints = topKFrequent(arr,1);

    }


    public static int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length+1];
        for (int num : nums) {
                arr[num]++;
        }
        HashSet<Integer> integers = new HashSet<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                map.put(arr[i],i);
                integers.add(i);
            }

        }
        Object[] mapArr = map.keySet().toArray();

        if (mapArr.length >= k){
            for (int i = mapArr.length-1; i >=k-1 ; i--) {
                list.add(map.get(mapArr[i]));
            }
        }
        int[] result =new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            result[i++] = integer;
        }



        return result;


    }
}
