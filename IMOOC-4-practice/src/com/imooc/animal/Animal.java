package com.imooc.animal;

/*
 * final class: 该类没有子类
 * final方法： 不允许子类重写
 * final 局部变量： 不允许重新赋值，允许在使用前赋值
 * final 类中成员属性：声明时没有赋值，在构造方法和静态代码块 
 * final 引用类型对象：地址不能修改
 * final 引用类型对象：引用类型对象的值可以修改
 */

public class Animal {
	private String name;
	private int month;
	private String pinzhong;
	String weight;
	private static int st1 = 22;
	public static int st2 = 23;
	

	static {
		System.out.println("我是父类的静态代码块");
	}
	{
		System.out.println("我是父类的代码块");
	}

	public boolean equals(Object one) {
		Animal two = (Animal) one;
		if (this.getName().equals(two.getName()) && this.getMonth() == two.getMonth()) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		
		return "名称："+this.name+" 月份："+this.month;
	}

//	父类的构造函数不允许被继承、不允许被重写
	public Animal() {
		System.out.println("我是父类的无参构造函数");
	}

	public Animal(String name, int month) {
		System.out.println("我是父类的带参构造");
		this.setName(name);
		this.setMonth(month);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getPinzhong() {
		return pinzhong;
	}

	public void setPinzhong(String pinzhong) {
		this.pinzhong = pinzhong;
	}


	public void eat() {
		final int temp;//方法内的局部变量
		temp = 12;
//		temp =3;//The final local variable temp may already have been assigned
		System.out.println(this.name + "-吃东西");
		final Animal animal = new Animal("凡凡",123);
//		animal = new Animal();// final修饰的引用类型对象地址不能修改
		animal.setName("niuniu");//final 引用类型对象的值可以修改
	}

	public void eat(String name) {
		System.out.println(name + "在吃东西");
	}

	public Animal jump() {
		System.out.println("跳跃是本能");
		return new Animal();
	}
}
