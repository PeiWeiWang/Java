package com.day13;

import java.util.Comparator;

//比较器必须实现Comparator接口,并通知比较器比较的类型
public class PersonNameComparator implements Comparator<Person>{

	//重写compare方法
	//按名字进行比较
	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}

}
