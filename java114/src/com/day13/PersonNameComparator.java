package com.day13;

import java.util.Comparator;

//�Ƚ�������ʵ��Comparator�ӿ�,��֪ͨ�Ƚ����Ƚϵ�����
public class PersonNameComparator implements Comparator<Person>{

	//��дcompare����
	//�����ֽ��бȽ�
	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}

}
