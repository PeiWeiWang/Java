package com.day2;

import java.util.Scanner;

public class TestIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int i = sc.nextInt();
		// 1.满足（boolean==true）中的条件，执行{}中的代码
		/*
		 * if(i<=10){ System.out.println("i在10以下"); }
		 */

		// 2.（boolean==true）,执行{}中的代码;如为false,执行else中的代码
		/*
		 * if(i<=10){ System.out.println("i在10以下"); }else{
		 * System.out.println("i在10以上"); }
		 */

		// 3.
		if (i <= 10) {
			System.out.println("i在10以下");
			System.out.println("i在10以下");
			System.out.println("i在10以下");
		}else if(i<=100){
			System.out.println("i在11-100之间");
		}else if(i<=1000){
			System.out.println("i在101-1000之间");
		}else{
			System.out.println("i大于1000");
		}

	}

}
