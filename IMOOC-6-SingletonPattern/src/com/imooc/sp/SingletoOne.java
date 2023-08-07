package com.imooc.sp;
//饿汉式：创建对象实例的时候就直接初始化-空间换时间，一建立的时候就创建好，用的时候不用等，但是会占用更多空间
public class SingletoOne {
//	1.创建类中私有构造
	private SingletoOne() {
		
	}
//	2.创建该类型的私有静态实例
	private static SingletoOne instance = new SingletoOne();
//	3.创建公有静态方法，返回静态实例对象
	public static SingletoOne getInstance() {
		return instance;
	}
}
