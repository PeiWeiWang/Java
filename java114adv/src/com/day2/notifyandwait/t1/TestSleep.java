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
					"进入run方法,开始执行");
			try {
				//Thread.sleep(10000);
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+
					"执行完毕");
		}
	}

	public static void main(String[] args) {
		 String  lock = "锁";
		 new TestSleep(lock).start();
		 new TestSleep(lock).start();
		 new TestSleep(lock).start();
	}

}
