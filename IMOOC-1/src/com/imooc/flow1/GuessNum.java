package com.imooc.flow1;

import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10+1);
		System.out.println("�����ǣ�"+num);
		Scanner s = new Scanner(System.in);
		int inNum;
		while(true) {
			inNum = s.nextInt();
			if(inNum > num) {
				System.out.println("�´���");
			}else if(inNum < num) {
				System.out.println("��С��");
			}else {
				System.out.println("������");
				break;
			}
		}
	}
}
