package com.day1;

public class TestVar {
	public static void main(String[] args) {
		//������һ����Ϊstr�ı�������ʼֵΪ��aaa��
		/*String str = "aaa";
		System.out.println(str);
		str = "bbb";
		System.out.println(str);
		
		//=���ұߵĲ��ֱ���Ϊ������
		int i = 1;
		i=2;*/
		
		//������������
		//1.����������  ----
		byte b = 127;  //�ֽ�  ȡֵ��Χ  -128��-2^7�� --- 127(2^7-1)
		short s = 444;//������2��byte    -2^15  -----2^15-1  
		
		//�ַ���:�����ַ�
		char c = '��'; //2��byte������ֵ����
		
		int i =1000;//���ͣ��������͵�Ĭ������4��byte -2^31-----2^31-1
		long l = 1000L;//������  -2^63-----2^63-1
		
		//2.��������
		float f = 1.0F;//�����ȸ����� 32λ������
		double d = 1.0;//˫���ȸ����ͣ������͵�Ĭ������ 64λ������
		
		//3.boolean ֻ��true��false
		boolean bo = true;
		boolean bo1 = false;
		
		
	}
}
