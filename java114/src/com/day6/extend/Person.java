package com.day6.extend;

public class Person extends Animal{
	protected String name;
	protected int age;
	protected int sex;
	protected double sal;
	private String type="aaaa";//˽�е�����ֻ���ڱ���ʹ��
	
	public void eat() {
		System.out.println(name+"���ˣ���Է�");
	}
	
	public void drink() {
		System.out.println("�˻��ˮ");
	}

	
}
