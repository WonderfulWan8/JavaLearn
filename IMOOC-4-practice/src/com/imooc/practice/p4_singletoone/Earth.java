package com.imooc.practice.p4_singletoone;

public class Earth {
	private Earth() {
		System.out.println("µØÇòµ®Éú");
	}
	private static Earth instance = null;
	public static Earth getInstance() {
		if(instance == null) {
			instance = new Earth();
		}
		return instance;
	}
	
}	
