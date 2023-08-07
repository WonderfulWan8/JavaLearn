package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListLoopDemo {
    public static void main(String[] args) {
        List<String> bookList = new ArrayList<String>();
        bookList.add("西游记");
        bookList.add("三国演义");
        bookList.add("水浒传");
        bookList.add("红楼梦");
//        遍历方式1 普通for循环
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
        System.out.println("==================");
//        遍历方式2 forEach
        bookList.forEach((str) -> {
            System.out.println(str);
        });
//        bookList.forEach(System.out::println);//Lambda表达式
        System.out.println("==================");

//        遍历方式3 Iterator
        Iterator<String> itr = bookList.iterator();
        while (itr.hasNext()) {// hasNext() 提取下一个元素，将指针移动到下一个元素
            System.out.println(itr.next());
        }
        System.out.println("==================");

    }
}
