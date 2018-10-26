package com.day9.api;

public class TestStringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "a"+"b"+"c"+"d"+"e";
		
		String str1 = new StringBuffer().append("a")
					.append("b").append(true).append(1)
					.append(6.0).toString();

	}

}
