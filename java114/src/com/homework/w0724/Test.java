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
			p.setSex("��1");
		} catch (SexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p);*/
		
		/*3.	�ֶ�����һ���ַ��� �ж�����  
		�ո��м��� ��ĸ�м���  �����м��� �����м���(���ַ����ж��ַ�)*/
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
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
		
		System.out.println("�ո���:"+blankCount);
		System.out.println("��ĸ��:"+charCount);
		System.out.println("������:"+numCount);
		System.out.println("������:"+otherCount);
	}

}
