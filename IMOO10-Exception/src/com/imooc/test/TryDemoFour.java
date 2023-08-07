package com.imooc.test;

import java.util.Scanner;

public class TryDemoFour {
	/*
	 * throw�׳��쳣����Ĵ��������� 1��ͨ��try catch����throw��� - �Լ��׳��쳣�Լ�����
	 */
//	public static void testAge() {
//		try {
//			System.out.println("�������䣺");
//			Scanner sc = new Scanner(System.in);
//			int age = sc.nextInt();
//			if (age < 18 || age > 80) {
//				throw new Exception("��Ҫ������ͬ");
//			} else {
//				System.out.println("��ӭ��ס");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	/*
	 * throw�׳��쳣����Ĵ��������� 
	 * 1��ͨ��try catch����throw��� - �Լ��׳��쳣�Լ�����
	 * 2��ͨ��throws�ڷ����������׳��쳣���� - ˭����˭����
	 */
//	public static void testAge() throws Throwable {
//
//		System.out.println("�������䣺");
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if (age < 18 || age > 80) {
//			throw new Exception("��Ҫ������ͬ");
//		} else {
//			System.out.println("��ӭ��ס");
//		}
//	}
	public static void testAge() throws AgeException {

		System.out.println("�������䣺");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 18 || age > 80) {
			throw new AgeException();
		} else {
			System.out.println("��ӭ��ס");
		}
	}

	public static void main(String[] args) {
		try {
			testAge();
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}
	}
}