package com.day10.my;
/**
 * String类型长度限制异常
 * */
//public class StringLengthLimitException extends RuntimeException{//非受检异常
public class StringLengthLimitException extends Exception{//受检异常
	public StringLengthLimitException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
}
