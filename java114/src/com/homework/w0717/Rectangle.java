package com.homework.w0717;

public class Rectangle {
	double height;
	double width;
	
	public double getPerimeter(){
		return 2*(height+width);
	}
	
	public double getArea(){
		return height*width;
	}
	
	public void showRectangle(){
		System.out.println("矩形的高为："+height);
		System.out.println("矩形的宽为："+width);
		double perimeter =  getPerimeter();//本类中实例成员的调用
		System.out.println("矩形的周长为："+perimeter);
		double area = getArea();//本类中实例成员的调用
		System.out.println("矩形的面积为："+area);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.height = 10;
		r1.width = 5;
		double perimeter = r1.getPerimeter();
		System.out.println(perimeter);
		double area = r1.getArea();
		System.out.println(area);
		r1.showRectangle();
	}
}
