package com.day4;

import java.lang.reflect.Field;

class Person {
	protected String name;
}

class Student extends Person {
	private String sex;

	@Override
	public String toString() {
		return "Student [sex=" + sex + ", name=" + name + "]";
	}

}

public class Test {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Student s = new Student();

		Class clazz = s.getClass();

		Field f = clazz.getSuperclass().getDeclaredField("name");

		f.setAccessible(true);
		f.set(s, "zs");
		System.out.println(s);
	}

}
