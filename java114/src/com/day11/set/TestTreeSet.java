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
		//��ͨ��ʵ��,��ʹ�ø�������ָ���������
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
		tres.add(new Person("zs",19,"Ů"));
		tres.add(new Person("ls",18,"��"));
		tres.add(new Person("we",19,"Ů"));
		tres.add(new Person("wy",19,"Ů"));
		tres.add(new Person("ww",17,"��"));*/
		
		Person[] ps = {new Person("zs",19,"Ů"),new Person("ls",18,"��"),
				new Person("we",19,"Ů"),new Person("wy",19,"Ů"),
				new Person("ww",17,"��")};
		Arrays.sort(ps);
		
		
		
	}

}
