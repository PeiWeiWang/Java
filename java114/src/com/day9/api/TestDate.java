package com.day9.api;

import java.util.Date;

public class TestDate {

	/**
	 * util.Date�������ڣ���ȷ������
	 * sql.Date����util.Date������
	 */
	public static void main(String[] args) {
		//��ȡϵͳ��ǰʱ��
		/*Date date = new Date();
		System.out.println(date);

		//Date�Ļ�׼ʱ�䣺1970-1-1 00��00��00��0000��0000
		System.out.println(new Date(100000000000L));
		
		//��ȡ��׼ʱ�䵽��ǰʱ��ĺ�����
		long time = date.getTime();
		System.out.println(time);
		*/
		
		//��ȡ��ǰʱ��10��������
		//1.��ȡ��ǰʱ��ĺ�����
		/*Date nowDate = new Date();
		long nowTime = nowDate.getTime();
		long targetTime = nowTime+10L*24*60*60*1000;
		
		//2.�ù��췽��������������ת��
		System.out.println(new Date(targetTime));*/
		
		
		//util.Date------>sql.Date
		Date nowDate = new Date();
		java.sql.Date sqlDate = new java.sql.Date(nowDate.getTime());
		System.out.println(sqlDate);
	}

}
