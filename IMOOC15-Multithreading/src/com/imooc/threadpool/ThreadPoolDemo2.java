package com.imooc.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {
//        调度器对象 : ExecutorService用于管理线程池
        ExecutorService threadPoll = Executors.newCachedThreadPool();//可缓存线程池
//        可缓存线程池的特定是,无限大,如果线程池中没有可用的线程则创建,有空闲线程则利用起来
        for (int i = 1; i <= 1000; i++) {
            final int index = i;
            threadPoll.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":"+index);
                }
            });
        }
        threadPoll.shutdown();
    }
}
