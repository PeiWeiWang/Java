package com.day1;

//1.��Ŀ����ʵ��Runnable�ӿ�
class ThreadDemo2 implements Runnable {
	private Integer num = 40;

	// 2.��дrun����
	@Override
	public void run() {
		while (true) {
			if (num > 0) {
				// Thread.currentThread().getName():��ȡ��ǰ�̵߳�����
				System.out.println(Thread.currentThread().getName() + "�����˵�"
						+ num-- + "��Ʊ");
			}
		}

	}

}

public class TestRunnable {
	public static void main(String[] args) {
		//3.����Ŀ����Ķ���
		ThreadDemo2 td = new ThreadDemo2();//������Դ
		//4.����Thread��Ķ���,��������Ķ���ΪThread��Ĺ��췽���Ĳ���
		Thread t1 = new Thread(td,"���߳�1");
		//5.ͨ��Thread��������start���������߳�,����Ŀ����Ķ����run����
		t1.start();
		
		Thread t2 = new Thread(td,"���߳�2");
		t2.start();
		
		Thread t3 = new Thread(td,"���߳�3");
		t3.start();
		
		Thread t4 = new Thread(td,"���߳�4");
		t4.start();
	}
}
