package com.imooc.animal;

public abstract class Animal {
	private String name;
	private int age;
	public Animal() {
		
	}
	public Animal(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//	抽象方法：定义时不允许包含方法体，子类中必须实现抽象方法
	public abstract void eat() ;
	public static void say() {
		System.out.println("动物说话~");
	}
}
