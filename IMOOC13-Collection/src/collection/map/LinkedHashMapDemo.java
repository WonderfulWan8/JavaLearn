package collection.map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
//        LinkedHashMap 有序排列 顺序和插入时保持一致
        Map<String,Object> lhm = new LinkedHashMap<String,Object>();
        lhm.put("name","张三");
        lhm.put("age",18);
        lhm.put("height",182);
        lhm.put("weight",60);
        System.out.println(lhm);
    }
}
