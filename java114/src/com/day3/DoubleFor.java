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
		/*for(int i=1;i<=5;i++){//���Ƹ�
			//���Ƶף�ÿ�е�*�ĸ����� j<=i���ֵ��� ���ܵ��ߵĿ��ƣ���������ǰ�ߵ�*��
			for(int j=1;j<=i;j++){
				System.out.print("*");//ÿ�����*������
			}
			//��ǰ�����һ��*�������ٻ���
			
		}*/
		
		/*//���9*9�ھ�
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println("");
		}*/
		
		//ƽ���ı���
		//   *********  1 4-i
		//  *********   4-i
		// *********   4-i
		//*********
		/*int count = 10;//������
		for(int i=1;i<=count;i++){
			for(int j = 1;j<=count-i;j++){//ÿ�еĿո�����Ϊ������-��ǰ��������i��
				System.out.print(" ");
			}
			System.out.println("***********");
		}
		*/
		
		//����������   ������  5
		// 		   ����  	�ո�����      *����
		//    *   1       5-1     1 2����ǰ����-1
		//   ***  2		  5-2     3 2����ǰ����-1  
		//  ***** 3       5-3     5
		// ******* 4      5-4     7
		//********* 5	  5-5     9
		//1. �ո������κ�*�������� û�п��ƹ�ϵ
		//2. �ո������κ�*���������ܵ�ͬһ���ߵĿ���
		/*int count = 5;
		for(int i = 1;i<=count;i++){//��������
			//����ÿ������Ŀո���
			for(int j = 1;j<=count-i;j++){//ÿ�еĿո�����Ϊ������-��ǰ��������i��
				System.out.print(" ");
			}
			//��������Ǻţ�ÿ�е�*����Ϊ   2��i-1
			for(int k = 1;k<=2*i-1;k++){
				System.out.print("*");
			}
			//һ����ϣ�����
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
		//���ε��ϰ벿��
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
	
		//�����������   �����ε��ϰ벿��1��   ���ϰ벿�ֵ�n-1�п�ʼ����������ԭ��һ��
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