package com.day5.obj;

import java.util.Date;
//向java描述程序员对学生的描述
public class Student {
	//共有的属性---数据的抽象
		public	int sid;
		public	String name;
		public	int age=18;
		public	String sex;
		public	Date hiredate;
	
	//共有的行为---过程的抽象
	public void study(){
		System.out.println(name+"是学生,就要学习");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", hiredate=" + hiredate + "]";
	}
	
}
