package com.day5.obj;



public class Monkey {
	//����:��Ա����(ʵ�����ԣ�ʵ���������ڶ���ÿ�������ж���������)
	String name;
	int age;//��ʼֵ����ʡ��
	String sex;
	String color;
	String type;
	
	//�޲ι���
	public Monkey(){}
	
	//���Զ����г�Ա���Խ��и�ֵ���вι���
	
	
	
	
	
	
	//��Ϊ��ʹ�÷������ж���,��Ϊ��Ա��������Ա�������Ե���������Ա��
	//ʵ��������ʵ���������ڶ���
	public void climb(){
		
		System.out.println(name+"�Ǻ��ӣ�������");
	}
	public void eat(){
		
		System.out.println("���ӻ������"+name);
	}
	public void drink(){
		System.out.println("���ӻ�Ժ�ˮ"+sex);
	}
}
