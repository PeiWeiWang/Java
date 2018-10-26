package com.day2.notifyandwait.t2;

public class Person {
	private String name;
	private ThreadLocal<String> tl = new ThreadLocal<>();//»º´æ
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return tl.get();
	}

	public void setName(String name) {
		if(name==null){
			this.name = name;
		}
		this.name =  tl.get();
	}
	
	
}
