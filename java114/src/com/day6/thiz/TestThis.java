package com.day6.thiz;

public class TestThis {
	int age;
	String name;

	public TestThis() {
		super();
	}

	public TestThis(int age) {
		this();
		this.age = age;
	}

	public TestThis(int age, String name) {
		// 将参数age的值赋值给当前对象中成员变量age
		//TestThis(age);//构造方法不允许进行显式的调用
		this(age);
		//this.age = age;
		this.name = name;
	}

	public void fun1() {
		// name在此处调用的是当前调用fun1()这个方法的对象
		System.out.println("我是fun1,本对象的name是" + this.name);
		System.out.println(this);
	}

	public void fun2() {
		this.fun1();
		System.out.println("我是fun2");
	}

	public static void main(String[] args) {
		/*
		 * TestThis tt = new TestThis(); tt.name = "aa"; tt.fun1();
		 */
		// tt.fun2();
		TestThis tt = new TestThis(10, "aaa");
		System.out.println(tt.age);
		System.out.println(tt);
		tt.fun1();
	}

}
