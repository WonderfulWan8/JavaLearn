package com.imooc.wrap;

public class WrapTestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		将基本数据类型转换成字符串
		int t1 = 2;
		String t2 = Integer.toString(t1);
		System.out.println("t2: " + t2);
//		字符串转换为基本数据类型
//		1包装类的parse
		int t3 = Integer.parseInt("2");
		System.out.println("t3: " + t3);
//		2\ valueof
	}

}
