package com.imooc.function;

public class ArrayDemo {
//	����һ�������޸�ĳ������Ԫ�صķ���
	public void changeArr(int[] arr) {
		arr[0] = 999999;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		ArrayDemo ca = new ArrayDemo();
		ca.changeArr(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
