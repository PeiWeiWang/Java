package com.homework.w0725;

import java.util.*;

public class TestSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> ts  = new HashSet<>();
		ts.add("adc");
		ts.add("afk");
		ts.add("abb");
		ts.add("bdc");
		ts.add("cba");
		
		Set<String> ts1  = new HashSet<>();
		ts.add("aaaasa");
		ts.add("ssss");
		ts.add("ggfgfsd");
		ts.add("fgfg");
		ts.add("cbaaaa");
		
		Set<String> ts2  = new HashSet<>();
		ts.add("hhh");
		ts.add("jjj");
		ts.add("ggfgfsd");
		ts.add("lll");
		ts.add("pppp");
		
		List<Set<String>> list =new ArrayList<Set<String>>();
		list.add(ts);
		list.add(ts1);
		list.add(ts2);
		
		
		//±éÀúÈçÉÏlist
		for(Set<String> set:list){
			for(String str:set){
				System.out.print(str+"\t\t");
			}
			System.out.println("\n");
		}
		
	}

}


