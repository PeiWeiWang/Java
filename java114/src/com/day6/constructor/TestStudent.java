package com.day6.constructor;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Student()构造方法（构造器、构造函数）：由JVM调用，用于创建类的对象
//		Student s = new Student();//调用的是无参构造，给予成员变量对应类型的默认值
//		s.sid = 10;
//		s.sname = "李四";
//		s.study();//方法
		
		
		//调用的有参构造：在创建对象的同时，直接将成员变量赋予对应的初始值
		Student s1 = new Student(11,"张三");
		System.out.println(s1);
		s1.sname = "王五哦";
		System.out.println(s1);
	//	s1.study();
		
		
		//特殊性质
		//1.构造方法和类同名
		//2.如果在定义类的同时，没有任何一个构造方法，java会默认创建一个构造方法
		//3.如果自定义了任何一个构造方法，java不会给自动创建默认无参构造
		   //构造方法：没有返回值类型、与类同名，可以有参数，也可以没有参数
		//4.构造方法只能通过new关键字，由JVM自动进行调用；
			//不能通过对象.方法或者类名.方法的形式进行显示的调用
		
		
		
		
		
	}

}
