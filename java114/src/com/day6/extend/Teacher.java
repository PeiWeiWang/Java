package com.day6.extend;
//使用extends关键字   表明Teacher类是继承了Person类
public class Teacher extends Person {
	int tid;
	String classType;
	
	public void teach(){
		System.out.println("老师要教学");
	}
}
