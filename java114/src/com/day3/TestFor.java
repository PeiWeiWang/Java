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
				System.out.println(num+"��ˮ�ɻ���");
			}
		}*/
		
		/*for(int i=1;i<10;i+=2){
			System.out.println(i);
		}
		
		for(int i=1;i<10;i+=2){
			System.out.println(i);
		}*/
		
		//��5�� 5��4��3��2��1
		/*int product = 1;
		for(int num = 5;num>=1;num--){
			product *=num;
		}
		System.out.println("5��="+product);*/
		
		//1+11+111+1111+11111
		/*int num = 1;
		int sum = 0;
		for(int i =1;i<=5;i++){
			sum += num;
			num = num*10+1;
		}
		System.out.println(sum);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������λ��");
		int num = sc.nextInt();
		System.out.println("����ĩλ����λ��");
		int count = sc.nextInt();
		int sum = 0;
		int temp = num;//����num�ĳ�ʼֵ
		for(int i =1;i<=count;i++){
			sum += num;
			num = num*10+temp;
		}
		System.out.println(sum);
	}

}
