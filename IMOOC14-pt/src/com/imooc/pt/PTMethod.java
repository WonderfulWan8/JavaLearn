package com.imooc.pt;

import java.util.ArrayList;
import java.util.List;

public class PTMethod {
    /*
    自定义泛型类
     */
    public <T> List<T> transforToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T item : array) {
            list.add(item);
        }
        return list;
    }

    public static void main(String[] args) {
        PTMethod ptmethod = new PTMethod();
        String[] arr = new String[]{"A", "B", "C"};
        Integer[] arr1 = new Integer[]{1,2,3};
        System.out.println("arr:"+arr);
        List<String> list = ptmethod.transforToList(arr);
        List<Integer> list1 = ptmethod.transforToList(arr1);
        System.out.println("list:"+list);
        System.out.println("list1:"+list1);
    }
}

