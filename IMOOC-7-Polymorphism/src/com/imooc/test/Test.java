package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 多态，向上转型（隐式转型）- 父类引用指向之类实例 父类指向子类实例，可以调用子类重写父类的方法，以及从父类继承的方法，不能调用子类特有方法
		 * 小类转型为大类
		 */
//		Animal a1 = new Animal();//抽象类不能实例化
		Animal a2 = new Cat();
		Animal a3 = new Dog();
//		a1.eat();
		a2.eat();
		a3.eat();
//		a2.getWeight();//报错，在Animal类中没有定义
		System.out.println("==========================");
		/*
		 * 向下转型：强制类型转换 — 子类引用指向父类实例 子类引用指向父类对象，此处必须进行强转，可以调用子类特有的方法
		 */
		if (a2 instanceof Cat) {
			Cat c1 = (Cat) a2;
			c1.getWeight();
			c1.eat();
			c1.run();
		}
		if (a2 instanceof Dog) {
			Dog d1 = (Dog) a2;// a2是Cat实例，Cat强转Dog会报错
			d1.eat();
		}
		if(a2 instanceof Animal) {//true
			System.out.println("Animal");
		}
		if(a2 instanceof Object) {//true
			System.out.println("Object");
		}

//		instanceof-用于判断某个对象是否是指定类或其子类的实例

	}
}
