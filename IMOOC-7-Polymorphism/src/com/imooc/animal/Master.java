package com.imooc.animal;

public class Master {
	/*
	 * ι������ ιè�� - ���������� ι�� - ����˯��
	 */
	public Master() {

	}

//	public void feed(Cat cat) {
//		System.out.println("����������");
//	}
//	public void feed(Dog dog) {
//		System.out.println("����˯��");
//	}
//	2.��һ����������˶��ִ������
	public void feed(Animal animal) {
		if (animal instanceof Cat) {
			Cat temp = (Cat) animal;
			temp.eat();
			System.out.println("����������");
		} else if (animal instanceof Dog) {
			Dog temp = (Dog) animal;
			temp.eat();
			System.out.println("����˯��");
		}
	}

	/*
	 * �������ֳ���: ʱ���:�� ʱ����:è��
	 */
	public Animal feed(boolean hastime) {
		if (hastime) {
			Dog dog = new Dog();
			return dog;
		} else {
			Cat cat = new Cat();
			return cat;
		}
	}
}