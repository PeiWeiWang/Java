package com.homework.w0717;

public class Person {
	int id;
	String name;
	int age;
	String sex;
	String adress;
	
	public void shout(){
		System.out.println("�ҵ������ǣ�"+name);
	}
	public void grow(){
		age++;
		System.out.println("���ֳ���һ�꣬�����ڣ�"+age+"��");
	}
	
	public String show() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", adress=" + adress + "]";
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name ="����";
		p1.age = 20;
		System.out.println("p1�����ǣ�"+p1.age+"��");
		p1.shout();
		p1.grow();
		p1.grow();
		p1.grow();
		System.out.println("---------\n�����ǣ�"+p1.age+"��");
		p1.show();
		
		
		Person p2 = new Person();
		p2.name ="����";
		p2.age = 25;
		System.out.println("p2�����ǣ�"+p2.age+"��");
		p2.shout();
		p2.grow();
		p1.grow();//��Ӱ��p2�е�age
		System.out.println("---------\n�����ǣ�"+p2.age+"��");
		p2.show();
		System.out.println("p1�����ǣ�"+p1.age+"��");
	}
	
}
