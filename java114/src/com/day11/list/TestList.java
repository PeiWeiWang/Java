package com.day11.list;

import java.util.*;

import com.homework.w0720.inte.Person;

public class TestList {
	public static void main(String[] args) {
		int[] ia = {1,2,3,4};//长度是确定的,一旦确定不可更改
		ia[0] = 2;
		
		/*for(int i=0;i<ia.length;i++){
			System.out.print(ia[i]+"\t");
		}*/
		
		//创建列表对象 ---ArrayList为可变长数组
		List list = new ArrayList();//初始容量为10,元素的个数为0
		//System.out.println(list.size());//得到列表中的元素的个数
		
		//放入元素---如未规定放入list中的元素的类型,jvm默认为Object类型
		list.add("第一个元素");//index = 0
		list.add(1);//index = 1 此时放入的1会自动装箱为对应的包装类
		list.add('2');//index = 2
		list.add("aaa");
		list.add("bbbbb");
		list.add("aaa");
		//添加时指定下标(插入新行,并将原来的数据向后移动)
		//list.add(2, "dsdsdsd");
		
		//取出单个元素
		/*Object o1 = list.get(3);
		System.out.println(o1);*/
		
		
		//删除元素
		//按下标删除元素
		/*list.remove(2);//删除第3个元素,后续的元素向前移动
		System.out.println(list.get(2));*/
		
		//按内容删除(第一个出现的)
		//list.remove("aaa");
	
		//按照下标修改元素
		list.set(3, "cccc");
		
		//遍历list
		//1.for
		/*for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"\t\t");
		}*/
		
		//2.forEach
		/*for(Object o:list){
			System.out.print(o+"\t\t");
		}*/
		
		//3.使用迭代器--迭代:将列表中的元素一个一个的按顺序取出
			//获取目标集合的迭代器
		Iterator it = list.iterator();
			//使用迭代器进行迭代
		while(it.hasNext()){//如果还有下一个元素
			System.out.print(it.next()+"\t\t");//将下一个元素取出
		}
		
		/*System.out.println("\n---使用同一个迭代器再次迭代--\n");
		while(it.hasNext()){//如果还有下一个元素
			System.out.print(it.next()+"\t\t");//将下一个元素取出
		}*/
	}
}
