package com.imooc.function;

/**
 * @description: 关于可变参数列表和重载的问题
 * @author: fuden
 * @date: 2023年6月16日
 * @version:1.0
 */
public class ChangeArgs {

	public void sum(int a,int... n) {
		System.out.println("a:"+a);
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		System.out.println("sum:" + sum);
	}
	public int plus(int a,int b) {
		System.out.println("不带可变参数的方法被调用~");
		return a+b;
	}
	public int plus(int a,int... n) {
		System.out.println("带可变参数的方法被调用~");
		int sum = 0;
		for(int i:n) {
			sum+=i;
		}
		sum += a;
		return sum;
	}

	public static void main(String[] args) {
		ChangeArgs ca = new ChangeArgs();
		ca.plus(10, 20,30);
	}
}
