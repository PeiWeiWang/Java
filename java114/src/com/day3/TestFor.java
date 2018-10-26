package com.day3;

import java.util.Scanner;

public class TestFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*for(int num  =100;num<=999;num++){
			int unit = num%10;
			int ten = num/10%10;
			int hum = num/100;
			int temp = unit*unit*unit+ten*ten*ten+hum*hum*hum;
			if(temp==num){
				System.out.println(num+"是水仙花数");
			}
		}*/
		
		/*for(int i=1;i<10;i+=2){
			System.out.println(i);
		}
		
		for(int i=1;i<10;i+=2){
			System.out.println(i);
		}*/
		
		//求5！ 5×4×3×2×1
		/*int product = 1;
		for(int num = 5;num>=1;num--){
			product *=num;
		}
		System.out.println("5！="+product);*/
		
		//1+11+111+1111+11111
		/*int num = 1;
		int sum = 0;
		for(int i =1;i<=5;i++){
			sum += num;
			num = num*10+1;
		}
		System.out.println(sum);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入首位数");
		int num = sc.nextInt();
		System.out.println("输入末位数的位数");
		int count = sc.nextInt();
		int sum = 0;
		int temp = num;//保存num的初始值
		for(int i =1;i<=count;i++){
			sum += num;
			num = num*10+temp;
		}
		System.out.println(sum);
	}

}
