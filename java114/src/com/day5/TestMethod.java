package com.day5;

public class TestMethod {
	//1.����ֵΪvoid�ķ�����û�з���һ�������ֵ
	public void fun1(){
		System.out.println("û�з���ֵ�ķ���");
	}
	
	
	//2.���з���ֵ�ķ���������ֵ����ͷ�������ķ�������ƥ��
	public double fun2(){
		System.out.println("����һ��double���͵�ֵ�ķ���");
		return 1+1;
	}
	
	//3.�������ķ���
	public void fun3(int x1,String str1){
		System.out.println("�в����ķ���");
		System.out.println(x1);
		System.out.println(str1);
	}
	
	public double fun4(double v1,double v2,double v3){
		System.out.println("�в����ķ�������һ��double���͵�ֵ�ķ���");
		return v1*v2*v3;
	}
	
}
