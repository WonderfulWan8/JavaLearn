package com.imooc.test;

import com.imooc.tel.Camera;
import com.imooc.tel.Fourthphone;
import com.imooc.tel.IPhoto;
import com.imooc.tel.Inet;
import com.imooc.tel.SmartWatch;
import com.imooc.tel.Thirdphone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fourthphone fp = new Fourthphone();
		fp.call();
		fp.message();
		fp.music();
		fp.game();
//		fp.photo();
		System.out.println("==================");
//		�ֻ������������ʵ������
		IPhoto ip = new Fourthphone();
		ip.photo();
		ip = new Camera();
		ip.photo();
		System.out.println("==================");
		System.out.println(Inet.temp);
		System.out.println("==================");
		Inet in = new SmartWatch();
		in.connection();
		System.out.println(in.temp);
		Inet.stop();//��̬����ֻ��ͨ���ӿ�������
		System.out.println("==================");
		Inet net2 = new SmartWatch();
		net2.connection();
		IPhoto ip2 = new SmartWatch();
		ip2.connection();
		System.out.println("================== - 5");
		Inet net3 = new Fourthphone();
		net3.connection();
		IPhoto ip3 = new Fourthphone();
		ip3.connection();
		
		
	}
}
