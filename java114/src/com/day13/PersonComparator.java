package com.day13;

import java.util.Comparator;


public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.getName().equals(p2.getName())){
			return p2.getAge().compareTo(p1.getAge());
		}
		return p1.getName().compareTo(p2.getName());
	}

}
