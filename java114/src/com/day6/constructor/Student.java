package com.day6.constructor;

import java.util.Date;

//��java��������Ա��ѧ��������
public class Student {
	//����
		public int sid;
		public String sname;

	//�޲�
	public Student() {}
	
	//�вι���
	public Student(int id,String name) {
		sid  = id;
		sname = name;
		System.out.println("�вι�����óɹ������ɹ��ĶԱ�����ĳ�Ա���Խ����˸�ֵ");
	}
	

	public void study() {
		System.out.println(sname + "��ѧ��,��Ҫѧϰ");
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

}
