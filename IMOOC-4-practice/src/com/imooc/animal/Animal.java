package com.imooc.animal;

/*
 * final class: ����û������
 * final������ ������������д
 * final �ֲ������� ���������¸�ֵ��������ʹ��ǰ��ֵ
 * final ���г�Ա���ԣ�����ʱû�и�ֵ���ڹ��췽���;�̬����� 
 * final �������Ͷ��󣺵�ַ�����޸�
 * final �������Ͷ����������Ͷ����ֵ�����޸�
 */

public class Animal {
	private String name;
	private int month;
	private String pinzhong;
	String weight;
	private static int st1 = 22;
	public static int st2 = 23;
	

	static {
		System.out.println("���Ǹ���ľ�̬�����");
	}
	{
		System.out.println("���Ǹ���Ĵ����");
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
		
		return "���ƣ�"+this.name+" �·ݣ�"+this.month;
	}

//	����Ĺ��캯�����������̳С�����������д
	public Animal() {
		System.out.println("���Ǹ�����޲ι��캯��");
	}

	public Animal(String name, int month) {
		System.out.println("���Ǹ���Ĵ��ι���");
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
		final int temp;//�����ڵľֲ�����
		temp = 12;
//		temp =3;//The final local variable temp may already have been assigned
		System.out.println(this.name + "-�Զ���");
		final Animal animal = new Animal("����",123);
//		animal = new Animal();// final���ε��������Ͷ����ַ�����޸�
		animal.setName("niuniu");//final �������Ͷ����ֵ�����޸�
	}

	public void eat(String name) {
		System.out.println(name + "�ڳԶ���");
	}

	public Animal jump() {
		System.out.println("��Ծ�Ǳ���");
		return new Animal();
	}
}