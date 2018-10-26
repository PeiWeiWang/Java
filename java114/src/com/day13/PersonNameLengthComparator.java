package com.day13;

import java.util.Comparator;

public class PersonNameLengthComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getName().length()-o2.getName().length();
	}

}
