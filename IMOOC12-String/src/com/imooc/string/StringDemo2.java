package com.imooc.string;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = new String("Java\"���\"����,��ϲ��java���");
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('\"'));
		System.out.println(str.lastIndexOf('\"'));
	}

}
