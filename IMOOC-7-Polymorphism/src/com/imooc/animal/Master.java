package com.imooc.animal;

public class Master {
	/*
	 * 喂养宠物 喂猫咪 - 吃完玩线球 喂狗 - 吃完睡觉
	 */
	public Master() {

	}

//	public void feed(Cat cat) {
//		System.out.println("吃完玩线球");
//	}
//	public void feed(Dog dog) {
//		System.out.println("吃完睡觉");
//	}
//	2.用一个方法解决了多种传入的类
	public void feed(Animal animal) {
		if (animal instanceof Cat) {
			Cat temp = (Cat) animal;
			temp.eat();
			System.out.println("吃完玩线球");
		} else if (animal instanceof Dog) {
			Dog temp = (Dog) animal;
			temp.eat();
			System.out.println("吃完睡觉");
		}
	}

	/*
	 * 饲养何种宠物: 时间多:狗 时间少:猫咪
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
