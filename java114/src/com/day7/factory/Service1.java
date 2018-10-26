package com.day7.factory;

public class Service1 {
	//private Dao2 dao = new Dao2();
	private BaseDao dao =  Factory.createDao();
	public void fun1(){
		System.out.println("Service1调用dao.add");
		dao.add();
	}
	
	public void fun2(){
		System.out.println("Service1调用dao.del");
		dao.del();
	}
}
