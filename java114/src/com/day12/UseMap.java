package com.day12;

import java.util.*;

public class UseMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Map> list = new ArrayList<>();
		Map<String,String> emp1  = new HashMap<>();
		emp1.put("员工名", "CLARK");
		emp1.put("部门名", "ACCOUNTING");
		list.add(emp1);
		
		Map<String,String> emp2  = new HashMap<>();
		emp2.put("员工名", "KING");
		emp2.put("部门名", "ACCOUNTING");
		list.add(emp2);
		
		for(Map map:list){
			System.out.println(map);
		}
		
	}

}
