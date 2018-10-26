package com.homework.w0719;

public class Printer {
	public Printer(){
		super();
		System.out.println("我是父类的构造方法");
	}
	protected void print(){
	//	System.out.println("打印机能打印");
	}
}

class ColorPrinter extends Printer{

	public ColorPrinter(){
		super();
		System.out.println("我是彩色的构造方法");
	}
	
	@Override
	public void print() {
		System.out.println("彩色打印机是打印彩色的");
	}
	
}

class BWPrinter extends Printer{

	public BWPrinter(){
		System.out.println("我是黑白的构造方法");
	}
	
	@Override
	public void print() {
		System.out.println("黑白打印机是打印黑白的");
	}
	
}

