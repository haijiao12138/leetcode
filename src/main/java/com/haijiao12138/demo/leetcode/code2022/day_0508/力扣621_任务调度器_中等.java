package com.haijiao12138.demo.leetcode.code2022.day_0508;

import java.util.Arrays;

/**
 * @ClassName 力扣621_任务调度器_中等
 * @Author houyuanbo
 * @Date 2022/5/8 12:47
 * @Description TODO
 * @Version
 **/
public class 力扣621_任务调度器_中等 {
    public static void main(String[] args) {
        char[] arr =  {'A','A','A','B','B','B'};
        int i = leastInterval(arr,2);
    }
    public static int leastInterval(char[] tasks, int n) {
        if (tasks.length <= 0  || n <1){
            return tasks.length;
        }
        int[] counts = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            counts[tasks[i] - 'A']++;
        }

        Arrays.sort(counts);
        int maxCount = counts[25];
        int retCount = (maxCount - 1) * (n + 1) + 1;//取最大的字母的数量 中间插入其他的字母和待命字样  一共有maxCount-1组  每组有 n+1个 加上最后剩下的那个 是总数
        int i = 24;
        while (i > 0 && counts[i] == maxCount){//以防出现相同的字符的次数  这时候就进行+1操作
            retCount++;
            i --;
        }


        return Math.max(retCount,tasks.length);
    }
}
