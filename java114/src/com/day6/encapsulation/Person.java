package com.day6.encapsulation;



public class Person {
	private String name;
	private int age;
	private String sex;
	private double sal;
	private boolean flag;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean isFlag(){
		return flag;
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	
	
	
	//获取的方法:使用公共的方法，返回name的值
	public String getName(){
		return name;
	}
	
	//修改的方法
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		if(age<1||age>130){//如数据不合法，提示后直接结束方法，不执行赋值操作
			System.err.println("数据不合法，赋值不成功");
			return;
		}
		this.age = age;
	}
	public void shout(){
		//私有的属性在内部可以正常使用
		System.out.println(name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", sal=" + sal + "]";
	}


	
	
	
}
