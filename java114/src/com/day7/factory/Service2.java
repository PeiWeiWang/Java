package com.day7.factory;

public class Service2 {
	//private BaseDao dao = new Dao2();
	private BaseDao dao =  Factory.createDao();
	public void fun1(){
		System.out.println("Service2调用dao.add");
		dao.add();
	}
	
	public void fun2(){
		System.out.println("Service2调用dao.del");
		dao.del();
	}
}
