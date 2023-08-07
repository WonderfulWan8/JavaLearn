package com.imooc.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 函数式编程
 * Predicate接口的使用方法
 */
public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> n > 4;
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(3));
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> predicate1 = n -> n > 5 && n % 2 == 0;
//        list.forEach(item -> {
//            if (predicate1.test(item)) {
//                System.out.println(item);
//            }
//        });
        filter(list, predicate1);
    }

    public static void filter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer item : list) {
            if (predicate.test(item)) {
                System.out.print(item + " ");
            }
        }
    }
}
