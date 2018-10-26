package com.day3;

public class DoubleFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
		/*for(int i=1;i<=5;i++){//控制高
			//控制底（每行的*的个数） j<=i体现的是 底受到高的控制，最多输出当前高的*数
			for(int j=1;j<=i;j++){
				System.out.print("*");//每次输出*不换行
			}
			//当前行最后一个*输出完毕再换行
			
		}*/
		
		/*//输出9*9口诀
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println("");
		}*/
		
		//平行四边形
		//   *********  1 4-i
		//  *********   4-i
		// *********   4-i
		//*********
		/*int count = 10;//总行数
		for(int i=1;i<=count;i++){
			for(int j = 1;j<=count-i;j++){//每行的空格数量为总行数-当前的行数（i）
				System.out.print(" ");
			}
			System.out.println("***********");
		}
		*/
		
		//等腰三角形   总行数  5
		// 		   行数  	空格数量      *数量
		//    *   1       5-1     1 2×当前行数-1
		//   ***  2		  5-2     3 2×当前行数-1  
		//  ***** 3       5-3     5
		// ******* 4      5-4     7
		//********* 5	  5-5     9
		//1. 空格三角形和*号三角形 没有控制关系
		//2. 空格三角形和*号三角形受到同一个高的控制
		/*int count = 5;
		for(int i = 1;i<=count;i++){//控制行数
			//控制每行输出的空格数
			for(int j = 1;j<=count-i;j++){//每行的空格数量为总行数-当前的行数（i）
				System.out.print(" ");
			}
			//控制输出星号，每行的*数量为   2×i-1
			for(int k = 1;k<=2*i-1;k++){
				System.out.print("*");
			}
			//一行完毕，换行
			System.out.println("");
		}
	 */

	
	  /*
	     *
	    ***
	   *****
	  *******
	 *********
	  *******
	   *****
	    ***
	     *   */
		//菱形的上半部分
		int count = 10;
		for(int i = 1;i<=count;i++){
			for(int j = 1;j<=count-i;j++){
				System.out.print(" ");
			}
			
			for(int k = 1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	
		//输出倒三角形   比菱形的上半部少1行   从上半部分的n-1行开始输出，输出到原第一行
		for(int i = count-1;i>=1;i--){
			for(int j = 1;j<=count-i;j++){
				System.out.print(" ");
			}
			
			for(int k = 1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println("");
		}

		
}
}