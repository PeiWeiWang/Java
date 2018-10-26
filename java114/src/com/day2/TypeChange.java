package com.day2;

public class TypeChange {

	
	public static void test(int i){}
	
	public static void main(String[] args) {
		/*int i = 1;
		char c ='a';//存储的字符的ASNIC码值  ‘a’=97，'A' = 65
		i = c+1;
		
		System.out.println(i);*/
		/*//自动类型转换
		short s = 100;
		long l = s;//short ----自动--->long
		System.out.println(s);
		System.out.println(l);
		
		//s = l;//java不能自动的将long转换为short
		l=1000000L;
		s = (short)l;//强制类型转换，不安全
		System.out.println(s);*/
		
		/*int i = 1;
		int i2 = i+1;*/
		
	/*	//整数类型的默认类型为int
		byte b = 1;
		//java在运算时将b提升为int类型，1本身为int类型，两个int类型的运算结果为int
	//	byte b2 = b+1;
		byte b2 = (byte)(b+1);*/
		/*
		byte b3 = 127;
		byte b4 = 127;
		byte b5 = b3+b4;*/
		
		byte b  = 1;
		int i = 2;
		long l = 3L;
		
		long i2= b+i+l;
		
		//浮点型默认类型double
		float f = 3.0F;//float变量赋值必须+F
		
		int imax = 2147483647;//int的如超出取值范围，数值是从最小值循环
		System.out.println(imax+10);
		//a>a+1.
		
		
		
	
	}

}
