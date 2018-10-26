package com.day10.my;


public class Person {
	private String name;
	private Integer age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws StringLengthLimitException {
		if(name.length()>10){
			throw new StringLengthLimitException("名字的长度不能大于10位");
		}
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
