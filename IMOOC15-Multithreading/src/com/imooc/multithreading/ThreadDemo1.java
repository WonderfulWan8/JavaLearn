package com.imooc.multithreading;

import java.util.Random;

public class ThreadDemo1 {

    class Runner extends Thread{
        @Override
        public void run() {
            Integer speed = new Random().nextInt(10);
            for (int i=0;i<speed;i++){
                try {
                    Thread.sleep(1000);//将当前的线程沉睡 1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                getName是线程自带的方法，返回值为线程的名字
                System.out.println("第" + i + "秒：" + this.getName() + "已跑到" + (i * speed) + "米（" + speed + "米/秒)");
            }
        }
    }

    public void start(){
        Runner threadA = new Runner();
        threadA.setName("参赛者A");//给线程名称赋值

        Runner threadB = new Runner();
        threadB.setName("参赛者B");

        Runner threadC = new Runner();
        threadC.setName("参赛者C");

        threadA.start();//创建和开始新的线程
        threadB.start();
        threadC.start();
    }

    public static void main(String[] args) {
        new ThreadDemo1().start();
    }
}
