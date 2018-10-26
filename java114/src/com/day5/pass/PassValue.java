package com.day5.pass;

public class PassValue {

	public static void change(int x) {
		System.out.println("局部x，change方法改变前"+x);
		x = 3; //只将局部变量x值改为5
		System.out.println("局部x，change方法改变后"+x);
	}

	public static void main(String[] args) {
		int x = 5;//main中 x 
		change(x);
		System.out.println(x);//main中 x 没有受到影响
	}

}
