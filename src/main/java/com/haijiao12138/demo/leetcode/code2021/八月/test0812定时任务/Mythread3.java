package com.haijiao12138.demo.leetcode.code2021.八月.test0812定时任务;/**
 * @author 候苑博
 * @date 2021/8/12 18:44
 * @description
 */

import java.util.concurrent.*;

/**
 * @author: 候苑博
 * @ClassName: Mythread3
 * @description: TODO
 * @date: 2021/8/12 18:44
 *
 */
public class Mythread3 implements Callable<String> {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        Future<String> future = scheduledExecutorService.submit(new Mythread3());
        try {
            System.out.println("等待去完成！！");
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
    @Override
    public String call() throws Exception {
        return "创建多线程3！！";
    }
}
