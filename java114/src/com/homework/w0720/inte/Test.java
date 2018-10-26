package com.homework.w0720.inte;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		
		Animal p = person;
		p.run();
		
		IEat eater = person;
		eater.eat();
		
	}
}
