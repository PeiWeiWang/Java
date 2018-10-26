package com.homework.day13;

import java.util.Scanner;

public class W0713 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//空心的菱形
		/*int count = 10;
		for(int i = 1;i<=count;i++){
			for(int j = 1;j<=count-i;j++){
				System.out.print(" ");
			}
			
			for(int k = 1;k<=2*i-1;k++){
				if(k==1||k==2*i-1){//输出*，只在边界值输出*
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
		/*有一对兔子，从出生后第3个月起每个月都生一对兔子，
		小兔子长到第三个月后每个月又生一对兔子，
		假如兔子都不死，问24个月后的兔子总对数为多少？  */
		//1 1 2 3  5  8  13  
		/*int m1 = 1;
		int m2 = 1;
		int m3;
		System.out.println("第1个月的兔子为【"+m1+"】对");
		System.out.println("第2个月的兔子为【"+m2+"】对");
		for(int i=3;i<=24;i++){
			m3 = m1 +m2;//第三个月的兔子
			m1 = m2;
			m2=m3;
			System.out.println("第"+i+"个月的兔子为【"+m3+"】对");
		}*/
		
	/*	4.	有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？*/
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
		System.out.println("一共"+count);*/
		
		//输入某年某月某日，判断这一天是这一年的第几天？  
		/*System.out.println("请输入年份");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("请输入月份");
		int month = sc.nextInt();
		System.out.println("请输入月份中的天数");
		int date = sc.nextInt();
		
		int days =0;//天数
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
				System.out.println("错误的月份");
		}
	 }
		System.out.println("为本年度的第"+(days+date)+"天");*/
		
		/*猴子吃桃问题：猴子第一天摘下若干个桃子，
		当即吃了一半，还不瘾，又多吃了一个    
		第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
		以后每天早上都吃了前一天剩下     的一半零一个。
		到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。 */
		/*int count =1;//第10天的桃子数
		for(int day=9;day>=1;day--){
			count = (count+1)*2;
		}
		System.out.println(count);*/
		
		//求1+2!+3!+...+20!的和
		// 1 +  1*2+1*2*3..
	/*	long sum  =0L;//和
		long num = 1L;//参与运算的数字
		for(int i=1;i<=20;i++){
			num*=i;//将前一个num*当前的循环子，即为当前数
			sum+=num;
			System.out.println("参与运算的num："+num);
			System.out.println("sum："+sum);
		}
		*/
}
		
}


