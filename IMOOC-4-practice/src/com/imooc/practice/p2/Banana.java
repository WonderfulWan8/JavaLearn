package com.imooc.practice.p2;

public class Banana extends Fruits {
	private String variety;

	public Banana() {

	}

	public Banana(String shape, String taste, String variety) {
		super.setShape(shape);
		super.setTaste(taste);
		this.setVariety(variety);
	}

	public void advantage() {
		System.out.println(this.getVariety() + " ���� " + super.getShape() + "�������𣬿ɹ���ʳ");
	}

	public String advantage(String color) {
		return this.getVariety() + " ��ɫΪ " + color;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

}