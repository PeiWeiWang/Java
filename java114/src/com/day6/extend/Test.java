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
		t.age = 30;//可以使用继承来的属性
		t.tid = 1010;
		
		t.eat();//可以使用继承来的方法
		t.drink();
		
		t.teach();
		t.run();
		
		
		

	}

}
