package com.imooc.practice.p7;

public class Circle extends Shape {
	private double r;
	final double PI = 3.14;

	public Circle() {

	}

	public Circle(double r) {
		this.setR(r);
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("圆形的面积为"+PI*PI*this.r);
	}

}
