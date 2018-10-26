package com.day6.constructor;

import java.util.Date;

//向java描述程序员对学生的描述
public class Student {
	//属性
		public int sid;
		public String sname;

	//无参
	public Student() {}
	
	//有参构造
	public Student(int id,String name) {
		sid  = id;
		sname = name;
		System.out.println("有参构造调用成功，并成功的对本对象的成员属性进行了赋值");
	}
	

	public void study() {
		System.out.println(sname + "是学生,就要学习");
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

}
