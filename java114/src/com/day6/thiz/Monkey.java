package com.day6.thiz;



public class Monkey {
	
	String name;
	int age;
	String sex;
	String color;
	String type;
	
	//无参构造
	public Monkey(){super();}
	
	//可以对所有成员属性进行赋值的有参构造
	public Monkey(String name, int age, String sex, String color, String type) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.color = color;
		this.type = type;
	}
	
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
