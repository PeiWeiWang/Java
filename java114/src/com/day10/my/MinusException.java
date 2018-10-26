package com.day10.my;

public class MinusException extends Exception{

	public MinusException() {
		super("不能为负");//将自定义出错信息,调用Exception构造方法
	}
}
