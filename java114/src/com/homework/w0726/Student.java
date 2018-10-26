package com.homework.w0726;
//学号  姓名  性别  年龄  
public class Student implements Comparable<Student>{
	private Integer sid;
	private String name;
	private String sex;
	private Integer age;
	public Student() {
		super();
	}
	public Student(Integer sid, String name, String sex, Integer age) {
		super();
		this.sid = sid;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		return this.sid.compareTo(other.sid);
	}
	
}
