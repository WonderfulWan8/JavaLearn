package com.imooc.animal;

public class Dog extends Animal {
	private String sex;
	
	public Dog() {
		
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void sleep() {
		System.out.println(this.getName()+"��˯����"+this.getMonth()+"���� ��");
	}
	public void eat() {
//		super.eat();
		super.setPinzhong("Ȯ��");
		super.weight = "85kg";
		System.out.println("gou chi   ");
	} 

	public Dog jump() {
		System.out.println("����");
		return new Dog();
	}
}