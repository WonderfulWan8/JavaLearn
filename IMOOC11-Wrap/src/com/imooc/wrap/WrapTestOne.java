package com.imooc.wrap;

public class WrapTestOne {
	public static void main(String[] args) {
//		装箱：把基本类型转换成包装类
//		1、自动装箱
		int t1 = 2;
		Integer t2 = t1;
//		2、手动装箱
		Integer t3 = new Integer(t1);
//		测试
		System.out.println("int t1:"+t1);
		System.out.println("Integer t2:"+t2);
		System.out.println("Integer t3:"+t3);
		System.out.println("====================");
//		拆箱：把包装类转换成基本类
//		1、自动拆箱
		int t4 = t2;
//		2、手动拆箱
		int t5 = t2.intValue();
		double t6 = t2.intValue();
		System.out.println("Integer t2:"+t2);
		System.out.println("int t4:"+t4);
		System.out.println("int t5:"+t5);
		System.out.println("int t6:"+t6);
		
	}
}
