package com.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.length()-s2.length();
	}
	
	public static void main(String[] args) {
		/*String[] stra = {"aaa","aaaaa","ll","oooo"};
		Arrays.sort(stra,new StringLengthComparator());
		System.out.println(Arrays.toString(stra));*/
		
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("ll");
		list.add("abc");
		list.add("aaaaa");
		Collections.sort(list,new StringLengthComparator());
		
		System.out.println(list);
		
 		
		
	}
}
