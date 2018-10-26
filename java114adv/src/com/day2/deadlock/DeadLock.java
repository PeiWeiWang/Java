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
			System.out.println(name+"获取了"+lock1+",开始执行第一把锁处的代码");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+"第一把锁处的代码执行完毕,准备获取"+lock2+"开启第2把锁");
			synchronized (lock2) {
				System.out.println(name+"--开始执行第2把锁处的代码---");
			}
		}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lock1 = "金锁";
		String lock2 = "银锁";
		
		new DeadLock(lock1,lock2).start();//A --- lock1
		new DeadLock(lock2,lock1).start();//B --- lock

		
	}

}
