package com.day9.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormat {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		/*Date date = new Date();
		System.out.println(date);
		*/
		//�����ڶ���---->ָ����ʽ�ַ���
			/*//1.ָ������ģ��
		String partten = "yyyy��MM��dd�� HHʱmm��ss�� E";
		
			//2.������ģ�崴��һ��SimpleDateFormat����
		SimpleDateFormat sdf = new SimpleDateFormat(partten);
		
			//3.ʹ��format������Ŀ������תΪ�ַ���
		String str = sdf.format(date);
		System.out.println(str);*/
		
		
		//��ָ����ʽ�ַ���---->���ڶ���
			//1.ָ������ģ��(ֻ��ת������ģ����ַ���)
		String partten = "dd-MM-yyyy HH:mm:ss";
			//2.������ģ�崴��һ��SimpleDateFormat����
		SimpleDateFormat sdf = new SimpleDateFormat(partten);
		
		String dateStr = "22-09-2017 11:11:11";
		//3.ʹ��parse���������ַ���---->���ڶ���
		Date date = sdf.parse(dateStr);
		System.out.println(date);
				
	}

}
