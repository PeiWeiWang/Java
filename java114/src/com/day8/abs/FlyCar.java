package com.day8.abs;

//因为含有一个没有实现的方法（abstract方法），整个类都没有办法实现
public  abstract class FlyCar {
 	String color;
	public FlyCar(){}
	
	public  void  run(){
		System.out.println("车可以跑");
	}
	
	//飞方法在本类中是一个设想，交由子类实现
	public  abstract void  fly();
	
	//飞方法在本类中是一个设想，交由子类实现
	public  abstract void  swim();
}
