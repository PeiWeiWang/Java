package com.day10;

import java.util.Scanner;

public class TestTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("�쳣����ǰ");
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������");
		int num = sc.nextInt();
		try{//��������
			System.out.println("ǰOK");
			System.out.println(100/num);//���ܳ�ѡ�쳣�Ĵ���
			System.out.println("��OK");
			
			String str = "aaa";// java.lang.NullPointerException
			System.out.println(str.charAt(0));
			
			 str = "a";//java.lang.StringIndexOutOfBoundsException
			System.out.println(str.charAt(1));
		}catch (ArithmeticException e) {//������쳣,���쳣������в���,��ֵ��e
			/*//���쳣���д���
			while(num==0){
				System.out.println("�������뱻����,����Ϊ0");
				num = sc.nextInt();
			}
			System.out.println(100/num);*/
			
			//��������Ϣ���п���̨�����
			//e.printStackTrace();
			System.err.println("-----����������Ϊ0------");
		}catch (NullPointerException e) {
			System.err.println("-----������Ϊ��------");
		}catch(Exception e){
			System.err.println("������δ֪�쳣");
		}
		
		//�����쳣,�����ܵ�Ӱ��
		System.out.println("�쳣������");

	}

}
