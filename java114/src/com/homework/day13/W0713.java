package com.homework.day13;

import java.util.Scanner;

public class W0713 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//���ĵ�����
		/*int count = 10;
		for(int i = 1;i<=count;i++){
			for(int j = 1;j<=count-i;j++){
				System.out.print(" ");
			}
			
			for(int k = 1;k<=2*i-1;k++){
				if(k==1||k==2*i-1){//���*��ֻ�ڱ߽�ֵ���*
					System.out.print("*");}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i = count-1;i>=1;i--){
			for(int j = 1;j<=count-i;j++){
				System.out.print(" ");
			}
			
			for(int k = 1;k<=2*i-1;k++){
				if(k==1||k==2*i-1){
					System.out.print("*");}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}*/
		/*��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
		С���ӳ����������º�ÿ��������һ�����ӣ�
		�������Ӷ���������24���º�������ܶ���Ϊ���٣�  */
		//1 1 2 3  5  8  13  
		/*int m1 = 1;
		int m2 = 1;
		int m3;
		System.out.println("��1���µ�����Ϊ��"+m1+"����");
		System.out.println("��2���µ�����Ϊ��"+m2+"����");
		for(int i=3;i<=24;i++){
			m3 = m1 +m2;//�������µ�����
			m1 = m2;
			m2=m3;
			System.out.println("��"+i+"���µ�����Ϊ��"+m3+"����");
		}*/
		
	/*	4.	��1��2��3��4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�*/
		/*int count=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
				if(i!=j&&i!=k&&k!=j){
					count++;
					System.out.println(i*100+j*10+k*1);
				}
					
				}
			}
			
		}
		System.out.println("һ��"+count);*/
		
		//����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿  
		/*System.out.println("���������");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("�������·�");
		int month = sc.nextInt();
		System.out.println("�������·��е�����");
		int date = sc.nextInt();
		
		int days =0;//����
		for(int i=1;i<month;i++){
			switch(i){
			case 1:
			case 3:	
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days+=31;
				break;
			case 4:	
			case 6:	
			case 9:	
			case 11:
				days+=30;
				break;
			case 2:	
				if((year%4==0&&year%100!=0)||year%400==0){
					days+=29;
				}else{
					days+=28;
				}
				break;
			default:
				System.out.println("������·�");
		}
	 }
		System.out.println("Ϊ����ȵĵ�"+(days+date)+"��");*/
		
		/*���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ�
		��������һ�룬����񫣬�ֶ����һ��    
		�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
		�Ժ�ÿ�����϶�����ǰһ��ʣ��     ��һ����һ����
		����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١� */
		/*int count =1;//��10���������
		for(int day=9;day>=1;day--){
			count = (count+1)*2;
		}
		System.out.println(count);*/
		
		//��1+2!+3!+...+20!�ĺ�
		// 1 +  1*2+1*2*3..
	/*	long sum  =0L;//��
		long num = 1L;//�������������
		for(int i=1;i<=20;i++){
			num*=i;//��ǰһ��num*��ǰ��ѭ���ӣ���Ϊ��ǰ��
			sum+=num;
			System.out.println("���������num��"+num);
			System.out.println("sum��"+sum);
		}
		*/
}
		
}


