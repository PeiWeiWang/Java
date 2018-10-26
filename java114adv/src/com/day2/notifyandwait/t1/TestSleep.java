package com.day2.notifyandwait.t1;

public class TestSleep extends Thread{
	private String lock ;
	
	
	public TestSleep(String lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		
		synchronized (lock) {
			System.out.println(Thread.currentThread().getName()+
					"����run����,��ʼִ��");
			try {
				//Thread.sleep(10000);
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+
					"ִ�����");
		}
	}

	public static void main(String[] args) {
		 String  lock = "��";
		 new TestSleep(lock).start();
		 new TestSleep(lock).start();
		 new TestSleep(lock).start();
	}

}
