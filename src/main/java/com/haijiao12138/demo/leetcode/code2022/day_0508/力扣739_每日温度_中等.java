package com.haijiao12138.demo.leetcode.code2022.day_0508;

import java.util.Stack;

/**
 * @Author:候苑博
 * @Date: 1:49
 * description:
 * Todo:
 */
public class 力扣739_每日温度_中等 {
    public static void main(String[] args) {

    }
  /*  public static int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length - 1; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]){
                    res[i] = j - i;
                    break;//如果第一个有大于的 就立刻返回进行下一个的寻找
                }
            }
        }
        return  res;
    }*/

    /**
     *
     * @param temperatures
     * @return  单调栈
     */
  public static int[] dailyTemperatures(int[] temperatures) {
      int[] res = new int[temperatures.length];
      Stack<Integer> stack = new Stack<>();
      for (int i = 0; i < temperatures.length; i++) {
          //取出下标进行元素值的比较
          while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){//栈中存放的是数组中的前一个
              Integer preIndex = stack.pop();
              res[preIndex] = i - preIndex;//现在有比前一个大的
          }
          stack.push(i);
      }
      return res;

  }
}
