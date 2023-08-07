package collection.map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Object> student = new HashMap<String,Object>();
        student.put("name","张三");
        System.out.println(student);
//        相同的key会覆盖内容
        String name = (String) student.put("name","李四");//返回值为被替换的value
        System.out.println(name+"已经被替换为李四");
        student.put("age",18);
        student.put("height",182);
        student.put("weight",60);
        System.out.println(student);
        System.out.println("当前kv数量："+student.size());

//        获取hash值
        System.out.println(student.get("name"));//李四
        System.out.println(student.containsKey("name"));// true
        System.out.println(student.containsValue("王五"));// false
//        移除指定值 返回值为被删除的元素的值
        String value = (String)student.remove("name");
        System.out.println("value:"+value);//value:李四
    }
}
