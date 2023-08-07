package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;
import com.imooc.animal.Master;

public class MasterTest {
	public static void main(String[] args) {
		Master m1 = new Master();
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Animal c2 = new Cat();
		m1.feed(d1);
		m1.feed(c1);
		
		Animal a = m1.feed(true);
		a.eat();
		
		c1.say(); 
		c2.say();
		Cat c3 = (Cat) c2;
		c3.say();

	}
}
