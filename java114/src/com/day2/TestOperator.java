package com.day2;

import java.util.Scanner;

public class TestOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//���������
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
		System.out.println(i/2);//2  �����ĳ������㣬����С����ȡ������
		System.out.println(d/2);//2.5
		System.out.println(i/5);//1
		System.out.println(d/5);//1.0
*/	
		
		/*int i = 10;
		System.out.println(i%3);//��10��3������
*/		/*System.out.println(-10%3);//-1
		System.out.println(10%-3);//1
		System.out.println(-10%-3);//-1
*/		
		/*String str = "100";
		System.out.println(str+i);//����ʽ��һ��ֵΪString��+Ϊ���ӷ�
*/	
		
		
		/*int i = 100;
		//System.out.println(++i);//����ǰ���Ƚ�i+1�������i  101
		System.out.println(i++);//�����������i,�ٽ�i+1
		System.out.println(i);*/
		
		/*int a = 3;
		int b=2;
		b+=a;//b=b+a;
		System.out.println(b);*/
		
		//�߼�����
		//System.out.println(true&(1==1));//�루�ͣ���&���ұ��붼Ϊtrue�����Ϊtrue
		//System.out.println(false|(1!=1));//���ߣ�|����ֻҪ��һ��Ϊtrue�����Ϊtrue
		//System.out.println(false^true);//���,^���ߵ�ֵ�෴����Ϊtrue
		//System.out.println(!false);//ȡ��
		/*System.out.println(true&&false);//��·�루�ͣ���&&���ұ��붼Ϊtrue�����Ϊtrue
		System.out.println(false||(1!=1));//��·���ߣ�||����ֻҪ��һ��Ϊtrue�����Ϊtrue
*/	
		/*int i = 0;
		//System.out.println(false&(1/i==0));//��ʹ���Ϊfalse���ұ߻��ǻ�����
		System.out.println(false&&(1/i==0));//&&�����Ϊfalse���ұ߾Ͳ�������
		System.out.println(true||(1/i==0));*/
		
		//��Ԫ���ʽ
		/*Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int i = sc.nextInt();
		//������ֵ1��ֵ2     ����Ϊtrue �����ص���ֵ1�����򷵻�ֵ2
		int y = i>0?i:-i;
		System.out.println("i�ľ���ֵΪ��"+y);*/
		
		//λ�����:��ת��Ϊ2���ƣ����չ���ת��
		/*int i = 10;
		int j = 7;
		//0000 1010 
		//     0111
		System.out.println(i&j);//10
*/		
		/*int i =2;// 0000 1000
		
		//<<���ƣ��ճ��Ĳ��ֲ�0
		System.out.println(i<<2);//32
		
		//>>:�з������ƣ�����λ�Ʋ���ʱ�����Է���תΪ2����������λ�ƣ��ټ��Ϸ���
		System.out.println(i>>2);
		
		//>>>:�޷���λ�ƣ������ִ��ŷ���һ��תΪ2������������λ�Ʋ���
		System.out.println(i>>>2);*/
		
		//double d = 100/10+20-(8>>2)+(9&6)/(7|3);
		System.out.println(1+1*3+"10"+4);
	}

}
