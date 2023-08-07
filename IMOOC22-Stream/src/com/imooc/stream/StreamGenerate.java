package com.imooc.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream 流创建对象的五种方式
 */
public class StreamGenerate {
    //1.基于数组进行创建
//    @Test
    public void generator1() {
        String[] arr = {"123", "345"};
        Stream<String> stream = Stream.of(arr);
        stream.forEach(s -> {
            System.out.println(s);
        });
    }

    //2.基于集合进行创建
//    @Test
    public void generator2() {
        List<String> list = new ArrayList<>();
        list.add("ll");
        list.add("yy");
        Stream<String> stream = list.stream();
        stream.forEach(s -> {
            System.out.println(s);
        });
    }

    //3.利用generate方法创建无限长度流
//    @Test
    public void generator3() {
        Stream<Integer> stream = Stream.generate(() -> new Random().nextInt(100000));
        stream.limit(10).forEach(i -> System.out.println(i));
    }

    //4.基于迭代器创建
//    @Test
    public void generator4() {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1);
        stream.limit(100).forEach(i -> System.out.println(i));
    }

    //5.基于字符序列创建流
    @Test
    public void generator5() {
        String  str = "abcdefg是";
        IntStream stream= str.chars();
        stream.forEach(c-> System.out.println((char)c));
    }
}
