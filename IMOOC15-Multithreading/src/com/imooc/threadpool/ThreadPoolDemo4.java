package com.imooc.threadpool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo4 {
    public static void main(String[] args) {
//        调度线程池 : 间隔时长 定点执行任务
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);//可调度线程池
//        延迟1秒执行 每3秒执行一次
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(new Date()+" 延迟1秒执行,每3秒执行一次");
            }
        },1,3, TimeUnit.SECONDS);
    }
}
