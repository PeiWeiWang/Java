package com.day8.abs;

//��Ϊ����һ��û��ʵ�ֵķ�����abstract�������������඼û�а취ʵ��
public  abstract class FlyCar {
 	String color;
	public FlyCar(){}
	
	public  void  run(){
		System.out.println("��������");
	}
	
	//�ɷ����ڱ�������һ�����룬��������ʵ��
	public  abstract void  fly();
	
	//�ɷ����ڱ�������һ�����룬��������ʵ��
	public  abstract void  swim();
}
