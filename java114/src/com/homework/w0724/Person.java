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
			throw new AgeException("����Ӧ����0-130");
		}
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) throws SexException {
		if(!"��".equals(sex)&&!"Ů".equals(sex)){
			throw new SexException("�Ա�ֻ��Ϊ�л���Ů");
		}
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}
