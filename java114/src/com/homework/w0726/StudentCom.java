package com.homework.w0726;

import java.util.Comparator;
//���Ȱ�����������,��ΰ���ѧ������   ��С����
public class StudentCom implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge().equals(o2.getAge())){
			o1.getSid().compareTo(o2.getSid());
		}
		return o1.getAge().compareTo(o2.getAge());
	}

}
