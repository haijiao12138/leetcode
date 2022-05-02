package com.haijiao12138.demo.leetcode.code2021.九月.线程相关;

import java.util.concurrent.*;

/**
 * @author: haijiao12138
 * @ClassName: Callable
 * @description: TODO
 * @date: 2021/9/5 22:46
 */
public class CallableTest implements Callable<String> {

    @Override
    public String call() throws Exception {
        //System.out.println("实现call接口==============");
//任务
        return "实现callable接口";
    }

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        Future<String> future = scheduledExecutorService.submit(new CallableTest());
        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        try {
           // System.out.println("等待去完成！！");
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
