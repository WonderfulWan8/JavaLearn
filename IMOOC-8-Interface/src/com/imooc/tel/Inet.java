package com.imooc.tel;

//�ӿ����η� Ĭ��public 
public interface Inet {
//	�ӿ��г��󷽷����Բ�дabstract
//	�������η�Ĭ��public
//	����ʵ�ֽӿ�ʱ����Ҫȥʵ�ֽӿ������г��󷽷���������Ҫ�������ɳ�����
	void network();


//	�ӿ��п��԰���������Ĭ�ϻ����public static final
//	public static final int temp = 20;
	int temp = 20;

//	default��Ĭ�Ϸ��������Դ������� jdk1.8�����
	default void connection() {
		System.out.println("���ǽӿ��е�Ĭ������");
	}
//	static:��̬���������Դ������� jdk1.8�����
	static void stop() {
		System.out.println("���ǽӿ��еľ�̬����");
	}
}