package com.imooc.stumanagement;

public class Student {
	String name;
	String num;
	String sex;
	int age;
	String major;
	int year;

	public Student() {
		
	}
	
	public Student(String name,String num,String sex,int age,String major,int year) {
		this.setName(name);
		this.setNum(num);
		this.setSex(sex);
		this.setAge(age);
		this.setMajor(major);
		this.setYear(year);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
