package com.day7.extend;

public class Student extends Person{
	
	public Student() {
		super();//���ø���Ĺ��췽��
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name,int age){
		/*this.name = name;
		this.age = age;*/
		super(name,age);//ָ�����ø�����вι���
	}
	
	@Override
	public void eat(){
		super.name = "aaaa";
		super.eat();//���ø����eat����
		System.out.println("ѧ��Ҫ�Ժõģ�"+name);
	}

	
	
	
	
}
