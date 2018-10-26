package com.homework.w0720.hw;

public abstract class SwimCar {
	public void run(){
		System.out.println("车能跑");
	}
	public abstract void swim();
}

class SQCar extends SwimCar{

	@Override
	public void swim() {
		System.out.println("上汽的车可以潜水500m");
		
	}
	
}

class NQCar extends SwimCar{

	@Override
	public void swim() {
		System.out.println("南汽的车可以潜水1500m");
		
	}
}