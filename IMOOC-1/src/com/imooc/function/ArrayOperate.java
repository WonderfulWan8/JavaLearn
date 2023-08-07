package com.imooc.function;

import java.util.Scanner;

public class ArrayOperate {
	public void showArr(int[] arr) {
		for(int i = 0 ; i < arr.length ;i++) {
			System.out.println("arr:"+arr[i]);
		}
	}

	public void insert(int[] arr, int index, int num) {
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
			if(i == index) {
				arr[index] = num;
				break;
			}
		}
	}

	public void operate(int[] arr) {
		Scanner s = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("*****************************");
			System.out.println("1-插入数据");
			System.out.println("2-显示所有数据");
			System.out.println("3-在指定位置处插入数据");
			System.out.println("4-查询能被3整除的数据");
			System.out.println("0-退出");
			System.out.println("*****************************");
			n = s.nextInt();
			switch (n) {
			case 1:
				break;
			case 2:
				
			case 3:
				System.out.println("请输入插入下下标");
				int index = s.nextInt();
				System.out.println("请输入插入的数字");
				int num = s.nextInt();
				this.insert(arr,index,num);
				break;			
			}
			if(n == 0) {
				break;
			}
			this.showArr(arr);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		ArrayOperate ao = new ArrayOperate();
		ao.operate(arr);

	}
}
