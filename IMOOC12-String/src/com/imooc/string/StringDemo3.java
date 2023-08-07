package com.imooc.string;

import java.io.UnsupportedEncodingException;

public class StringDemo3 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String str = new String("Java ±à³Ì »ù´¡");
		byte[] arrs = str.getBytes();
		for(int i=0;i<arrs.length;i++) {
			System.out.println(arrs[i]+" ");
		}
		
		String str1 = new String(arrs,"GBK");
		System.out.println(str1);
		
	}
}
