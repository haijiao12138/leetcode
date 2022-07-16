package com.haijiao12138.demo.leetcode.code2022.day_0531;

import java.util.*;

/**
 * @Author:候苑博
 * @Date:2022-05-31 21:15
 * description:  小顶堆排序
 * Todo:
 */
public class 力扣_前k个高频元素 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int[] ints = topKFrequent(arr, 2);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        //根据map的value值进行正排序   相当于一个小顶堆
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o1.getValue() - o2.getValue());
        for (Map.Entry<Integer, Integer> entry : entries) {
            queue.offer(entry);
            if (queue.size() > k){
                queue.poll();
            }
        }
        for (int i =  k -1 ; i >= 0 ; i--) {
            result[i] = queue.poll().getKey();
        }

        return result;

    }
    
}
