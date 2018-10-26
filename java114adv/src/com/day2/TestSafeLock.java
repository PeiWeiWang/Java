package com.day2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadDemo4 implements Runnable {
	private Integer num = 40;
	private Lock lock = new ReentrantLock();
	
	@Override
	public void run() {
		while (true) {
			lock.lock();
				if (num > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "--卖掉了第" + num-- + "张票");
				}
			lock.unlock();
			}
		
		}	
	}


public class TestSafeLock {
	public static void main(String[] args) {
		
		ThreadDemo2 td = new ThreadDemo2();//共享资源
	
		Thread t1 = new Thread(td,"子线程1");
		t1.start();
		
		Thread t2 = new Thread(td,"子线程2");
		t2.start();
		
		Thread t3 = new Thread(td,"子线程3");
		t3.start();
		
		Thread t4 = new Thread(td,"子线程4");
		t4.start();
	}
}
