package com.day6.thiz;



public class Monkey {
	
	String name;
	int age;
	String sex;
	String color;
	String type;
	
	//�޲ι���
	public Monkey(){super();}
	
	//���Զ����г�Ա���Խ��и�ֵ���вι���
	public Monkey(String name, int age, String sex, String color, String type) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.color = color;
		this.type = type;
	}
	
	public void climb(){
		System.out.println(name+"�Ǻ��ӣ�������");
	}
	

	public void eat(){
		
		System.out.println("���ӻ������"+name);
	}
	public void drink(){
		System.out.println("���ӻ�Ժ�ˮ"+sex);
	}
}
