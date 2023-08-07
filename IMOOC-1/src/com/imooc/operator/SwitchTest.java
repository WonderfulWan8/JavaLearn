package com.imooc.operator;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		switch (n) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期2");
			break;
		case 3:
			System.out.println("星期3");
			break;
		case 4:
			System.out.println("星期4");
			break;
		case 5:
			System.out.println("星期5");
			break;
		case 6:
			System.out.println("星期6");
			break;
		case 7:
			System.out.println("星期7");
			break;
		default:
			System.out.println("超出范围");

		}
	}
}
