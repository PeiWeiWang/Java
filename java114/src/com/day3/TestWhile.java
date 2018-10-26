package com.day3;

public class TestWhile {

	/**
	 * 循环结构：重复的执行同一段代码，直到达到设定的退出条件 while do...while() for
	 */
	public static void main(String[] args) {
		/*
		 * int i = 1;//1必须要有一个循环子 while (i <= 100) {//2.（能执行的条件），（）内要为true
		 * System.out.println("我能学好java,已经喊了第【"+i+"】遍");
		 * i++;//3.对循环子的操作，循环子要无限的趋向于设定的退出条件 }
		 */

		/*
		 * int i1 = 100;//1必须要有一个循环子 while (i1>=1) {//2.（能执行的条件），（）内要为true
		 * System.out.println("我能学好java,已经喊了第【"+i+"】遍");
		 * i--;//3.对循环子的操作，循环子要无限的趋向于设定的退出条件 }
		 */

		// 循环找出1-200之间的奇数
		/*int num = 1;
		
		 * while(num<=20){ System.out.println(num); num+=2; }
		 
		while (num <= 20) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
			num++;
		}

		System.out.println("循环完毕num为" + num);*/
		
		//找出100-1000之间的偶数
		/*int num = 100;
		while(num<=1000){
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}*/
		
		//找出100-999之间的水仙花数  个位数^3+10位数^3+百位数^3=数本身
		/*int num  =100;
		while(num<=999){
			int unit = num%10;
			int ten = num/10%10;
			int hum = num/100;
			int temp = unit*unit*unit+ten*ten*ten+hum*hum*hum;
			if(temp==num){
				System.out.println(num+"是水仙花数");
			}
			num++;
		}*/
		
		//找出100-999之间的回文数 101 111 979
		/*int num  =100;
		while(num<=999){
			int unit = num%10;
			int hum = num/100;
			if(unit==hum){
				System.out.println(num+"是回文数");
			}
			num++;
		}*/
	}

}
