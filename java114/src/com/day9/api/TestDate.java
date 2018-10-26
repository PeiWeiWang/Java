package com.day9.api;

import java.util.Date;

public class TestDate {

	/**
	 * util.Date代表日期：精确到毫秒
	 * sql.Date：是util.Date的子类
	 */
	public static void main(String[] args) {
		//获取系统当前时间
		/*Date date = new Date();
		System.out.println(date);

		//Date的基准时间：1970-1-1 00：00：00：0000：0000
		System.out.println(new Date(100000000000L));
		
		//获取基准时间到当前时间的毫秒数
		long time = date.getTime();
		System.out.println(time);
		*/
		
		//获取当前时间10天后的日期
		//1.获取当前时间的毫秒数
		/*Date nowDate = new Date();
		long nowTime = nowDate.getTime();
		long targetTime = nowTime+10L*24*60*60*1000;
		
		//2.用构造方法将毫秒数进行转换
		System.out.println(new Date(targetTime));*/
		
		
		//util.Date------>sql.Date
		Date nowDate = new Date();
		java.sql.Date sqlDate = new java.sql.Date(nowDate.getTime());
		System.out.println(sqlDate);
	}

}
