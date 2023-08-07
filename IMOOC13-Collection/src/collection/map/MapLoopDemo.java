package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLoopDemo {
    public void doForLoop(Map map) {
        Set<String> keys = map.keySet();//获取保存key的set集合
        for(String k : keys){
            System.out.println(k+":"+map.get(k));
        }
    }

    public void doForeach(Map map){
        map.forEach((key,value)-> {
            System.out.println(key+":"+value);
        });
    }

    public void doIterator(Map map){
        Iterator<Map.Entry<String,Object>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,Object> entry = itr.next();
            System.out.println(entry.getKey()+ ":" +entry.getValue());
        }
    }


    public static void main(String[] args) {
        Map<String, Object> student = new HashMap<>();
        student.put("name", "张三");
        student.put("age", 18);
        student.put("height", 182);
        student.put("weight", 60);
        MapLoopDemo mlp = new MapLoopDemo();
//        mlp.doForLoop(student);
//        mlp.doForeach(student);
        mlp.doIterator(student);
    }


}
