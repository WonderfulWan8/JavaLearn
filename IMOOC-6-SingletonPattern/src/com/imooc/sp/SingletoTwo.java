package com.imooc.sp;
//懒汉式：实例对象创建时，并不初始化，直到第一次调用get方法时才实例化-用时间换空间，用的时候才实例化要等一会儿，但如果不用就可以省空间
public class SingletoTwo {
//	1.创建类中私有构造
	private SingletoTwo() {
		
	}
//	2.创建该类型的私有静态实例
	private static SingletoTwo instance = null;
//	3.创建公有静态方法，返回静态实例对象，只有在用的时候才实例化，且只实例化一次，所以懒
	public static SingletoTwo getInstance() {
		if(instance == null) {
			instance = new SingletoTwo();
		}
		return instance;
	}
}
