package com.imooc.people;

public class Person {
	public int age;
	public Heart getHeart() {
//		System.out.println(new Heart().age);
		return new Heart();
	}
	public void eat() {
		System.out.println("�˳�");
	}
//	��Ա�ڲ���
	/*
	 * 1���ڲ������ⲿʹ��ʱ���޷�ֱ��ʵ��������Ҫ�����ⲿ����Ϣ����ʵ����
	 * 2���ڲ���ķ������η��������⣬���Ƿ��ʷ�Χ���ܵ�Ӱ��
	 * 3���ڲ������ֱ�ӷ����ⲿ��ĳ�Ա���������ͬ���ģ����ȷ����ڲ����еĶ���
	 * 4������ʹ���ⲿ��.this.��Ա�ķ�ʽ�������ⲿ����ͬ������Ϣ
	 * 5���ⲿ���Ա�����ڲ�����Ϣ����Ҫͨ���ڲ���ʵ�����޷�ֱ�ӷ���
	 * 6���ڲ������� .class�ļ��������ⲿ��$�ڲ���.class
	 * 7���ڲ������Ƿ���԰������ⲿ����ͬǩ���ķ�����
	 * 
	public class Heart{
		int age = 12;
		public void eat() {
			System.out.println("�ڲ����");
		}
		public String beat() {
			Person.this.eat();
			return Person.this.age+"����������";
		}
	}
	*/
//	��̬�ڲ���
	/*
	 * 1����̬�ڲ����У�ֻ��ֱ�ӷ����ⲿ��ľ�̬�����������Ҫ���÷Ǿ�̬��������Ա������ͨ������ʵ��
	 * 2����̬�ڲ���ʵ��ʱ�����Բ������ⲿ��
	 * 3������ͨ�� �ⲿ��.�ڲ���.��̬��Ա�ķ�ʽ�������ڲ����еľ�̬��Ա
	 * 4���ڲ����������ⲿ������ͬ��ʱ��Ĭ��ֱ�ӵ����ڲ����дӳ�Ա��
	 * 	�����Ҫ�����ⲿ���еľ�̬���ԣ������ͨ���ⲿ��.���Եķ�ʽ��
	 * 	�����Ҫ�����ⲿ���еķǾ�̬���ԣ������ͨ��new �ⲿ��().���Եķ�ʽ��
	 */
	public static class Heart{
		static int age = 13;
		int temp = 22;
		public static void say() {
			System.out.println("hello");
		}
		public String beat() {			
		 	new Person().eat();
			return new Person().age + "�������������";
		}
	}
	
}