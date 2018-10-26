package com.homework.w0725;

public class Person {
	private String name;
	private Integer age;
	private String sex;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Integer age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null||!(obj instanceof Person)){
			return false;
		}
		Person other = (Person)obj;
		if(this.name.equals(other.name)&&this.age.equals(other.age)){
			return true;
		}
		return false;
		
	}
	
	
}
