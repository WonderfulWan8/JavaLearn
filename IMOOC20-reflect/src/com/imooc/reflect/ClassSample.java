package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

public class ClassSample {
    public static void main(String[] args) {
        try {
//            Class.forName将指定的方法加载到 jvm中 并返回Class对象
            Class employeeClass = Class.forName("om.imooc.reflect.entity.Employee");
            System.out.println("employee已被加载到JVM");

            Employee employee = (Employee) employeeClass.newInstance();//通过默认的构造方法 创建新的对象 返回值为 Object 需要强制类型转
            System.out.println(employee);
        } catch (ClassNotFoundException e) {//类名写错  会出现的异常
            e.printStackTrace();
        } catch (InstantiationException e) {//实例化异常 无法实例化的时候会报错 比如实例化抽象类
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {//非法访问异常  程序外部访问程序内部私有方法 或者作用域外方法
            throw new RuntimeException(e);
        }
    }
}
