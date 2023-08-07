package com.imooc.operator;

import java.util.Scanner;

public class YearTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("My turn");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("ÈòÄê");
		}else {
			System.out.println("¼¸Äê");
		}
	}
}
