package com.day5.pass;

import com.day5.obj.Student;

public class TestPass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int x = 1;
		int y = x;//��xָ���ֵ����y---ֵ����
		System.out.println(y==x);//true
		y=10;//y��ָ��1������ָ��10
		System.out.println(y==x);//false
		System.out.println(x);
		System.out.println(y);*/
		
		System.out.println("--------------------");
		Student s1 = new Student();//ֻ��1������
		s1.age = 10;
		//System.out.println(s1.age);//10
		Student s2 = s1;//��s1ָ���ֵ���ݸ�s2---ֵ����
		//System.out.println(s2.age);//10
		System.out.println(s1==s2);//10
		System.out.println("--------------------");
		s2.age = 100;
		System.out.println(s1==s2);
		System.out.println("s1:"+s1.age);//100
		System.out.println("s2:"+s2.age);//100
	}

}
