package com.day6.extend;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "aaa";
		p.eat();
		p.drink();
		p.run();
		
		
		Teacher t = new Teacher();
		t.name = "t1";
		t.age = 30;//����ʹ�ü̳���������
		t.tid = 1010;
		
		t.eat();//����ʹ�ü̳����ķ���
		t.drink();
		
		t.teach();
		t.run();
		
		
		

	}

}
