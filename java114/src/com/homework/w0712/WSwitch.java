package com.homework.w0712;

import java.util.Scanner;

public class WSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����һ���·ݣ���ʾ���µ�����   ��ʱ2�°�28���
		
		System.out.println("�������·�");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		/*switch(month){
		case 1:
			System.out.println("����Ϊ��"+month+"�£�Ϊ31��");
			break;
		case 2:	
			System.out.println("����Ϊ��"+month+"�£�Ϊ28��");
			break;
		case 3:
			System.out.println("����Ϊ��"+month+"�£�Ϊ31��");
			break;
		case 4:
			System.out.println("����Ϊ��"+month+"�£�Ϊ30��");
			break;	
		case 5:
			System.out.println("����Ϊ��"+month+"�£�Ϊ31��");
			break;		
		case 6:
			System.out.println("����Ϊ��"+month+"�£�Ϊ30��");
			break;	
		case 7:
			System.out.println("����Ϊ��"+month+"�£�Ϊ31��");
			break;	
		case 8:
			System.out.println("����Ϊ��"+month+"�£�Ϊ31��");
			break;	
		case 9:
			System.out.println("����Ϊ��"+month+"�£�Ϊ30��");
			break;
		case 10:
			System.out.println("����Ϊ��"+month+"�£�Ϊ31��");
			break;
		case 11:
			System.out.println("����Ϊ��"+month+"�£�Ϊ30��");
			break;
		case 12:
			System.out.println("����Ϊ��"+month+"�£�Ϊ31��");
			break;	
		default:
			System.out.println("������·�");
	}*/
		switch(month){
			case 1:
			case 3:	
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("����Ϊ��"+month+"�£�Ϊ31��");
				break;
			case 4:	
			case 6:	
			case 9:	
			case 11:
				System.out.println("����Ϊ��"+month+"�£�Ϊ30��");
				break;
			case 2:	
				System.out.println("����Ϊ��"+month+"�£�Ϊ28��");
				System.out.println("����Ϊ��"+month+"�£�Ϊ28��");
				System.out.println("����Ϊ��"+month+"�£�Ϊ28��");
				System.out.println("����Ϊ��"+month+"�£�Ϊ28��");
				break;
			default:
				System.out.println("������·�");
		}

	}

}
