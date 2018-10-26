package com.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.day4.Test;
import com.day4.clazz.Person;

public class BeanUtils{
	public static Object getProperty(Object obj,String name) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Class clazz =  obj.getClass();
		Object value = null;
		Field f = clazz.getDeclaredField(name);
		f.setAccessible(true);
		value = f.get(obj);
		return value;
	}
	
	
	public static void setProperty(Object obj,String name,Object value){
		Class clazz =  obj.getClass();
		try {
			Field f = clazz.getDeclaredField(name);
			f.setAccessible(true);
			f.set(obj, value);	
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
	
	//public static T createObject(String className){}
	public static Object createObject(String className){
		Object obj = null;
			try {
				Class clazz = Class.forName(className);
				obj = clazz.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return obj;
	}
	
	public static void showClass(Class clazz){
		//չʾ����
		System.out.println(clazz);
		
		System.out.println("\n��Ա����");
		Field[] fs = clazz.getDeclaredFields();
		for(Field f:fs){
			System.out.println(f);
		}
		
		System.out.println("\n���췽��");
		Constructor[] cs = clazz.getDeclaredConstructors();
		for(Constructor c:cs){
			System.out.println(c);
		}
		
		System.out.println("\n��Ա����");
		Method[] ms = clazz.getDeclaredMethods();
		for(Method m:ms){
			System.out.println(m);
		}
		
	}
	
	//���Ը��̳��������Խ��и�ֵ
	public static void setProperty(Object obj,Class clazz,
					String name,Object value) throws IllegalArgumentException, IllegalAccessException{
		
		try {
			Field f = clazz.getDeclaredField(name);
			f.setAccessible(true);//��ִ�е�����,˵�����ԾͶ����ڱ�����
			f.set(obj, value);	
		} catch (NoSuchFieldException e) {//���Ҳ�������,�����쳣
			if("java.lang.Object".equals(clazz.getName())){
				System.err.println("��׷�ݵ�����Object,�޴�����");
				return;
			}
			//�ٴε��ñ�����,�������в�ѯ������(�ݹ��ѯ)
			setProperty(obj,clazz.getSuperclass(),name,value);
		} 
	}
	
	//���Ը��̳��������Խ���ȡֵ
		public static Object getProperty(Object obj,Class clazz,
						String name) throws IllegalArgumentException, IllegalAccessException{
			Object value = null;
			try {
				Field f = clazz.getDeclaredField(name);
				f.setAccessible(true);//��ִ�е�����,˵�����ԾͶ����ڱ�����
				value = f.get(obj);	
			} catch (NoSuchFieldException e) {//���Ҳ�������,�����쳣
				if("java.lang.Object".equals(clazz.getName())){
					System.err.println("��׷�ݵ�����Object,�޴�����");
					return null;
				}
				//�ٴε��ñ�����,�������в�ѯ������(�ݹ��ѯ)
				value = getProperty(obj,clazz.getSuperclass(),name);
			} 
			return value;
		}
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		/*Person person = new Person();
		BeanUtils.setProperty(person, "age", 19);
		System.out.println(person);*/
		
		/*Test test = (Test)BeanUtils.createObject("com.day4.Test");
		System.out.println(test);*/
		
		//BeanUtils.showClass(Account.class);
		
		Cus2 c = new Cus2();
		BeanUtils.setProperty(c,Cus2.class, "Balance", 100000);
		System.out.println(BeanUtils.getProperty(c, Cus2.class, "Balance"));
		
	}

}
class Cus extends Account{
	private String name;

	@Override
	public String toString() {
		return "Cus [name=" + name + ", Balance=" + Balance + "]";
	}
	
}

class Cus2 extends Cus{
	@Override
	public String toString() {
		return "Cus2 [Balance=" + Balance + "]";
	}
}

