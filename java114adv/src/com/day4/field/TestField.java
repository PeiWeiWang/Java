package com.day4.field;

import java.lang.reflect.Field;

class Person {
	private String type="��̬";
	
	Integer age;
	protected String sex;
	public String name;//Filed
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Person [type=" + type + ", age=" + age + ", sex=" + sex
				+ ", name=" + name + "]";
	}
	
	
}

public class TestField {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 */
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		Person p1 = new Person();
		p.setType("����");
		p.sex="nan";
		p.age = 100;
		System.out.println(p);
		
	
		// 1.��ȡĿ�����Ŀ����������ʱ����
		Class clazz =Person.class;
		/*Class clazz1 =p.getClass();
		System.out.println(clazz==clazz1);*/
		
		// ��ȡ�����������ֶ�
		/*Field[] fs = clazz.getDeclaredFields();
		for(Field f:fs){
			System.out.println(f.toGenericString());
		}*/
		
		//2.��ȡָ�������ֶ�
		Field type = clazz.getDeclaredField("type");//private
		Field age = clazz.getDeclaredField("age");//default
		
		//3.ȡ�������Եķ��ʿ���
		type.setAccessible(true);
		age.setAccessible(true);
		
		//4.��Ŀ����������ֶν��в���(ȡֵ/��ֵ)
		type.set(p, "�׷�"); //��ֵ
		System.out.println(type.get(p));//ȡֵ
		System.out.println(age.get(p));
		
		
	}

}
