package com.imooc.stumanagement;

public class Subject {
	private String subjectName;
	private String code;
	private int year;
	Student[] studentList;
	public Subject() {
		
	}
	public Subject(String subjectName,String code,int year) {
		this.setsubjectName(subjectName);
		this.setCode(code);
		this.setYear(year);
	}
	public String getsubjectName() {
		return subjectName;
	}
	public void setsubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
