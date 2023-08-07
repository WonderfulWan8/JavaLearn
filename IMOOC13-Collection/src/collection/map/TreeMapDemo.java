package collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    class RecordComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);//o1 按照字典顺序大于o2时 返回一个大于0的数字
        }
    }

    public void sort(){
        //        针对key进行排序后存储 默认升序
        Map<String,Object> record = new TreeMap<>(new RecordComparator());
        record.put("A1","1");
        record.put("A2","2");
        record.put("A3","3");
        record.put("A4","4");
        record.put("A5","5");
        System.out.println(record);
//        降序处理
    }

    public static void main(String[] args) {
        TreeMapDemo demo = new TreeMapDemo();
        demo.sort();
    }
}
