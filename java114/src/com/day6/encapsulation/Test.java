package com.day6.encapsulation;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Person p = new Person();
		p.name = "张三";
		p.age = 10;
		p.sex="man";
		p.sal = 10000;
		
		System.out.println(p.toString());
		*/
		
		Person p = new Person();
		//私有属性在类的外部不能用对象.属性的方式直接使用
		/*p.name = "张三";
		p.age = -10;
		p.sex="?";
		p.sal = -10000.0;*/
		
		p.setName("张三");
		p.setAge(1000);
		System.out.println(p.toString());
	}

}
