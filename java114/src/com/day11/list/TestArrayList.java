package com.day11.list;

import java.util.*;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//<类型>:范型,规定放入list集合中的元素的类型
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add(null);
		list.add(null);
		list.add(null);
		//只能用于List及其子类集合的迭代器--列表迭代器
		//1.获得一个列表迭代器
		ListIterator<String> lit = list.listIterator();
		
		//2.正向迭代
		while(lit.hasNext()){
			System.out.print(lit.next()+"\t\t");
		}
		System.out.println();
		//3.正向迭代完成,可以进行逆向迭代
		while(lit.hasPrevious()){//如果有前一个
			System.out.print(lit.previous()+"\t\t");//将前一个取出
		}
		
		
	}

}
