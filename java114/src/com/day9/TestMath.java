package com.day9;

public class TestMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(Math.PI);
		
	/*	System.out.println(Math.ceil(11.9));//����ȡ��
		System.out.println(Math.floor(11.9));//����ȡ��c
		
		System.out.println(Math.round(11.59));//�������� 11
*/		
		/*System.out.println(Math.ceil(-11.9));//-11
		System.out.println(Math.floor(-11.9));//-12
		
		System.out.println(Math.round(-11.49));//-11
		System.out.println(Math.round(-11.59));//-12
*/		
		
		System.out.println(Math.random());//����0-1֮���α�����
		
		
		//1-8֮��������
		int rows  = (int)(Math.random()*8+1);
		int cols  = (int)(Math.random()*8+1);
		System.out.println("���"+rows+"�У�"+"��"+cols+"��ͬѧ�ش�����");
	}

}
