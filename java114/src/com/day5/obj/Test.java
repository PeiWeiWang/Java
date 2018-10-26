package com.day5.obj;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//类不能直接使用
		//Student.name = "";
		
		/*String str = "aaa";
		
		//只能使用根据类生成的独立的个体---对象
		Student s1 = new Student();
		s1.name = "张三";
		s1.study();
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.name = "李四";
		s2.study();
		System.out.println(s2);*/
		
		Monkey m1 = new Monkey();
	/*	m1.name="猴王";
		m1.sex = "公";
		m1.age = 5;
		m1.name="猴王1";
		m1.climb();
		m1.drink();
		m1.eat();*/
		System.out.println(m1.age);
		System.out.println(m1.type);
		
		/*Monkey m2 = new Monkey();
		m2.name = "皇后";
		m2.sex = "公";
		m2.age = 2;
		m2.climb();
		m2.drink();
		m2.eat();
		
		m1.climb();*/
	}

}
