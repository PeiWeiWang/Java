package com.homework.w0723;

import java.util.Arrays;

public class WString {

	
	public static void main(String[] args) {
		
		//1.将字符串"  abc  defg   "中的所有空格去掉，
		//然后截取（1，4）位，并转化为大写
		String str = "  abc  defg   ".replace(" ", "");
		System.out.println(str.substring(0, 4).toUpperCase());
		
		
		//2.将字符串表达式"11.0+22.2"的结果计算出来
			//1.利用spilt按运算符进行拆分成字符串数组
		String[] sa = "119.0+22.2".split("[+*/-]");
		System.out.println(Arrays.toString(sa));
			//2.将字符串数组中的字符串转换为对应的数字
		double  num1 = Double.parseDouble(sa[0]);
		double  num2 = Double.parseDouble(sa[1]);
		
		System.out.println(num1+num2);
	}

}
