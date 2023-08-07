package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {

    class SampleCompartor implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }


    public List<Integer> sort(List<Integer> list){
        Collections.sort(list,new SampleCompartor());
        System.out.println(list);
        return list;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(70);
        list.add(60);
        list.add(40);
        list.add(50);
        list.add(90);
        list.add(20);
        list.add(10);
        System.out.println(list);
        ListSorter ls = new ListSorter();
        ls.sort(list);
        System.out.println(list);

    }
}
