package com.day7.访问控制;

public class Son extends Father{
	
	public void test(){
		//System.out.println(privateX);//私有的子类也不能使用
		System.out.println(defaultX);
		System.out.println(protectedX);
		System.out.println(publicX);
	}
	
	}
