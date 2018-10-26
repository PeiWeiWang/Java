package com.day4.clazz;
class Student extends Person{
//	public Student(String name){}
}
class Teacher extends Person{}

//类
public class Person {
	//属性
	private String name;
	private Integer age;
	private String type = "变态";
	
	
	//构造方法
	public Person() {
		super();
	}
	
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//普通方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
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
		return "Person [name=" + name + ", age=" + age + ", type=" + type + "]";
	}


	


	

	
}
