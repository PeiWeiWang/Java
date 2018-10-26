package com.day5;

public class TestMethod {
	//1.返回值为void的方法：没有返回一个具体的值
	public void fun1(){
		System.out.println("没有返回值的方法");
	}
	
	
	//2.带有返回值的方法，返回值必须和方法定义的返回类型匹配
	public double fun2(){
		System.out.println("返回一个double类型的值的方法");
		return 1+1;
	}
	
	//3.带参数的方法
	public void fun3(int x1,String str1){
		System.out.println("有参数的方法");
		System.out.println(x1);
		System.out.println(str1);
	}
	
	public double fun4(double v1,double v2,double v3){
		System.out.println("有参数的方法返回一个double类型的值的方法");
		return v1*v2*v3;
	}
	
}
