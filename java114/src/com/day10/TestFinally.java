package com.day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import util.DateUtil;

public class TestFinally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("����һ�������ַ���");
		String str = "2000-1-1";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");*/
		
		/*//�����Ƿ������쳣,finally��Ҫִ��
		try {
			sdf.parse(str);
			System.out.println("����ִ��");
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("finally�еĴ���һ���ᱻִ��,��Դ�ر�");
		}*/
		
		
		//System.out.println("�쳣��");
		
		//����ִ���˶��ٴ���,finallyһ��Ҫִ��
		try {
			System.out.println("�����߼�����");
		
		}  finally{
			System.out.println("finally�еĴ���һ���ᱻִ��,��Դ�ر�");
		}
	}

}
