package com.work.day4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestMy {
	
	int x=100;
	
	/**
	 * @param args
	 */
	@MyAn(value1="1")
	public void test(){} 
	
	public static void main(String[] args) throws Exception {
		TestMy tm = new TestMy();
		
		Class clazz  = tm.getClass();
		
		Method test= clazz.getDeclaredMethod("test");
		Annotation at = test.getAnnotation(MyAn.class);
				
				
		System.out.println(at);

	}

}
