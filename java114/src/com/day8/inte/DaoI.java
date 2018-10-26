package com.day8.inte;
interface T1{} 
interface T2{} 
//public interface DaoI extends T1,T2
public interface DaoI {
	//定义在接口中的变量默认使用public static final修饰，必须在定义的同时赋值（常量）
	 String VERSION="111";
	 
	 //接口中不能定义构造方法
	// public DaoI(){}
	
	//定义在接口中的方法，默认使用public abstract修饰
	abstract  void add();
	public  void del();
	 void update();
	 void query();
	 
}
