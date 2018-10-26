package com.homework.w0717;

import java.util.Arrays;
import java.util.Scanner;

public class W017 {
	public static int getDMax(int[] ia1,int[] ia2){
		Arrays.sort(ia1);
		Arrays.sort(ia2);
		int ia1Max = ia1[ia1.length-1];
		int ia2Max = ia2[ia2.length-1];
		if(ia1Max>ia2Max){
			return ia1Max;
		}else{
			return ia2Max;
		}
		
	}
	
	public static void main(String[] args) {
		/*int max =  W017.getDMax(new int[]{5,6,9,8,11,22,17},new int[]{99,22,13,5,6,10});
		System.out.println(max);*/
		
	/*	Scanner sc = new Scanner(System.in);
		int[] ia = new int[5];
		for(int i =0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"个数");
			ia[i] = sc.nextInt();
		}
		Arrays.sort(ia);
		System.out.println("最小的数为："+ia[0]);
*/
		//将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int num  = sc.nextInt();
		System.out.print(num+"=");
		int i = 2;//1不是任何数的因数
		while(i<=num){//因数最多等于这个数本身
			if(i==num){//因数最多等于这个数本身
				System.out.println(i);
				break;//到数本身就不需要循环了
			}else if(num%i==0){//num%i==0为查询因数的条件
				System.out.print(i+"*");
				num/=i;//找到因数后，下一次的参与运算的num为num/i
			}else{
				i++;//因为因数有可能重复，只有以上条件都不满足才将i+1
			}
		}
		
		
		
		
		
	}

}
