package com.homework.w0712;

import java.util.Scanner;

public class WSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//输入一个月份，显示本月的天数   暂时2月按28天计
		
		System.out.println("请输入月份");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		/*switch(month){
		case 1:
			System.out.println("本月为："+month+"月，为31天");
			break;
		case 2:	
			System.out.println("本月为："+month+"月，为28天");
			break;
		case 3:
			System.out.println("本月为："+month+"月，为31天");
			break;
		case 4:
			System.out.println("本月为："+month+"月，为30天");
			break;	
		case 5:
			System.out.println("本月为："+month+"月，为31天");
			break;		
		case 6:
			System.out.println("本月为："+month+"月，为30天");
			break;	
		case 7:
			System.out.println("本月为："+month+"月，为31天");
			break;	
		case 8:
			System.out.println("本月为："+month+"月，为31天");
			break;	
		case 9:
			System.out.println("本月为："+month+"月，为30天");
			break;
		case 10:
			System.out.println("本月为："+month+"月，为31天");
			break;
		case 11:
			System.out.println("本月为："+month+"月，为30天");
			break;
		case 12:
			System.out.println("本月为："+month+"月，为31天");
			break;	
		default:
			System.out.println("错误的月份");
	}*/
		switch(month){
			case 1:
			case 3:	
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("本月为："+month+"月，为31天");
				break;
			case 4:	
			case 6:	
			case 9:	
			case 11:
				System.out.println("本月为："+month+"月，为30天");
				break;
			case 2:	
				System.out.println("本月为："+month+"月，为28天");
				System.out.println("本月为："+month+"月，为28天");
				System.out.println("本月为："+month+"月，为28天");
				System.out.println("本月为："+month+"月，为28天");
				break;
			default:
				System.out.println("错误的月份");
		}

	}

}
