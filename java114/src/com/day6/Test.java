package com.day6;

import com.day6.encapsulation.Emp;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emp emp  = new Emp();
		emp.setEname("kk");
		emp.setSal(20000);
		System.out.println(emp.toString());

	}

}
