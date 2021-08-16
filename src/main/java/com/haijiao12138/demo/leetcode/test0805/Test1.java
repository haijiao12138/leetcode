package com.haijiao12138.demo.leetcode.test0805;/**
 * @author 候苑博
 * @date 2021/8/5 20:44
 * @description
 */

/**
 * @author
 * @description
 * @date 2021/8/5
 *
 */
public class Test1 {
    private int data;
    int result = 0;
    public void m(){
        result+=2;
        data+=2;
        System.out.print(result+" "+data);
    }
}
class ThreadExample extends Thread{
    private Test1 mv;
    public ThreadExample(Test1 mv){
        this.mv = mv;
    }
    public void run(){
        synchronized (mv){
            mv.m();
        }
    }

}
class ThreadTest{
    public static void main(String[] args) {
        Test1 mv = new Test1();
        ThreadExample t1 = new ThreadExample(mv);
        ThreadExample t2 = new ThreadExample(mv);
        ThreadExample t3 = new ThreadExample(mv);
        t1.start();
        t2.start();
        t3.start();
    }
}
