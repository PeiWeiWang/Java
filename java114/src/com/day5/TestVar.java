package com.day5;

public class TestVar {
	int x = 1;//成员变量
	
	public void fun1(){
		int y = 2;//局部变量
		System.out.println(x);
		System.out.println(y);
	}
	
	public void fun2(){
		x = 3;//对成员属性X进行重新赋值
		System.out.println(x);//使用的是成员变量x
		
		int x = 3;//重新定义的一个局部变量，只在fun2中起效
		System.out.println(x);//使用的是局部变量x
	}
	
	//x：形式参数；形参等同于本作用域的局部变量
	public void fun2(int x){
		System.out.println(x);
	}
}
