package com.haijiao12138.demo.leetcode.八月.test0829小冰面试;

/**
 * @author: haijiao12138
 * @ClassName: Leetcode717
 * @description: TODO
 * @date: 2021/8/30 21:01
 */
public class Leetcode717 {
    public static void main(String[] args) {
    int[] arr = {1,0,0};
        boolean oneBitCharacter = isOneBitCharacter(arr);
        System.out.println(oneBitCharacter);
    }
    public static boolean isOneBitCharacter(int[] bits){
        int start = 0;
        while (start < bits.length-1){
            if (bits[start] == 0){
                start++;
            }else {
                start+=2;//每次一个1都会与下一个1或者0进行配对
            }
        }
        return start == bits.length-1;
    }
}
