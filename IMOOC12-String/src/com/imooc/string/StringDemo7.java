package com.imooc.string;

public class StringDemo7 {
//	String具有不可变性 每次修改都会创建一个新的String对象比较浪费空间
//	StringBuilder可以在原始字符串上进行修改 无需创建新的对象
	public static void main(String[] args) {
//		定义一个字符串 "你好"
		StringBuilder sb = new StringBuilder("你好");
//		在"你好"后面添加字符串
		sb.append(" imooc");
		System.out.println(sb);
//		将字符串变成 "你好，IMOOC"
//		两种方式
//		1、使用delete方法删除imooc，然后插入IMOOC
		System.out.println(sb.delete(4, 8));
		System.out.println(sb.insert(4, "MOOC"));
//		2 使用replace替换
		System.out.println(sb.replace(4, 8, "MOOC"));
		
	}
}
