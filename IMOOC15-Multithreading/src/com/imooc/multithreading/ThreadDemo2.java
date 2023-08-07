package com.imooc.multithreading;

import java.util.Random;

public class ThreadDemo2 {
    class Runner implements Runnable {

        @Override
        public void run() {
            Integer speed = new Random().nextInt(10);
            for (int i = 0; i < speed; i++) {
                try {
                    Thread.sleep(1000);//将当前的线程沉睡 1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                Thread.currentThread().getName() 是线程类自带的静态方法，返回值为线程的名字
                System.out.println("第" + i + "秒：" + Thread.currentThread().getName() + "已跑到" + (i * speed) + "米（" + speed + "米/秒)");
            }
        }
    }

    public void start() {
        Runner runner = new Runner();
        Thread threadA = new Thread(runner);
        threadA.setName("参赛者A");
        Thread threadB = new Thread(new Runner());
        threadB.setName("参赛者B");
        Thread threadC = new Thread(new Runner());
        threadC.setName("参赛者B");

        threadA.start();
        threadB.start();
        threadC.start();
    }

    public static void main(String[] args) {
        new ThreadDemo2().start();
    }
}
