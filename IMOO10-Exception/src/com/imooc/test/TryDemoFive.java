package com.imooc.test;

public class TryDemoFive {
	public static void testOne() throws AgeException {
		throw new AgeException();
	}

	public static void testTwo() throws Exception{
		try {
			testOne();
		} catch (AgeException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw new Exception("�����²������쳣",e);
		}
	}

	public static void testThree() throws Exception{
		try {
			testTwo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("�����µ��쳣2",e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			testThree();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}