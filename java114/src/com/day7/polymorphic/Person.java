package com.day7.polymorphic;
class  Animal{}
public class Person  extends Animal{

	public void fun1(){
		System.out.println("���������fun1");
	}
	public void fun2(){
		System.out.println("���������fun2");
	}
	
	

	
}

class Man extends Person{
	int age;
	public void fun1(){
		System.out.println("�������˵�fun1");
	}
	public void fun3(){
		System.out.println("�������˵�fun3");
	}
	
}
class Woman extends Person{
	
	public void fun1(){
		System.out.println("����Ů�˵�fun1");
	}
	public void fun4(){
		System.out.println("����Ů�˵�fun4");
	}
}
