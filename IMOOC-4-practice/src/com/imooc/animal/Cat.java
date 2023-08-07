package com.imooc.animal;

public class Cat extends Animal {
	private double weight;
	public static int st3 = 44;
	

	static {
		System.out.println("我是子类的静态代码块");
	}
	{
		System.out.println("我是子类的代码块");
	}
	public Cat() {
		System.out.println("我是子类的无参构造");
	}
	public Cat(String name,int month) {
		super(name,month);// 通过super调用父类的带参构造函数，此代码必须放在第一行，没有显示调用时，默认调用无参的构造函数
		System.out.println("我是子类的带参构造");
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void run() {
		System.out.println(this.getName()+"是一只"+this.getPinzhong()+"在快乐的奔跑");
	}
	@Override
	public void eat(String name) {
		// TODO Auto-generated method stub
		super.eat(name);
	}
}
