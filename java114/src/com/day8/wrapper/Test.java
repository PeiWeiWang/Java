package com.day8.wrapper;

public class Test {

	/**
	 * Integer:int�İ�װ��
	 */
	public static void main(String[] args) {
		
		/*System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		Integer ii = new Integer(1);
		System.out.println(ii.intValue());*/
		
		//����ʵ�ֽ�String����ת��Ϊ��Ӧ�Ļ�����������
		/*String numStr1 = "1111";
		String numStr2 = "22";*/
		//System.out.println(numStr1+numStr2);//
		
		//���ַ���ת��Ϊint����
		/*//1.ֱ�ӽ�String----->int  �Ƽ�
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);
		System.out.println(num1+num2);*/
		
		//2.String----->Integer----->int
		/*Integer ii1 = new Integer(numStr1);
		Integer ii2 = new Integer(numStr2);
		int num1 = ii1.intValue();
		int num2 = ii2.intValue();
		System.out.println(num1+num2);*/
		
		//3.String----->Integer----->int
/*		Integer ii1 =  Integer.valueOf(numStr1);
		Integer ii2 = Integer.valueOf(numStr2);
		int num1 = ii1.intValue();
		int num2 = ii2.intValue();
		System.out.println(num1+num2);*/
		
		//��Ϊint����ת���ַ���
		 //1.
		/*int i = 1;
		String str = Integer.toString(i);
		System.out.println(str+1);
		
		//2.
		String str1 = i+"";
		System.out.println(str1+1);*/
		
		
		/*//�Զ�װ�䣺�������������� ���Ϊ ��Ӧ�İ�װ������  int---->Integer
		Integer ii = 1;//java�Զ�ִ��Integer.valueOf(1);
		System.out.println(ii+1);
		
		//�Զ����䣺����Ӧ�İ�װ������ �Զ�����Ϊ������������
		int i = ii;//java�Զ�ִ��ii.intValue()
*/	
			Emp e1 = new Emp();
			e1.setComm(10.0);
	}

}
