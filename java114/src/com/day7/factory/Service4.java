package com.day7.factory;

public class Service4 {
	//private BaseDao dao = new Dao2();
	private BaseDao dao =  Factory.createDao();
	public void fun1(){
		System.out.println("Service4����dao.add");
		dao.add();
	}
	
	public void fun2(){
		System.out.println("Service4����dao.del");
		dao.del();
	}
}
