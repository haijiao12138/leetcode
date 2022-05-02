package com.haijiao12138.demo.leetcode.code2021.八月.test0810;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author: 候苑博
 * @ClassName: FindMaxRightWithStack
 * @description: TODO
 * @date: 2021/8/10 16:17
 *
 */
public class FindMaxRightWithStack {
    public static void main(String[] args) {
    int[] arr = {1,5,3,6,4,8,9,10};
        int[] maxRightWithStack = findMaxRightWithStack(arr);
        System.out.println(Arrays.toString(maxRightWithStack));
    }


    public static int[] findMaxRightWithStack(int[] array){
        if (array == null){
            return null;
        }
        int n =array.length;
        int[] ret = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int i=1;
        while (i<n){
            if(!stack.isEmpty() && array[i] > array[stack.peek()]){
                ret[stack.pop()] = array[i];
            }else{
                stack.push(i++);
            }
        }
        while (!stack.isEmpty()){
            ret[stack.pop()] = -1;
        }
        return  ret;

    }
}
