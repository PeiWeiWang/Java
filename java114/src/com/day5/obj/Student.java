package com.day5.obj;

import java.util.Date;
//��java��������Ա��ѧ��������
public class Student {
	//���е�����---���ݵĳ���
		public	int sid;
		public	String name;
		public	int age=18;
		public	String sex;
		public	Date hiredate;
	
	//���е���Ϊ---���̵ĳ���
	public void study(){
		System.out.println(name+"��ѧ��,��Ҫѧϰ");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", hiredate=" + hiredate + "]";
	}
	
}
