package com.work.day4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Deprecated
public class Test {
	@Deprecated
	int x;
	//�@�������ѽ��^�r--ע�:�o�������Լ�ʹ��,JVM�����
	
	@Deprecated//ע��:�����빤��(JVM)����ע��
	public static void oldMethod(){
		System.out.println("�@���^�r����");
	}
	
	
	public  void newMethod(){
		System.out.println("�@���������");
	}
	
	/**
	 * @author ����
	 * @param ����
	 * @return ����ֵ
	 * @exception �׳����쳣
	 * @version �����İ汾
	 * */
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		
		List list = new ArrayList();
	
	}

}

class  TestSon extends Test{
	@Override
	public void newMethod(){
		System.out.println("�@�����෽��");
	}
}
