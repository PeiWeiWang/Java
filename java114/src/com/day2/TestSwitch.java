package com.day2;

import java.util.Scanner;

public class TestSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\t\t\t��ӭʹ���������ع������ϵͳ1.0\n\n");
		System.out.println("\t\t\t\t\t1.\t��¼\n\n");
		System.out.println("\t\t\t\t\t2.\tע��\n\n");
		System.out.println("\t\t\t\t\t3.\t�˳�\n\n");
		System.out.println("*****************************************");
		System.out.println("\t\t��ѡ����������");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		switch(choose){
			case 1:
				System.out.println("ת������¼ҳ��");
				break;
			case 2:	
				System.out.println("ת����ע��ҳ��");
				break;
			case 3:
				System.out.println("�˳�ϵͳ");
				break;
			default:
				System.out.println("�˹�����δ����");
		}
		//һ�����������͵�֧��
			//1.JDK1.5���°汾  choose֧�� byte short char int
			//2.JDK1.5-1.6�汾  choose֧�� byte short char int  enum(ö��)
			//3.JDK1.7�����ϰ汾  choose֧�� String byte short char int  enum(ö��)
		
		//������֧������ֶ�
		//����breakһ�㲻��©д;switch�����У�ִ�е�һ��ƥ���һֱ��������һ��break��switchִ�����
	}

}
