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
		//1.�ȴ�������
		Calculator cl = new Calculator();
		
		//2.���ݷ������ͷ��������б���÷���
		int sumI = cl.addI(5, 10);
		System.out.println(sumI);
		
		
		
		//java��ѯ������
			//1.��Ӧ�Ķ������Ƿ��ж�Ӧ�ķ�����
			//2.�緽������ͬ�����жϲ����б�
			//3.���жϷ���ֵ����
		cl.mul(1, 1);//cl.mul(int,int)
		cl.mul(1.0, 3.0);//cl.mul(double,double)
		System.out.println();
		
	}
}
