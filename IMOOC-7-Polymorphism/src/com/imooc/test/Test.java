package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��̬������ת�ͣ���ʽת�ͣ�- ��������ָ��֮��ʵ�� ����ָ������ʵ�������Ե���������д����ķ������Լ��Ӹ���̳еķ��������ܵ����������з���
		 * С��ת��Ϊ����
		 */
//		Animal a1 = new Animal();//�����಻��ʵ����
		Animal a2 = new Cat();
		Animal a3 = new Dog();
//		a1.eat();
		a2.eat();
		a3.eat();
//		a2.getWeight();//��������Animal����û�ж���
		System.out.println("==========================");
		/*
		 * ����ת�ͣ�ǿ������ת�� �� ��������ָ����ʵ�� ��������ָ������󣬴˴��������ǿת�����Ե����������еķ���
		 */
		if (a2 instanceof Cat) {
			Cat c1 = (Cat) a2;
			c1.getWeight();
			c1.eat();
			c1.run();
		}
		if (a2 instanceof Dog) {
			Dog d1 = (Dog) a2;// a2��Catʵ����CatǿתDog�ᱨ��
			d1.eat();
		}
		if(a2 instanceof Animal) {//true
			System.out.println("Animal");
		}
		if(a2 instanceof Object) {//true
			System.out.println("Object");
		}

//		instanceof-�����ж�ĳ�������Ƿ���ָ������������ʵ��

	}
}