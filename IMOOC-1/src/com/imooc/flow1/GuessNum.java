package com.imooc.flow1;

import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10+1);
		System.out.println("数字是："+num);
		Scanner s = new Scanner(System.in);
		int inNum;
		while(true) {
			inNum = s.nextInt();
			if(inNum > num) {
				System.out.println("猜大了");
			}else if(inNum < num) {
				System.out.println("猜小了");
			}else {
				System.out.println("猜中了");
				break;
			}
		}
	}
}
