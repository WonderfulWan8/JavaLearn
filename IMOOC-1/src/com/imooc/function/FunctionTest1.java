package com.imooc.function;

public class FunctionTest1 {
	public void Say() {
		System.out.println("**********************");
	}
	public int area() {
		int length = 10;
		int width = 20;	
		return length*width;
	}
	public float max(float a,float b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public void iterate(int[] arr) {
		for(int i = 0 ; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public void iterate(int[] arr,int n) {
		for(int i = 0 ; i < arr.length;i++) {
//			System.out.println(arr[i]);
			if(arr[i] == n) {
				System.out.println("找到了");
				return;
			}
		}
		System.out.println("没找到");
	}

	public static void main(String[] args) {
//		this.Say();
		FunctionTest1 mytest = new FunctionTest1();
		int[] arr = {1,2,3,3,4,5};
		mytest.iterate(arr);
		mytest.iterate(arr,6);
		mytest.iterate(arr,4);
	}

}
