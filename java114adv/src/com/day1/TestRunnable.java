package com.day1;

//1.让目标类实现Runnable接口
class ThreadDemo2 implements Runnable {
	private Integer num = 40;

	// 2.重写run方法
	@Override
	public void run() {
		while (true) {
			if (num > 0) {
				// Thread.currentThread().getName():获取当前线程的名字
				System.out.println(Thread.currentThread().getName() + "卖掉了第"
						+ num-- + "张票");
			}
		}

	}

}

public class TestRunnable {
	public static void main(String[] args) {
		//3.创建目标类的对象
		ThreadDemo2 td = new ThreadDemo2();//共享资源
		//4.创建Thread类的对象,并以上类的对象为Thread类的构造方法的参数
		Thread t1 = new Thread(td,"子线程1");
		//5.通过Thread类对象调用start方法启动线程,调用目标类的对象的run方法
		t1.start();
		
		Thread t2 = new Thread(td,"子线程2");
		t2.start();
		
		Thread t3 = new Thread(td,"子线程3");
		t3.start();
		
		Thread t4 = new Thread(td,"子线程4");
		t4.start();
	}
}
