package com.imooc.practice.p2;

public class Fruits {
	private String shape;
	private String taste;
	public void eat() {
		System.out.println("ˮ���ɹ�����ʳ�ã�");
	}
	public Fruits() {
		
	}
	public Fruits(String shape,String taste) {
		this.setShape(shape);
		this.setTaste(taste);
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Fruits f1 = (Fruits) obj;
		if(f1.getShape().equals(this.getShape()) && f1.getTaste().equals(this.getTaste())) {
			return true;
		}else {
			return false;
		}
	}
	
}
