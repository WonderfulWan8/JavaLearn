package com.imooc.test;

import com.imooc.practice.p4_singletoone.Earth;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Earth e1 = Earth.getInstance();
		Earth e2 = Earth.getInstance();
		Earth e3 = Earth.getInstance();
		System.out.println(e1 == e2 && e2 == e3);
	}

}
