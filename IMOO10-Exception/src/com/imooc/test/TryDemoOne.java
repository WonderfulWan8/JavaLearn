package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {
	public static void main(String[] args) {
//		int one = 12;
//		int two = 2;
//		System.out.println("1/2:"+one/two);

		Scanner sc = new Scanner(System.in);
		try {
			int one = sc.nextInt();
			int two = sc.nextInt();
			System.out.println("1/2:" + one / two);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.exit(1);
			System.out.println("�����쳣��" + e);
		} catch (InputMismatchException e) {
			System.out.println("�����쳣��" + e);
		} catch (Exception e) {
			System.out.println("�����쳣��" + e);
		} finally {
			System.out.println("�������");
		}

	}
}
