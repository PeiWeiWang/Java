package com.homework.w0719;

public class Person {
	public void eat(){
		System.out.println("�˾�Ҫ�Է�");
	}
	
	public void drink(){
		System.out.println("���ܹ��Ⱦ�");
	}
}

class Norther extends Person{

	@Override
	public void eat() {
		System.out.println("�����˷�һ����ĳ�");
	}

	@Override
	public void drink() {
		System.out.println("�����˺Ⱦ�һƿƿ�ĺ�");
	}
	
}


class Souther extends Person{

	@Override
	public void eat() {
		System.out.println("�Ϸ��˳Է�һ�����ĳ�");
	}

	@Override
	public void drink() {
		System.out.println("�Ϸ��˺Ⱦ�һ�����ĺ�");
	}
	
}
