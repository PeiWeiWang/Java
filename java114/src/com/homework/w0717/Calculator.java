package com.homework.w0717;

public class Calculator {
	
	
	public int addI(int num1,int num2){
		return num1+num2;
	}
	
	public double addD(double num1,double num2){
		return num1+num2;
	}
	
	public int subI(int num1,int num2){
		return num1-num2;
	}
	
	
	public double subD(double num1,double num2){
		return num1-num2;
	}
	
	
	//
	public void mul(int num1,int num2){
		//return num1*num2;
		System.out.println("aaaa");
	}
	/*public void mul(int num3,int num4){
		//return num1*num2;
		System.out.println("aaaa");
	}*/
	
	
	
	public double mul(double num1,double num2){
		return num1*num2;
	}
	
	public static void main(String[] args) {
		//1.先创建对象
		Calculator cl = new Calculator();
		
		//2.根据方法名和方法参数列表调用方法
		int sumI = cl.addI(5, 10);
		System.out.println(sumI);
		
		
		
		//java查询方法：
			//1.对应的对象中是否有对应的方法名
			//2.如方法名相同，再判断参数列表
			//3.不判断返回值类型
		cl.mul(1, 1);//cl.mul(int,int)
		cl.mul(1.0, 3.0);//cl.mul(double,double)
		System.out.println();
		
	}
}
