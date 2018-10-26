package com.day1;

//1.继承Thread类
class ThreadDemo extends Thread {
	// 2.重写run方法---需要多线程执行的代码
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
	
		for (int i = 0; i < 100; i++) {
			System.out.println("------" + name + "执行了" + i + "次");
		}
	}

}

public class TestThread {
	public static void main(String[] args) {

		// 3.(启动线程)先创建线程类的对象
		ThreadDemo d = new ThreadDemo();
		// d.run();//这是普通的方法调用,不是启动线程

		// 4.使用start方法启动线程
		d.start();
		// d.start();//同一个线程对象只能启动一次
/*
		String name = "主线程";
		for (int i = 0; i < 100; i++) {
			System.out.println("******" + name + "执行了" + i + "次");
		}*/

	}

}
