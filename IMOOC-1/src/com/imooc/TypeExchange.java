package com.imooc;

public class TypeExchange {
	public static void main(String[] args) {
		// char 类型和int类型之间相互转换
		char c = (char) 65536;
		int n;
		n = c;
		c = (char)n;

		//	整形和浮点数的类型转换问题	
		int x = 100;
		long y = x;
		x = (int)y;
	}
}
