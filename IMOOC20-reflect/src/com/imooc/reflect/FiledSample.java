package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FiledSample {
    public static void main(String[] args) {
        try {
            Class empClass = Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor = empClass.getConstructor(new Class[]{
                    Integer.class, String.class, Float.class, String.class
            });
            Employee employee = (Employee) constructor.newInstance(new Object[]{100, "李磊", 3000f, "研发部"});
            Field enameFiled = empClass.getField("ename");
            Field enameFiled2 = empClass.getField("dname");
            enameFiled.set(employee, "李磊");//设置值
            String ename = (String) enameFiled.get(employee);
            String dname = (String) enameFiled2.get(employee);
            System.out.println("dname:" + dname);//私有属性  不可访问 报错
            System.out.println("ename" + ename);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {//没有找到对应成员变量异常 java.lang.NoSuchFieldException: dname
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
