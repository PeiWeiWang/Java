package com.day12;

import java.util.*;

public class TestMap {

	/**
	 * Map中的元素以 键--->值 形式存在
	 * 键不可重复
	 */
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		//将 键值对 放入map集合
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
	//	map.put("key4", null);
		
		//查询键值对数量
	//	System.out.println(map.size());

		//根据键取出值
		//System.out.println(map.get("key3"));
		
		//键值对关系 不存在,取出的是null;键值对存在,但值为null,取出的也是null
		/*System.out.println(map.get("key5"));
		System.out.println(map.get("key4"));*/
		
		//根据key删除  key-value
		//map.remove("key3");
		//System.out.println(map.get("key3"));
		
		//如放入一个键值对,如key已经存在;则将新的value覆盖原value
		/*map.put("key3", "value0000");
		System.out.println(map.get("key3"));*/
		
		//Map集合的遍历
		//1.先遍历键,通过键取值
//		Set<String> keys = map.keySet();//取出存放key的set集合
//		for(String key:keys){
//			System.out.println(key+"----->"+map.get(key));
//		}
		
		//2.直接遍历值
//		 Collection<String> values = map.values();
//		 for(String value:values){
//				System.out.println(value);
//			}
		 
		 //3.遍历印射关系
		 Set entrySet = map.entrySet();
		 for(Object entry:entrySet){
				System.out.println(entry);
			}
		 
		 System.out.println(map);
	}

}
