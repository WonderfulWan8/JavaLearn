package com.imooc.test;

import com.imooc.sp.SingletoOne;
import com.imooc.sp.SingletoTwo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletoOne s1 = SingletoOne.getInstance();
		SingletoOne s2 = SingletoOne.getInstance();
		System.out.println(s1.equals(s2));//true 返回的是同一个对象引用
		SingletoTwo s3 = SingletoTwo.getInstance();
		SingletoTwo s4 = SingletoTwo.getInstance();
		System.out.println(s3.equals(s4));
	}

}
