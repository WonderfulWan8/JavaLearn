package com.imooc.test;

public class Book {
	private String name;
	private String author;
	private String productor;
	private double price;
	public Book(String name,String author,String productor,double price) {
		this.setName(name);
		this.setAuthor(author);
		this.setProductor(productor);
		this.setPrice(price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 10) {
			System.out.println("金额不能小于10");
			return;
		}else {			
			this.price = price;
		}
	}
	public void getBookInfo() {
		System.out.println("图书价格最低10元");
		System.out.println("书名"+this.name);
		System.out.println("作者"+this.author);
		System.out.println("出版社"+this.productor);
		System.out.println("价格"+this.price);
		System.out.println("=======================================");
	}

}
