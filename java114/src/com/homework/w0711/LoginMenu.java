package com.homework.w0711;

import java.util.Scanner;

public class LoginMenu {

	public static void main(String[] args) {
		System.out.println("\t\t\t��ӭʹ���������ع������ϵͳ1.0\n\n");
		System.out.println("\t\t\t\t\t1.\t��¼\n\n");
		System.out.println("\t\t\t\t\t2.\tע��\n\n");
		System.out.println("\t\t\t\t\t3.\t�˳�\n\n");
		System.out.println("*****************************************");
		System.out.println("\t\t��ѡ����������");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		if(choose==1){
			System.out.println("��ӭ��¼");
		}else if(choose==2){
			System.out.println("ע��ҳ��");
		}else if(choose==3){
			System.out.println("�˳�ϵͳ");
		}else{
			System.out.println("�˹�����δ����");
		}
	}

}