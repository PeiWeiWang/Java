package com.day12;

import java.util.*;

import com.homework.w0725.Person;

public class TestTreeMap {
	public static void main(String[] args) {
		/*TreeMap<String,Object> tm = new TreeMap<>();
		
		tm.put("abc", "˳���һ��value");
		tm.put("adc","˳��ڶ���value");
		tm.put("aac", "˳�������value");
		
		
		Set<String> keys = tm.keySet();//ȡ�����key��set����
		for(String key:keys){
			System.out.println(key+"----->"+tm.get(key));
		}*/
		
		TreeMap<Person,Object> tm = new TreeMap<>();
		tm.put(new Person(), "111");
		tm.put(new Person(), "2222");
	}
}
