package com.day2.notifyandwait;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ʹ�õ���ͬһ��NumHorder����,ʹ�õ���ͬ������,�Ե�ǰnhΪ��
		NumHorder nh = new NumHorder();
		
		new Dese(nh,"���߳�1").start();//  ����1����0
		new Inse(nh,"���߳�1").start();//  ����0����1
		new Dese(nh,"���߳�2").start();//  ����1����0
		new Inse(nh,"���߳�2").start();//  ����0����1
	}

}
