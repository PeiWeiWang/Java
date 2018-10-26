package com.day5.pass;

import com.day5.obj.Student;

public class TestPass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int x = 1;
		int y = x;//将x指向的值传给y---值传递
		System.out.println(y==x);//true
		y=10;//y不指向1，换成指向10
		System.out.println(y==x);//false
		System.out.println(x);
		System.out.println(y);*/
		
		System.out.println("--------------------");
		Student s1 = new Student();//只有1个对象
		s1.age = 10;
		//System.out.println(s1.age);//10
		Student s2 = s1;//将s1指向的值传递给s2---值传递
		//System.out.println(s2.age);//10
		System.out.println(s1==s2);//10
		System.out.println("--------------------");
		s2.age = 100;
		System.out.println(s1==s2);
		System.out.println("s1:"+s1.age);//100
		System.out.println("s2:"+s2.age);//100
	}

}
