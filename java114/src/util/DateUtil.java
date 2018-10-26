package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {
	/**
	 * 将“yyyy-MM-dd”字符串转为Date
	 * */
	public static Date StringToDate(String dateStr){
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
	public static Date StringToDateNew(String dateStr){
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
	public static String DateToString(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		return sdf.format(date);
	}
	
	public static void main(String[] args) {
	/*	Date date = DateUtil.StringToDate("2000/10/1");
		System.out.println(date);*/
		
		/*String str = "2000/10/1";
		System.out.println(DateUtil.StringToDateNew(str));*/
		
		String str1 = "2009_11_11";
		System.out.println(DateUtil.StringToDateNew(str1));
		/*String str = DateUtil.DateToString(new Date());
		System.out.println(str);*/
		
	}
} 
