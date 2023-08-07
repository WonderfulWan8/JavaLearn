package com.imooc.people;

public class Person {
	public int age;
	public Heart getHeart() {
//		System.out.println(new Heart().age);
		return new Heart();
	}
	public void eat() {
		System.out.println("人吃");
	}
//	成员内部类
	/*
	 * 1、内部类在外部使用时，无法直接实例化，需要借由外部类信息才能实例化
	 * 2、内部类的访问修饰符可以任意，但是访问范围会受到影响
	 * 3、内部类可以直接访问外部类的成员，如果出现同名的，优先访问内部类中的定义
	 * 4、可以使用外部类.this.成员的方式，访问外部类中同名的信息
	 * 5、外部类成员访问内部类信息，需要通过内部类实例，无法直接访问
	 * 6、内部类编译后 .class文件命名，外部类$内部类.class
	 * 7、内部类中是否可以包含与外部类相同签名的方法？
	 * 
	public class Heart{
		int age = 12;
		public void eat() {
			System.out.println("内部类吃");
		}
		public String beat() {
			Person.this.eat();
			return Person.this.age+"心脏在跳动";
		}
	}
	*/
//	静态内部类
	/*
	 * 1、静态内部类中，只能直接访问外部类的静态方法，如果需要调用非静态方法、成员，可以通过对象实例
	 * 2、静态内部类实例时，可以不依赖外部类
	 * 3、可以通过 外部类.内部类.静态成员的方式，访问内部类中的静态成员
	 * 4、内部类属性与外部类属性同名时，默认直接调用内部类中从成员，
	 * 	如果需要访问外部类中的静态属性，则可以通过外部类.属性的方式，
	 * 	如果需要访问外部类中的非静态属性，则可以通过new 外部类().属性的方式，
	 */
	public static class Heart{
		static int age = 13;
		int temp = 22;
		public static void say() {
			System.out.println("hello");
		}
		public String beat() {			
		 	new Person().eat();
			return new Person().age + "岁的心脏在跳动";
		}
	}
	
}
