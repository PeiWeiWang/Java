package com.homework.w0717;

public class Person {
	int id;
	String name;
	int age;
	String sex;
	String adress;
	
	public void shout(){
		System.out.println("我的名字是："+name);
	}
	public void grow(){
		age++;
		System.out.println("我又长了一岁，我现在："+age+"岁");
	}
	
	public String show() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", adress=" + adress + "]";
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name ="王五";
		p1.age = 20;
		System.out.println("p1现在是："+p1.age+"岁");
		p1.shout();
		p1.grow();
		p1.grow();
		p1.grow();
		System.out.println("---------\n现在是："+p1.age+"岁");
		p1.show();
		
		
		Person p2 = new Person();
		p2.name ="李四";
		p2.age = 25;
		System.out.println("p2现在是："+p2.age+"岁");
		p2.shout();
		p2.grow();
		p1.grow();//不影响p2中的age
		System.out.println("---------\n现在是："+p2.age+"岁");
		p2.show();
		System.out.println("p1现在是："+p1.age+"岁");
	}
	
}
