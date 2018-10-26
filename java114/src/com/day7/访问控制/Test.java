package com.day7.访问控制;

public class Test {
	public void test(){
		Father f= new Father();
		//System.out.println(f.privateX);//私有的无法在类的外部使用
		System.out.println(f.defaultX);// 同包下 y
		System.out.println(f.protectedX);// y
		System.out.println(f.publicX); // y
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
