package com.imooc.person;

public class Person {
	private String name;
//	��̬��Ա ���Ա ����ʵ�������ٸ����� �۸���ͬһƬ�ڴ�ռ� ֵ�����һ����ֵ��ֵ
//	��̬��Ա�����ַ��ʷ��� 1.����.������ 2.��.������
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
			System.out.println("���䲻��С��0");
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
		eat();//��Ա�����п���ֱ�ӷ������еľ�̬��Ա
		System.out.println("����һ��ѧ��");
	}

	public void sex(String meal) {
		System.out.println("����һ��" + meal + "��");
	}
//	�෽��
	public static void eat() {
		System.out.println("��");
//		say();��̬�����в���ֱ�ӷ��ʷǾ�̬��Ա(��������������) ���Ե��þ�̬��Ա
//		��̬�����в�����this
		price = 0;//��̬���󡢷��������ھ�̬�����з���
//		�����Ҫ���ʷǾ�̬��������Ա������ʵ��������
		Person temp = new Person();
		temp.setAge(10);
	}
	

	public void info() {
		System.out.println("������" + this.name);
		System.out.println("���䣺" + this.age);
		System.out.println("��ͣ�" + this.grade);
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		Person.price = price;
	}
}
