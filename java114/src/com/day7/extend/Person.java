package com.day7.extend;

public class Person{
	//属性---可以继承，不存在重写（就近原则）
	protected String name="父类";
	protected int age;
	
	//构造方法---不能重写，不能继承，但默认调用
	public Person() {
		super();//当任何一个类没有使用extends显式继承一个类时，java默认继承Object类
		// TODO Auto-generated constructor stub
	}

	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	//普通方法---可以重写 
	public void eat(){
		System.out.println("是人就要吃饭："+name);
	}
	
	
	


	public void run(){
		System.out.println("是人就会跑");
	}
	
	
}
