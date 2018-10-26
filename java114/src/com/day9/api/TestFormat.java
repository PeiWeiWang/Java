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
		//将日期对象---->指定格式字符串
			/*//1.指定日期模板
		String partten = "yyyy年MM月dd日 HH时mm分ss秒 E";
		
			//2.给日期模板创建一个SimpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat(partten);
		
			//3.使用format方法将目标日期转为字符串
		String str = sdf.format(date);
		System.out.println(str);*/
		
		
		//将指定格式字符串---->日期对象
			//1.指定日期模板(只能转换符合模板的字符串)
		String partten = "dd-MM-yyyy HH:mm:ss";
			//2.给日期模板创建一个SimpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat(partten);
		
		String dateStr = "22-09-2017 11:11:11";
		//3.使用parse方法进行字符串---->日期对象
		Date date = sdf.parse(dateStr);
		System.out.println(date);
				
	}

}
