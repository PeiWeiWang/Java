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
		// ������age��ֵ��ֵ����ǰ�����г�Ա����age
		//TestThis(age);//���췽�������������ʽ�ĵ���
		this(age);
		//this.age = age;
		this.name = name;
	}

	public void fun1() {
		// name�ڴ˴����õ��ǵ�ǰ����fun1()��������Ķ���
		System.out.println("����fun1,�������name��" + this.name);
		System.out.println(this);
	}

	public void fun2() {
		this.fun1();
		System.out.println("����fun2");
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
