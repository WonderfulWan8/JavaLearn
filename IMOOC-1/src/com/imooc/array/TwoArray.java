package com.imooc.array;

public class TwoArray {
	public static void main(String[] args) {
//		int[][] intArray = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] intArray = new int[3][];
		intArray[0] = new int[2];
		intArray[1] = new int[3];
		intArray[2] = new int[4];
		for(int i = 0 ; i < intArray.length;i++) {
			for(int j = 0 ; j < intArray[i].length;j++) {
				System.out.print("intArray["+i+"]"+"["+j+"]"+intArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}
