package com.day2;

public class TypeChange {

	
	public static void test(int i){}
	
	public static void main(String[] args) {
		/*int i = 1;
		char c ='a';//�洢���ַ���ASNIC��ֵ  ��a��=97��'A' = 65
		i = c+1;
		
		System.out.println(i);*/
		/*//�Զ�����ת��
		short s = 100;
		long l = s;//short ----�Զ�--->long
		System.out.println(s);
		System.out.println(l);
		
		//s = l;//java�����Զ��Ľ�longת��Ϊshort
		l=1000000L;
		s = (short)l;//ǿ������ת��������ȫ
		System.out.println(s);*/
		
		/*int i = 1;
		int i2 = i+1;*/
		
	/*	//�������͵�Ĭ������Ϊint
		byte b = 1;
		//java������ʱ��b����Ϊint���ͣ�1����Ϊint���ͣ�����int���͵�������Ϊint
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
		
		//������Ĭ������double
		float f = 3.0F;//float������ֵ����+F
		
		int imax = 2147483647;//int���糬��ȡֵ��Χ����ֵ�Ǵ���Сֵѭ��
		System.out.println(imax+10);
		//a>a+1.
		
		
		
	
	}

}
