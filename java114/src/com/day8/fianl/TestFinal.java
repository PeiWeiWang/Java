package com.day8.fianl;

public final class TestFinal {
	final int x =10;
	
	public final void fun1(){
	//	x=11;//final���εı����������ٴθ�ֵ
		System.out.println("final���εķ��������Ա�������д");
	}
}


//fianl��û������
/*class Son extends TestFinal{
	
	//final���εķ��������Ա�������д
	public final void fun1(){
		System.out.println("final���εķ��������Ա�������д");
	}
}*/