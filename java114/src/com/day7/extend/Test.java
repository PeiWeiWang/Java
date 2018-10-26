package com.day7.extend;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Person p = new Person();
		p.eat();//子类覆盖父类的方法，对父类没有影响
		p.run();
*/		
		
		Student  s = new Student();
		//s.run();
		s.eat();//子类覆盖父类的方法，子类对象调用eat方法时，使用的是子类自己的eat方法
		
	}

}
