package com.imooc.string;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java 编程基础";
//		取长度
		System.out.println("字符串的长度是:"+str.length());
//		取指定下标
		System.out.println(str.charAt(6));
//		求子串
		System.out.println(str.substring(6));
		System.out.println(str.substring(6, 7));
	}

}
