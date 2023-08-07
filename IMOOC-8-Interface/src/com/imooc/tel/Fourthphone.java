package com.imooc.tel;

public class Fourthphone extends Thirdphone implements IPhoto{
//	public void photo() {
//		System.out.println("自拍");
//	}
	public void newwork() {
		System.out.println("上网");
	}
	public void game() {
		System.out.println("玩游戏");
	}
	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("自拍");
	}
}
