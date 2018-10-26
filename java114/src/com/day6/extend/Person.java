package com.day6.extend;

public class Person extends Animal{
	protected String name;
	protected int age;
	protected int sex;
	protected double sal;
	private String type="aaaa";//私有的属性只能在本类使用
	
	public void eat() {
		System.out.println(name+"是人，会吃饭");
	}
	
	public void drink() {
		System.out.println("人会喝水");
	}

	
}
