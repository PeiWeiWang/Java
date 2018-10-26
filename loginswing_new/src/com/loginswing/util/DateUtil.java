package com.loginswing.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {
	/**
	 * ����yyyy-MM-dd���ַ���תΪDate
	 * */
	public static Date stringToDate(String dateStr){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
				date = sdf.parse(dateStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return date;
	}
	
	/**
	 * �ܹ����ܡ�yyyy-MM-dd������"yyyy/MM/dd"���ַ���,תΪDate
	 * */
	public static Date stringToDateNew(String dateStr){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//1
		Date date = null;//Ĭ�Ϸ���null
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			//���ֽ����쳣,����catch��;��һ��ģ��
			sdf = new SimpleDateFormat("yyyy/MM/dd");//2
			try {
				date = sdf.parse(dateStr);
			} catch (ParseException e1) {
				System.err.println("��ʽ����Ϊyyyy-MM-dd����yyyy/MM/dd");
			}
		}
		
		return date;
	}
	/**
	 * ��DateתΪ yyyy��MM��dd�� �ַ���
	 * */
	public static String dateToString(Date date){
		if(date==null){
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		return sdf.format(date);
	}
	
	//����һ���ַ���,ת��ΪSQL DATE
	public static java.sql.Date stringToSqlDate(String dateStr) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date1 = null;
		try {
			date1 = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new  java.sql.Date(date1.getTime());
	}
} 
