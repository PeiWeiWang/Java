package com.day5;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestMethod tm  = new TestMethod();
		/*tm.fun1();//返回值为void方法的调用
		
		//返回值不为void的方法的调用
		 tm.fun2();
		 
		double d =  tm.fun2();
		System.out.println(d);
		
		//带参数返回值为void方法的调用
		tm.fun3(1, "ssss");

		//带参数有返回值方法的调用
		double d1 = tm.fun4(3, 4, 5);
		System.out.println(d1);*/
		
		/*Cirle c1 = new Cirle();
		c1.r = 10;
		System.out.println(c1.r);
		double perimeter = c1.getPerimeter();
		System.out.println("周长为："+perimeter);
		double area = c1.getArea();
		System.out.println("面积为："+area);
		
		
		Cirle c2 = new Cirle();
		c2.r = 2;
		System.out.println(c2.r);//10?
		double perimeter2 = c2.getPerimeter();
		System.out.println("周长为："+perimeter2);
		double area2 = c2.getArea();
		System.out.println("面积为："+area2);*/
		
		Cirle c3 = new Cirle();
		c3.r = 33;
		c3.showCircle();
		
	}

}
