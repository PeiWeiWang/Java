package com.day11.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import com.homework.w0725.Person;

public class TestTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//非通用实现,不使用父类引用指向子类对象
		/*TreeSet<String> ts  = new TreeSet<>();
		
		ts.add("adc");
		ts.add("afk");
		ts.add("abb");
		ts.add("bdc");
		ts.add("cba");
		
		for(String s :ts){
			System.out.print(s+"\t\t");
		}*/
		/*TreeSet<Character> ts  = new TreeSet<>();
		ts.add('z');
		ts.add('b');
		ts.add('f');
		ts.add('d');
		ts.add('j');
		for(char s :ts){
			System.out.print(s+"\t\t");
		}*/
		/*TreeSet<Person> tres = new TreeSet<>();
		tres.add(new Person("zs",19,"女"));
		tres.add(new Person("ls",18,"男"));
		tres.add(new Person("we",19,"女"));
		tres.add(new Person("wy",19,"女"));
		tres.add(new Person("ww",17,"男"));*/
		
		Person[] ps = {new Person("zs",19,"女"),new Person("ls",18,"男"),
				new Person("we",19,"女"),new Person("wy",19,"女"),
				new Person("ww",17,"男")};
		Arrays.sort(ps);
		
		
		
	}

}
