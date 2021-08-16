package com.haijiao12138.demo.leetcode;/**
 * @author 候苑博
 * @date 2021/8/1 17:18
 * @description
 */

import java.util.*;

import  java.util.Arrays.*;

/**
 * @author
 * @description
 * @date 2021/8/1
 *
 */
public class testPork {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,0,0,2,1};
        int[] test1 = test(test);
//        for (int i : test1) {
//            System.out.print(" "+i);
//        }
        System.out.println(Arrays.toString(test1));
        //System.out.println(test1);//排序输出
    }

    private static int[] test(int[] rains){
        int[] ans = new int[rains.length];
        Arrays.fill(ans, 1);
        Map<Integer, Integer> water = new HashMap<>();
        TreeSet<Integer> zero = new TreeSet<>();
        for(int i = 0; i < rains.length; ++i){
            int rain = rains[i];
            if(rain == 0){//晴天，存下标
                zero.add(i);
                continue;
            }
            if(water.containsKey(rain)){//下雨天，且这个湖泊已经下过雨了
                Integer r = zero.higher(water.get(rain));//找到之前一次下雨的下标所对应的下一个晴天下标
                if(r == null) return new int[]{};//如果没有满足要求的晴天下标，返回空数组
                ans[r] = rain;//清空的湖泊下标
                zero.remove(r);//移除已经使用过的晴天
            }
            water.put(rain, i);//存放下雨的湖泊
            ans[i] = -1;//下雨不能操作
        }
        return ans;
    }
}
