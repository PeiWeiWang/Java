package com.day1;

//1.�̳�Thread��
class ThreadDemo extends Thread {
	// 2.��дrun����---��Ҫ���߳�ִ�еĴ���
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
	
		for (int i = 0; i < 100; i++) {
			System.out.println("------" + name + "ִ����" + i + "��");
		}
	}

}

public class TestThread {
	public static void main(String[] args) {

		// 3.(�����߳�)�ȴ����߳���Ķ���
		ThreadDemo d = new ThreadDemo();
		// d.run();//������ͨ�ķ�������,���������߳�

		// 4.ʹ��start���������߳�
		d.start();
		// d.start();//ͬһ���̶߳���ֻ������һ��
/*
		String name = "���߳�";
		for (int i = 0; i < 100; i++) {
			System.out.println("******" + name + "ִ����" + i + "��");
		}*/

	}

}
