package com.imooc.array;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int num;
		for(int i = 0 ; i<arr.length;i++) {
			num = s.nextInt();
			sum += num;
			arr[i] = num;
		}
		System.out.println("sum:"+sum);
		int max = -9999;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
