package com.day2;

import java.util.Scanner;

public class TestIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int i = sc.nextInt();
		// 1.���㣨boolean==true���е�������ִ��{}�еĴ���
		/*
		 * if(i<=10){ System.out.println("i��10����"); }
		 */

		// 2.��boolean==true��,ִ��{}�еĴ���;��Ϊfalse,ִ��else�еĴ���
		/*
		 * if(i<=10){ System.out.println("i��10����"); }else{
		 * System.out.println("i��10����"); }
		 */

		// 3.
		if (i <= 10) {
			System.out.println("i��10����");
			System.out.println("i��10����");
			System.out.println("i��10����");
		}else if(i<=100){
			System.out.println("i��11-100֮��");
		}else if(i<=1000){
			System.out.println("i��101-1000֮��");
		}else{
			System.out.println("i����1000");
		}

	}

}
