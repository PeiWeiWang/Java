package com.homework.w0723;

import java.util.Scanner;

public class Test {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個四則運算數");
		String str = sc.next();
		
		String[] nums = str.split("[+/*-]");
		double num1 = Double.parseDouble(nums[0]);
		double num2 = Double.parseDouble(nums[1]);
		
		//if(str.contains("+")){
		if(str.indexOf("+")!=-1){
			System.out.println("两个数的和为："+(num1+num2));
		}else if(str.contains("-")){
			System.out.println("两个数的差为："+(num1-num2));
		}else if(str.contains("*")){
			System.out.println("两个数的积为："+(num1*num2));
		}else{
			System.out.println("两个数的商为："+(num1/num2));
		}
		
	}
}
