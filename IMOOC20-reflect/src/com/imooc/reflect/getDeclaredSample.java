package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getDeclaredSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{
                    Integer.class, String.class, Float.class, String.class
            });
            Employee employee = (Employee) constructor.newInstance(new Object[]{100, "李磊", 3000f, "研发部"});
            Field[] fields = employeeClass.getDeclaredFields();
            for (Field field : fields) {
//                System.out.println(field.getName());
                if(field.getModifiers() == 1){//public 修饰
                    Object val  =  field.get(employee);
                    System.out.println(field.getName()+":"+val);
                }else if(field.getModifiers() == 2){// private 修饰
                    String methodName   =  "get"+field.getName().substring(0,1).toUpperCase()+field.getName().substring(1);
                    Method  getMethod = employeeClass.getMethod(methodName);
                    Object obj = getMethod.invoke(employee);
                    System.out.println(field.getName()+":"+obj);
                }
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
