package com.day7.polymorphic;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�����������͵�ת��
		//byte --�Զ�--> int
//		byte b = 1;
//		int i = b;
		
		//int -----ǿ��---->byte
//		b = (byte)i;
		
		
		//�����������͵�ת��
		//1.Student �Ǽ̳�Person��ģ�Student��Person�Ǽ��ݵ�
		//2.Student��Personָ���ķ�ΧС
		
		//�Զ�����ת��----Сת���Զ�ת��    JVM
		/*Man s = new Man();
		s.fun1();
		s.fun2();
		s.fun3();
		
		//���˶��������ࣻ��һ�����˶��󵱳��������ʹ��
		//ֻ�ܵ����ڸ����ж���ķ���������
		Person p = s;
		p.fun1();
		p.fun2();*/
		//p.fun3();//��Man����еķ������ڵ���Person��ʹ��ʱ��java������ʹ��
		
		//ǿ������ת��  ---�ɵ�����ǿ��JVM
	/*	Person p = new Man();//���������ָ������Ķ���
		p.fun1();
		p.fun2();
		System.out.println("----------------------");*/
		//����Աȷ���ڴ�ȷʵ��Man�Ķ���
		//Man m = p;//�������Ͳ����Զ�ת��Ϊ��������
		/*Man m = (Man)p;//��������ֻ��ǿ��ת��Ϊ��������
		m.fun1();
		m.fun2();
		m.fun3();*/
	}

	
	
}
