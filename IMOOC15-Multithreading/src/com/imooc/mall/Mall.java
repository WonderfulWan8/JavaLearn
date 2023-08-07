package com.imooc.mall;

public class Mall {
//    前面的线程处理不完 锁不释放 后面的就一直阻塞
    public synchronized void sale() {
        if (Stock.count > 0) {
            try {
                // 模拟到商城办理销售业务,用时5毫秒
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Stock.count--;
            System.out.println("商品销售成功");
        } else {
            System.out.println("商品库存不足,请下次再来!");
        }
    }

    public static void main(String[] args) {
//        实例化唯一商城对象
        Mall mall = new Mall();
//        模拟5名顾客同时涌入商城购买商品
        for (int i = 0; i < 20; i++) {
            Consumer consumer = new Consumer();
            consumer.mall = mall;
//            新建线程
            Thread thread = new Thread(consumer);
            thread.start();
        }
        try {
//            模拟下班后清库存
            Thread.sleep(1000);
            System.out.println("当前商品库存为:" + Stock.count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
