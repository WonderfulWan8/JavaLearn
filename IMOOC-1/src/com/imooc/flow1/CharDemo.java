package com.imooc.flow1;

public class CharDemo {
	public static void main(String[] args) {
//		ѭ�����26��Ӣ��Сд��ĸ�����������
		char ch = 'a';
		int count = 1;
		while (ch < 'z') {
			ch += 1;
			count++;
			if(count %13 == 0) {
				System.out.println();
			}
			System.out.print(ch);
		}
	}
}
