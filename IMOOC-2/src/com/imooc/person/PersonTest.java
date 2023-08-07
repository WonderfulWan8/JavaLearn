package com.imooc.person;

public class PersonTest {
	public static void main(String[] args) {
//		Person p = new Person();
		Person p = new Person();
		Person.age = 15;
//		p.eat();
//		Person.eat();
		p.say();
		p.setName("·¨¿ËöÏ");
		p.setAge(-1);
		System.out.println(p.getName());
 	}
}
