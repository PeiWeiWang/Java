package com.day7.factory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service1 s1 = new Service1();
		s1.fun1();
		s1.fun2();
		System.out.println("--------------");
		
		Service2 s2 = new Service2();
		s2.fun1();
		s2.fun2();
		System.out.println("--------------");
		
		Service3 s3 = new Service3();
		s3.fun1();
		s3.fun2();
		
		System.out.println("--------------");
		
		Service4 s4 = new Service4();
		s4.fun1();
		s4.fun2();
	}

}
