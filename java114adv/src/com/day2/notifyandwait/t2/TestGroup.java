package com.day2.notifyandwait.t2;

public class TestGroup {

	/**
	 * �߳����ʹ��
	 */
	public static void main(String[] args) {
		ThreadGroup tg1 = new ThreadGroup("�߳���1");
		Thread t1 = new Thread(tg1,"�߳�1");
		t1.start();
		Thread t2 = new Thread(tg1,"�߳�2");
		//.start();
		Thread t3 = new Thread(tg1,"�߳�3");
		
		tg1.destroy();
		//System.out.println(t1.getThreadGroup());
		
		System.out.println(tg1.activeCount());//1
		
		
		
		
	}

}
