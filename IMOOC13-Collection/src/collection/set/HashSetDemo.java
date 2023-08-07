package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Set 无序 不可重复
        Set<String> mobileSet = new HashSet<String>();
        mobileSet.add("17798254965");
        mobileSet.add("17798254965");
        mobileSet.add("18371000833");

        System.out.println(mobileSet);

//        判断是否包含某一项
        System.out.println(mobileSet.contains("17798254965"));//true
        System.out.println(mobileSet.contains("17798254965111"));//false
//        mobileSet.getClass()
//        mobileSet.forEach((str) -> {
//            System.out.println(str);
//        });



    }
}
