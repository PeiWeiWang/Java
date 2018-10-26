package com.day2.deadlock.l2;

public class Deadlock implements Runnable {
	A a = new A();
	B b = new B();

	Deadlock() {
		Thread.currentThread().setName("���߳�");//��main�߳�����
		
		new Thread(this).start();//�ֿ��������߳�
		
		//�˶δ��������� main�߳� --a������Ϊ��,������main�߳�����
		a.foo(b); // get lock on a in this thread.
		System.out.println("back in main thread");
	}

	public void run() {
		Thread.currentThread().setName("���߳�");
		
		//b������Ϊ��,���������߳�����
		b.bar(a); // get lock on a in other thread.
		System.out.println("back in other thread");
	}

	public static void main(String[] args) {
		new Deadlock();//main�߳�
		
		
		
		
	}
}