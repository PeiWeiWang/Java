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
		System.out.println("输入一个日期字符串");
		String str = "2000-1-1";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");*/
		
		/*//无论是否会出现异常,finally都要执行
		try {
			sdf.parse(str);
			System.out.println("正常执行");
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("finally中的代码一定会被执行,资源关闭");
		}*/
		
		
		//System.out.println("异常外");
		
		//不论执行了多少代码,finally一定要执行
		try {
			System.out.println("运行逻辑代码");
		
		}  finally{
			System.out.println("finally中的代码一定会被执行,资源关闭");
		}
	}

}
