package com.imooc.wrap;

public class WrapTestOne {
	public static void main(String[] args) {
//		װ�䣺�ѻ�������ת���ɰ�װ��
//		1���Զ�װ��
		int t1 = 2;
		Integer t2 = t1;
//		2���ֶ�װ��
		Integer t3 = new Integer(t1);
//		����
		System.out.println("int t1:"+t1);
		System.out.println("Integer t2:"+t2);
		System.out.println("Integer t3:"+t3);
		System.out.println("====================");
//		���䣺�Ѱ�װ��ת���ɻ�����
//		1���Զ�����
		int t4 = t2;
//		2���ֶ�����
		int t5 = t2.intValue();
		double t6 = t2.intValue();
		System.out.println("Integer t2:"+t2);
		System.out.println("int t4:"+t4);
		System.out.println("int t5:"+t5);
		System.out.println("int t6:"+t6);
		
	}
}