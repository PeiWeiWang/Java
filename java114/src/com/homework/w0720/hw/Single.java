package com.homework.w0720.hw;
//����ģʽ��Single��Ķ���ֻ�ܴ���һ���������еĵ����߹���
public class Single {
	//2.˽�еĳ�Ա��������ڲ���������ʹ�ã�������ڲ����д�������Ķ���
	//3.ʵ����Ա���봴������ſ���ʹ�ã���single����ʹ��static���Σ�
	//4.������Ҫ���з�װ���ṩһ��getter�������л�ȡ
	private	static final Single single = new Single();
	
	private String name;
	
	//1.�����췽��˽�л���ʹ֮������ⲿ�޷�ʹ��
	private Single(){
	}


	public static Single getSingle() {
		return single;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
