package com.day1;

public class TestLife extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 20; i++) {
			System.out.println("------" + name + "执行了" + i + "次");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1.新建状态
		TestLife tl = new TestLife();
		
		//2.就绪状态----并没有开始执行
		tl.start();
		tl.start();
		
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 20; i++) {
			System.out.println("------" + name + "执行了" + i + "次");
		}
	
	}

}
