package com.homework.w0719;

public class Printer {
	public Printer(){
		super();
		System.out.println("���Ǹ���Ĺ��췽��");
	}
	protected void print(){
	//	System.out.println("��ӡ���ܴ�ӡ");
	}
}

class ColorPrinter extends Printer{

	public ColorPrinter(){
		super();
		System.out.println("���ǲ�ɫ�Ĺ��췽��");
	}
	
	@Override
	public void print() {
		System.out.println("��ɫ��ӡ���Ǵ�ӡ��ɫ��");
	}
	
}

class BWPrinter extends Printer{

	public BWPrinter(){
		System.out.println("���Ǻڰ׵Ĺ��췽��");
	}
	
	@Override
	public void print() {
		System.out.println("�ڰ״�ӡ���Ǵ�ӡ�ڰ׵�");
	}
	
}

