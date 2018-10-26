package com.day14;

public class Test {
	//计算某个数的阶乘
	
	/*//递归算法
	 *1.方法中自己调用自己 
	 *2.一定要有一个能够达到的退出条件
	 *3.操作一定要趋向与退出条件
	 * */
	public static int count(int num){
		if(num==1){
			System.out.print(num+"=");
			return 1;
		}else{
			System.out.print(num+"*");
			return num*count(num-1);
		} 
	}
	
	
	//5+4+3+2+1
	
	public static void main(String[] args) {
		//5!
		/*int num=1;
		for(int i=2;i<=5;i++){
			num*=i;
		}
		System.out.println(num);*/
		
		//num = 1*2*3*4*5;迭代算法
		
		
		//5! = 5*4!  4!=4*3! 3! = 3*2! 2!= 2*1! 1!=1//递归算法
		int  num = count(5);
	System.out.println(num);
		
		
	}

}
