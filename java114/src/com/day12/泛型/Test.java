package com.day12.·ºĞÍ;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Container<String,String> stringContainer = new Container<>();
		stringContainer.setValue("ÕâÊÇ×Ö·û´®");
		System.out.println(stringContainer);
		System.out.println(stringContainer.getValue() instanceof String);
		
		
		Container<Integer,String> integerContainer = new Container<>();
		integerContainer.setValue(1111);
		System.out.println(integerContainer);
		System.out.println(integerContainer.getValue() instanceof Integer);
		
		Container<Person,Person> personContainer1= new Container<>();
		personContainer1.setValue(new Person());
		personContainer1.setValue(new Student());*/
		
		List<String> list = new ArrayList<>();
		list.add("fdfd");
		list.add("fdfd");
		list.add("fdfd");
		
		
		
		String str = (String)list.get(3);
	}

}

class Person{}
class Student extends Person{}

