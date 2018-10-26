package com.day12;

import java.util.*;

import com.homework.w0725.Person;

public class TestTreeMap {
	public static void main(String[] args) {
		/*TreeMap<String,Object> tm = new TreeMap<>();
		
		tm.put("abc", "顺序第一个value");
		tm.put("adc","顺序第二个value");
		tm.put("aac", "顺序第三个value");
		
		
		Set<String> keys = tm.keySet();//取出存放key的set集合
		for(String key:keys){
			System.out.println(key+"----->"+tm.get(key));
		}*/
		
		TreeMap<Person,Object> tm = new TreeMap<>();
		tm.put(new Person(), "111");
		tm.put(new Person(), "2222");
	}
}
