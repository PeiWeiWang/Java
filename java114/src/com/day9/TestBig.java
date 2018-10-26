package com.day9;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestBig {
	public static void main(String[] args) {
		//long money = 1111111111111111111111111111L;
		//System.out.println(1.0-0.99);//精度丢失
		
		//大整数运算
		//1.创建BigInteger对象，构造方法中以要运算数的String字符串为参数
		/*BigInteger num1 = new BigInteger("1111111111111111111111111111111");
		BigInteger num2 = new BigInteger("333333333333333333333333333333");
		//2使用方法进行字符串的运算
		BigInteger sum = num1.add(num2);
		BigInteger divide = num1.divide(num2);
		System.out.println(divide);*/
		
		//大浮点数的运算：1可以保证精度，2.没有运算的上限
		BigDecimal num1  = new BigDecimal("1.0");
		BigDecimal num2  = new BigDecimal("0.99");
		System.out.println(num1.subtract(num2));
		
		
	}
}
