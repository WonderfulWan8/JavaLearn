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
		System.out.println(this.getName()+"在睡觉，"+this.getMonth()+"个月 大");
	}
	public void eat() {
//		super.eat();
		super.setPinzhong("犬科");
		super.weight = "85kg";
		System.out.println("gou chi   ");
	} 

	public Dog jump() {
		System.out.println("狗跳");
		return new Dog();
	}
}
