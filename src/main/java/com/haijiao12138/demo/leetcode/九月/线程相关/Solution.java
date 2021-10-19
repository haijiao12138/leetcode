package com.haijiao12138.demo.leetcode.九月.线程相关;

/**
 * @author: haijiao12138
 * @ClassName: Solution
 * @description: TODO
 * @date: 2021/9/5 22:32
 */
public class Solution extends Thread  {

    @Override
  public void run(){
      System.out.println("创建多线程1");
      ///================================
  }

    public static void main(String[] args) {

        Solution myThread = new Solution();
       // myThread.start();
        myThread.run();
        //System.out.println("运行结束！");
    }

}
