package com.day6.encapsulation;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Person p = new Person();
		p.name = "����";
		p.age = 10;
		p.sex="man";
		p.sal = 10000;
		
		System.out.println(p.toString());
		*/
		
		Person p = new Person();
		//˽������������ⲿ�����ö���.���Եķ�ʽֱ��ʹ��
		/*p.name = "����";
		p.age = -10;
		p.sex="?";
		p.sal = -10000.0;*/
		
		p.setName("����");
		p.setAge(1000);
		System.out.println(p.toString());
	}

}
