package com.day5;

public class Cirle {
	double r;
	double PI = 3.14;
	
	public double getPerimeter(){
		return 2*PI*r;
	}
	
	public double getArea(){
		return PI*r*r;
	}
	
	public void showCircle(){
		System.out.println("圆的半径为："+r);
		double perimeter =  getPerimeter();//本类中实例成员的调用
		System.out.println("圆的周长为："+perimeter);
		double area = getArea();//本类中实例成员的调用
		System.out.println("圆的面积为："+area);
	}
}
