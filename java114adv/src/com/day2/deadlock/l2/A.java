package com.day2.deadlock.l2;



public class A {
	//A的对象为锁
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 进入  A.foo ");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(name + " 尝试执行 B.last()");
		b.last();//B的对象
	}

	synchronized void last() {
		System.out.println("inside A.last");
	}
}