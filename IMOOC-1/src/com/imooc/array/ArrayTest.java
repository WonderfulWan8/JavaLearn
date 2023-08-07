package com.imooc.array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[] intArray;
		int intA[];
		int[] arr;
		arr = new int[10];
		int arr1[] = new int[2];
		int arr2[];
		arr2 = new int[6];
		System.out.println(arr2.length);
		float[] floatArray = new float[4];
//		初始化数组
		char[] ch = { 'a', 'b', 'c' };
		String[] strList = new String[10];
		System.out.println(ch[2]);
		System.out.println(strList[2]);
		int num;
		for (int i = 0; i < 6; i++) {
			arr2[i] = i;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
