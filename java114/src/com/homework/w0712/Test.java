package com.homework.w0712;

import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个1000-9999之间的数字");
		int i = sc.nextInt();// 计算i每一位的和
		
		int thou = i/1000;
		int hum  = i%1000/100;
		int ten  = i/10%10;
		int unit = i % 10;//个位
		System.out.println("每位数字的和为："+(thou+hum+ten+unit));
	}

}
