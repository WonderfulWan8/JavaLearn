package com.imooc.sp;
//����ʽ����������ʵ����ʱ���ֱ�ӳ�ʼ��-�ռ任ʱ�䣬һ������ʱ��ʹ����ã��õ�ʱ���õȣ����ǻ�ռ�ø���ռ�
public class SingletoOne {
//	1.��������˽�й���
	private SingletoOne() {
		
	}
//	2.���������͵�˽�о�̬ʵ��
	private static SingletoOne instance = new SingletoOne();
//	3.�������о�̬���������ؾ�̬ʵ������
	public static SingletoOne getInstance() {
		return instance;
	}
}
