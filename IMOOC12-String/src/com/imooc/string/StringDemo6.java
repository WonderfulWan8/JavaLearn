package com.imooc.string;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String�Ĳ��ɱ���
//		String����һ�������������޸�
//		��ν���޸���ָ�������µĶ�����ָ����ڴ�ռ䲻��
		String s1 = "imooc";
		s1 = "hello" + s1;// �ڳ��������������µ��ַ�����s1ָ����ڴ��ַ�ᷢ���ı�
		System.out.println(s1);

		String s3 = new String("hello imooc");
		System.out.println(s3.substring(0, 5));
	}

}