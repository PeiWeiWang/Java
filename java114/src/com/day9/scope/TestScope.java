package com.day9.scope;

public class TestScope {
	
	{
		System.out.println("我是构造代码块1");
	}
	{
		System.out.println("我是构造代码块2");
	}
	public TestScope(){
		System.out.println("我是构造方法");
	} 
	static{
		System.out.println("我是静态代码块1");
	}
	
	
	public static void main(String[] args) {
		System.out.println("我是main方法");
		TestScope ts = new TestScope();
		
	}
	static{
		System.out.println("我是静态代码块2");
	}
}
