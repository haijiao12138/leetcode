package com.haijiao12138.demo.leetcode.code2022.五月.day_0504;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName 力扣84_柱状图中最大的矩形
 * @Author houyuanbo
 * @Date 2022/5/4 13:23
 * @Description TODO
 * @Version   单调栈求解  739  496  42接雨水
 **/
public class 力扣84_柱状图中最大的矩形 {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int i = largestRectangleArea(arr);

    }

    public static  int largestRectangleArea(int[] heights){
        int[] tmp = new int[heights.length + 2];
        System.arraycopy(heights,0,tmp,1,heights.length);
        Deque<Integer> stack = new ArrayDeque<>();
        int area = 0;
        for (int i = 0; i < tmp.length; i++) {
            while (!stack.isEmpty() && tmp[i]<tmp[stack.peek()]){ //stack.peek()返回栈顶元素而不删除
                int h = tmp[stack.pop()]; //后面遍历的比前面小
                area = Math.max(area,(i - stack.peek()-1)*h);//分清楚底和高
            }
            stack.push(i);//放的是下标
        }
        return area;
    }


}
