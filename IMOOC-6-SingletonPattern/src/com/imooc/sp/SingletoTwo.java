package com.imooc.sp;
//����ʽ��ʵ�����󴴽�ʱ��������ʼ����ֱ����һ�ε���get����ʱ��ʵ����-��ʱ�任�ռ䣬�õ�ʱ���ʵ����Ҫ��һ�������������þͿ���ʡ�ռ�
public class SingletoTwo {
//	1.��������˽�й���
	private SingletoTwo() {
		
	}
//	2.���������͵�˽�о�̬ʵ��
	private static SingletoTwo instance = null;
//	3.�������о�̬���������ؾ�̬ʵ������ֻ�����õ�ʱ���ʵ��������ֻʵ����һ�Σ�������
	public static SingletoTwo getInstance() {
		if(instance == null) {
			instance = new SingletoTwo();
		}
		return instance;
	}
}
