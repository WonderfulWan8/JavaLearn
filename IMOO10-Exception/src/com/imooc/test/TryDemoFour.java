package com.imooc.test;

import java.util.Scanner;

public class TryDemoFour {
	/*
	 * throw抛出异常对象的处理方案： 1、通过try catch包含throw语句 - 自己抛出异常自己处理
	 */
//	public static void testAge() {
//		try {
//			System.out.println("输入年龄：");
//			Scanner sc = new Scanner(System.in);
//			int age = sc.nextInt();
//			if (age < 18 || age > 80) {
//				throw new Exception("需要亲友陪同");
//			} else {
//				System.out.println("欢迎入住");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	/*
	 * throw抛出异常对象的处理方案： 
	 * 1、通过try catch包含throw语句 - 自己抛出异常自己处理
	 * 2、通过throws在方法声明处抛出异常类型 - 谁调用谁处理
	 */
//	public static void testAge() throws Throwable {
//
//		System.out.println("输入年龄：");
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if (age < 18 || age > 80) {
//			throw new Exception("需要亲友陪同");
//		} else {
//			System.out.println("欢迎入住");
//		}
//	}
	public static void testAge() throws AgeException {

		System.out.println("输入年龄：");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 18 || age > 80) {
			throw new AgeException();
		} else {
			System.out.println("欢迎入住");
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
