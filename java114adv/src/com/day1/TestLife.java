package com.day1;

public class TestLife extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 20; i++) {
			System.out.println("------" + name + "ִ����" + i + "��");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1.�½�״̬
		TestLife tl = new TestLife();
		
		//2.����״̬----��û�п�ʼִ��
		tl.start();
		tl.start();
		
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 20; i++) {
			System.out.println("------" + name + "ִ����" + i + "��");
		}
	
	}

}
