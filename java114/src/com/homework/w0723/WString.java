package com.homework.w0723;

import java.util.Arrays;

public class WString {

	
	public static void main(String[] args) {
		
		//1.���ַ���"  abc  defg   "�е����пո�ȥ����
		//Ȼ���ȡ��1��4��λ����ת��Ϊ��д
		String str = "  abc  defg   ".replace(" ", "");
		System.out.println(str.substring(0, 4).toUpperCase());
		
		
		//2.���ַ������ʽ"11.0+22.2"�Ľ���������
			//1.����spilt����������в�ֳ��ַ�������
		String[] sa = "119.0+22.2".split("[+*/-]");
		System.out.println(Arrays.toString(sa));
			//2.���ַ��������е��ַ���ת��Ϊ��Ӧ������
		double  num1 = Double.parseDouble(sa[0]);
		double  num2 = Double.parseDouble(sa[1]);
		
		System.out.println(num1+num2);
	}

}
