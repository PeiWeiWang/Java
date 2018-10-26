package com.day2;

import java.util.Scanner;

public class TestOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//算术运算符
		/*int i = 1;
		i = i+1;// 2
		System.out.println(i);
		
		i = i-2;
		System.out.println(i);
		
		i  = 5;
		i = i*2;
		System.out.println(i);
		
		i = i/10;
		System.out.println(i);*/
		
	
/*		int i =5;
		double d = 5;
		System.out.println(i/2);//2  整数的除法运算，如有小数，取整处理
		System.out.println(d/2);//2.5
		System.out.println(i/5);//1
		System.out.println(d/5);//1.0
*/	
		
		/*int i = 10;
		System.out.println(i%3);//求10对3的余数
*/		/*System.out.println(-10%3);//-1
		System.out.println(10%-3);//1
		System.out.println(-10%-3);//-1
*/		
		/*String str = "100";
		System.out.println(str+i);//如表达式的一个值为String，+为连接符
*/	
		
		
		/*int i = 100;
		//System.out.println(++i);//自增前：先将i+1，再输出i  101
		System.out.println(i++);//自增后：先输出i,再将i+1
		System.out.println(i);*/
		
		/*int a = 3;
		int b=2;
		b+=a;//b=b+a;
		System.out.println(b);*/
		
		//逻辑运算
		//System.out.println(true&(1==1));//与（和），&左右必须都为true，结果为true
		//System.out.println(false|(1!=1));//或者，|左右只要有一个为true，结果为true
		//System.out.println(false^true);//异或,^两边的值相反，才为true
		//System.out.println(!false);//取反
		/*System.out.println(true&&false);//短路与（和），&&左右必须都为true，结果为true
		System.out.println(false||(1!=1));//短路或者，||左右只要有一个为true，结果为true
*/	
		/*int i = 0;
		//System.out.println(false&(1/i==0));//即使左边为false，右边还是会运算
		System.out.println(false&&(1/i==0));//&&的左边为false，右边就不会运算
		System.out.println(true||(1/i==0));*/
		
		//三元表达式
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int i = sc.nextInt();
		//条件？值1：值2     条件为true ，返回的是值1，否则返回值2
		int y = i>0?i:-i;
		System.out.println("i的绝对值为："+y);*/
		
		//位运算符:先转换为2进制，按照规则转换
		/*int i = 10;
		int j = 7;
		//0000 1010 
		//     0111
		System.out.println(i&j);//10
*/		
		/*int i =2;// 0000 1000
		
		//<<左移，空出的部分补0
		System.out.println(i<<2);//32
		
		//>>:有符号右移：在做位移操作时，忽略符号转为2进制数，先位移，再加上符号
		System.out.println(i>>2);
		
		//>>>:无符号位移：将数字带着符号一并转为2进制数，进行位移操作
		System.out.println(i>>>2);*/
		
		//double d = 100/10+20-(8>>2)+(9&6)/(7|3);
		System.out.println(1+1*3+"10"+4);
	}

}
