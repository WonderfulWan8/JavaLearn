package com.imooc.string;

public class StringDemo7 {
//	String���в��ɱ��� ÿ���޸Ķ��ᴴ��һ���µ�String����Ƚ��˷ѿռ�
//	StringBuilder������ԭʼ�ַ����Ͻ����޸� ���贴���µĶ���
	public static void main(String[] args) {
//		����һ���ַ��� "���"
		StringBuilder sb = new StringBuilder("���");
//		��"���"���������ַ���
		sb.append(" imooc");
		System.out.println(sb);
//		���ַ������ "��ã�IMOOC"
//		���ַ�ʽ
//		1��ʹ��delete����ɾ��imooc��Ȼ�����IMOOC
		System.out.println(sb.delete(4, 8));
		System.out.println(sb.insert(4, "MOOC"));
//		2 ʹ��replace�滻
		System.out.println(sb.replace(4, 8, "MOOC"));
		
	}
}