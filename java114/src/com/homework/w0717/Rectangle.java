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
		System.out.println("���εĸ�Ϊ��"+height);
		System.out.println("���εĿ�Ϊ��"+width);
		double perimeter =  getPerimeter();//������ʵ����Ա�ĵ���
		System.out.println("���ε��ܳ�Ϊ��"+perimeter);
		double area = getArea();//������ʵ����Ա�ĵ���
		System.out.println("���ε����Ϊ��"+area);
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
