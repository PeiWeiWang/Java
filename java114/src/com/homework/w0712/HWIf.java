package com.homework.w0712;

import java.util.Scanner;

public class HWIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入利润");
//		double pay = sc.nextDouble();
//		double comm = 0;//奖金
//		if(pay<=0){
//			System.out.println("滚");
//		}else if(pay<=10){
//			comm = pay*0.1;
//		}else if(pay<=20){
//			comm = 10*0.1+(pay-10)*0.075;
//		}else if(pay<=40){
//			comm = 10*0.1+(20-10)*0.075+(pay-20)*0.05;
//		}else if(pay<=60){
//			comm = 10*0.1+(20-10)*0.075+(40-20)*0.05+(pay-40)*0.03;
//		}else if(pay<=100){
//			comm = 10*0.1+(20-10)*0.075+(40-20)*0.05+(60-40)*0.03+(pay-60)*0.015;
//		}else{
//			comm = 10*0.1+(20-10)*0.075+(40-20)*0.05+(60-40)*0.03+(100-60)*0.015+(pay-100)*0.01;
//		}
//		System.out.println("你的当月奖金为"+comm+"万元");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = sc.nextInt();
		System.out.println("请输入月份");
		int month = sc.nextInt();
		switch (month) {
		case 1:case 3:case 5:case 7:case 8: case 10:
		case 12:
			System.out.println("本月31天");
			break;
		case 4:	case 6:	case 9:	 
		case 11:	
				System.out.println("本月30天");
				break;
		case 2:	
				//判断是否是闰年
				if(year%4==0&&year%100!=0||year%400==0){
					System.out.println("本年是闰年，2月是29天");
				}else{
					System.out.println("本年不是闰年，2月是28天");
				}
				break;
		default:
			System.out.println("错误的月份");
		}
		
		
		
	}

}
