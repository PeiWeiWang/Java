package com.day5.pass;

public class PassValue {

	public static void change(int x) {
		System.out.println("�ֲ�x��change�����ı�ǰ"+x);
		x = 3; //ֻ���ֲ�����xֵ��Ϊ5
		System.out.println("�ֲ�x��change�����ı��"+x);
	}

	public static void main(String[] args) {
		int x = 5;//main�� x 
		change(x);
		System.out.println(x);//main�� x û���ܵ�Ӱ��
	}

}
