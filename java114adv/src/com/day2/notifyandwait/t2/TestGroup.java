package com.day2.notifyandwait.t2;

public class TestGroup {

	/**
	 * 线程组的使用
	 */
	public static void main(String[] args) {
		ThreadGroup tg1 = new ThreadGroup("线程组1");
		Thread t1 = new Thread(tg1,"线程1");
		t1.start();
		Thread t2 = new Thread(tg1,"线程2");
		//.start();
		Thread t3 = new Thread(tg1,"线程3");
		
		tg1.destroy();
		//System.out.println(t1.getThreadGroup());
		
		System.out.println(tg1.activeCount());//1
		
		
		
		
	}

}
