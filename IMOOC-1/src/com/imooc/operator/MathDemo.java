package com.imooc.operator;

import java.util.Scanner;

public class MathDemo {
	public static void main(String[] args) {

		while (true) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			if (n % 2 == 0) {
				System.out.println("Å¼Êý");
			} else {
				System.out.println("ÆæÊý");
			}
		}
	}
}
