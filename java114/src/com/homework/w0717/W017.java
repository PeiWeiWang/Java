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
			System.out.println("�������"+(i+1)+"����");
			ia[i] = sc.nextInt();
		}
		Arrays.sort(ia);
		System.out.println("��С����Ϊ��"+ia[0]);
*/
		//��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����");
		int num  = sc.nextInt();
		System.out.print(num+"=");
		int i = 2;//1�����κ���������
		while(i<=num){//�������������������
			if(i==num){//�������������������
				System.out.println(i);
				break;//��������Ͳ���Ҫѭ����
			}else if(num%i==0){//num%i==0Ϊ��ѯ����������
				System.out.print(i+"*");
				num/=i;//�ҵ���������һ�εĲ��������numΪnum/i
			}else{
				i++;//��Ϊ�����п����ظ���ֻ������������������Ž�i+1
			}
		}
		
		
		
		
		
	}

}
