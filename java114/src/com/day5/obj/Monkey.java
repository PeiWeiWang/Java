package com.day5.obj;



public class Monkey {
	//属性:成员属性(实例属性，实例属性属于对象，每个对象都有独立的属性)
	String name;
	int age;//初始值可以省略
	String sex;
	String color;
	String type;
	
	//无参构造
	public Monkey(){}
	
	//可以对所有成员属性进行赋值的有参构造
	
	
	
	
	
	
	//行为：使用方法进行定义,称为成员方法（成员方法可以调用其他成员）
	//实例方法，实例方法属于对象
	public void climb(){
		
		System.out.println(name+"是猴子，能爬树");
	}
	public void eat(){
		
		System.out.println("猴子会吃桃子"+name);
	}
	public void drink(){
		System.out.println("猴子会吃喝水"+sex);
	}
}
