package com.day8.fianl;

public class Test {
	//final int x = 0;//永远不可改变
	final int x;//final空白，java不会对final修饰的成员变量赋予初始值
	
	public static final long VERSION=200L;
	

	public Test(int x) {
		this.x = x;//在构造器中对final变量进行赋值
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//final int  x = 1;
		//x=3;//final修饰的变量的值不可改变
		//System.out.println(x);

		Test t = new Test(4);
		System.out.println(t.x);
	//	t.x = 10;
		
		Test t1 = new Test(10);
		System.out.println(t1.x);
	}

}
