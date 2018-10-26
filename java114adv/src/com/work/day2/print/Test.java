package com.work.day2.print;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Print p = new Print();
		new PrintChar(p).start();
		new PrintNum(p).start();
	}

}
