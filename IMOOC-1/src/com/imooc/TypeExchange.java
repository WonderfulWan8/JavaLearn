package com.imooc;

public class TypeExchange {
	public static void main(String[] args) {
		// char ���ͺ�int����֮���໥ת��
		char c = (char) 65536;
		int n;
		n = c;
		c = (char)n;

		//	���κ͸�����������ת������	
		int x = 100;
		long y = x;
		x = (int)y;
	}
}
