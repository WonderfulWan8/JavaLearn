package com.imooc.people;

import com.imooc.people.Person.Heart;

public class PeopleTest {
	public static void main(String[] args) {
		Person p1  = new Person();
		p1.age = 22;
		
		

//		获取内部类对象实例 方式1：new 外部类.new 内部类
//		Person.Heart myHeart = new Person().new Heart();
//		System.out.println(myHeart.beat());
		
//		获取内部类对象实例 方式2：外部类对象.new内部类
//		myHeart = p1.new Heart();
//		System.out.println(myHeart.beat());
		
//		获取内部类对象实例 方式3:通过外部类对象获取方法
//		myHeart = p1.getHeart();
//		System.out.println(myHeart.beat()); 
		
//		获取静态内部类实例对象的方法
		Person.Heart myHeart = new Person.Heart();
		System.out.println(myHeart.beat());
		Person.Heart.say();
		
	}
}
