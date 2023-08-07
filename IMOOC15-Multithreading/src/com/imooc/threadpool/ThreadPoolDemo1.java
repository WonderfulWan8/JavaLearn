package com.imooc.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
//        定长线程池 - 最多有10个任务可以同时运行
        ExecutorService threadPoll = Executors.newFixedThreadPool(10);
//        定长线程池的特点是固定线程总数,空闲线程用于执行任务,如果线程都在使用,后续任务则处于等待状态
        for (int i = 1; i < 1000; i++) {
            final int index = i;
            threadPoll.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":" + index);
                }
            });
        }
        /*
            需要返回值,使用submit方法执行Callable对象,利用Future对象接收返回值,
         */
//        Future<Object> ret = threadPoll.submit(new Callable<Object>() {
//            @Override
//            public Object call() throws Exception {
//                return null;
//            }
//        });
//        运行完毕后关闭线程池
        threadPoll.shutdown();

    }
}
