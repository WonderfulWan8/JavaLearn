package com.imooc.practice.p1;

public class Person {
	private String name;
	private int age;
	private String sex;

	public Person() {

	}

	public Person(String name, int age, String sex) {
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
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
		if (this.age < 0) {
			System.out.println("年龄不能小于0");
		} else {
			this.age = age;
		}
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("姓名："+this.getName()+" 年龄："+this.getAge()+" 性别："+this.getSex());
		System.out.println("姓名："+this.getName()+" 年龄："+this.getAge()+" 性别："+this.getSex());
		return "";
	}
}
