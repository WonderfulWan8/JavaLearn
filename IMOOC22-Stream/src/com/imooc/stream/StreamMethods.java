package com.imooc.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    //    提取集合中所有 偶数并求和
//    @Test
    public void case1() {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        int sum = list.stream().//获取stream对象
                mapToInt(s -> Integer.parseInt(s))//mapToInt将流中每一个数据转换为整数
                .filter(n -> n % 2 == 0)//对流中的数据进行求和
                .sum();
        System.out.println(sum);
    }

    //    所有名字首字母大写
//    @Test
    public void case2() {
        List<String> list = Arrays.asList("lily", "mike", "jack");
        List newList = list.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.toList());//将 流中的数据转换为list集合
        System.out.println(newList);
    }

    //   将所有奇数从小到大进行排序 ，且不允许出现  重复
    @Test
    public void case3() {
        List<Integer> list = Arrays.asList(1, 42, 521, 12, 5125, 2214, 55);
        List newList = list.stream().distinct().filter(s -> s % 2 != 0).sorted((a, b) -> b - a).collect(Collectors.toList());
        System.out.println(newList);
    }
}
