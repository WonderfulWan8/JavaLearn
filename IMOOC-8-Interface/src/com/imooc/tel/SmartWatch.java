package com.imooc.tel;

public class SmartWatch implements Inet,IPhoto{
	public static final int temp = 30;
	
	public void call() {
		System.out.println("智能手表打电话");
	}
	public void message() {
		System.out.println("智能手表发短信");
	}

	@Override
	public void network() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}
	public void connection() {
		System.out.println("smart phone自己的链接");
	}
}
