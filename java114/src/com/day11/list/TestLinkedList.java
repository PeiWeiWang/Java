package com.day11.list;

import java.util.*;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//普通用法
		/*List<String> list = new LinkedList<>();
		
		list.add("aa");
		list.add("bb");*/
		
		//list.remove(0);
		
	//	System.out.println(list.get(0));
		
		/*list.set(0, "cc");
		for(String s:list){
			System.out.print(s+"\t\t");
		}*/
		
		
		//独有方法的使用--不使用父类引用指向子类对象
		LinkedList<String> link = new LinkedList<>();
		
		link.add("aa");
		link.add("bb");
		
		//将元素插入队列的开头
		link.addFirst("nn");
		
		//将元素插入队列的末尾
		link.addLast("ww");
		
		//获取并移除队列的首位元素
		System.out.println(link.poll());
		
		for(String s:link){
			System.out.print(s+"\t\t");
		}
	}

}
