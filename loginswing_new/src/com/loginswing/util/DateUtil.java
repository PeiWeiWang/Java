package com.loginswing.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {
	/**
	 * 将“yyyy-MM-dd”字符串转为Date
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
	 * 能够接受“yyyy-MM-dd”或者"yyyy/MM/dd"的字符串,转为Date
	 * */
	public static Date stringToDateNew(String dateStr){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//1
		Date date = null;//默认返回null
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			//出现解析异常,进入catch块;换一个模板
			sdf = new SimpleDateFormat("yyyy/MM/dd");//2
			try {
				date = sdf.parse(dateStr);
			} catch (ParseException e1) {
				System.err.println("格式必须为yyyy-MM-dd或者yyyy/MM/dd");
			}
		}
		
		return date;
	}
	/**
	 * 将Date转为 yyyy年MM月dd日 字符串
	 * */
	public static String dateToString(Date date){
		if(date==null){
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		return sdf.format(date);
	}
	
	//接受一个字符串,转换为SQL DATE
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
