package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {
	/**
	 * ����yyyy-MM-dd���ַ���תΪDate
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
	 * �ܹ����ܡ�yyyy-MM-dd������"yyyy/MM/dd"���ַ���,תΪDate
	 * */
	public static Date StringToDateNew(String dateStr){
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
	public static String DateToString(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
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
