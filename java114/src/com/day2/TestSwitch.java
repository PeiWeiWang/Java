package com.day2;

import java.util.Scanner;

public class TestSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\t\t\t欢迎使用我行我素购物管理系统1.0\n\n");
		System.out.println("\t\t\t\t\t1.\t登录\n\n");
		System.out.println("\t\t\t\t\t2.\t注册\n\n");
		System.out.println("\t\t\t\t\t3.\t退出\n\n");
		System.out.println("*****************************************");
		System.out.println("\t\t请选择，输入数字");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		switch(choose){
			case 1:
				System.out.println("转换到登录页面");
				break;
			case 2:	
				System.out.println("转换到注册页面");
				break;
			case 3:
				System.out.println("退出系统");
				break;
			default:
				System.out.println("此功能尚未开放");
		}
		//一、参数对类型的支持
			//1.JDK1.5以下版本  choose支持 byte short char int
			//2.JDK1.5-1.6版本  choose支持 byte short char int  enum(枚举)
			//3.JDK1.7及以上版本  choose支持 String byte short char int  enum(枚举)
		
		//二、不支持区间分段
		//三、break一般不能漏写;switch的运行，执行第一个匹配项，一直到遇到第一个break或switch执行完毕
	}

}
