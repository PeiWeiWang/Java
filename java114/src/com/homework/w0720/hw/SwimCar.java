package com.homework.w0720.hw;

public abstract class SwimCar {
	public void run(){
		System.out.println("������");
	}
	public abstract void swim();
}

class SQCar extends SwimCar{

	@Override
	public void swim() {
		System.out.println("�����ĳ�����Ǳˮ500m");
		
	}
	
}

class NQCar extends SwimCar{

	@Override
	public void swim() {
		System.out.println("�����ĳ�����Ǳˮ1500m");
		
	}
}