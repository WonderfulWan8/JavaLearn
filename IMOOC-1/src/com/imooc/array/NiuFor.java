package com.imooc.array;

public class NiuFor {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int n : arr) {
			System.out.println("n:" + n);
		}
		int a = 3, b = 5;
		System.out.println("a" + a +"b" + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a" + a +"b" + b);
	}
}
