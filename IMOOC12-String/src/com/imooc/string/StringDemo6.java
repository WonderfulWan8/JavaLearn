package com.imooc.string;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String的不可变性
//		String对象一旦创建，则不能修改
//		所谓的修改是指创建了新的对象，所指向的内存空间不变
		String s1 = "imooc";
		s1 = "hello" + s1;// 在常量池中生成了新的字符串，s1指向的内存地址会发生改变
		System.out.println(s1);

		String s3 = new String("hello imooc");
		System.out.println(s3.substring(0, 5));
	}

}
