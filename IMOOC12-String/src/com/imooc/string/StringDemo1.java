package com.imooc.string;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java ��̻���";
//		ȡ����
		System.out.println("�ַ����ĳ�����:"+str.length());
//		ȡָ���±�
		System.out.println(str.charAt(6));
//		���Ӵ�
		System.out.println(str.substring(6));
		System.out.println(str.substring(6, 7));
	}

}