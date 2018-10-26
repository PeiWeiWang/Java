package com.homework.w0724;

public class Person {
	private String name;
	private Integer age;
	private String sex;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
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
	public void setAge(Integer age) throws AgeException {
		if(age<0||age>130){
			throw new AgeException("年龄应该在0-130");
		}
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) throws SexException {
		if(!"男".equals(sex)&&!"女".equals(sex)){
			throw new SexException("性别只能为男或者女");
		}
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}
