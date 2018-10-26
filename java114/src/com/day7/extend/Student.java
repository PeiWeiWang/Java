package com.day7.extend;

public class Student extends Person{
	
	public Student() {
		super();//调用父类的构造方法
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name,int age){
		/*this.name = name;
		this.age = age;*/
		super(name,age);//指明调用父类的有参构造
	}
	
	@Override
	public void eat(){
		super.name = "aaaa";
		super.eat();//调用父类的eat方法
		System.out.println("学生要吃好的："+name);
	}

	
	
	
	
}
