package com.haijiao12138.demo.leetcode.test0809;


import java.util.concurrent.*;

/**
 * @author: 候苑博
 * @ClassName: Thread
 * @description: TODO
 * @date: 2021/8/10 11:44
 *
 */
public class Thread {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

    }
    public static ExecutorService newCachedThreadPool(){
        return new ThreadPoolExecutor(0,Integer.MAX_VALUE,60L,
                TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
    }
}
