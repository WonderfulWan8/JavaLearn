package com.imooc.people;

import com.imooc.people.Person.Heart;

public class PeopleTest {
	public static void main(String[] args) {
		Person p1  = new Person();
		p1.age = 22;
		
		

//		��ȡ�ڲ������ʵ�� ��ʽ1��new �ⲿ��.new �ڲ���
//		Person.Heart myHeart = new Person().new Heart();
//		System.out.println(myHeart.beat());
		
//		��ȡ�ڲ������ʵ�� ��ʽ2���ⲿ�����.new�ڲ���
//		myHeart = p1.new Heart();
//		System.out.println(myHeart.beat());
		
//		��ȡ�ڲ������ʵ�� ��ʽ3:ͨ���ⲿ������ȡ����
//		myHeart = p1.getHeart();
//		System.out.println(myHeart.beat()); 
		
//		��ȡ��̬�ڲ���ʵ������ķ���
		Person.Heart myHeart = new Person.Heart();
		System.out.println(myHeart.beat());
		Person.Heart.say();
		
	}
}