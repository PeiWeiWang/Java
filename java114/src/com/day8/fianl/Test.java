package com.day8.fianl;

public class Test {
	//final int x = 0;//��Զ���ɸı�
	final int x;//final�հף�java�����final���εĳ�Ա���������ʼֵ
	
	public static final long VERSION=200L;
	

	public Test(int x) {
		this.x = x;//�ڹ������ж�final�������и�ֵ
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//final int  x = 1;
		//x=3;//final���εı�����ֵ���ɸı�
		//System.out.println(x);

		Test t = new Test(4);
		System.out.println(t.x);
	//	t.x = 10;
		
		Test t1 = new Test(10);
		System.out.println(t1.x);
	}

}
