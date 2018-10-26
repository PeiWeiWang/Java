package com.homework.w0719;

public class Person {
	public void eat(){
		System.out.println("人就要吃饭");
	}
	
	public void drink(){
		System.out.println("人能够喝酒");
	}
}

class Norther extends Person{

	@Override
	public void eat() {
		System.out.println("北方人饭一盆盆的吃");
	}

	@Override
	public void drink() {
		System.out.println("北方人喝酒一瓶瓶的喝");
	}
	
}


class Souther extends Person{

	@Override
	public void eat() {
		System.out.println("南方人吃饭一粒粒的吃");
	}

	@Override
	public void drink() {
		System.out.println("南方人喝酒一杯杯的喝");
	}
	
}
