package com.day10;

import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import util.DateUtil;

public class TestException {
	public static void main(String[] args) {
		
		//dfdfdfedf//語法的錯誤,無法通過编译----编译错误
		/*Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個被除数");
		int i  = sc.nextInt();
		System.out.println(100/i);//可以通过编译
	
		System.out.println("正常执行");*/
		
		
		
		
		
		//常见异常
		/*int[] ia = {1,2,3};//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(ia[3]);*/
		
		/*String str = null;// java.lang.NullPointerException
		System.out.println(str.charAt(0));*/
		
	/*	String str = "a";//java.lang.StringIndexOutOfBoundsException
		System.out.println(str.charAt(1));*/
		
		//System.out.println(1/0);//java.lang.ArithmeticException
		
		/*SimpleDateFormat sdf
		= new SimpleDateFormat("yyyy-MM-dd");
	
		try {
			sdf.parse("2000-1-1");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	//	FileOutputStream fis = new FileOutputStream("d:/aaa.java");
		
		
		
		
		
	}
}
