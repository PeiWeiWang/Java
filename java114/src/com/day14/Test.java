package com.day14;

public class Test {
	//����ĳ�����Ľ׳�
	
	/*//�ݹ��㷨
	 *1.�������Լ������Լ� 
	 *2.һ��Ҫ��һ���ܹ��ﵽ���˳�����
	 *3.����һ��Ҫ�������˳�����
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
		
		//num = 1*2*3*4*5;�����㷨
		
		
		//5! = 5*4!  4!=4*3! 3! = 3*2! 2!= 2*1! 1!=1//�ݹ��㷨
		int  num = count(5);
	System.out.println(num);
		
		
	}

}
