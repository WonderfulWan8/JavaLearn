package collection.list;

import java.util.LinkedList;

public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("西游记");
        ls.add("三国演义");
        ls.add("水浒传");
        ls.add("红楼梦");
        System.out.println(ls);//[西游记, 三国演义, 水浒传, 红楼梦]
        ls.addFirst("征求革命");
        ls.addLast("工业革命");
        System.out.println(ls);//[征求革命, 西游记, 三国演义, 水浒传, 红楼梦, 工业革命]
//        ls.forEach(System.out::println);
        ls.forEach((str) -> {
            System.out.println(str);
        });
    }
}
