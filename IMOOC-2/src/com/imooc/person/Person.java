package com.imooc.person;

public class Person {
	private String name;
//	静态成员 类成员 不论实例化多少个对象 价格都是同一片内存空间 值是最后一个赋值的值
//	静态成员的两种访问方法 1.对象.属性名 2.类.属性名
	public static int age;
	private int grade;
	private static double price;

	Person() {

	}

	public Person(String name, int age, int grade) {
		this.setName(name);
		this.setAge(age);
		this.setGrade(grade);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("年龄不能小于0");
			return;
		} else {
			this.age = age;
		}
	}
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAge() {
		return this.age;
	}

	public void say() {
		eat();//成员方法中可以直接访问类中的静态成员
		System.out.println("我是一名学生");
	}

	public void sex(String meal) {
		System.out.println("我是一名" + meal + "生");
	}
//	类方法
	public static void eat() {
		System.out.println("吃");
//		say();静态方法中不能直接访问非静态成员(包括方法和属性) 可以调用静态成员
//		静态方法中不能用this
		price = 0;//静态对象、方法可以在静态方法中访问
//		如果需要访问非静态方法、成员，则需实例化对象
		Person temp = new Person();
		temp.setAge(10);
	}
	

	public void info() {
		System.out.println("姓名：" + this.name);
		System.out.println("年龄：" + this.age);
		System.out.println("年纪：" + this.grade);
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		Person.price = price;
	}
}
