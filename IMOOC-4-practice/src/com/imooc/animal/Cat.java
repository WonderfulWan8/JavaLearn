package com.imooc.animal;

public class Cat extends Animal {
	private double weight;
	public static int st3 = 44;
	

	static {
		System.out.println("��������ľ�̬�����");
	}
	{
		System.out.println("��������Ĵ����");
	}
	public Cat() {
		System.out.println("����������޲ι���");
	}
	public Cat(String name,int month) {
		super(name,month);// ͨ��super���ø���Ĵ��ι��캯�����˴��������ڵ�һ�У�û����ʾ����ʱ��Ĭ�ϵ����޲εĹ��캯��
		System.out.println("��������Ĵ��ι���");
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void run() {
		System.out.println(this.getName()+"��һֻ"+this.getPinzhong()+"�ڿ��ֵı���");
	}
	@Override
	public void eat(String name) {
		// TODO Auto-generated method stub
		super.eat(name);
	}
}