package com.day9;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestBig {
	public static void main(String[] args) {
		//long money = 1111111111111111111111111111L;
		//System.out.println(1.0-0.99);//���ȶ�ʧ
		
		//����������
		//1.����BigInteger���󣬹��췽������Ҫ��������String�ַ���Ϊ����
		/*BigInteger num1 = new BigInteger("1111111111111111111111111111111");
		BigInteger num2 = new BigInteger("333333333333333333333333333333");
		//2ʹ�÷��������ַ���������
		BigInteger sum = num1.add(num2);
		BigInteger divide = num1.divide(num2);
		System.out.println(divide);*/
		
		//�󸡵��������㣺1���Ա�֤���ȣ�2.û�����������
		BigDecimal num1  = new BigDecimal("1.0");
		BigDecimal num2  = new BigDecimal("0.99");
		System.out.println(num1.subtract(num2));
		
		
	}
}
