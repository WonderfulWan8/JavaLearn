package com.imooc.string;

public class StringDemo5 {
	public static void main(String[] args) {
		String st1 = "imooc";
		String st2 = "imooc";
		String st3 = new String("imooc");
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));
		System.out.println(st1 == st2);
		System.out.println(st2 == st3);

	}
}
