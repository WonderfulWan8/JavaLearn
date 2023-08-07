package com.imooc.function;

/**
 * @description: ���ڿɱ�����б�����ص�����
 * @author: fuden
 * @date: 2023��6��16��
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
		System.out.println("�����ɱ�����ķ���������~");
		return a+b;
	}
	public int plus(int a,int... n) {
		System.out.println("���ɱ�����ķ���������~");
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
