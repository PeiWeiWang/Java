package com.homework.w0711;

import java.util.Scanner;

public class LoginMenu {

	public static void main(String[] args) {
		System.out.println("\t\t\t欢迎使用我行我素购物管理系统1.0\n\n");
		System.out.println("\t\t\t\t\t1.\t登录\n\n");
		System.out.println("\t\t\t\t\t2.\t注册\n\n");
		System.out.println("\t\t\t\t\t3.\t退出\n\n");
		System.out.println("*****************************************");
		System.out.println("\t\t请选择，输入数字");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		if(choose==1){
			System.out.println("欢迎登录");
		}else if(choose==2){
			System.out.println("注册页面");
		}else if(choose==3){
			System.out.println("退出系统");
		}else{
			System.out.println("此功能尚未开放");
		}
	}

}