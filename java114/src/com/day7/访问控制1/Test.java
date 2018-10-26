package com.day7.访问控制1;

import com.day7.访问控制.Father;

public class Test {
	public void test(){
		Father f= new Father();
		//System.out.println(f.privateX);//私有的无法在类的外部使用
		//System.out.println(f.defaultX);//
		//System.out.println(f.protectedX);//
		System.out.println(f.publicX); //
	}
}
