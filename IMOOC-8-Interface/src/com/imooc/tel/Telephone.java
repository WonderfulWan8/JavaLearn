package com.imooc.tel;
/*
 * ԭʼ�ֻ�
 */
public class Telephone implements Inet{
	private String brand;
	private int price;
	public Telephone() {
		
	}
	public Telephone(String brand,int price) {
		this.setBrand(brand);
		this.setPrice(price);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void call() {
		System.out.println("�ֻ����Դ�绰");
	}
	@Override
	public void network() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void connection() {
		// TODO Auto-generated method stub
		
	}
}
