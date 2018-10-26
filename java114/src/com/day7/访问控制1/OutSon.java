package com.day7.访问控制1;

import com.day7.访问控制.Father;

public class OutSon  extends Father{

	public void test(){
	//	System.out.println(privateX);//私有的子类也不能使用
	//	System.out.println(defaultX);//包访问，即使是外包的子类也不能使用
		System.out.println(protectedX);
		System.out.println(publicX);
	}
}
