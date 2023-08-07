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
			System.out.println("���䲻��С��0");
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
		System.out.println("������"+this.getName()+" ���䣺"+this.getAge()+" �Ա�"+this.getSex());
		System.out.println("������"+this.getName()+" ���䣺"+this.getAge()+" �Ա�"+this.getSex());
		return "";
	}
}