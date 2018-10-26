package com.homework.w0720.hw;
//单例模式：Single类的对象只能创建一个，由所有的调用者共享
public class Single {
	//2.私有的成员，在类的内部可以正常使用；在类的内部自行创建本类的对象
	//3.实例成员必须创建对象才可以使用，将single变量使用static修饰；
	//4.对属性要进行封装，提供一个getter方法进行获取
	private	static final Single single = new Single();
	
	private String name;
	
	//1.将构造方法私有化，使之在类的外部无法使用
	private Single(){
	}


	public static Single getSingle() {
		return single;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
