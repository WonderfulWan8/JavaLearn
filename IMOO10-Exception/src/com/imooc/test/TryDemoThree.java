package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {

	public static int test() throws Exception {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		System.out.println("1/2:" + one / two);
		System.out.println("�������");
		return one / two;
	}

	public static void main(String[] args) {
		try {
			int result = test();
			System.out.println(result);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Ҫ�������Ϊ0");
//			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Ҫ������Ϊ����");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}