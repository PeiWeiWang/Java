package com.day11.list;

import java.util.*;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//<����>:����,�涨����list�����е�Ԫ�ص�����
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add(null);
		list.add(null);
		list.add(null);
		//ֻ������List�������༯�ϵĵ�����--�б������
		//1.���һ���б������
		ListIterator<String> lit = list.listIterator();
		
		//2.�������
		while(lit.hasNext()){
			System.out.print(lit.next()+"\t\t");
		}
		System.out.println();
		//3.����������,���Խ����������
		while(lit.hasPrevious()){//�����ǰһ��
			System.out.print(lit.previous()+"\t\t");//��ǰһ��ȡ��
		}
		
		
	}

}
