package com.imooc.multithreading;

public class SyncSample {
    class Printer {
        Object lock = new Object();

        public void print() {
//            方式一、 synchronized代码块
            synchronized (lock) {//线程同步机制 线程获取到锁依次执行 保证同一时间只有一个线程执行
                try {
                    Thread.sleep(500);
                    System.out.print("魑");
                    Thread.sleep(500);
                    System.out.print("魅");
                    Thread.sleep(500);
                    System.out.print("魍");
                    Thread.sleep(500);
                    System.out.print("魉");
                    System.out.println();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        //        方式二 synchronized方法
        public synchronized void print2() {
            try {
                Thread.sleep(500);
                System.out.print("魑");
                Thread.sleep(500);
                System.out.print("魅");
                Thread.sleep(500);
                System.out.print("魍");
                Thread.sleep(500);
                System.out.print("魉");
                System.out.println();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//       方式三：静态方法

    }

    public void start() {
        Printer printer = new Printer();
//        printer.print();
        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask();
//            所有线程都共享同一个 printer实例 使得所有线程共享一个lock
            task.printer = printer;
            Thread thread = new Thread(task);
            thread.start();
        }
    }

    class PrintTask implements Runnable {
        public Printer printer;

        @Override
        public void run() {
//            printer.print(); //synchronized 代码块
            printer.print2();  //synchronized 方法
        }

    }

    public static void main(String[] args) {
        SyncSample syncSample = new SyncSample();
        syncSample.start();
    }


}
