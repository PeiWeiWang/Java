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
		System.out.println("Բ�İ뾶Ϊ��"+r);
		double perimeter =  getPerimeter();//������ʵ����Ա�ĵ���
		System.out.println("Բ���ܳ�Ϊ��"+perimeter);
		double area = getArea();//������ʵ����Ա�ĵ���
		System.out.println("Բ�����Ϊ��"+area);
	}
}
