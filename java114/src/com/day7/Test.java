package com.day7;

import com.day7.extend.Person;

public class Test {
		Person p = new Person();
	 
		void test1(int i){
			p.eat();
		}
	
		Person getPerson(Person p){
			p.eat();
			return new Person();
		}
		
		
		
	public static void main(String[] args) {
		Person person = new Person();
		person.eat();
		
		//��������ֻʹ��һ�εĶ���
		new Person().eat();
		
		person.run();
	}

}
