package com.day11.list;

import java.util.*;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ͨ�÷�
		/*List<String> list = new LinkedList<>();
		
		list.add("aa");
		list.add("bb");*/
		
		//list.remove(0);
		
	//	System.out.println(list.get(0));
		
		/*list.set(0, "cc");
		for(String s:list){
			System.out.print(s+"\t\t");
		}*/
		
		
		//���з�����ʹ��--��ʹ�ø�������ָ���������
		LinkedList<String> link = new LinkedList<>();
		
		link.add("aa");
		link.add("bb");
		
		//��Ԫ�ز�����еĿ�ͷ
		link.addFirst("nn");
		
		//��Ԫ�ز�����е�ĩβ
		link.addLast("ww");
		
		//��ȡ���Ƴ����е���λԪ��
		System.out.println(link.poll());
		
		for(String s:link){
			System.out.print(s+"\t\t");
		}
	}

}
