package com.day2;

class ThreadDemo3 implements Runnable {
	private Integer num = 40;
	
	@Override
	public void run() {
		while (true) {
			this.sal();
		}	
		}
	
	//ʹ��synchronized���η���:synchronized����ʹ��thisΪ��
	public synchronized void sal() {
		if (num > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "--�����˵�"
					+ num-- + "��Ʊ");
		}
	}

}

public class TestSafeMethod {
	public static void main(String[] args) {
		
		ThreadDemo2 td = new ThreadDemo2();//������Դ
	
		Thread t1 = new Thread(td,"���߳�1");
		t1.start();
		
		Thread t2 = new Thread(td,"���߳�2");
		t2.start();
		
		Thread t3 = new Thread(td,"���߳�3");
		t3.start();
		
		Thread t4 = new Thread(td,"���߳�4");
		t4.start();
	}
}
