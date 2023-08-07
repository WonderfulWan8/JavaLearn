package collection.list;

import java.util.ArrayList;

public class ArrayListSample<S> {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> as = new ArrayList<String>();
//      插入 删除
        as.add("1123");
        as.add("456");
        as.add("789");
//        as.add(789);// error 泛型限制类型
        System.out.println(as);//[1123, 456, 789]
        System.out.println(as.get(0));//1123
//        System.out.println(as.get(10));// 下标越界 thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 3
        as.add(1, "insert");// 在指定位置插入元素
        System.out.println(as);//[1123, insert, 456, 789]
        String resultItem = as.remove(0);//删除指定位置 返回值为被删除元素
        System.out.println("删除的元素："+resultItem);//1123
        System.out.println(as);//[insert, 456, 789]
        as.remove("insert");//删除指定元素
        System.out.println(as);// [456, 789]
        boolean result = as.add("insert2");
        System.out.println("数组是否发生变化："+result);//true

//      遍历
        as.forEach((item)->{
            System.out.print(item+" ");
        });
        System.out.println();
        System.out.println(as.size());//3

    }
}
