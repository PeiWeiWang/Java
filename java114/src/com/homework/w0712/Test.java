package com.homework.w0712;

import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��1000-9999֮�������");
		int i = sc.nextInt();// ����iÿһλ�ĺ�
		
		int thou = i/1000;
		int hum  = i%1000/100;
		int ten  = i/10%10;
		int unit = i % 10;//��λ
		System.out.println("ÿλ���ֵĺ�Ϊ��"+(thou+hum+ten+unit));
	}

}
