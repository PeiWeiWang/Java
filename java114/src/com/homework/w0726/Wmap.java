package com.homework.w0726;

import java.util.*;

public class Wmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Set<String> ts = new HashSet<>();
		ts.add("adc");
		ts.add("afk");
		ts.add("abb");
		ts.add("bdc");
		ts.add("cba");

		Set<String> ts1 = new HashSet<>();
		ts1.add("aaaasa");
		ts1.add("ssss");
		ts1.add("ggfgfsd");
		ts1.add("fgfg");
		ts1.add("cbaaaa");

		Set<String> ts2 = new HashSet<>();
		ts2.add("hhh");
		ts2.add("jjj");
		ts2.add("ggfgfsd");
		ts2.add("lll");
		ts2.add("pppp");

		Map<String, Set<String>> map = new HashMap<>();
		map.put("字符串集1", ts);
		map.put("字符串集2", ts1);
		map.put("字符串集3", ts2);
		
		Set<String> keys	= 	map.keySet();
		for(String key:keys){
			Set<String> value = map.get(key);
			System.out.println("\n"+key);
			for(String str:value){
				System.out.print(str+"\t\t");
			}
			System.out.print("\t\t");
		}*/
		
		//手动输入一个字符串"afdsadfserwe2#@$#@$13243dgffdherewfrewrwe",
		//统计每个字符------出现的次数
		String str = "aaaabbb%%%111";
		
		//1.转为字符数组
		char[] ca = str.toCharArray();
		
		//2.利用Map结合的特征来统计每个字符出现的次数;以要统计的字符为键,以出现的次数为值
		TreeMap<Character,Integer> countMap = new TreeMap<>();
			//遍历ca,并将其元素循环的放入countMap
		for(Character c:ca){
			if(countMap.get(c)==null){//根据c取出的值如为null,说明字符没有放入countMap中过
				countMap.put(c, 1);//将其放入countMap中,key为c,value为1
			}else{
				//如不为null,说明字符已经出现过;将对应的次数取出+1,在放回countMap
				countMap.put(c, countMap.get(c)+1);
			}
		}
		System.out.println(countMap);
	}

}
 