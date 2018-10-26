package com.day11.set;

import com.homework.w0725.Person;
import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("zs",19,"Å®");
		Person p2 = new Person("ls",18,"ÄÐ");
		Person p3 = new Person("zs",19,"Å®");
		
		System.out.println(p1.equals(p3));
		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		for(Person s :set){
			System.out.println(s+"\t\t");
		}
		
		
		

	}

}
