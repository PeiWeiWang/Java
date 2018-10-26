package com.day2;

public class TestScope {

	
	public static void main(String[] args) {
		//System.out.println(i);//i还没有定义
		int i =1;
		System.out.println(i);
		{
			System.out.println(i);
			int y =10;
			System.out.println(y);
		}
		//System.out.println(y);//超出作用域
		System.out.println(i);
	}

	
}
