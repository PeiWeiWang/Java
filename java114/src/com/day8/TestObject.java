package com.day8;

import com.day6.encapsulation.Dept;

public class TestObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dept d1 = new Dept(11,"saler2","nanjin2222");

		Dept d2 = new Dept(11,"saler","nanjin1111");
		
		System.out.println(d1==d2);//==比值（内存地址）
		System.out.println(d1.equals(d2));
		
		String str = "aaa";
	}

}
