package com.homework.w0723;

import java.util.Scanner;

public class Test {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ոݔ��һ���Ąt�\�㔵");
		String str = sc.next();
		
		String[] nums = str.split("[+/*-]");
		double num1 = Double.parseDouble(nums[0]);
		double num2 = Double.parseDouble(nums[1]);
		
		//if(str.contains("+")){
		if(str.indexOf("+")!=-1){
			System.out.println("�������ĺ�Ϊ��"+(num1+num2));
		}else if(str.contains("-")){
			System.out.println("�������Ĳ�Ϊ��"+(num1-num2));
		}else if(str.contains("*")){
			System.out.println("�������Ļ�Ϊ��"+(num1*num2));
		}else{
			System.out.println("����������Ϊ��"+(num1/num2));
		}
		
	}
}
