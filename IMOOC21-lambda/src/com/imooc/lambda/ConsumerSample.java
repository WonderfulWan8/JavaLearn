package com.imooc.lambda;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void output(Consumer<String> consumer){
        String text = "天将降大任于斯人也，必先苦其心志，劳其筋骨，饿其体肤，空乏其身";
        consumer.accept(text);
    }

    public static void main(String[] args) {
        output(s-> System.out.println("向控制台打印："+s));
        output(s-> System.out.println("向网站发送数据包："+s));
    }
}
