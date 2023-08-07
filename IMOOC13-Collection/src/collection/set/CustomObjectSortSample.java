package collection.set;

import java.util.*;

public class CustomObjectSortSample {
    private class CustomerComparator implements Comparator<Goods>{

        @Override
        public int compare(Goods o1, Goods o2) {
            return o1.getSn().compareTo(o2.getSn());//在 String 类中，字符串按照字典顺序进行比较
        }
    }
    public List<Goods> sort(List<Goods> list){
        CustomerComparator cc = new CustomerComparator();
        Collections.sort(list,cc);
        return list;
    }
    public static void main(String[] args) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("sn5","title1"));
        goodsList.add(new Goods("sn1","title1"));
        goodsList.add(new Goods("sn1","title1"));
        goodsList.add(new Goods("sn3","title1"));
        goodsList.add(new Goods("sn2","title1"));
        System.out.println(goodsList);
        List<Goods> list = new CustomObjectSortSample().sort(goodsList);
        System.out.println(list);
    }
}
