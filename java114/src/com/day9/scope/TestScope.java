package com.day9.scope;

public class TestScope {
	
	{
		System.out.println("���ǹ�������1");
	}
	{
		System.out.println("���ǹ�������2");
	}
	public TestScope(){
		System.out.println("���ǹ��췽��");
	} 
	static{
		System.out.println("���Ǿ�̬�����1");
	}
	
	
	public static void main(String[] args) {
		System.out.println("����main����");
		TestScope ts = new TestScope();
		
	}
	static{
		System.out.println("���Ǿ�̬�����2");
	}
}
