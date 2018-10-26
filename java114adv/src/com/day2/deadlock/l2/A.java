package com.day2.deadlock.l2;



public class A {
	//A�Ķ���Ϊ��
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " ����  A.foo ");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(name + " ����ִ�� B.last()");
		b.last();//B�Ķ���
	}

	synchronized void last() {
		System.out.println("inside A.last");
	}
}