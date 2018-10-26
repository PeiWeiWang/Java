package com.homework.w0720.hw;



/*private	String name;
private	int age;
private String sex;
private String color;*/
public class Monkey {
	private	String name;
	//使用包装类来定义成员变量
	private Integer age;
	private String sex;
	private String color;
	
	public Monkey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Monkey(String name, Integer age, String sex, String color) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.color = color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Monkey [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", color=" + color + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null||!(obj instanceof Monkey)){
			return false;
		}
		
		Monkey other = (Monkey)obj;
		if(this.color.equals(other.color)&&this.age.equals(age)){
			return true;
		}
		return false;
	}
	
	
	
	
 
}
