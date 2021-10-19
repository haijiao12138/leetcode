package com.haijiao12138.demo.leetcode.九月.test0912;

/**
 * @author: haijiao12138
 * @ClassName: 选择
 * @description: TODO
 * @date: 2021/9/12 18:35
 */
public class 选择 {
    public static void main(String[] args) throws InterruptedException {
        new T2().start();
    }
   static class  T2 extends Thread{
        T2(){
            setName("MyThread");
        }
        @Override
        public void run(){
            System.out.println(getName()+"线程启动了");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
