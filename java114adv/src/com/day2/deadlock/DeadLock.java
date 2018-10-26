package com.day2.deadlock;

public class DeadLock extends Thread{
	private Object lock1 ;
	private Object lock2 ;
	
	
	


	public DeadLock(Object lock1, Object lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}


	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (lock1) {
			System.out.println(name+"��ȡ��"+lock1+",��ʼִ�е�һ�������Ĵ���");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+"��һ�������Ĵ���ִ�����,׼����ȡ"+lock2+"������2����");
			synchronized (lock2) {
				System.out.println(name+"--��ʼִ�е�2�������Ĵ���---");
			}
		}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lock1 = "����";
		String lock2 = "����";
		
		new DeadLock(lock1,lock2).start();//A --- lock1
		new DeadLock(lock2,lock1).start();//B --- lock

		
	}

}
