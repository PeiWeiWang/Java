package com.homework.w0724;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Person p = new Person();
		p.setName("zs");
		try {
			p.setAge(10);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			p.setSex("男1");
		} catch (SexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p);*/
		
		/*3.	手动输入一行字符串 判断其中  
		空格有几个 字母有几个  数字有几个 其他有几个(二种方法判断字符)*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc.nextLine();
		int numCount =0;
		int charCount = 0;
		int blankCount = 0;
		int otherCount = 0;
		
		char[] temp = str.toCharArray();
		/*for(char c:temp){
			if(c==' '){
				blankCount++;
			}else if(('a'<=c&&c<='z')||('A'<=c&&c<='Z')){
				charCount++;
			}else if('0'<=c&&c<='9'){
				numCount++;
			}else{
				otherCount++;
			}
		}*/
		for(char c:temp){
			if(Character.isSpaceChar(c)){
				blankCount++;
			}else if(Character.isLetter(c)){
				charCount++;
			}else if(Character.isDigit(c)){
				numCount++;
			}else{
				otherCount++;
			}
		}
		
		System.out.println("空格有:"+blankCount);
		System.out.println("字母有:"+charCount);
		System.out.println("数字有:"+numCount);
		System.out.println("其他有:"+otherCount);
	}

}
