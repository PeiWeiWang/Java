package com.day2.deadlock.l2;

public class Deadlock implements Runnable {
	A a = new A();
	B b = new B();

	Deadlock() {
		Thread.currentThread().setName("主线程");//给main线程命名
		
		new Thread(this).start();//又开启的子线程
		
		//此段代码运行在 main线程 --a对象作为锁,掌握在main线程手上
		a.foo(b); // get lock on a in this thread.
		System.out.println("back in main thread");
	}

	public void run() {
		Thread.currentThread().setName("子线程");
		
		//b对象作为锁,掌握在子线程手上
		b.bar(a); // get lock on a in other thread.
		System.out.println("back in other thread");
	}

	public static void main(String[] args) {
		new Deadlock();//main线程
		
		
		
		
	}
}