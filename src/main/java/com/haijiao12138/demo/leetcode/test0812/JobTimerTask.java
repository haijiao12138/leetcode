package com.haijiao12138.demo.leetcode.test0812;


import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: 候苑博
 * @ClassName: JobTimerTask
 * @description: TODO    2-使用 TimerTask 创建job定时任务
 * @date: 2021/8/12 15:06
 *
 */
public class JobTimerTask {
    static long count = 0;

    public static void main(String[] args) {
        TimerTask timerTask =  new TimerTask(){
            @Override
            public void run() {
                count++;
                System.out.println("==:"+count);
            }
        };
        Timer timer = new Timer();
        long delay = 0;
        long period = 1000;
        timer.scheduleAtFixedRate(timerTask,delay,period);
    }

}
