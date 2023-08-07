package collection.set;

import java.util.HashSet;

public class UniqueSetSample {
    /*
        思考：Set集合如何确保数据的唯一性？
        解答：Set集合在新增数据时先判断数据的hashCode是否已存在，
        若hashCode()在Set集合存在再调用equals()方法判断内容是否相同，
        hashCode()相同且equals()返回true则视为重复数据，不会被添加到Set集合中。

        思考：为什么要用对象的hashCode()直接用对象的equals()方法判断内容是否相同不行吗？
        解答：hashCode()方法返回的是一个int类型的整数，比较起来更快。
     */
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        System.out.println(a.hashCode()+":"+b.hashCode());



        HashSet<Goods> goodSet = new HashSet<Goods>();
        goodSet.add(new Goods("sn1","title1"));
        goodSet.add(new Goods("sn1","title1"));
        goodSet.add(new Goods("sn3","title1"));
        goodSet.add(new Goods("sn2","title1"));
        System.out.println(goodSet);
    }
}
