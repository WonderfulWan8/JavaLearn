package com.imooc.animal;

public class Dog extends Animal {

	private String sex;

	public void sleep() {
		System.out.println("��˯��");
	}

	public Dog() {

	}

	public Dog(String name, int age, String sex) {
		super.setName(name);
		super.setAge(age);
		this.setSex(sex);
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
//		super.eat();
		System.out.println("����~");
	}
}
