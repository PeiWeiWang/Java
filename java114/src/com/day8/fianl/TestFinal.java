package com.day8.fianl;

public final class TestFinal {
	final int x =10;
	
	public final void fun1(){
	//	x=11;//final修饰的变量不可以再次赋值
		System.out.println("final修饰的方法不可以被子类重写");
	}
}


//fianl类没有子类
/*class Son extends TestFinal{
	
	//final修饰的方法不可以被子类重写
	public final void fun1(){
		System.out.println("final修饰的方法不可以被子类重写");
	}
}*/