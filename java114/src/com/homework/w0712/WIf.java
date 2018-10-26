package com.homework.w0712;

import java.util.Scanner;

public class WIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		System.out.println("\t\t请输入分数");
		double course  = sc.nextDouble();
		if(course<60){
			System.out.println("得分为D");
		}else if(course<70){
			System.out.println("得分为C");
		}else if(course<90){
			System.out.println("得分为B");
		}else if(course<100){
			System.out.println("得分为A");
		}else{
			System.out.println("得分为S");
		}*/
		
		/*//输入3个数字 A B C ，按照从大到小的顺序进行输出
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入A");
		double a  = sc.nextDouble();
		System.out.println("请输入B");
		double b  = sc.nextDouble();
		System.out.println("请输入C");
		double c  = sc.nextDouble();
		
		if(a>b&&b>c){
			System.out.println(a+">"+b+">"+c);
		}else if(a>c&&c>b){
			System.out.println(a+">"+c+">"+b);
		}else if(b>a&&a>c){
			System.out.println(b+">"+a+">"+c);
		}else if(b>c&&c>a){
			System.out.println(b+">"+c+">"+a);
		}else if(c>b&&b>a){
			System.out.println(c+">"+b+">"+a);
		}else{
			System.out.println(c+">"+a+">"+b);
		}*/
		
		/*boolean flag = true;
		if(flag){
			System.out.println("flag为true");
		}else{
			System.out.println("flag为false");
		}*/
		
		//java方法中的代码是从上往下依次执行；if匹配到第一个满足的条件，就会执行；不再往下判断
		int i =6;
		if(i<=10){
			System.out.println("i<=10");
		}else if(i==6){
			System.out.println("i=6");
		}else if(i<100){
			System.out.println("i<100");
		}else{
			System.out.println("aaa");
		}
		
		
	}

}
