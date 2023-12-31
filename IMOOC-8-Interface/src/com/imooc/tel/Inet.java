package com.imooc.tel;

//接口修饰符 默认public 
public interface Inet {
//	接口中抽象方法可以不写abstract
//	访问修饰符默认public
//	当类实现接口时，需要去实现接口中所有抽象方法，否则需要将该类变成抽象类
	void network();


//	接口中可以包含常量，默认会加上public static final
//	public static final int temp = 20;
	int temp = 20;

//	default：默认方法，可以带方法体 jdk1.8后更新
	default void connection() {
		System.out.println("我是接口中的默认链接");
	}
//	static:静态方法，可以带方法体 jdk1.8后更新
	static void stop() {
		System.out.println("我是接口中的静态方法");
	}
}
