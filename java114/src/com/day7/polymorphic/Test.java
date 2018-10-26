package com.day7.polymorphic;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//基本数据类型的转换
		//byte --自动--> int
//		byte b = 1;
//		int i = b;
		
		//int -----强制---->byte
//		b = (byte)i;
		
		
		//引用数据类型的转换
		//1.Student 是继承Person类的，Student和Person是兼容的
		//2.Student比Person指代的范围小
		
		//自动类型转换----小转大，自动转换    JVM
		/*Man s = new Man();
		s.fun1();
		s.fun2();
		s.fun3();
		
		//男人对象是人类；把一个男人对象当成人类对象使用
		//只能调用在父类中定义的方法和属性
		Person p = s;
		p.fun1();
		p.fun2();*/
		//p.fun3();//是Man类独有的方法，在当成Person类使用时，java不允许使用
		
		//强制类型转换  ---由调用者强制JVM
	/*	Person p = new Man();//父类的引用指向子类的对象
		p.fun1();
		p.fun2();
		System.out.println("----------------------");*/
		//程序员确定内存确实是Man的对象
		//Man m = p;//父类类型不能自动转换为子类类型
		/*Man m = (Man)p;//父类类型只能强制转换为子类类型
		m.fun1();
		m.fun2();
		m.fun3();*/
	}

	
	
}
